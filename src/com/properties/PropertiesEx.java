package com.properties;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Writer;
import java.nio.charset.Charset;
import java.util.Properties;
import java.util.Set;
import java.io.File;
import java.io.FileInputStream;
public class PropertiesEx {

	public static void main(String[] args) throws IOException {
		Properties p=new Properties();  
	/*	p.setProperty("name","Sonoo Jaiswal");  
		p.setProperty("email","sonoojaiswal@javatpoint.com");  
		  
		p.store(new FileWriter("info.properties"),"Javatpoint Properties Example");  
		p.store(new FileOutputStream("info2.properties"),"storing using outputstream");
		
		String value1,value2;
		value1=p.getProperty("name");
		value2=p.getProperty("email");
		
		System.out.println(value1+"  "+value2);
		Set<String> name=p.stringPropertyNames();
		System.out.println(name);
		p.list(System.out);
		
		PrintWriter pw=new PrintWriter(new File("info3.properties"));
		p.list(pw);
		pw.flush();*/
		
		p.load(new FileInputStream(new File("info3.properties")));
		String value1,value2;
		value1=p.getProperty("name");
		value2=p.getProperty("email");
		
		System.out.println(value1+"  "+value2);
	

	}

}
