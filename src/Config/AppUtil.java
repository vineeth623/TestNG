package Config;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class AppUtil
 
{
	
	public static  WebDriver driver;
	@BeforeTest
	public static void SetUp() {
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://facebook.com");
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	driver.findElement(By.name("(//input[@id='email'])[1]")).sendKeys("andmin");
	driver.findElement(By.name("//input[@id='pass']")).sendKeys("admin");
	driver.findElement(By.name("//button[@id='loginbutton']")).click("");
	
	}
	 @AfterTest
	 public static void TearDown()
	 {
	 driver.close();

	}
	 

	}
    
    
    
    
    
    
    