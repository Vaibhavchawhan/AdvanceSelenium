package CommonUtils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;

public class PropertyFileUtils {

	public String getDataFromPropertyFile(String keyname) throws IOException {
		FileInputStream fis = new FileInputStream("src\\test\\resources\\LoginCredential.properties");
		Properties properties = new Properties();
		properties.load(fis);
		String value = properties.getProperty(keyname);
		return value;

	}

	
}
