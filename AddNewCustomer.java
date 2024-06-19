package POM;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Helper.BaseClass;

public class AddNewCustomer extends BaseClass{
//
//    private WebDriver driver;
//    private WebDriverWait wait;

    @FindBy(xpath = "//i[@class='nav-icon far fa-user']")
    private WebElement customerIcon;

    @FindBy(xpath = "//p[text()=' Customers']")
    private WebElement customerOption;

    @FindBy(xpath = "//a[@class='btn btn-primary']")
    private WebElement addNewButton;

    @FindBy(xpath = "//input[@id='Email']")
    private WebElement email;

    @FindBy(xpath = "//input[@id='Password']")
    private WebElement password;

    @FindBy(xpath = "//input[@id='FirstName']")
    private WebElement firstName;

    @FindBy(xpath = "//input[@id='LastName']")
    private WebElement lastName;

    @FindBy(xpath = "//input[@id='Gender_Male']")
    private WebElement gender;
//
//    @FindBy(xpath = "//span[@aria-controls='DateOfBirth_dateview']")
//    private WebElement dateOfBirthButton;
//
//    @FindBy(xpath = "//div[@id='DateOfBirth_dateview']")
//    private WebElement dateOfBirthPicker; 
//
//    @FindBy(xpath = "//a[@aria-live='assertive']")
//    private WebElement currentMonthYear;
//
//    @FindBy(xpath = "//a[@aria-label='Previous']")
//    private WebElement previousButton;
//
//    @FindBy(xpath = "//a[@data-value='2002/7/08']")
//    private WebElement dateOfBirth;
@FindBy(xpath="//input[@name='DateOfBirth']")
private WebElement DateOfBirth;
  
    
    @FindBy(xpath = "//input[@id='Company']")
    private WebElement companyName;

    @FindBy(xpath = "//input[@id='IsTaxExempt']")
    private WebElement taxBox;

    @FindBy(xpath = "//span[@class='select2-selection select2-selection--multiple']")
    private WebElement newsLetter; 
    
    @FindBy(xpath = "//ul[@id='SelectedNewsletterSubscriptionStoreIds_listbox']/li[1]")
    private WebElement newsLetterOption;
    
    @FindBy(xpath="//span[@class='select2-selection select2-selection--multiple']")
    private WebElement CustomerRoles;

    @FindBy(xpath = "//textarea[@id='AdminComment']")
    private WebElement adminComment;
    
    @FindBy(xpath="//button[@name='save']")
    private WebElement Save;

    public AddNewCustomer(WebDriver driver) throws InterruptedException {
        this.driver = driver;
       // this.wait = new WebDriverWait(driver, Duration.ofSeconds(20));
    Thread.sleep(2000);
    }

    public void clickCustomerIcon() throws InterruptedException {
       // wait.until(ExpectedConditions.elementToBeClickable(customerIcon)).click();
    Thread.sleep(2000);
    customerIcon.click();
    
    }

    public void clickCustomerOption() throws InterruptedException {
        //wait.until(ExpectedConditions.elementToBeClickable(customerOption)).click();
    Thread.sleep(2000);
    customerOption.click();
    }

    public void clickAddNewButton() throws InterruptedException {
        //wait.until(ExpectedConditions.elementToBeClickable(addNewButton)).click();
       Thread.sleep(2000); 
       addNewButton.click();
    }

    public void fillEmail(String emailAddress) throws InterruptedException {
       // wait.until(ExpectedConditions.elementToBeClickable(email)).sendKeys(emailAddress);
        Thread.sleep(2000);
        email.sendKeys("mugilanmugi2002dha@gmail.com");
    }

    public void fillPassword(String passwordValue) throws InterruptedException {
        //wait.until(ExpectedConditions.elementToBeClickable(password)).sendKeys(passwordValue);
       Thread.sleep(2000);  
       password.sendKeys("1133557799");
    }

    public void fillFirstName(String firstNameValue) throws InterruptedException {
        //wait.until(ExpectedConditions.elementToBeClickable(firstName)).sendKeys(firstNameValue);
       Thread.sleep(2000); 
       firstName.sendKeys("Mugi");
    }

    public void fillLastName(String lastNameValue) throws InterruptedException {
       // wait.until(ExpectedConditions.elementToBeClickable(lastName)).sendKeys(lastNameValue);
    Thread.sleep(2000);
    lastName.sendKeys("lan");
    }

    public void clickGender() throws InterruptedException {
        //wait.until(ExpectedConditions.elementToBeClickable(gender)).click();
     Thread.sleep(2000);
     gender.click();
    }

   // public void clickDateOfBirthButton() throws InterruptedException {
        //wait.until(ExpectedConditions.elementToBeClickable(dateOfBirthButton)).click();
     //  Thread.sleep(2000);
       //dateOfBirthButton.sendKeys("08/07/2002");
   // }

    //public void waitDateOfBirthPickerVisibility() throws InterruptedException {
        //wait.until(ExpectedConditions.visibilityOf(dateOfBirthPicker));
      // Thread.sleep(2000);
       //dateOfBirthPicker.sendKeys("16/07/2002");
    //}

   // public String getCurrentMonthYear() {
     //   return currentMonthYear.getText();
    //}
//
//    public void clickPreviousButton() throws InterruptedException {
//        //wait.until(ExpectedConditions.elementToBeClickable(previousButton)).click();
//       Thread.sleep(2000);
    //}

 public void clickDateOfBirth()throws InterruptedException {
    	Thread.sleep(2000);
    	DateOfBirth.sendKeys("08/07/2002");
        
    }

    public void fillCompanyName(String companyNameValue) throws InterruptedException {
       // wait.until(ExpectedConditions.elementToBeClickable(companyName)).sendKeys(companyNameValue);
    Thread.sleep(3000);
    companyName.sendKeys("Google");
    
    }

    public void clickTaxBox() throws InterruptedException {
       // wait.until(ExpectedConditions.elementToBeClickable(taxBox)).click();
         Thread.sleep(2000);
         taxBox.click();
         
    }

    public void clickNewsLetter() throws InterruptedException {
        //wait.until(ExpectedConditions.elementToBeClickable(newsLetter)).click();
      Thread.sleep(2000);  
      newsLetter.sendKeys("Test Store 2");
    }
    public void ClickCustomerRoles()throws InterruptedException{
    	Thread.sleep(2000);
    	CustomerRoles.sendKeys("Vendors");
    }
    
   // public void selectNewsLetterOption() throws InterruptedException {
       // wait.until(ExpectedConditions.elementToBeClickable(newsLetterOption)).click();
     //  Thread.sleep(2000);
    //}
    
    public void fillAdminComment(String adminCommentValue) throws InterruptedException {
      //  wait.until(ExpectedConditions.elementToBeClickable(adminComment)).sendKeys(adminCommentValue);
       Thread.sleep(2000);
       adminComment.sendKeys("good");
       
    }
public void ClickSave()throws InterruptedException{
	Thread.sleep(2000);
	Save.click();
}
}

