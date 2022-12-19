package Practice;

import java.util.LinkedList;
import java.util.ListIterator;

public class Demo2 {

	public static void main(String[] args) {
		LinkedList h=new LinkedList();
		h.add("selenium");
		h.add("java");
		h.add("testNG");
		h.add(122);
		h.add(12.34);
		h.add(true);
		
		LinkedList h1=new LinkedList();
		h1.add("E");
		h1.add("B");
		h1.add("C");
		h1.add("D");
		h1.add("A");
		
		h1.addAll(3, h);
		//System.out.println(h1);
//		
//		int b=h1.indexOf("A");
//		System.out.println(b);
//		
		ListIterator l= h1.listIterator();
		 while(l.hasNext())
		 {
			 System.out.println(l.next());
		 }
		
		
		
		
		
		
		
		
	}

}
