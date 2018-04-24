package com.src.threads;

import java.util.ArrayDeque;

class Task implements Runnable {
	private String name;
	Task(int i) {
		this.name = "Worker "+i;
	}
	@Override
	public void run() {
		try {
			System.out.println(this.name+" started");
			Thread.currentThread().sleep(2000);
			System.out.println(this.name+" Completed");	
		}catch(Exception e) {
			
		}
	}
}
class MyThreadPool extends Thread {
	private ArrayDeque<Task> tasks;
	private Boolean process;
	private Executor[] executors;
	private int size;
	
	@Override
	public void run() {
		for(int i=0;i<this.executors.length;i++) {
			this.executors[i] = new Executor();
			Thread t = new Thread(this.executors[i]);
			t.setName("Executor "+i);
			t.start();
		}
	}
	
	public MyThreadPool(int size) {
		this.size = size;
		this.executors = new Executor[this.size];
		this.process = true;
		this.tasks = new ArrayDeque<>();
	}
	
	public void addTask(Task task) {
		synchronized(tasks) {
			tasks.add(task);
		}
	}
	
	public void terminate() {
		this.process = false;
	}
	
	class Executor implements Runnable {
		private Task currTask;
		@Override
		public void run() {	
			while(process) {
				while((currTask=tasks.poll())!=null) {
					currTask.run();
				}
			}
		}
	}
}
class Program12 {
	public static void main(String[] args) throws Exception{
		MyThreadPool pool = new MyThreadPool(2);
		pool.run();
		for(int i=0;i<10;i++) {
			pool.addTask(new Task(i));
		}
	}
}
