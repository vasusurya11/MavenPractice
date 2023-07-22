package simpletest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AmazonBrowser 
{
  @Test
  public void openAmazon() throws InterruptedException 
  {
	  WebDriver driver= new ChromeDriver();
	 // Thread.sleep(1000);
	  driver.get("https://www.amazon.in/");
	  Thread.sleep(1000);
	  driver.close();
	  Thread.sleep(1000);
	  
  }
}
