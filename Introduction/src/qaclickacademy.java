import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class qaclickacademy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
WebDriver driverobject = new ChromeDriver();
System.setProperty("webdriver.driver.chrome", "C:\\chromedriver.exe");

driverobject.get("http://www.qaclickacademy.com/interview.php");

driverobject.findElement(By.xpath("//li[@id='tablist1-tab1']")).click();

driverobject.findElement(By.xpath("//li[@id='tablist1-tab1']/following-sibling::li[1]")).click();

driverobject.findElement(By.xpath("//li[@id='tablist1-tab1']/following-sibling::li[2]")).click();
driverobject.findElement(By.xpath("//li[@id='tablist1-tab1']/following-sibling::li[3]")).click(); 

// "//li[@id='tablist1-tab1']/following-sibling::li[3]"




		
		

	}

}
