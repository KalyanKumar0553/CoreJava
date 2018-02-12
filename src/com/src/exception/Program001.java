package com.src.exception;

public class Program001 {
	public static void main(String[] args) {
		try {
			int x= 10/0;
		} catch(Exception e) {
			System.err.println("Error");
		} finally {
			System.err.println("Finally");
		}
		System.err.println("Outside");
	}
}
