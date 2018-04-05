package seleniumudemy;

import java.util.Iterator;
import java.util.Set;

//import javax.swing.text.html.HTMLDocument.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingMultipleWindows {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driverobject = new ChromeDriver();
		driverobject.get("https://accounts.google.com/SignUp?hl=en");
		driverobject.findElement(By.xpath("//*[@id='wrapper']/div[2]/div/div[1]/p/a")).click();
		
		System.out.println(driverobject.getTitle());
		
		Set<String>ids=driverobject.getWindowHandles();
		Iterator<String> itera=ids.iterator();
		
		String parentId=itera.next();
		String childId=itera.next();
		driverobject.switchTo().window(childId);
		System.out.println(driverobject.getTitle());
	}

}
