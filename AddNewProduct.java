package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import Helper.BaseClass;

public class AddNewProduct  extends BaseClass{ 
	  //private WebDriver driver;
	    //private WebDriverWait wait;

	    @FindBy(xpath = "//i[@class='nav-icon fas fa-book']")
	    private WebElement catalogIcon;
	    
	    @FindBy(xpath = "//a[@href='/Admin/Product/List']//following-sibling::p")
	    private WebElement productsOption;
	    
	    @FindBy(xpath="//a[@class='btn btn-primary']")
	    private WebElement 	 addnewButton;
	    
	    @FindBy(xpath="//input[@data-val-required='Please provide a name.']")
        private WebElement Productname;
	    
	    @FindBy(xpath="//textarea[@name='ShortDescription']")
	    private WebElement ShortDescription;
	    
	    @FindBy (xpath="//iframe[@id='FullDescriptuon']")
	    private WebElement FullDescriptionFrame;
	    
	    @FindBy(xpath="//span[@data-valmsg-for=\"FullDescription\"]")
	    private WebElement FullDescription;
	    
	    @FindBy(xpath="//input[@name='Sku']")
	    private WebElement SKU;
	    
	    
	    @FindBy(xpath="//select[@id='SelectedCategoryIds']")
	    private WebElement categoryElement;
	  
	   
	    @FindBy(xpath="(//input[@class='select2-search__field'])[2]") 
	    private WebElement  Manufacturers;
	    
	    @FindBy(xpath= "//span[@data-valmsg-for='ManufacturerPartNumber']")
	    private WebElement manufacturerpartNumber;	
	    
	    @FindBy(xpath="(//input[@class='select2-search__field'])[3]")
	    private WebElement Producttags;
	    
	    @FindBy(xpath="//input[@name='Gtin']")
	    private WebElement global;
	    
	    @FindBy(xpath="(//span[@role='combobox'])[4]")
	    private WebElement CustomerRoles;
	    
	    @FindBy(xpath="(//input[@class='select2-search__field'])[4]")
	    private WebElement LimitedToStores;
	    
	    @FindBy(xpath="//select[@id='VendorId']")
	    private WebElement Vendor;

	   
	    @FindBy(xpath = "//input[@name='AvailableStartDateTimeUtc']")
	 private WebElement AvailableStartDate;

	    @FindBy(xpath = "//input[@name='AvailableEndDateTimeUtc']")
	    private WebElement AvailableEndDate;
	    
	    @FindBy(xpath="//input[@name='MarkAsNew'][1])")
	    private WebElement MarkAsNew;
	    
	    @FindBy(xpath="//textarea[@id='AdminComment']")
	    private WebElement  AdminComment;
	   
	    @FindBy(xpath="//input[@name='Price']")
	    private WebElement Price;
	    
	    @FindBy(xpath="//input[@name='OldPrice']")
	    private WebElement OldPrice;
	    
	    @FindBy(xpath="//input[@name='ProductCost']")
	    private WebElement ProductPrice;
	    
	    @FindBy(xpath="//input[@name='DisableBuyButton'][1]")
	    private WebElement DisableBuyButton;
	    
	    @FindBy(xpath="(//input[@class='select2-search__field'])[5]")
	    		private WebElement Discount;
	    
	    @FindBy(xpath="//select[@name='TaxCategoryId']")
	    private WebElement TaxCategory;
	    
	    @FindBy(xpath="//input[@data-val-required='The Weight field is required.'][1]")
	    private WebElement weight;
	    
	    @FindBy(xpath="//input[@id='Length']")
	    private WebElement length;
	    
	    @FindBy(xpath="//input[@name='Width']")
	    private WebElement width;
	    
	    @FindBy(xpath="//input[@name='Height']")
	    private WebElement height;
	    
	    @FindBy(xpath="//input[@id='AdditionalShippingCharge']")
	    private WebElement charge;
	    
	    @FindBy(xpath="//select[@id='DeliveryDateId']")
	    private WebElement deliverydate;
	    
	    @FindBy(xpath="//select[@id='ManageInventoryMethodId']")
private WebElement InventoryMethod;	 
	    
	    @FindBy(xpath="//select[@id='WarehouseId']")
	    private WebElement warehouse;
	    
	    @FindBy(xpath="//input[@aria-describedby='MinStockQuantity-error']")
	    private WebElement MinimumStock;
	    
	    @FindBy(xpath="//select[@name='LowStockActivityId']")
	    private WebElement LowStock;
	    
	    @FindBy(xpath="//select[@id='ProductAvailabilityRangeId']")
	    		private WebElement ProductAvailability;
	    
	    @FindBy(xpath="//input[@id='OrderMinimumQuantity']")
	    private WebElement MinimumCart;
	    
	    @FindBy(xpath="//input[@id='OrderMaximumQuantity']")
	    private WebElement MaximumCart;
	    
	    @FindBy(xpath="//input[@id='AllowedQuantities']")
	    private WebElement AllowedQuantities;
	    
	    @FindBy(xpath="//input[@id='AllowAddingOnlyExistingAttributeCombinations']")
	    private WebElement Existing;
	    
	    @FindBy(xpath="//button[@name='save']")
	    private WebElement Save;
	    
	    
	    
	    //	    @FindBy(xpath = "//a[@aria-live='assertive']")
//	    private WebElement currentMonthYearLabel;
//
//	    @FindBy(xpath = "//a[@aria-label='Previous']")
//	    private WebElement previousButton;
//
//	    @FindBy(xpath = "//a[@data-value='2023/0/1']")
//	    private WebElement startDate2023;
//
//	    @FindBy(xpath = "//span[@aria-controls='AvailableEndDateTimeUtc_dateview']")
//	    private WebElement endDateCalendarButton;
//	    
//	    @FindBy(xpath = "//div[@id='AvailableEndDateTimeUtc_dateview']")
//	    private WebElement EndDatePicker;
//
//	    @FindBy(xpath = "(//a[@aria-live='assertive'])[2]")
//	    private WebElement currentMonthYearLabel2;
//
//	    @FindBy(xpath = "(//a[@aria-label='Next'])[2]")
//	    private WebElement nextButton;
//
//	    @FindBy(xpath = "//a[@data-value='2025/0/1']")
//	    private WebElement endDate2025;
//

	    
	    public AddNewProduct(WebDriver driver) throws InterruptedException {
	        this.driver = driver;
	      //  this.wait = new WebDriverWait(driver, Duration.ofSeconds(20));
	   Thread.sleep(3000);
	    }

	    public void clickCatalogIcon() throws InterruptedException {
	        //wait.until(ExpectedConditions.elementToBeClickable(catalogIcon)).click();
	    Thread.sleep(2000);
	    catalogIcon.click();
	    }

	    public void clickProductsOption() throws InterruptedException {
	        //wait.until(ExpectedConditions.elementToBeClickable(productsOption)).click();
	    	 Thread.sleep(2000);
	    	 productsOption.click();
	    }

	    public void clickAddNewButton() throws InterruptedException {
	      //  wait.until(ExpectedConditions.elementToBeClickable(nextButton)).click();
	    	 Thread.sleep(2000);
	    	 addnewButton.click();
	    }

	    public void fillProductName(String name) throws InterruptedException {
	       // wait.until(ExpectedConditions.elementToBeClickable(productsOption)).sendKeys(name);
	    	 Thread.sleep(2000);
	    	 Productname.sendKeys(name);
	    }

	    public void fillShortDescription(String description) throws InterruptedException {
	      //  wait.until(ExpectedConditions.elementToBeClickable(ShortDescription)).sendKeys(description);
	    	 Thread.sleep(2000);
	    	 ShortDescription.sendKeys(description);
	    }

	    public void switchToFullDescriptionFrame() throws InterruptedException {
	    	Thread.sleep(2000);
	        driver.switchTo().frame(FullDescriptionFrame);
	    }

	    public void fillFullDescription(String description) throws InterruptedException {
	        //wait.until(ExpectedConditions.elementToBeClickable(FullDescription)).sendKeys(description);
	    	 Thread.sleep(2000);
	    	 FullDescription.sendKeys("The full form of HP is Hewlett-Packard . HP is an American multinational IT (Information Technology) corporation that offers software and hardware-related services and products for individuals, small and medium-sized businesses and large companies, including marketing, education and healthcare.");
	    }

	    public void switchToDefaultContent() throws InterruptedException {
	    	Thread.sleep(3000);
	        driver.switchTo().defaultContent();
    }

	    public void fillSku(String sku) throws InterruptedException {
	       // wait.until(ExpectedConditions.elementToBeClickable(this.SKU)).sendKeys(sku);
	    	 Thread.sleep(2000);
	    	 SKU.sendKeys(sku);
	    }
	     public void clickCategoryElement() throws InterruptedException {
	       // wait.until(ExpectedConditions.elementToBeClickable(categoryElement)).click();
	        Thread.sleep(3000);
	    	Select s1=new Select(categoryElement);
	        s1.selectByVisibleText("Books");

        

        
        
	     }
	      
//	     public void clickAddElement() throws InterruptedException {
////	       // wait.until(ExpectedConditions.elementToBeClickable( previousButton)).click();
//    	 Thread.sleep(2000);
//    	 previousButton.click();
//    
//	}    	 
    public void ClickOnManufacturesIcon()throws InterruptedException{
    	Thread.sleep(3000);
    	Manufacturers.sendKeys("HP");
    }
////
// 	    public void clickManufacturersDivElement() throws InterruptedException {
////	        WebElement manufacturersDivElement = driver.findElement(By.xpath("(//div[@class='k-multiselect-wrap k-floatwrap'])[2]"));
////	        JavascriptExecutor executor = (JavascriptExecutor) driver;
////	        executor.executeScript("arguments[0].click();", manufacturersDivElement);
////	        
////	       // wait.until(ExpectedConditions.elementToBeClickable(manufacturersDivElement)).click();
//	        Thread.sleep(2000);
//	        
//	        Select s2=new Select(manufacturers);
//	        s2.selectByVisibleText("HP");
	         
	        


//	    public void selectManufacturerName() throws InterruptedException {
//	       // wait.until(ExpectedConditions.elementToBeClickable(ManufacturerpartNumber)).click();
//	    	 Thread.sleep(2000);
//	    	Select s1=new Select(Manufacturers);
//	    	s1.selectByVisibleText("HP");
//	    	Manufacturers.click();
//	    	
//	    }
//	    
	    public void ClickProducttags()throws InterruptedException{
	    	Thread.sleep(2000);
	    	Producttags.sendKeys("1234$%");
	    }
		public void Clickglobal()throws InterruptedException{
			Thread.sleep(2000);
			global.sendKeys("13579");
			
		}
public void clickCustomerRoles()throws InterruptedException{
       Thread.sleep(2000);
       CustomerRoles.sendKeys("Administrators");
}
public void ClickLimitedToStores() throws InterruptedException{
	Thread.sleep(2000);
	LimitedToStores.sendKeys("Your store name");
}
public void ClickVendor()throws InterruptedException{
	Thread.sleep(2000);
	Vendor.sendKeys("vendor1");
}






//		public void clickManufacturerPartNumber()throws InterruptedException{
//	    	Thread.sleep(2000);
//	    	ManufacturerPartNumber.
//	    }
		
	    
	    public void clickAvailableStartDate() throws InterruptedException {
	        //wait.until(ExpectedConditions.elementToBeClickable(startDateCalendarButton)).click();
	    	 Thread.sleep(2000);
	    	 AvailableStartDate.sendKeys("03-05-2023");
	    }

	    public void ClickAvailableEndDate() throws InterruptedException {
	      // wait.until(ExpectedConditions.visibilityOf(startDatePicker));
	    	 Thread.sleep(2000);
	    	 AvailableEndDate.sendKeys("03-05-2024");
	    	 
	    	 
	    }

//	    public void ClickMarkAsNew()throws InterruptedException{
	//    	Thread.sleep(2000);
	  //     MarkAsNew.click();
	    
public void ClickAdminComment()throws InterruptedException{
	Thread.sleep(2000);
	AdminComment.sendKeys("Good");
}
public void ClearPrice()throws InterruptedException{
	Thread.sleep(2000);
	Price.clear();
}
	    
public void ClickPrice()throws InterruptedException{
	Thread.sleep(2000);
	Price.sendKeys("40000");
}
	public void ClearOldPrice()throws InterruptedException{
		Thread.sleep(2000);
		Price.clear();
	}
	public void ClickOldPrice()throws InterruptedException{
		Thread.sleep(2000);
		OldPrice.sendKeys("42000");
	}
	public void ClearProductPrice()throws InterruptedException{
		Thread.sleep(2000);
		Price.clear();
	}
public void ClickProductPrice()throws InterruptedException{
	Thread.sleep(2000);
	ProductPrice.sendKeys("39000");
}
public void ClickDisableBuyButton()throws InterruptedException{
	Thread.sleep(2000);
	DisableBuyButton.click();
	
	
}
//public void ClickDiscount()throws InterruptedException{
//	Thread.sleep(2000);
////Discount.sendKeys("Sample discount with coupon code");
//
//}
public void ClickTaxCategory()throws InterruptedException{
	Thread.sleep(2000);
	TaxCategory.sendKeys("Books");
}
public void Clickweight()throws InterruptedException{
	Thread.sleep(2000);
weight.sendKeys("500");

}
public void Clicklength()throws InterruptedException{
	Thread.sleep(2000);
	length.sendKeys("35.5");
}
public void Clickwidth()throws InterruptedException{
	Thread.sleep(2000);
	width.sendKeys("40");
	}
public void Clickheight()throws InterruptedException{
	Thread.sleep(2000);
	height.sendKeys("32");
}
public void Clickcharge()throws InterruptedException{
	Thread.sleep(2000);
	charge.sendKeys("10");
}
public void Clickdeliverydate()throws InterruptedException{
	Thread.sleep(2000);
	deliverydate.sendKeys("1-2 days");
}
public void ClickInventoryMethod()throws InterruptedException{
	Thread.sleep(2000);
	InventoryMethod.sendKeys("Track inventory");	    
    
}
public void Clickwarehouse()throws InterruptedException{
	Thread.sleep(2000);
	warehouse.sendKeys("warehouse 1(Newyork)");
}
//public void ClickMinimumStock()throws InterruptedException{
	//Thread.sleep(2000);
//	MinimumStock.sendKeys("100");
//}
public void ClickLowStock()throws InterruptedException{
	Thread.sleep(2000);
	LowStock.sendKeys("Unpublish");
}
public void ClickProductAvailability()throws InterruptedException{
	Thread.sleep(2000);
	ProductAvailability.sendKeys("7-10days");
}
public void ClickMinimumCart()throws InterruptedException{
	Thread.sleep(2000);
	MinimumCart.sendKeys("3");
}
public void ClickMaximumCart()throws InterruptedException{
	Thread.sleep(2000);
	MaximumCart.sendKeys( "00");
}
public void ClickAllowedQuantities()throws InterruptedException{
	Thread.sleep(2000);
	AllowedQuantities.sendKeys("4");
	
}
////public void ClickExisting()throws InterruptedException{
////	Thread.sleep(2000);
////	Existing.click();
//}
public void ClickSave()throws InterruptedException{
	Thread.sleep(2000);
	Save.click();
}

}
