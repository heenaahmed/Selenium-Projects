import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SpiceJet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driverobject = new ChromeDriver();
		System.setProperty("webdriver.driver.chrome", "C:\\chromedriver.exe");
driverobject.get("http://spicejet.com/");

Select s = new Select(driverobject.findElement(By.cssSelector("select[id='ctl00_mainContent_ddl_Adult']")));
s.selectByValue("2");

Select e = new Select(driverobject.findElement(By.id("ctl00_mainContent_ddl_Child")));
e.selectByIndex(2);

Select l = new Select(driverobject.findElement(By.xpath("//select[@id='ctl00_mainContent_DropDownListCurrency']")));
l.selectByVisibleText("USD");

driverobject.findElement(By.cssSelector("*#ctl00_mainContent_ddl_originStation1_CTXT")).click();


driverobject.findElement(By.xpath("//a[@value='HYD']")).click();
driverobject.findElement(By.xpath("(//a[@value='DEL'])[2]")).click();


//driverobject.findElement(By.cssSelector("select[id='ctl00_mainContent_ddl_Adult']")).click();
		
		

	}

}
