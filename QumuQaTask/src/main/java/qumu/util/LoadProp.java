package qumu.util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class LoadProp {

	static String PropLoc = "./src/test/resources/TestData/TestData.properties";
	public static Properties prop = new Properties();;
	static FileInputStream input;
	
	public static String getURL(String key) {
		
		try {
			input = new FileInputStream(PropLoc);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		try {
			prop.load(input);
		} catch (IOException e) {
			e.printStackTrace();
		}			
		return prop.get(key).toString();
	}



	public static String getproperty(String key) {
	
		try {
			input = new FileInputStream(PropLoc);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		try {
			prop.load(input);
		} catch (IOException e) {
			e.printStackTrace();
		}			
		return prop.get(key).toString();
	}
	
	public static  String getScreenshotlocation(String key) {
	
		try {
			input = new FileInputStream(PropLoc);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		try {
			prop.load(input);
		} catch (IOException e) {
			e.printStackTrace();
		}			
		return prop.get(key).toString();
	}
}
