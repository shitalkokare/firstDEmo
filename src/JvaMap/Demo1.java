package JvaMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Demo1 {

	public static void main(String[] args) {
		HashMap h=new HashMap();
		h.put("firstname:- ", " mayuri");
		h.put("lastname:- ", " patil");
		h.put("phno:- ", " 9988776655");
		h.put("password:- ", " mayuri123");
		h.put("dob:- ", " 8/dec/1999");
		h.put("gender:- ", " male");
		h.put("gender:- ", " female");
		
		
		Set s =h.entrySet();
		Iterator it =s.iterator();
		while(it.hasNext())
		{
			Map.Entry me = (Map.Entry)it.next();
			System.out.print(me.getKey());
			
			System.out.println(me.getValue());
			if(me.getKey().equals("firstname"))
			{
				me.setValue("Amol");
			}
			
		}
		
		System.out.println(h);
		
		
		
		

	}

}
