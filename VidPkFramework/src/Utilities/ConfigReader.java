package Utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {
	
	Properties prop;
	
	public ConfigReader() {
		
		try {
			File src = new File("C:\\Users\\Jehan Aurangzeb\\Documents\\Selenium\\VidPkFramework\\Configration\\config.property");
			
			FileInputStream fis = new FileInputStream(src);
			
			prop = new Properties();
			
			prop.load(fis);
	
		} catch (IOException e) {
	
			System.out.println("Exception is ==" + e.getMessage());
		}
	}
	
	public String getVidPkUrl() {
		
		String text = prop.getProperty("VidPkUrl");
		return text;
	}

}
