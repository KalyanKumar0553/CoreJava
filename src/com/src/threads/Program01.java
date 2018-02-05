package com.src.threads;


class ExtendsWorker extends Thread{
	public void run() {
		System.out.println("Extends Threads");
	}
}
public class Program01 {
	public static void main(String[] args) throws Exception{
		ExtendsWorker t = new ExtendsWorker();
		t.start();
		t.join();
		System.out.println("Completed");
	}
}
