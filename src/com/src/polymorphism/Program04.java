package com.src.polymorphism;

class Program04A {
	String name = "Parent";
	public void add() {
		System.out.println(name);
	}
}
class Program04B extends Program04A {
	String name = "Child";
	public void add() {
		System.out.println(name);
	}
}
public class Program04 {
	public static void main(String[] args) {
		Program04A prg = new Program04B();
		prg.add();
	}
}
