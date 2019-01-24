package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class searchedPage {

	@FindBy(xpath = "//*[@id=\"b_header\"]/nav/ul/li[2]/a")
	private WebElement searchVerify;
	
	public String whatsThatElement(WebDriver driver) {
		return searchVerify.getText();
	}
	
	
}
