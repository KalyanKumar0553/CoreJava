package com.src.polymorphism;

class Program07A {
	Program07A() {
		display();
		print();
	}

	static void display() {
		System.out.println("Static Display A");
	}

	void print() {
		System.out.println("Instance Print A");
	}
}

class Program07B extends Program07A {
	Program07B() {
		display();
		print();
	}

	static void display() {
		System.out.println("Static Display B");
	}

	void print() {
		System.out.println("Instance Print B");
	}
}

public class Program07 {
	public static void main(String[] args) {
		new Program07B();
	}
}
