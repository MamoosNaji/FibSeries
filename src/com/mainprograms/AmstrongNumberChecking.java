package com.mainprograms;

public class AmstrongNumberChecking {
	public static void main(String[] args) {
		int num = 153;
		int n = num;
		int temp1,temp2=0;
		
		
		while (num>0) {
			temp1 = num%10;
			temp2 = temp2 + temp1*temp1*temp1;
			num= num/10;
		}
		
		if (n==temp2) {
			System.out.println("Amstrong number");
		}
		else {
			System.out.println("Not an Amstrong number");
		}
	}
}
