package ProgramHashSet;

import java.util.HashSet;

public class Demo2 {

	public static void main(String[] args) throws CloneNotSupportedException {
		HashSet s=new HashSet();
		s.add("selenium");
		s.add("cucumber");
		s.add(123);
		s.add(12.33f);
		s.add('s');
		s.add(true);
		
		HashSet s1=new HashSet();
		s1.add("java");
		s1.add("testNG");
		s1.add(12);
		s1.add('A');
		s1.add('B');
		s1.add(false);
		
		//System.out.println(s);
   s.addAll(s1);
//		System.out.println(s);
//		s.retainAll(s1);
//		System.out.println(s1);
		
//		s.remove(123);
//		System.out.println(s);

//		s.removeAll(s1);
//		System.out.println(s);
//		
//		boolean s2=s1.contains("testNG");
//		System.out.println(s2);
		
//		boolean s2=s.containsAll(s1);
//		System.out.println(s2);
//			s1.clear();
//		System.out.println(s1);
//		System.out.println(s1.isEmpty());
//		
		//System.out.println(s.size());
		
		Object a=s1.clone();
		System.out.println(a);
		
		
		
		
		
	}

}
