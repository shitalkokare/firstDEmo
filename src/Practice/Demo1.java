package Practice;

import java.util.ArrayList;
import java.util.Iterator;

public class Demo1 {
public static void main(String[] args) {
	
		ArrayList h=new ArrayList();
		h.add("selenium");
		h.add("java");
		h.add("testNG");
		h.add(122);
		h.add(12.34);
		h.add(true);
		
		ArrayList<String> h1=new ArrayList<String>();
		h1.add("E");
		h1.add("B");
		h1.add("C");
		h1.add("D");
		h1.add("A");
	
		//System.out.println(h.get(2));
//		for(int i=0;i<h.size();i++)
//		{
//			System.out.println(h.get(i));
//		}
	
//		for(Object o:h)
//		{
//			System.out.println(o);
//		}
//		
//		for(String s:h1)
//		{
//			System.out.println(s);
//		}
	
//		Iterator it =h.iterator();
//		while(it.hasNext())
//		{
//			System.out.println(it.next());
//		}
		
		
		Object [] abc =h1.toArray();
		
		for(Object o: abc)
		{
			System.out.println(o);
		}

		
		
		
		
		
	}

}
