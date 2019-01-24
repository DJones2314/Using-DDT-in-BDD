package pages;


	import org.openqa.selenium.Keys;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	
	public class Home {

		@FindBy(xpath = "//*[@id=\"sb_form_q\"]")
		private WebElement searchBar;
		
		@FindBy(xpath = "//*[@id=\"wsb-nav-00000000-0000-0000-0000-000450914915\"]/ul/li[5]/a")
		private WebElement checkoutButton;
		
		public void enterASearch(WebDriver driver, String arg1) {
			
			searchBar.click();
			searchBar.sendKeys(arg1, Keys.ENTER);

		}
		
	}
