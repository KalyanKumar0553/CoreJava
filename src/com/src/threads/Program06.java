package com.src.threads;

class InterruptedWorker {
	public void add() {
		try {
			Thread.sleep(4000);
			System.out.println("In test");
		} catch (InterruptedException e) {
			System.out.println("Exception caught");
		}
	}
}
public class Program06 {
	public static void main(String[] args) throws Exception{
		InterruptedWorker worker=new InterruptedWorker();
		Thread t1=new Thread(()->{worker.add();});
		Thread t2=new Thread(()->{worker.add();});
		t1.start();
		t2.start();
		t1.interrupt();
		t2.interrupt();
		t1.join();
		t2.join();
		System.out.println("Completed==>");
	 
	}
}
