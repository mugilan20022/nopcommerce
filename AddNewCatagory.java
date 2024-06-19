package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Helper.BaseClass;

public class AddNewCatagory extends BaseClass{

//    private WebDriver driver;
  //  private WebDriverWait wait;

    @FindBy(xpath = "//i[@class='nav-icon fas fa-book']")
    private WebElement catalogIcon;

    @FindBy(xpath = "(//i[@class='nav-icon far fa-dot-circle'])[2]")
    private WebElement categoriesOption;
    
    @FindBy(xpath = "//a[@class='btn btn-primary']")
    private WebElement addNewButton;

    @FindBy(xpath = "//input[@id='Name']")
    private WebElement productName;
//
//    @FindBy(xpath = "//iframe[@id='Description_ifr']") ////iframe[@id='Description_ifr']
//    private WebElement fullDescriptionFrame;
//
//    @FindBy(xpath = "//body[@id='tinymce']") ////*[@id="tinymce"]
//    private WebElement fullDescription;

    @FindBy(xpath = "//select[@id='ParentCategoryId']")
    private WebElement categoryElement;
 
    @FindBy(xpath = "//select[@id='ParentCategoryId']/option[8]")
    private WebElement addElement;

    @FindBy(xpath = "//div[text()='Upload a file']") 
    private WebElement uploadFile;
    
    
    @FindBy(xpath="//input[@name='ShowOnHomepage'][1]")
    private WebElement ShowOnHomePage;
    
    @FindBy(xpath="//input[@id='PageSizeOptions']")
    private WebElement PageSize;
    
    @FindBy(xpath="//input[@id='PriceFrom']")
    private WebElement priceFrom;
    
    @FindBy(xpath="//input[@id='PriceTo']")
    private WebElement PriceTo;
    
    @FindBy(xpath="//input[@id='DisplayOrder']")
    private WebElement DisplayOrder;
    
    @FindBy(xpath="(//input[@class='select2-search__field'])[2]")
    private WebElement LimitedToCustomerRoles;
    
    @FindBy(xpath="(//input[@class='select2-search__field'])[3]")
    private WebElement LimitedToStores;
    
    @FindBy(xpath="//input[@name='SeName']")
    private WebElement SEO;
    
    @FindBy(xpath="//input[@name='MetaTitle']")
 private WebElement MetaTitle; 
    
    @FindBy(xpath="//input[@name='MetaKeywords']")
private WebElement MetaKeywords;
    
    @FindBy(xpath="//textarea[@name='MetaDescription']")
    private WebElement MetaDescription;
    
    @FindBy(xpath="//button[@name='save']")
    private WebElement Save;
    
    public AddNewCatagory(WebDriver driver) throws InterruptedException {
        //this.driver = driver;
        
    	//this.wait = new WebDriverWait(driver, Duration.ofSeconds(20));
    Thread.sleep(2000);
    }

    public void clickCatalogIcon() throws InterruptedException {
      // wait.until(ExpectedConditions.elementToBeClickable(catalogIcon)).click();
 Thread.sleep(2000);
 catalogIcon.click();
    }

    public void clickCategoriesOption() throws InterruptedException {
    	//wait.until(ExpectedConditions.elementToBeClickable(categoriesOption)).click();
   Thread.sleep(2000);
   categoriesOption.click();
    }

    public void clickAddNewButton() throws InterruptedException {
       // wait.until(ExpectedConditions.elementToBeClickable(addNewButton)).click();
    Thread.sleep(2000);
    addNewButton.click();
    }

    public void fillProductName(String name) throws InterruptedException {
        //wait.until(ExpectedConditions.elementToBeClickable(productName)).sendKeys(name);
    Thread.sleep(2000);
    productName.sendKeys("HP Laptop");
    
    }
   
////
//   public void switchToFullDescriptionFrame() {
//        driver.switchTo().frame(fullDescriptionFrame);
//        fullDescriptionFrame.sendKeys("A laptop is a portable computer that can be easily carried around. It's a device designed for personal use and can perform various functions such as browsing the internet, creating documents, playing games, etc. Laptops are generally smaller in size than desktop computers and are battery powered.");
//    }
public void ClickcategoryElement()throws InterruptedException{
	Thread.sleep(2000);
	categoryElement.sendKeys("computers");
}
public void ClickShowOnHomePage()throws InterruptedException{
Thread.sleep(2000);
ShowOnHomePage.click();
}
public void ClickPageSize()throws InterruptedException{
	Thread.sleep(2000);
	PageSize.sendKeys(",4");
}
public void ClearPriceFrom()throws InterruptedException{
	Thread.sleep(2000);
	priceFrom.clear();
}
public void ClickPriceFrom()throws InterruptedException{
	Thread.sleep(2000);
	priceFrom.sendKeys("40000");
}
public void ClearPriceTo()throws InterruptedException{
	Thread.sleep(2000);
	PriceTo.clear();
}
public void ClickPriceTo()throws InterruptedException{
	Thread.sleep(2000);
	PriceTo.sendKeys("38000");
	
}
public void ClearDisplayOrder()throws InterruptedException{
	Thread.sleep(2000);
	DisplayOrder.clear();
}
public void ClickDisplayOrder()throws InterruptedException{
	Thread.sleep(2000);
	DisplayOrder.clear();
}
public void ClickLimitedToCustomerRoles()throws InterruptedException{
	Thread.sleep(2000);
	LimitedToCustomerRoles.sendKeys("Vendors");
	
}
public void ClickLimitedToStores()throws InterruptedException{
	Thread.sleep(2000);
	LimitedToStores.sendKeys("Your store name");
}
public void ClickSEO()throws InterruptedException {
	Thread.sleep(2000);
	SEO.sendKeys("On your computer, open Chrome. Settings. Select Search engine. Select a new default search engine.");
}
public void ClickMetaTitle()throws InterruptedException{
	Thread.sleep(2000);
	MetaTitle.sendKeys("metadata is usually more detailed and structured than meta tags. It can include information about the page's author, date of publication, language, and other relevant details.");
}
public void ClickMetaKeywords()throws InterruptedException{
	Thread.sleep(2000);
	MetaKeywords.sendKeys("win+s");
}
public void ClickMetaDescription()throws InterruptedException{
	Thread.sleep(2000);
	MetaDescription.sendKeys("A meta description tag generally informs and interests users with a short, relevant summary of what a particular page is about. They are like a pitch that convince the user that the page is exactly what they're looking for.");
}
public void ClickSave()throws InterruptedException{
	Thread.sleep(2000);
	Save.click();
}
//}
//    public void fillFullDescription(String description) throws InterruptedException {
//        //wait.until(ExpectedConditions.elementToBeClickable(fullDescription)).sendKeys(description);
// Thread.sleep(2000);
// 
    }
//
//    public void switchToDefaultContent() {
//        driver.switchTo().defaultContent();
//    }
//    
//    public void clickCategoryElement() {
//        wait.until(ExpectedConditions.elementToBeClickable(categoryElement)).click();
//    }
//
//    public void clickAddElement() {
//        wait.until(ExpectedConditions.elementToBeClickable(addElement)).click();
//    }
//
//    public void uploadFile(String filePath) {
//        WebElement uploadFileElement = wait.until(ExpectedConditions.elementToBeClickable(uploadFile));
//        JavascriptExecutor executor = (JavascriptExecutor) driver;
//        executor.executeScript("arguments[0].click();", uploadFileElement);
//
//        WebElement fileInput = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@type='file']")));
//
//        fileInput.sendKeys(filePath);
//    }
//    

