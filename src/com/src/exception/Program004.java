package com.src.exception;

public class Program004 {
	public static void main(String[] args) {
		try {
			try {
				throw new Level1Exception();
			} catch (Level2Exception e) {
			} finally {
			}
		} catch (Level1Exception e) {

		}
	}

}