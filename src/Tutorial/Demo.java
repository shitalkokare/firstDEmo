package Tutorial;

import java.util.LinkedHashSet;

public class Demo {

	public static void main(String[] args) {
		
	
		String a = "cucumber";
		char[] abc = a.toCharArray();

		LinkedHashSet s = new LinkedHashSet();

		String b = "";//cumber
		String c = "";//cu

		for (int i = 0; i < abc.length; i++) //8
		{
			if (s.add(abc[i])) 
			{		//"cumbe"+r
				b = b + abc[i];//cu+m=cumber
			} 
			else {
				
				c = c + abc[i];//c+u
			}
		}

		System.out.println(b);//cumber

		System.out.println(c);//cu

		
		
		
	}

}
