package day4;

import java.util.Scanner;

public class checkarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter size of the array");
		int len=sc.nextInt();
		int number[] = new int[len];
		System.out.println("array length "+number.length);
		for (int i = 0; i < number.length; i++) {
			System.out.println("ENter array value");
			number[i]=sc.nextInt();
			
		}
		for (int i = 0; i < number.length; i++) {
			System.out.println("array is "+number[i]);
			
		}
		String names[]= {"anj","rahul","luv"};
		for (int j = 0; j < names.length; j++) {
			System.out.println(names[j]);
		}
		

	}

}
