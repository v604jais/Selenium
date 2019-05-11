package iO;

import java.io.*;
import java.util.*;

public class ReadingPropFile {

	public static void main(String[] args) {
		
		String path= System.getProperty("user.dir")+"/TestData/Property.properties";
		
		try {
			File file= new File (path);
			FileInputStream fin= new FileInputStream(file);
			System.out.println(fin.available());
			Properties prop= new Properties();
			prop.load(fin);
			 System.out.println(prop.getProperty("URL"));
			
			
		} catch (Exception e) {
			
			e.printStackTrace();
			System.out.println(e.getMessage());
		}

	}

}
