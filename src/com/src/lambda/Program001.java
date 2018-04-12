package com.src.lambda;

import java.util.function.Predicate;

public class Program001 {
	public static void main(String[] args) {
		System.out.println(filter(10,(e)-> {return true;}));
	}
	public static boolean filter(Integer x,Predicate<Integer> predict) {
		return predict.test(x);
	}
}
