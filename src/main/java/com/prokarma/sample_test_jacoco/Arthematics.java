package com.prokarma.sample_test_jacoco;


public class Arthematics {
	public static  int addMethod(int num1, int num2) {
		int sum = 0;
		if (num1 > 0 && num2 > 0) {
			sum = num1 + num2;
		} else if (num1 < 0 && num2 > 0) {
			sum = num1 + num2;
		} else if (num1 > 0 && num2 < 0) {
			sum = num1 + num2;
		} else
			sum = num1 + num2;
		return sum;
	}

	public static int subMethod(int num1, int num2) {
		int sub = 0;
		if (num1 > 0 && num2 > 0) {
			sub = num1 - num2;
		} else if (num1 < 0 && num2 > 0) {
			sub = num1 - num2;
		} else if (num1 > 0 && num2 < 0) {
			sub = num1 - num2;
		} else
			sub = num1 - num2;
		return sub;
	}
	
	public static int mulMethod(int num1, int num2) {
		int mul = 0;
		if (num1 > 0 && num2 > 0) {
			mul = num1 * num2;
		} else if (num1 < 0 && num2 > 0) {
			mul = num1 * num2;
		} else if (num1 > 0 && num2 < 0) {
			mul = num1 * num2;
		} else
			mul = num1 * num2;
		return mul;
	}
	
	public static void main(String[] args) {
		System.out.println(addMethod(2, 3));
		System.out.println(subMethod(3, 4));
		System.out.println(mulMethod(7, 8));
		
	}

}
