package JvaMap;

import java.util.HashMap;
import java.util.Map;

public class Demo {

	public static void main(String[] args) {
		
		HashMap h=new HashMap();
		h.put("firstname", "mayuri");
		h.put("lastname", "patil");
		h.put("phno", "9988776655");
		h.put("password", "mayuri123");
		h.put("dob", "8/dec/1999");
		h.put("gender", "male");
		h.put("gender", "female");
		
		
		HashMap h1=new HashMap();
		h1.put("firstname", "sayali");
		h1.put("lastname", "patil");
		h1.put("phno", "8976543234");
		h1.put("password", "sayli123");
		
		
//		System.out.println(h.get("phno"));
//		System.out.println(h.containsKey("dob"));
//		System.out.println(h.containsValue("female"));
//		System.out.println(h.isEmpty());
//		System.out.println(h.size());
//		System.out.println(h.keySet());
//		System.out.println(h.values());
//		System.out.println(h.entrySet());
		
		h.putAll(h1);
		System.out.println(h);
		
		h.remove("phno");
		System.out.println(h);
		
		h.clear();
		System.out.println(h);
		
		
		
	}

}
