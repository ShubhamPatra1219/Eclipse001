/**
 * 
 */
package facebook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
/**
 * @author Shubham Patra for Facebook to Open
 *
 */
public class OpenFacebookPage {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\Rajdip Selenium Class\\Jars and Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());//Print title of page
		System.out.println(driver.getCurrentUrl());//Getting URL
		driver.findElement(By.name("email")).sendKeys("test@gmail.com");//Enter Email
		driver.findElement(By.id("pass")).sendKeys("Test@1234");//Enter Password
		driver.findElement(By.name("login")).click();//click login
		driver.navigate().back();//go back
		driver.navigate().refresh();
		driver.close();
		driver.quit();
	}

}
