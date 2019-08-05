package com.src.innerclass;

import org.apache.commons.lang.StringEscapeUtils;

public class UTFConversion {
	public static void main(String[] args) {
		String name="of\u00A0Mw\u00A4";
		display(name.getBytes());
		convertUTF(name);
	}
	
	public static void display(byte[] data) {
		for(byte curr: data) {
			System.out.print((char)curr);
		}
		System.out.println();
	}
	
	public static void convertUTF(String input) {
		String data = StringEscapeUtils.escapeJava(input);
		StringBuffer result = new StringBuffer();
		int size = data.length();
		for(int i=0;i<size;i++) {
			if(data.charAt(i)=='\\' && data.charAt(i+1)=='u') {
				int hexVal = Integer.parseInt(data.substring(i+2, i+6),16);
				//result.append((char)hexVal);
				i=i+5;
			}else {
				result.append(data.charAt(i));
			}
		}
		display(result.toString().getBytes());
	}
}
