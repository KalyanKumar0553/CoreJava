package com.src.misc;

public class Program06 {
	public static void printMe(int i, int j, int k) {
		System.out.println("ijk");
	}

	public static void printMe(byte... b) {
		System.out.println("b");
	}

	public static void main(String[] args) {
		byte b = 9;
		printMe(b,b,b);
	}
}
