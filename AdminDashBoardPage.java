package POM;


		import org.openqa.selenium.WebElement;
		import org.openqa.selenium.support.FindBy;
		import Helper.BaseClass;

		public class AdminDashBoardPage extends BaseClass{

			@FindBy(xpath="//a[@class='nav-link active']")
			WebElement DbTitle;

			public WebElement getDbTitle() {
				return DbTitle;
			

	}

}
