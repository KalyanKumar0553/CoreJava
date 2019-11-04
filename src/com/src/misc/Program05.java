package com.src.misc;

public class Program05 {
	public static void main(String[] args) {
		StringBuffer c = new StringBuffer("Hello");
		c.delete(1, 3); // First starts from 0, Second Starts from 1
		System.out.println(c);
	}
}
