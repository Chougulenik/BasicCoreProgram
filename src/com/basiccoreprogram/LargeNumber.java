package com.basiccoreprogram;

public class LargeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = 20; int num2 =30; int num3 = 50;
		int largeNum;
		largeNum = (num1>num2) ? (num1>num3 ? num1:num3 ) : (num2>num3 ? num2:num3);   //ternary operator
		System.out.println("Largest Number : " +largeNum);
	}

}
