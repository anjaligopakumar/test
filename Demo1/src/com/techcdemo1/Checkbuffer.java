package com.techcdemo1;

public class Checkbuffer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer sb = new StringBuffer("My name ");
		sb.append("is anjali");
		StringBuffer sb1= new StringBuffer();
		sb1.append("hey");
		System.out.println(sb1);
		System.out.println(sb);
		System.out.println(sb.length());
		System.out.println(sb.capacity());
		System.out.println(sb.charAt(3));
		System.out.println(sb.replace(0, 2, "hi"));
		System.out.println(sb.delete(0, 2));
		System.out.println(sb.reverse());
		
	}

}
