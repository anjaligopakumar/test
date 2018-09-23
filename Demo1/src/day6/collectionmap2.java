package day6;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class collectionmap2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Map<String,String> m= new HashMap<String,String>();
		//Map<String,String> m= new LinkedHashMap<String,String>();
		Map<String,String> m= new TreeMap<String,String>();
		m.put("a", "anjali");
		m.put("b", "raj");
		m.put("A", "sohan");
		m.put("B", "mohan");
		System.out.println(m);
		System.out.println(m.get("A"));
		System.out.println(m.remove("A"));
		System.out.println(m);
		System.out.println(m.keySet());
		Set<String> s=m.keySet();
		for (Iterator iterator = s.iterator(); iterator.hasNext();) {
			String string = (String) iterator.next();
			System.out.println(m.get(string));
			
		}
		System.out.println(m.values());
	}

}
