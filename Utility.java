package utilities;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.DataProvider;

import Helper.BaseClass;
import POM.AddNewProduct;
import POM.AdminLoginPage;
import TestCase.AddNewProductTest;

public class Utility extends BaseClass {

	public  void  loginpage(String username,String password) throws Exception {
		AdminLoginPage adminLoginPage=PageFactory.initElements(driver, AdminLoginPage.class);
		adminLoginPage.getEmailIdTxtBx().clear();
		adminLoginPage.getEmailIdTxtBx().sendKeys(username);
//driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
Thread.sleep(3000);
adminLoginPage.getPwdTxtBx().clear();
adminLoginPage.getPwdTxtBx().sendKeys(password);
adminLoginPage.getEmailIdTxtBx().click();
adminLoginPage.getRemembermeChBx();

adminLoginPage.getLoginBtn().click();


	}
@DataProvider(name="userData")
	public Object[][]userData(){
return new Object[][] {
	new Object[] {"admin@yourstore.com","admin"},
	};

}







}









