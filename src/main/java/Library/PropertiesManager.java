package Library;

import java.io.FileInputStream;
import java.util.Properties;

public class PropertiesManager {
	
public static void main(String[] args) {
	
	
	PropertiesManager get_valu = new PropertiesManager();
	get_valu.get_value("dev-url");
	System.out.println(get_valu.get_value("dev-url"));
	
}	
	private Properties pro;
	private FileInputStream input;
	String file_path = "resources/application.properties";
	
	public String get_value(String key) {
		try {
			pro = new Properties();
			input = new FileInputStream(file_path);
			pro.load(input);
		} catch (Exception e) {
			
	}
		return pro.getProperty(key);
						
			
		}
	}


