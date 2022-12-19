package ProgramHashSet;

import java.util.HashSet;

public class Demo4 {

	public static void main(String[] args) {

		String a = "java";

		char[] abc = a.toCharArray();

		HashSet hs = new HashSet();

		for (int i = 0; i < abc.length; i++) {
			hs.add(abc[i]);
		}

		Object[] abcd = hs.toArray();
		
		for(Object o:abcd)
		{
			System.out.print(o);
		}

	}

}
