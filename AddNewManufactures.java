package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Helper.BaseClass;

public class AddNewManufactures extends BaseClass{
//
//    private WebDriver driver;
//    private WebDriverWait wait;

    @FindBy(xpath = "//i[@class='nav-icon fas fa-book']")
    private WebElement catalogIcon;

    @FindBy(xpath = "(//i[@class='nav-icon far fa-dot-circle'])[3]")
    private WebElement manufacturersOption;

    @FindBy(xpath = "//a[@class='btn btn-primary']")
    private WebElement addNewButton;

    @FindBy(xpath = "//input[@id='Name']")
    private WebElement manufacturesName;

    @FindBy(xpath = "//iframe[@id='Description_ifr']")
    private WebElement fullDescriptionFrame;

    @FindBy(xpath = "//body[@id='tinymce']")
    private WebElement fullDescription;

    @FindBy(xpath = "//div[text()='Upload a file']")
    private WebElement uploadFile;
    
    @FindBy(xpath="//input[@value='6, 3, 9']")
    private WebElement PageSizeOptions;
    
    @FindBy(xpath="//input[@id='PriceFrom']")
    private WebElement PriceFrom;
    
    @FindBy(xpath="//input[@name='PriceTo']")
    private WebElement PriceTo;
    
    @FindBy(xpath="//input[@name='DisplayOrder']")
    private WebElement DisplayOrder;
    
    @FindBy(xpath="(//span[@class='select2-selection select2-selection--multiple'])[2]")
    		private WebElement LimitedToCustomeRoles;
    
    @FindBy(xpath="(//span[@class='select2-selection select2-selection--multiple'])[3]")
private WebElement LimitedToStores;

    @FindBy(xpath="//input[@name='SeName']")
    private WebElement SearchEngine;
    
    @FindBy(xpath="//input[@name='MetaTitle']")
    private WebElement MetaTitle;
    
    @FindBy(xpath="//input[@name='MetaKeywords']")
    private WebElement MetaKeyWords;
    
    @FindBy(xpath="//textarea[@name='MetaDescription']")
    private WebElement MetaDescription;
    
    @FindBy(xpath="//button[@class='btn btn-primary'][1]")
    private WebElement Save;
//    // 6 time increase
    
//    @FindBy(xpath = "(//span[@class='k-link k-link-increase'])[2]")
//    private WebElement priceFrom;
//
//    // 10 times increase
//    @FindBy(xpath = "(//span[@class='k-link k-link-increase'])[3]")
//    private WebElement priceTo;
//
//    // 5 times
//    @FindBy(xpath = "(//span[@class='k-link k-link-increase'])[4]")
//    private WebElement displyOrder;
//
//    @FindBy(xpath = "(//div[@class='k-widget k-multiselect k-multiselect-clearable'])[1]")
//    private WebElement limitedToCustomerRoles;
//
//    @FindBy(xpath = "(//li[@data-offset-index='0'])[1]")
//    private WebElement addElementLTCR;
//
//    @FindBy(xpath = "(//div[@class='k-multiselect-wrap k-floatwrap'])[3]")
//    private WebElement limitedToStores; 
//
//    @FindBy(xpath = "//ul[@id='SelectedStoreIds_listbox']/li[1]")
//    private WebElement addElementLTS; 
//
//    @FindBy(xpath = "//input[@id='SeName']")
//    private WebElement searchEngineName;
//
//    @FindBy(xpath = "//input[@id='MetaTitle']")
//    private WebElement metaTitle;
//
//    @FindBy(xpath = "//input[@id='MetaKeywords']")
//    private WebElement metaKeywords;
//
//    @FindBy(xpath = "//textarea[@id='MetaDescription']")
//    private WebElement metaDescription;

    public AddNewManufactures(WebDriver driver) {
        //this.driver = driver;
        //this.wait = new WebDriverWait(driver, Duration.ofSeconds(30));
    
    }

    public void clickCatalogIcon() throws InterruptedException {
       // wait.until(ExpectedConditions.elementToBeClickable(catalogIcon)).click();
    Thread.sleep(3000);
    catalogIcon.click();
    }

    public void clickManufacturersOption() throws InterruptedException {
       // wait.until(ExpectedConditions.elementToBeClickable(manufacturersOption)).click();
 Thread.sleep(3000);
 manufacturersOption.click();
    }

    public void clickAddNewButton() throws InterruptedException {
        //wait.until(ExpectedConditions.elementToBeClickable(addNewButton)).click();
    Thread.sleep(3000);
    addNewButton.click();
    }

    public void enterManufacturerName(String name) throws InterruptedException {
       // wait.until(ExpectedConditions.visibilityOf(manufacturesName)).sendKeys(name);
    	Thread.sleep(3000);
    	manufacturesName.sendKeys("HP Laptop");
    }
    public void ClickPageSizeOptions()throws InterruptedException{
    	Thread.sleep(2000);
    	PageSizeOptions.sendKeys("2,8,5");
    }
public void ClickPriceFrom()throws InterruptedException{
	Thread.sleep(2000);
	PriceFrom.sendKeys("10000");
}
public void ClickPriceTo()throws InterruptedException{
	Thread.sleep(2000);

	PriceTo.sendKeys("9000");
}
public void ClickDisplayOrder()throws InterruptedException{
	Thread.sleep(2000);
	
	DisplayOrder.sendKeys("1");
	
}
public void ClickLimitedToCustomeRoles()throws InterruptedException{
	Thread.sleep(2000);
	LimitedToCustomeRoles.sendKeys("vendors");
	
}
public void ClickLimitedToStores()throws InterruptedException{
	Thread.sleep(2000);
	LimitedToStores.sendKeys("Your store name");
}
public void ClickSearchEngine()throws InterruptedException{
	Thread.sleep(2000);
	SearchEngine.sendKeys("SEO-friendly domain names are short, contain relevant keywords, and include simple terms.");
}
public void ClickMetaTitle()throws InterruptedException{
	Thread.sleep(2000);
	MetaTitle.sendKeys("High Quality");
}
public void ClickMetaKeywords()throws InterruptedException{
	Thread.sleep(2000);
	MetaKeyWords.sendKeys("download");
	
}
public void ClickMetaDescription()throws InterruptedException{
	Thread.sleep(2000);
	MetaDescription.sendKeys("Try Shopify free and start a business or grow an existing one.");
}
public void ClickSave()throws InterruptedException{
Thread.sleep(2000);
	Save.click();
}
//
//  public void switchToFullDescriptionFrame() {
//        driver.switchTo().frame(fullDescriptionFrame);
//    }
//
//  public void fillFullDescription(String description) throws InterruptedException {
//       //wait.until(ExpectedConditions.elementToBeClickable(fullDescription)).sendKeys(description);
//    	Thread.sleep(3000);
//    }
////
//    public void switchToDefaultContent() {
//        driver.switchTo().defaultContent();
//    }
////
//    public void uploadFile(String filePath) throws InterruptedException {
////        WebElement uploadFileElement = wait.until(ExpectedConditions.elementToBeClickable(uploadFile));
//Thread.sleep(2000);
//  uploadFile.click(); 
//    }
////        JavascriptExecutor executor = (JavascriptExecutor) driver;
////        executor.executeScript("arguments[0].click();", uploadFileElement);
////
////        WebElement fileInput = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@type='file']")));
////        fileInput.sendKeys(filePath);
////    }
//
//    public void ClickPriceFrom() throws InterruptedException {
//        for (int i = 0; i < 6; i++) {
//            //wait.until(ExpectedConditions.elementToBeClickable(priceFrom)).click();
//        Thread.sleep(2000);
//        priceFrom.click();
//    }  }
//    public void increasePriceTo() throws InterruptedException {
//        for (int i = 0; i < 10; i++) {
//            //wait.until(ExpectedConditions.elementToBeClickable(priceTo)).click();
//        Thread.sleep(2000);
//        priceTo.clear();
//        priceTo.sendKeys("10000");
//        }
//    }
//
//    public void increaseDisplayOrder() throws InterruptedException {
//        for (int i = 0; i < 5; i++) {
//            //wait.until(ExpectedConditions.elementToBeClickable(displyOrder)).click();
//        Thread.sleep(2000);
//        }
//    }
//
    public void selectLimitedToCustomerRoles() throws InterruptedException {
       //AddNewManufactures wait.until(ExpectedConditions.elementToBeClickable(limitedToCustomerRoles)).click();
    Thread.sleep(2000);
    }

    public void clickElementToLimitedCustomerRoles() throws InterruptedException {
//        wait.until(ExpectedConditions.elementToBeClickable(addElementLTCR)).click();
  Thread.sleep(2000);
    }

//    public void selectLimitedToStores() {
//        WebElement limitedToStores = driver.findElement(By.xpath("(//div[@class='k-multiselect-wrap k-floatwrap'])[3]"));
//        JavascriptExecutor executor = (JavascriptExecutor) driver;
//        executor.executeScript("arguments[0].click();", limitedToStores);
//        
//        wait.until(ExpectedConditions.elementToBeClickable(limitedToStores)).click();
//    }

    public void clickElementToLimitedToStores() throws InterruptedException {
       // wait.until(ExpectedConditions.elementToBeClickable(addElementLTS)).click();
    Thread.sleep(2000);
    
    }
    
    public void enterSearchEngineName(String name) throws InterruptedException {
        //wait.until(ExpectedConditions.visibilityOf(searchEngineName)).sendKeys(name);
       Thread.sleep(3000);   
    }

    public void enterMetaTitle(String title) throws InterruptedException {
     //   wait.until(ExpectedConditions.visibilityOf(metaTitle)).sendKeys(title);
    	  Thread.sleep(3000); 
    }

    public void enterMetaKeywords(String keywords) throws InterruptedException {
       // wait.until(ExpectedConditions.visibilityOf(metaKeywords)).sendKeys(keywords);
    Thread.sleep(3000);
    }

    public void enterMetaDescription(String description) throws InterruptedException {
       // wait.until(ExpectedConditions.visibilityOf(metaDescription)).sendKeys(description);
    Thread.sleep(2000);
  //  metaDescription.click();

    }
}
