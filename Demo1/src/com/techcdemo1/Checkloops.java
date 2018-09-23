package com.techcdemo1;

public class Checkloops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int number=2;
		int count=1;
		int i=10;
	/*	while(count<=10)
		{
			System.out.println(number+ "*"+count+"="+(number*count));
			count++;
		}
		while(i>=1)
		{
			System.out.println(number+"*"+i+"="+(number*i));
			i--;
		}*/
		
		do
		{
			System.out.println(number+ "*"+count+"="+(number*count));
			count++;
		}while(count<=10);
				do
		{
			System.out.println(number+"*"+i+"="+(number*i));
			i--;
		}while(i>=1);

	}

}
