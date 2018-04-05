import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButtons {
	
	public static void main(String[] args)
	{
		
  System.setProperty("webdriver.chrome.driver", "C:\\Chromedriver.exe");	
  
  //@SuppressWarnings("unused")
WebDriver driverobject = new ChromeDriver();
  

driverobject.get("http://echoecho.com/htmlforms10.htm");


int count = (driverobject.findElements(By.xpath("//input[@name='group1']")).size());

for(int i=0;i<count;i++)
{
	String text = driverobject.findElements(By.xpath("//input[@name='group1']")).get(i).getAttribute("value");
	if(text.equals("Cheese"))
	{
		driverobject.findElements(By.xpath("//input[@name='group1']")).get(i).click();
	}
	
	
}


		
	}

}
