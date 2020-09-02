package com.src.threads;

class Program15Thread extends Thread {
	Program15Thread(){}
	Program15Thread(Runnable r){super(r);}
	@Override
	public void run() {
		System.out.println("inside Thread");
	}
}

class Program15Runnable implements Runnable {
	public void run() {
		System.out.println("inside Runnable");
	}
}


public class Program15  {
	public static void main(String[] args) {
		new Program15Thread().start();
		new Program15Thread(new Program15Runnable()).start();
	}
}
