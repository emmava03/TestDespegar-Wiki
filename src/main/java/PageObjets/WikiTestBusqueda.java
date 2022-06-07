package PageObjets;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WikiTestBusqueda {
	
	@FindBy(id="searchInput")
	WebElement searchImput;
	
	private WebDriver driver = null;
	
	public WikiTestBusqueda (WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	public boolean searchImputEsVisible() {
		return this.searchImput.isDisplayed();
	}
	
	public WikiTestResultado searchText(String text) {
		this.searchImput.sendKeys(text);
		searchImput.submit();
		return new WikiTestResultado(this.driver);
		
	}
}
