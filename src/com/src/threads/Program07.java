package com.src.threads;


class NotifyWorker {
	public synchronized void add() {
		try {
			this.wait();
			System.out.println("In add");
		} catch (InterruptedException e) {
			System.out.println("Exception caught");
		}
	}
	public synchronized void sub() {
		try {
			this.notifyAll();
			System.out.println("In sub");
		} catch (Exception e) {
			System.out.println("Exception caught");
		}
	}
}
public class Program07 {
	public static void main(String[] args) throws Exception{
		NotifyWorker worker=new NotifyWorker();
		Thread t1=new Thread(()->{worker.add();});
		Thread t2=new Thread(()->{worker.sub();});
		t1.start();
		t2.start();
		t1.join();
		t2.join();
		System.out.println("Completed==>");
	 
	}
}
