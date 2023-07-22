import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class NewTest {
  @Test
  public void AmazonBrowser() 
  {
	  WebDriver driver= new ChromeDriver();
	  driver.get("https://www.amazon.in/");
	  
  }
}
