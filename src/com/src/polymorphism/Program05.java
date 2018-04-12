package com.src.polymorphism;

interface AA {
	default void walk() {
		System.out.println("AA Walk");
	}
}
interface BB {
	default void walk() {
		System.out.println("AA Walk");
	}
}
interface CC extends AA,BB {
	default void walk() {
		BB.super.walk();
	}
	
}
public class Program05 {
	
}
