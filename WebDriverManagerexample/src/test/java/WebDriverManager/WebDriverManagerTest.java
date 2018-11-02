package WebDriverManager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriverManagerTest {
	
	@Parameters({"Url"})
	@Test
	public void WebDriverManagerSetup(String Url) {
		//Setup the Chrome Driver using the WebDriver Manager
		WebDriverManager.chromedriver().setup();		
		//create Driver object for chrome
		WebDriver driver = new ChromeDriver();
		//navigate to browser 
		driver.get(Url);
		//quit the browser
		driver.quit();
	}

}
