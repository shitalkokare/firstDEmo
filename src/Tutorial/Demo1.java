package Tutorial;

import java.util.Comparator;
import java.util.TreeSet;

public class Demo1 {

	public static void main(String[] args) {
		// 65,66,67,99,106,115
		TreeSet<String> t=new TreeSet<String>();
		t.add("selenium");//115
		t.add("java");//106
		t.add("100");
		t.add("cucumber");//99
		t.add("A");//65
		t.add("B");//66
		t.add("C");//67
		System.out.println(t);
		
//		System.out.println(t.pollFirst());
//		System.out.println(t.pollLast());

		System.out.println(t.descendingSet());
		System.out.println(t.lower("C"));
		
		System.out.println(t.higher("selenium"));
		System.out.println(t.lower("C"));
		System.out.println(t.floor("java"));
		
		
		
		
		
		
		
		
		

	}

}
