package com.src.inheritance;

public class Program001 {
	public static void main(String[] args) {
		Program001A a =new Program001B();
		Program001B b =new Program001B();
		System.out.println(a.c + " " + a.getValue());
		System.out.println(b.getValue() + " " + b.getSuperValue());
		// A B
		// B A 
	}
}
class Program001A {
	protected char c = 'A';
	char getValue() {
		return c;
	}
}
class Program001B extends Program001A {
	protected char c = 'B';
	char getValue() {
		return c;
	}
	char getSuperValue() {
		return super.c;
	}
}