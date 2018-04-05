import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookXpath {
	
	
	public static void main(String[] args)
	{
System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
WebDriver driverobject = new ChromeDriver();


driverobject.get("https://wwww.facebook.com");
System.out.println(driverobject.getTitle()); 
System.out.println(driverobject.getCurrentUrl());

driverobject.findElement(By.xpath("//*[@data-testid='royal_email']")).sendKeys("Tasneemsmileforever@gmail.com");

driverobject.findElement(By.xpath("//*[@data-testid='royal_pass']")).sendKeys("Light7866..");

driverobject.findElement(By.xpath("//*[@data-testid='royal_login_button']")).click();

	}

}
