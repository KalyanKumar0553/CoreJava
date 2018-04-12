package com.src.polymorphism;

class Program03A {
	String name = "Parent";
	public void add() {
		System.out.println(name);
	}
}
class Program03B extends Program03A {
	String name = "Child";
}
public class Program03 {
	public static void main(String[] args) {
		Program03A prg = new Program03B();
		prg.add();
	}
}
