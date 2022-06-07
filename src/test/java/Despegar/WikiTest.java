package Despegar;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import DriverFactory.DriverFactory;
import PageObjets.WikiTestBusqueda;
import PageObjets.WikiTestResultado;

public class WikiTest extends DriverFactory {

	@Test(description = "Validar que las busquedas en Wikipedia funcionan")
	public void ValidarBusquedaWikipedia() throws Exception {
		WebDriver driver = DriverFactory.AbrirBrowser("CHROME");
		DriverFactory.goToMainPage(driver);
		WikiTestBusqueda HomePage = new WikiTestBusqueda(driver);
		Assert.assertTrue(HomePage.searchImputEsVisible(), "El input no esta visible");
		WikiTestResultado Resultado = HomePage.searchText("Selenium");
		Assert.assertTrue(Resultado.tituloEsVisible(), "El titulo no esta visible");
		driver.close();
		
		/*System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://wikipedia.org");
		WebElement searchInput = driver.findElement(By.id("searchInput"));
		Assert.assertTrue(searchInput.isDisplayed());
		searchInput.sendKeys("Selenium");
		searchInput.submit();
		WebElement tituloResultado = driver.findElement(By.id("firstHeading"));
		System.out.println("Texto encontrado " + tituloResultado.getText());
		Assert.assertTrue(tituloResultado.isDisplayed());
		driver.close();*/

	}

}
