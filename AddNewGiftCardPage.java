package POM;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AddNewGiftCardPage  {
 
private WebDriver driver;
  private WebDriverWait wait;

	  @FindBy(xpath = "//i[@class='nav-icon fas fa-shopping-cart']")
	  private WebElement saleIcon;

	  @FindBy(xpath = "//p[text()=' Gift cards']")
	  private WebElement giftCardOption;

	  @FindBy(xpath = "//a[@class='btn btn-primary']")
	  private WebElement addNewButton;

	  @FindBy(xpath = "//input[@data-val-required='The Initial value field is required.']")
	  private WebElement initialValue;

	  @FindBy(xpath = "//input[@id='IsGiftCardActivated']")
	  private WebElement giftCardBox;

	  @FindBy(xpath ="//button[@id='generateCouponCode']")
	  private WebElement couponCode;

	  @FindBy(xpath ="(//input[@class='form-control text-box single-line'])[2]")
	  private WebElement recipientsName;

	  @FindBy(xpath = "//input[@id='RecipientEmail']")
	  private WebElement recipientsEmail;

	  @FindBy(xpath = "//input[@id='SenderName']")
	  private WebElement senderName;

	  @FindBy(xpath = "//input[@id='SenderEmail']")
	  private WebElement sendermail;

	  @FindBy(xpath = "//textarea[@id='Message']")
	  private WebElement message;
	  
	  @FindBy(xpath="//button[@name='save']")
	  private WebElement SaveButton;

	  
	  public AddNewGiftCardPage(WebDriver driver) {
	      this.wait = new WebDriverWait(driver, Duration.ofSeconds(5));
	  //Thread.sleep(3000);
	  }

	  public void clickSaleIcon() throws Exception {
	     // wait.until(ExpectedConditions.elementToBeClickable(saleIcon)).click();
	  Thread.sleep(3000);
	  saleIcon.click();
	  }

	  public void clickGiftCardOption() throws InterruptedException {
	     // wait.until(ExpectedConditions.elementToBeClickable(giftCardOption)).click();
		  Thread.sleep(3000);
		  giftCardOption.click();
	  }

	  // Method to click on the Add New Button
	  public void clickAddNewButton() throws InterruptedException {
	      //wait.until(ExpectedConditions.elementToBeClickable(addNewButton)).click();
		  Thread.sleep(3000); 
		  addNewButton.click();
	  }

	  public void InitialValue() throws InterruptedException {
	      //for (int i = 0; i < 20; i++) {
	         // wait.until(ExpectedConditions.elementToBeClickable(initialValue)).click();
	      Thread.sleep(3000);
	      //initialValue.click();
	      initialValue.sendKeys("230000");
	     
	  }

	  public void clickGiftCardBox() throws InterruptedException {
	      
		 //wait.until(ExpectedConditions.elementToBeClickable(giftCardBox)).click();
	     Thread.sleep(3000); 
	  	  giftCardBox.click();
	  }
	  
	  public void clickCouponCode() throws InterruptedException {
	     // wait.until(ExpectedConditions.elementToBeClickable(couponCode)).click();
		  Thread.sleep(2000);
		  couponCode.click();
	  }

	  public void fillRecipientsName(String name) throws InterruptedException {
	      //wait.until(ExpectedConditions.elementToBeClickable(recipientsName)).sendKeys(name);
		  Thread.sleep(2000);
		 // fillRecipientsName(name);
		  recipientsName.sendKeys("Mugilan");	  
	  }

	  public void fillRecipientsEmail(String email) throws InterruptedException {
	      //wait.until(ExpectedConditions.elementToBeClickable(recipientsEmail)).sendKeys(email);
		  Thread.sleep(2000);
		  recipientsEmail.sendKeys("mugilanmugi2002dha@gmail.com");
	  }

	  public void fillSenderName(String name) throws InterruptedException {
	      //wait.until(ExpectedConditions.elementToBeClickable(senderName)).sendKeys(name);
		  Thread.sleep(2000);
		  senderName.sendKeys("Jackson");
	  }

	  public void fillSendermail(String email) throws InterruptedException {
	      //wait.until(ExpectedConditions.elementToBeClickable(sendermail)).sendKeys(email);
		  Thread.sleep(2000);
		  sendermail.sendKeys("jackson123@gmail.com");
	  }

	  public void fillMessage(String messageText) throws InterruptedException {
	      //wait.until(ExpectedConditions.elementToBeClickable(message)).sendKeys(messageText);
		  Thread.sleep(2000);	
		  message.sendKeys("Congratulations!You have just recevied the gift of a one-hour private hypnotherapy session.");
		 
	 
	}
public void ClickSaveButton()throws InterruptedException{
	Thread.sleep(2000);
	SaveButton.click();
}

	
}
