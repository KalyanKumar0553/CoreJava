package com.src.exception;

public class Program002 {
	public static void main(String[] args) {
		double df=10/-0.0;
		if(df==Double.POSITIVE_INFINITY) {
			System.out.println("+ Infinity");
		} else {
			System.out.println("- Infinity");
		}
	}
}
