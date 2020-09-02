package com.src.collections;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;

interface Foo {
	int calculate(int i1,int i2);
}

public class Program02 {
	public static void main(String[] args) {
		Path p1 = Paths.get("log",".");
		Path p2 = Path.of(p1.getParent().toString(),".");
		Path p3 = p1.toAbsolutePath();
		File file = p1.toFile();
		System.out.println(p1.equals(p2));
		System.out.println(p1.equals(p3));
		System.out.println(p1.equals(file));
	}
}
