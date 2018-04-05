import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;

public class Firefox {

		 public static void main(String[] args)
		 {
 WebDriver driverobject = new ChromeDriver();
 System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
 
 driverobject.get("https://www.facebook.com/");
 driverobject.findElement(By.id("email")).sendKeys("Tasneemsmileforever@gmail.com");
 
 
 driverobject.findElement(By.name("pass")).sendKeys("Light7866..");
 
 //driverobject.findElement(By.xpath("//*[@id=\'pw\']")).sendKeys("Light7866..");
 
 driverobject.findElement(By.xpath("//*[@id='u_0_y']")).click();
 
 //driverobject.findElement(By.id("u_0_2")).click();
 
 //driverobject.findElement(By.linkText("Forgot account?")).click();  //*[@id="u_0_y"]  //*[@id="u_0_y"]
 
// driverobject.findElement(By.className("inputtext")).sendKeys("You are the pain my ass");
 
 
 
 //driverobject.close();
 
			 
			 
		 }


	
}
