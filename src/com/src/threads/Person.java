package com.src.threads;

class AA{
	public String name = "hello";
	public void display() {
		System.out.println(this.name);
	}
	public Object call() throws Exception {
		return null;
	}
}
class BB  extends AA{
	public String name = "world";
	public void display() {
		System.out.println(name);
	}
}
public class Person{
	public static void main(String[] args) {

	}
}
