package seleniumudemy;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class actionsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driverobject = new ChromeDriver();


		driverobject.get("https://www.amazon.com/");
		
		Actions a = new Actions(driverobject);
		
		//WebElement moveobject = driverobject.findElement(By.xpath("//*[@id='nav-link-accountList']span[2]"));
		
		//a.moveToElement(moveobject).build().perform();
		
		a.moveToElement(driverobject.findElement(By.id("twotabsearchtextbox"))).click().keyDown(Keys.SHIFT).sendKeys("hello").build().perform();
		
		
	}

}
