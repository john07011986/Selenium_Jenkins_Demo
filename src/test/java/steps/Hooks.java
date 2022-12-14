package steps;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.cucumber.java.After;
import io.cucumber.java.Before;


public class Hooks extends BasePage {
	
	@Before
	public void precondition() {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
			driver.get("http://leaftaps.com/opentaps");
	}
	
	@After
	public void postcondition() {
		driver.close();
	}

}

