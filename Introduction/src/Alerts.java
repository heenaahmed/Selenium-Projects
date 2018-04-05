import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Alerts {
	
	
	public static void main(String[] args)
	{
	System.setProperty("webdriver.chrome.driver", "C:\\Chromedriver.exe");	
	  
	  //@SuppressWarnings("unused")
	WebDriver driverobject = new ChromeDriver();
	
	driverobject.get("http://tizag.com/javascriptT/javascriptalert.php");
	
	driverobject.findElement(By.xpath("/html/body/table[3]/tbody/tr[1]/td[2]/table/tbody/tr/td/div[4]/form/input")).click();
	//driverobject.switchTo().alert().accept();
	
	System.out.println(driverobject.switchTo().alert().getText());

	//driver.switchTo().alert().sendKeys("fesfe");

	driverobject.switchTo().alert().accept(); //Accept = ok done yes

	//driver.switchTo().alert().dismiss();

	}

	
	
	}

