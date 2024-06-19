package POM;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Helper.BaseClass;

public class AdminLoginPage extends BaseClass{

	@FindBy(xpath="//input[@type='email']")
	WebElement emailIdTxtBx;
	
	
	@FindBy(xpath="//input[@value='admin']")
	WebElement pwdTxtBx;
	
	@FindBy(xpath = "//button[@class='button-1 login-button']")
	WebElement loginBtn;
	
	@FindBy(xpath="//input[@type='checkbox']")
	WebElement remembermeChBx;
	
	public WebElement getEmailIdTxtBx() {
		return emailIdTxtBx;
	}

	public WebElement getPwdTxtBx() {
		return pwdTxtBx;
	}
	

	
	public WebElement getRemembermeChBx() throws Exception {
		
		return remembermeChBx;
	}
		public WebElement getLoginBtn() throws InterruptedException {
			
			return loginBtn;
		
	}
	
	
	
	
	



}
