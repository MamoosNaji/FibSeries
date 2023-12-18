package com.mainprograms;

public class ReverseString {
	public static void main(String[] args) {
		String s = "Hello World";
		String reverse = "";
		
		for (int i = s.length()-1; i >=0; i--) {
			char charAt = s.charAt(i);
			reverse = reverse + charAt;
		}
		
		System.out.println("String reversed to :" + reverse);
		
	}
}
