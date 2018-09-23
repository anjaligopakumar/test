package com.techcdemo1;

public class Checkstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String firstname = "Anjali";
		String lastname = "Gopakumar";
		String name1 = " Anjali Gopakumar " ;
		String name2 = "i live in India";
		System.out.println(firstname+ " "+lastname);
		System.out.println(firstname.concat(" ").concat(lastname));
		System.out.println(firstname.length());
		System.out.println(lastname.length());
		System.out.println(firstname.toUpperCase());
		System.out.println(lastname.toLowerCase());
		System.out.println(firstname.charAt(5));
		System.out.println(firstname.equals(firstname));
		System.out.println(firstname.equals(lastname));
		System.out.println(firstname.replace('a','j'));
		System.out.println(firstname.equalsIgnoreCase("Bnjali"));
		System.out.println(firstname.substring(3));
		System.out.println(firstname.substring(3,5));
		System.out.println(firstname.compareTo(lastname));
		System.out.println(firstname.contains("n"));
		System.out.println(name1.trim());
		String values[] = name2.split("i");
		System.out.println(values[0]);
		System.out.println(values[1]);
		System.out.println(values[2]);
		System.out.println(values[3]);
		
 	}

}

