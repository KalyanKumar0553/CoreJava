package com.src.threads;

// Program to print 1 to 10 numbers by different threads

public class Program09 {
	public synchronized void print(){
		try {
			notifyAll();
			for(int i=1;i<=5;i++){
				System.out.println(Thread.currentThread().getName()+" printing "+i);
				Thread.currentThread().sleep(500);
			}
			wait();
		} catch (InterruptedException e) {
				e.printStackTrace();
		}
	}
	public static void main(String[] args) throws Exception{
		Program09 prg=new Program09();
		Thread th1=new Thread(()->{
			while(true){
				prg.print();
			}
		});
		th1.setName("First printer");
		Thread th2=new Thread(()->{
			while(true){
				prg.print();
			}
		});
		th2.setName("Second printer");
		th1.start();
		th2.start();
	}
}
