package Tutorial;

import java.util.Enumeration;
import java.util.Vector;

public class Demo3 {

	public static void main(String[] args) {
		
		Vector v=new Vector();
		v.add("selenium");
		v.add("java");
		v.add("cucumber");
		v.add("testNG");
		v.add("POM");
	
//		Iterator i=v.iterator();
//		while(i.hasNext())
//		{
//			System.out.println(i.next());
//		}
		
//		ListIterator l=v.listIterator();
//		while(l.hasNext())
//		{
//			System.out.println(l.next());
//		}
		
		Enumeration e=v.elements();
		while(e.hasMoreElements())
		{
			System.out.println(e.nextElement());
		}
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
