package day6;

import java.util.HashMap;
import java.util.Map;

public class collectionmap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer,String> m= new HashMap<Integer,String>();
		m.put(5, "anjali");
		m.put(2, "raj");
		m.put(6, "sohan");
		m.put(4, "mohan");
		System.out.println(m);
		System.out.println(m.get(2));
		System.out.println(m.remove(2));
		System.out.println(m);
		
	}

}
