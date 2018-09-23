package day4;

import java.util.Scanner;

public class doubledimensarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter row size");
		int row=sc.nextInt();
		System.out.println("enter column size");
		int col=sc.nextInt();
		int number[][] = new int[row][col];
		for (int i = 0; i < number.length; i++) {
			for(int j=0;j<number[i].length;j++)
			{
				System.out.println("enter array elements");
				number[i][j]=sc.nextInt();
			}
			
		}
		for (int i1 = 0; i1 < number.length; i1++) {
			System.out.println();
			for(int j1=0;j1<number[i1].length;j1++)
			{
				System.out.print(number[i1][j1]+"\t");
			}
			
		}
		/*int number[][]= {{1,2,3},{3,4,5},{6,7,8}}; 
		System.out.println(number.length);
		System.out.println(number[0][0]);
		System.out.println(number[0][1]);
		System.out.println(number[0][2]);
		System.out.println(number[1][0]);
		System.out.println(number[1][1]);
		System.out.println(number[1][2]);
		System.out.println(number[2][0]);
		System.out.println(number[2][1]);
		System.out.println(number[2][2]);*/
	}

}
