package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

//import Helper.BaseClass;


//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.FindBy;

import Helper.BaseClass;

public class AddNewDiscountPage extends BaseClass {
	@FindBy(xpath="//p[normalize-space()='Promotions']")
	private WebElement promotionOptionicon;
	
	@FindBy(xpath="//p[text()=' Discounts']")
	private WebElement DiscountsIcon;
	
	@FindBy(xpath="//a[@class='btn btn-primary']")
	private WebElement AddNewButton;

	@FindBy(xpath="//input[@id='IsActive']")
	private WebElement isActive;
	
	@FindBy(xpath="//input[@data-val-required='Please provide a name.']")
	private WebElement discountName;
	
	@FindBy(xpath="//select[@id='DiscountTypeId']")
	private WebElement dicountType;

@FindBy(xpath="//input[@name='UsePercentage'][1]")
private WebElement  usePercentage;

@FindBy(xpath="//input[@name='DiscountAmount']")
private WebElement discountAmount;

@FindBy(xpath="//input[@name='RequiresCouponCode'][1]")
private WebElement RequiresCouponCode;

@FindBy(xpath="//input[@name='RequiresCouponCode'][1]")
private WebElement CouponCode;

@FindBy(xpath="//input[@name='StartDateUtc']")
private WebElement StartDate;

@FindBy(xpath="//input[@name='EndDateUtc']")
private WebElement EndDate;

@FindBy(xpath="//input[@id='IsCumulative']")
private WebElement Cumulative;


@FindBy(xpath="//select[@name='DiscountLimitationId']")
private WebElement DiscountLimitation;

@FindBy(xpath="//input[@name='LimitationTimes']")
private WebElement LimitationTimes;

@FindBy(xpath="//textarea[@name='AdminComment']")
private WebElement AdminComment;

@FindBy(xpath="//button[@name='save']")
private WebElement SaveButton;


public void addNewDiscountPage(WebDriver driver)throws  InterruptedException{
	this.driver=driver;
	Thread.sleep(2000);
}
public void ClickpromotionOptionicon()throws InterruptedException{
	Thread.sleep(2000);
	promotionOptionicon.click();
}
public void ClickDiscountsIcon()throws InterruptedException{
	Thread.sleep(2000);
	DiscountsIcon.click();
}
public void ClickAddNewButton()throws InterruptedException{
	Thread.sleep(2000);
	AddNewButton.click();
	
}
public void ClickDiscountName()throws InterruptedException{
	Thread.sleep(2000);
	 discountName.sendKeys("Mugilan");
		
}
public void ClickDicountType()throws InterruptedException{
	Thread.sleep(2000);
	dicountType.sendKeys("Assigned to order Product");
}
public void ClickusePercentage()throws InterruptedException{
	Thread.sleep(2000);
	usePercentage.click();
}
public void ClickDiscountAmount()throws InterruptedException{
	Thread.sleep(2000);
	discountAmount.sendKeys("20000");
	
}
public void ClickRequiresCouponCode()throws InterruptedException{
	Thread.sleep(2000);
	RequiresCouponCode.click();
}
public void ClickCouponCode()throws InterruptedException{
	Thread.sleep(2000);
	CouponCode.sendKeys("#123$%^&");
}
public void ClickStartDate()throws InterruptedException{
	Thread.sleep(2000);
	StartDate.sendKeys("18/03/2024");
}
public void ClickEndDate()throws InterruptedException{
	Thread.sleep(2000);
	EndDate.sendKeys("30/03/2024");
}
public void ClickCumulative()throws InterruptedException{
	Thread.sleep(2000);
	Cumulative.click();
}
public void ClickDiscountLimitation()throws InterruptedException{
	Thread.sleep(2000);
	DiscountLimitation.sendKeys("N times only");
}
public void ClickLimitationTimes()throws InterruptedException{
	Thread.sleep(2000);
	LimitationTimes.sendKeys("10");
}
public void ClickAdminComment()throws InterruptedException{
	Thread.sleep(2000);
	AdminComment.sendKeys("Good");
}
public void ClickSaveButton()throws InterruptedException{
	Thread.sleep(2000);
	SaveButton.click();
}
}

