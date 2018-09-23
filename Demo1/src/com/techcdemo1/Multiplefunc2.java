package com.techcdemo1;

public class Multiplefunc2 {
	    static final int num1=5;
	    static  final int num2=7;

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		System.out.println(addition(num1,num2));
		//printing the class directly
		difference(num1,num2);
		//printing inside the class
		int mul=multiplication(num1,num2);
		System.out.println(mul);
		//assigning and printing
	}
	
	public static int addition(int num1,int num2)
	{
		int sum = num1+num2;
		return sum;
	}
	
	public static void difference(int num1,int num2)
	{
		int diff=num2-num1;
		System.out.println("difference is "+diff);;
	}
	
	public static int multiplication(int num1,int num2)
	{
		int mul=num1*num2;
		return mul;
	}

}
