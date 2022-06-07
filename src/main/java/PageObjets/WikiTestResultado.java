package PageObjets;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WikiTestResultado {
	
	@FindBy(id="firstHeading")
	WebElement firstHeading;
	
	private WebDriver driver = null;
	
	public WikiTestResultado (WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	public boolean tituloEsVisible() {
		return this.firstHeading.isDisplayed();
	}
}
