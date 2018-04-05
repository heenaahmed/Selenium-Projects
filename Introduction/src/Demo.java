import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo
 {
	 public static void main(String[] args)
	 {
		WebDriver driverobject = new ChromeDriver();
System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");

driverobject.get("http://www.google.com"); //hit url on the browser
System.out.println(driverobject.getTitle()); //get title of the browser which is google for this
System.out.println(driverobject.getCurrentUrl()); //validate if u r landed on correct url	
//System.out.println(driverobject.getPageSource()); //get that page source code.

driverobject.get("http://www.facebook.com");
//driverobject.findElement(By.xpath("//*[@id='email']")).sendKeys("Tasneemsmileforever@gmail.com");

driverobject.findElement(By.xpath("//*[contains(@name, 'email123')]")).sendKeys("");
driverobject.findElement(By.cssSelector("input#pass.inputtext")).sendKeys("Light7866..");
driverobject.findElement(By.cssSelector("input#u_0_2")).click();



driverobject.navigate().back(); //navigates back to the previous url which is google.com
//driverobject.close(); //close the browser
//driverobject.quit();// it close all the browser opened by selenium script.





	 }
 }