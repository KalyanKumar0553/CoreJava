package com.src.threads;

import java.io.*;
import java.util.*;

public class Processor {
	private ArrayList<Integer> data = new ArrayList();
	private volatile int value = 0;

	public synchronized void addData() throws Exception {
		notifyAll();
		System.out.println("In producer " + data.size());
		if (data.size() < 3) {
			data.add(value++);
			Thread.currentThread().sleep(500);
		}
		wait();
	}

	public synchronized void removeData() throws Exception {
		notifyAll();
		System.out.println("In consumer " + data.size());
		if (data.size() > 0) {
			data.remove(0);
			Thread.currentThread().sleep(1000);
		}
		wait();
	}
}

class MyCode {
	public static void main(String[] args) {
		Processor process = new Processor();
		Thread t1 = new Thread(() -> {
			try {
				while(true)
					process.addData();
			} catch (Exception e) {

			}
		});
		Thread t2 = new Thread(() -> {
			try {
				while(true)
					process.removeData();
			} catch (Exception e) {

			}
		});
		t1.start();
		t2.start();

	}
}