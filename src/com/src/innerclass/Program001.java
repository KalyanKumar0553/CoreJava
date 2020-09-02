package com.src.innerclass;

class Program001Inner extends Thread {
	Program001Inner() {
		System.out.println("Program001Inner");
	}
	@Override
	public void run() {
		System.out.println(" World ");
	}
	public void run(String s) {
		System.out.println(" Run ");
	}
	
}
public class Program001 {
	public static void main(String[] args) {
		Thread t = new Program001Inner() {
			public void run() {
				System.out.println("Hello world");
			}
		};
		t.start();
	}
}
