package com.mainprograms;

public class FibonacciSeriesPrint {
	public static void main(String[] args) {
		int f=1,s=2,t=0;
		
		for (int i = 1; i <=10; i++) {
			System.out.println(f);
			t=f+s;
			f=s;
			s=t;
		}
	}
}
