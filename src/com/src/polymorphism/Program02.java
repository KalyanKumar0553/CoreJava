package com.src.polymorphism;

class Program2A {
	public static void add() {
		System.out.println("Parent add");
	}
}
class Program2B extends Program2A {
	public static void add() {
		System.out.println("Child add");
	}
}
public class Program02 {
	public static void main(String[] args) {
		Program2B a =new Program2B();
		a.add();
	}
}
