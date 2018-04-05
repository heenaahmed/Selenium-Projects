import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RegularExpression {
	
public static void main(String[] args)
	{
		
WebDriver driverobject = new ChromeDriver();

System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");

driverobject.get("http://www.rediff.com/");

System.out.println(driverobject.getTitle()); 
System.out.println(driverobject.getCurrentUrl());

driverobject.findElement(By.cssSelector("a[title*='Sign in']")).click();

driverobject.findElement(By.cssSelector("input[id*='loign']")).sendKeys("Lets see");

//driverobject.findElement(By.xpath("//input(contains[@id,'login'])")).sendKeys("This works Bey");

driverobject.findElement(By.cssSelector("input[name*='pas']")).sendKeys("uhoo");




	
	
		
	}

}
