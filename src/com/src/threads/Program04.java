package com.src.threads;


public class Program04 {
	public static void main(String[] args) throws Exception{
		Thread t = new Thread(()->{System.out.println("Lambda execution..!!");});
		t.start();
		t.join();
		System.out.println("Completed");
	}
}
