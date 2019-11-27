import java.security.PublicKey;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google {

	public static void main(String[] args) {
		
		//System.setProperty("webdriver.firefox.marionette", "C:\\Users\\User\\Downloads\\geckodriver-v0.26.0-win64\\geckodriver.exe");
		//WebDriver driver = new FirefoxDriver();
		//driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://hikarifood.ga/#/login");
		driver.findElement(By.id("staffId")).sendKeys("0000015");
		driver.findElement(By.id("staffPassword")).sendKeys("0000015");
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div/form/div/div/div/div/div/div[3]/div[1]/button")).click();;

		
		//driver.close();
	}

}
