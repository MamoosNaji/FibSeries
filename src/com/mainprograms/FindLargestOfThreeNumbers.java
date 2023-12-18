package com.mainprograms;

public class FindLargestOfThreeNumbers {
	public static void main(String[] args) {
		int a = 60;
		int b = 40;
		int c = 30;

		if (a > b && a > c) {
			System.out.println("Largest is:" + a);
		} else if (b > a && b > c) {
			System.out.println("Largest is:" + b);
		} else if (c > a && c > b) {
			System.out.println("Largest is:" + c);
		}

	}
}
