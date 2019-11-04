package com.src.threads;

public class Program13 extends Thread {
	Thread t1, t2;

	Program13() {
		t1 = new Thread(this, "Thread_1");
		t2 = new Thread(this, "Thread_2");
		t1.start();
		t2.start();
	}

	public void run() {
		t2.setPriority(Thread.MAX_PRIORITY);
		System.out.print(t1.equals(t2));
	}

	public static void main(String args[]) {
		new Program13();
	}
}
