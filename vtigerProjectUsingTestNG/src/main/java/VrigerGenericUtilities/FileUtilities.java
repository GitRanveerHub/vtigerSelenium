package VrigerGenericUtilities;

import java.io.FileInputStream;
import java.util.Properties;

public class FileUtilities {
	
	/**
	 * it is used return the value from property file based on key
	 * @param key
	 * @return
	 * @throws Throwable
	 * author Ranveer
	 */

	public String getKeyAndValueData(String key) throws Throwable {
		    FileInputStream fis = new FileInputStream("C:\\Users\\karan\\Downloads\\VtigerBasicURL01.properties");
	        Properties pro = new Properties();
	        pro.load(fis);
			return pro.getProperty(key);
	}
}
