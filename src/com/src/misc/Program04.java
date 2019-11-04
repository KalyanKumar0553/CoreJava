package com.src.misc;

class Customer {
	private String name;

	public Customer(String nm) {
		this.name = nm;
	}
}

public class Program04 {

	public static void main(String[] args) {
		Customer c1 = new Customer("John");
		Customer c2 = new Customer("John");
		if (c1 == c2) {
			System.out.print("yes");
		} else {
			System.out.print("no");
		}
		if (c1.equals(c2)) {
			System.out.print("yes");
		} else {
			System.out.print("no");
		}

	}
}
