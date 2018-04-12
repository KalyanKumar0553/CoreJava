package com.src.polymorphism;

class Program06A {
	String name = "Parent";
	public void add() {
		System.out.println(name);
	}
}
class Program06B extends Program06A {
	public void add() {
		System.out.println(name);
	}
}
public class Program06 {
	public static void main(String[] args) {
		Program06A prg = new Program06B();
		prg.add();
	}
}
