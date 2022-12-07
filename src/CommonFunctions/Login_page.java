package CommonFunctions;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Login_page {
//define Repository
	@FindBy(name ="username")
	WebElement user;
	@FindBy(xpath ="//input[@placeholder='Password']")
	WebElement pass;
	@FindBy(name ="button")
	WebElement login_Btn;
	//define method
	public void verifyLogin(String username,String password) 
	{
	   user.sendKeys(username);
	   pass.sendKeys(password);
	   login_Btn.click();
	}

	
		  user.sendKeys(username);
		  
		  
	}
	
	
	
}
