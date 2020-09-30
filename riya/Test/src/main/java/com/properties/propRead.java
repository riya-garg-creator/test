package com.properties;

import java.io.FileInputStream;
import java.util.Properties;

public class propRead {
	
	public static String propertyFile(String value) throws Exception {
		Properties prop = new Properties();
		FileInputStream file = new FileInputStream("D:\\workspace\\Test\\src\\main\\resources\\prop.properties");
		prop.load(file);
		return prop.getProperty(value);	
	}
	

}
