package ProgramHashSet;

import java.util.ArrayList;
import java.util.HashSet;

public class Demo1 {

	public static void main(String[] args) {
	
		HashSet h=new HashSet();
		h.add("selenium");
		h.add("testNG");
		h.add(123);
		h.add("testNG");
		h.add(true);
		h.add('S');
		
	System.out.println(h.add("testNG"));
	System.out.println(h.add("null"));
	System.out.println(h.add(true));
	System.out.println(h);	
	}

}
