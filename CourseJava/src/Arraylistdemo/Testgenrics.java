package Arraylistdemo;

import java.util.ArrayList;
import java.util.Iterator;

public class Testgenrics {
	public static void main(String[] args) {
		
		
		ArrayList<String> al=new ArrayList<String>();
		al.add("afsa");
		al.add("jubbu");
		al.add("mounika");
		
		//al.add(6);
		System.out.println("elements "+al);
		
		Iterator<String> itr=al.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}

	}
}
