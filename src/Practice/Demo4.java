package Practice;

import java.util.Enumeration;
import java.util.Vector;

public class Demo4 {

	public static void main(String[] args) {
		
		Vector v=new Vector();
		
		v.addElement("selenium");
		v.addElement("java");
		v.addElement("cucumber");
		v.add(122);
		v.add(true);
		
//		v.removeElement("java");
//		System.out.println(v);
//		
//		v.removeElementAt(2);
//		System.out.println(v);
//		
//		v.removeAllElements();
//		System.out.println(v);
		
//		System.out.println(v.firstElement());
//		System.out.println(v.lastElement());
//		System.out.println(v.capacity());
//		System.out.println(v);
//		Object o=v.clone();
//		System.out.println(o);
		
		Enumeration e=v.elements();
		while(e.hasMoreElements())
		{
			System.out.println(e.nextElement());
		}
		
		
		
	}

}
