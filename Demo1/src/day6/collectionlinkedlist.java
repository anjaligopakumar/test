package day6;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class collectionlinkedlist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> mylist=new LinkedList<String>();
		mylist.add("anjali");
		mylist.add("raj");
		mylist.add("yash");
		System.out.println(mylist.size());
				//System.out.println(mylist);
		for (Iterator iterator = mylist.iterator(); iterator.hasNext();) {
			String name = (String) iterator.next();
			System.out.println(name);
		}
		System.out.println(mylist.get(1));
		mylist.remove(1);
		System.out.println(mylist);
	}

}
