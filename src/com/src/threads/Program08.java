package com.src.threads;

// Program to prind odd and even numbers by different threads
class EvenPrinter implements Runnable {

	Printer pr;

	public EvenPrinter(Printer pr) {
		this.pr=pr;
	}

	@Override
	public void run() {
		while(this.pr.number<10){
			this.pr.print();
		}
	}		
}
class OddPrinter implements Runnable {
	Printer pr;
	public OddPrinter(Printer pr) {
		this.pr=pr;
	}

	public OddPrinter() {
		
	}
	@Override
	public void run() {
		while(this.pr.number<10){
			this.pr.print();
		}
	}
}
class Printer {
	int number =1;
	public synchronized void print(){
		try {
			System.out.println(Thread.currentThread().getName()+" printing "+number++);
			notifyAll();
			if(this.number<10) {
				wait();
				Thread.currentThread().sleep(500);
			}
		} catch (InterruptedException e) {
				e.printStackTrace();
		}
	}
}
public class Program08 {
	public static void main(String[] args) throws Exception{
		Printer pr=new Printer();
		Thread th1=new Thread(new OddPrinter(pr));
		th1.setName("Odd printer");
		Thread th2=new Thread(new EvenPrinter(pr));
		th2.setName("Even printer");
		th1.start();
		th2.start();
	}
}
