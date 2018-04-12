package com.src.threads;

class Task implements Runnable {
	private String name;
	Task(int i) {
		this.name = "Worker "+i;
	}
	
	@Override
	public void run() {
		try {
			System.out.println(this.name+" started");
			Thread.currentThread().sleep(2000);
			System.out.println(this.name+" Completed");	
		}catch(Exception e) {
			
		}
	}
}

class Program12 {
	public static void main(String[] args) throws Exception{
		
	}
}
