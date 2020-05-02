package framework;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeSuite;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;

import java.util.concurrent.TimeUnit;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestClass1 {
  WebDriver driver;
  @Test
  public void loginIntoAmazon() {
	  boolean pageOpened = driver.getTitle().contains("Online Shopping site in India");
	  Assert.assertEquals(pageOpened, true);
	  driver.close();
  }
  @BeforeSuite
  public void beforeSuite() {
	  //doing the setup
	  String currentDirectory = System.getProperty("user.dir");
	  System.out.println(currentDirectory+"\\src\\test\\resources\\\\src\\test\\resources");
	  System.setProperty("webdriver.chrome.driver",currentDirectory + "\\src\\test\\resources\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	  driver.get("https://www.amazon.in/");
  }


}
