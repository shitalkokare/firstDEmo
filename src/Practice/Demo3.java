package Practice;

import java.util.LinkedList;

public class Demo3 {

	public static void main(String[] args) {
		LinkedList h=new LinkedList();
		h.add("selenium");
		h.add("java");
		h.add("testNG");
		h.add(122);
		h.add(12.34);
		h.add(true);
		
		h.addLast("A");
		System.out.println(h);
		System.out.println(h.getFirst());
		System.out.println(h.getLast());
		h.removeFirst();
		System.out.println(h);
		h.removeLast();
		System.out.println(h);
		
		
		
		
		
		
	}

}
