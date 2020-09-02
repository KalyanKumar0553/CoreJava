package com.src.polymorphism;

public class Program14 {
	private int data = 5;
	public int getData() {
		return this.data;
	}
	public int getData(int value) {
		return (data+1);
	}
	public int getData(int... value) {
		return (data+2);
	}
	public static void main(String[] args) {
		Program14 x = new Program14();
		System.out.println(x.getData(7,5));
	}
}
