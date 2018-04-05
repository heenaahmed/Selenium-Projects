import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice {
	
	
	public static void main(String[] args)
	 {
		WebDriver driverobject = new ChromeDriver();
System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");


driverobject.get("https://www.google.com/");

driverobject.findElement(By.xpath("//div[@class ='lst-c']/div/div[2]/div/input")).sendKeys("Facebook.com");


driverobject.close();
	
	
	
	 }	

}
