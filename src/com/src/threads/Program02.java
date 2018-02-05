package com.src.threads;


class ImplementsWorker implements Runnable{
	public void run() {
		System.out.println("Implements Runnable");
	}
}
public class Program02 {
	public static void main(String[] args) throws Exception{
		Thread t = new Thread(new ImplementsWorker());
		t.start();
		t.join();
		System.out.println("Completed");
	}
}
