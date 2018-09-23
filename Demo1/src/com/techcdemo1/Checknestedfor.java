package com.techcdemo1;

import java.util.Scanner;

public class Checknestedfor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number for printing the table");
		int number = sc.nextInt() ;
		//int number=Integer.parseInt(value);
		for (int i = 1; i <= 10; i++) {
			System.out.println(number+ "*"+i+"="+(number*i));
		}
		for(int j=10;j>=1;j--)
		{
			System.out.println(number+ "*"+j+"="+(number*j));
		}
		}

	}


