package com.src.polymorphism;

class Program1A {
	public void add() {
		System.out.println("Parent add");
	}
}
class Program1B extends Program1A {
	public void add() {
		System.out.println("Child add");
	}
}
public class Program01 {
	public static void main(String[] args) {
		Program1A a =new Program1B();
		a.add();
	}
}
