import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Implicit {

public static void main(String[] args) throws InterruptedException {
// TODO Auto-generated method stub
	
System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");

WebDriver driverobject = new ChromeDriver();

// driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
driverobject.get("https://alaskatrips.poweredbygps.com/g/pt/hotels?MDPCID=ALASKA-US.TPS.BRAND.hotels.HOTEL");
driverobject.findElement(By.id("H-destination")).sendKeys("nyc");
driverobject.findElement(By.id("H-destination")).sendKeys(Keys.TAB);
driverobject.findElement(By.id("H-fromDate")).sendKeys(Keys.ENTER);

WebDriverWait d=new WebDriverWait(driverobject,20);
d.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@id='resultsContainer']/section/article[1]")));
//Thread.sleep(5000L);

driverobject.findElement(By.xpath("//div[@id='resultsContainer']/section/article[1]")).click();
   




}

}