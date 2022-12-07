package Nov22;


import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.formula.functions.Index;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.FindActiveElement;
import org.openqa.selenium.remote.server.handler.FindElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
public class PropertyFile {
	public Properties p;
	WebDriver driver;
	@BeforeTest
	public void setUp()throws Throwable
	{
		 p= new Properties();
		 p.load(new FileInputStream("C:\\Users\\VINEETH KUMAR\\Documents\\WorkFrame\\Flight.properties"));
		 driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get(p.getProperty("url"));
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);	 
	}		
	@Test
	public void validateRegister()
	{
		driver.findElement(By.xpath(p.getProperty("objFrom"))).sendKeys(p.getProperty("hydarabad"));
		driver.findElement(By.xpath(p.getProperty("objoneway "))).sendKeys(p.getProperty("yes"));
		driver.findElement(By.xpath(p.getProperty("objroundTrip"))).sendKeys(p.getProperty("no"));
		driver.findElement(By.xpath(p.getProperty("objTo"))).sendKeys(p.getProperty("dubai"));
		new Select(driver.findElement(By.xpath(p.getProperty("objsearch")))).selectByIndex(0);
		driver.findElement(By.xpath(p.getProperty("infants"))).click();
		driver.findElement(By.xpath(p.getProperty("objAdult ="))).click();
		driver.findElement(By.xpath(p.getProperty("Classoftravel"))).click();
        driver.findElement(By.xpath(p.getProperty("objmoreoptions"))).click();
        driver.findElement(By.xpath(p.getProperty("objChildren"))).click();
        driver.findElement(By.xpath(p.getProperty("Departon"))).click();
       }
	    
	   
		
	}












