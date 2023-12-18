package com.mainprograms;

public class ReverseNumber {
	public static void main(String[] args) {
		int num = 12345;
		int reversedNum =0;
		while (num>0) {
			int r = num%10;
			reversedNum = reversedNum*10 + r;
			num = num/10;
		}
		System.out.println(reversedNum);
	}
}
