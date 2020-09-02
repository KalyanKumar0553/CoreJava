package com.src.threads;


// Wait throws checked Interrupted Exception
class Promram14Test implements Runnable {
	@Override
	public void run() {
		Program14.obj.notify();
	}
		
}
public class Program14  implements Runnable {
	public static Program14 obj;
	private int data;
	Program14() {
		data = 10;
	}
	@Override
	public void run() {
		obj = new Program14();
		// obj.wait();
		obj.data+=20;
	}
	
}
