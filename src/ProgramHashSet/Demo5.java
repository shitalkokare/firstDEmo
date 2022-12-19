package ProgramHashSet;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class Demo5 {

	public static void main(String[] args) {

		HashSet hs=new HashSet();
		
		hs.add("selenium");
		hs.add("testNG");
		hs.add("cucumber");
		
		ArrayList l=new ArrayList(hs);
		List l1=new LinkedList(hs);
		Vector l2=new Vector(hs);
		System.out.println(l.get(0));
		System.out.println(l1.get(0));
		System.out.println(l2.get(0));
	}

}
