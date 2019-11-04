package com.src.misc;

public class Program07 {
	public static void main(String[] args) {
		Float f = new Float("12");
		//switch accepts only int, string and enums
		switch (f.intValue()) {
		case 12:
			System.out.println("Twelve");
		case 0:
			System.out.println("Zero");
		default:
			System.out.println("Default");
		}
	}
}
