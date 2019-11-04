package com.src.misc;

interface X {
	default void f() {
		System.out.println("parent");
	}
}

public class Program01 implements X {
	public static void main(String[] args) throws Exception {
		new Program01().f();
	}

	@Override
	public void f() {
		System.out.println("child");
	}

}
