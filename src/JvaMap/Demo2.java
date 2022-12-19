package JvaMap;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Properties;

public class Demo2 {
	private static String path = System.getProperty("user.dir")+"//src//JvaMap//demo2.properties";

	public static void main(String[] args) throws IOException {
		Properties prop = new Properties();

		FileInputStream fis = new FileInputStream(path);

		prop.load(fis);

		System.out.println(prop.getProperty("username"));

		prop.setProperty("name", "selenium");

		FileOutputStream fos = new FileOutputStream(path);
		
		prop.store(fos, "Added name property");
		
		System.out.println(prop.getProperty("name"));
		
		Enumeration e =prop.propertyNames();
		
		while(e.hasMoreElements())
		{
			System.out.println(e.nextElement());
		}
		

	}

}
