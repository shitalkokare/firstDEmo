package ProgramHashSet;

import java.util.HashSet;
import java.util.Iterator;

public class Demo6 {

	public static void main(String[] args) {
		
		String a = "java";
		HashSet hs = new HashSet();

		for(int i=0;i<a.length();i++)
		{
			hs.add(a.charAt(i));
		}
		
		Iterator it =hs.iterator();
		
		while(it.hasNext())
		{
			System.out.print(it.next());
		}
		
		
		
		
		
	}

}
