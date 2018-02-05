package com.src.threads;

class SleepWorker extends Thread {
	public synchronized void run() {
		try {
			Thread.sleep(40000);
			System.out.println("Hello world");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
public class Program05 {
	public static void main(String[] args) throws Exception{
		SleepWorker worker1=new SleepWorker();
		worker1.setName("SleepWorker");
		worker1.start();
		worker1.join();
	}
}
