package simpletest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FlipKart {
  @Test
  public void openFlipKart() throws InterruptedException 
  {
	  WebDriver driver= new ChromeDriver();
	  //Thread.sleep(1000);
	  driver.get("https://www.flipkart.com/");
	  Thread.sleep(1000);
	  driver.close();
	  Thread.sleep(1000);
  }
}
