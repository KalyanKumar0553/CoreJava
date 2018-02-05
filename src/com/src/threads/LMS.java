package com.src.threads;

import java.util.concurrent.ConcurrentHashMap;

public class LMS {
	public static void main(String[] args) {
		ConcurrentHashMap hmap =new ConcurrentHashMap<>();
		hmap.put(1, "one");
		System.out.println(hmap);
	}
}
