package com.src.polymorphism;

public class Program15 {
	private int data = 5;
	public int getData() {
		return this.data;
	}
	public int getData(int value, int value2) {
		return (data+1);
	}
	public int getData(int... value) {
		return (data+2);
	}
	public static void main(String[] args) {
		Program15 x = new Program15();
		System.out.println(x.getData(7,5));
	}
}
