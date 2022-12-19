package ProgramHashSet;

import java.util.ArrayList;
import java.util.HashSet;

public class Demo3 {

	public static void main(String[] args) {
		HashSet h=new HashSet();
		h.add("selenium");
		h.add("cucumber");
		h.add("testNG");
		h.add("java");
		h.add(123);
		h.add(true);
		
	ArrayList a=new ArrayList(h);
	
	System.out.println(a);
	System.out.println(a.get(2));

	}

}
