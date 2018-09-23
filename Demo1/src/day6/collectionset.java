package day6;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class collectionset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//HashSet<String> h = new HashSet<String>();
		LinkedHashSet<String> h = new LinkedHashSet<String>();
		h.add("ram");
		h.add("shyam");
		h.add("ram");
		h.add("mohan");
		System.out.println(h.size());
		System.out.println(h);
	}

}
