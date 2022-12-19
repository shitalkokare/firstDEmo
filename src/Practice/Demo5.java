package Practice;

import java.util.Stack;

public class Demo5 {

	public static void main(String[] args) {
		
		Stack h=new Stack();
		h.add("selenium");
		h.add("java");
		h.add("testNG");
		h.add(122);
		h.add(12.34);
	
		
//		h.push("A");
//		System.out.println(h);
//		h.pop();
//		System.out.println(h);
//		System.out.println(h.peek());
//		h.removeAllElements();
//		System.out.println(h.empty());

		System.out.println(h.search(122));		
	}

}
