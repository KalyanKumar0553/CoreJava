package com.src.threads;


public class Program03 {
	public static void main(String[] args) throws Exception{
		Thread t = new Thread(new Runnable() {
			
			@Override
			public void run() {
				System.out.println("Inline execution");
			}
		});
		t.start();
		t.join();
		System.out.println("Completed");
	}
}
