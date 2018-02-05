package com.src.threads;

// Program to print odd, even and one to 10 numbers no matter the order of execution

class SequencePrinter {
	
	int number = 1;
	int printCount = 1;
	int currentStep = 1;
	
	public synchronized void printOdd() {
		try {
			notifyAll();
			if(number<10 && currentStep != 1) {
				wait();
			}else {
				System.out.println(Thread.currentThread().getName()+" printing "+number++);
				currentStep = 2;
				Thread.currentThread().sleep(500);
				notifyAll();
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public synchronized void printEven() {
		try {
			notifyAll();
			if(number<10 && currentStep != 2) {
				wait();
			}else {
				currentStep = 3;
				System.out.println(Thread.currentThread().getName()+" printing "+number++);
				Thread.currentThread().sleep(500);
				notifyAll();
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public synchronized void print() {
		try {
			notifyAll();
			if(number<10 && currentStep != 3) {
				wait();
			}else {
				currentStep = 1;
				for(int i=0;i<=5;i++){
					System.out.println(i);
					Thread.currentThread().sleep(500);
				}
				printCount++;
				notifyAll();
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}

public class Program11 {
	public static void main(String[] args) throws Exception{
		SequencePrinter spr = new SequencePrinter();
		Thread t1=new Thread(()->{
			while(spr.number<10){
				spr.printOdd();
			}
		});
		t1.setName("Odd Printer ##");
		Thread t2=new Thread(()->{
			while(spr.number<10){
				spr.printEven();
			}
		});
		t2.setName("Even Printer ##");
		Thread t3=new Thread(()->{
			while(spr.printCount < 5) {
				spr.print();
			}
		});
		t2.start();
		Thread.currentThread().sleep(2000);
		t3.start();
		Thread.currentThread().sleep(2000);
		t1.start();
	}
}
