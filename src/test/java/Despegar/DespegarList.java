package Despegar;

import static org.testng.Assert.assertTrue;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DespegarList {

	WebDriver driver = null;
	
	
public void ValidarBusquedaDespegar() throws Exception {
	
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.despegar.com.ar/");

}

public void BarraBusquedaSeccion() throws Exception {
	
		List<WebElement> listaSecciones = driver.findElements(By.cssSelector(".header-products-container"));
		for (WebElement Secciones : listaSecciones) {
			Assert.assertTrue(Secciones.isDisplayed(),"La seccion no es visible");
			Assert.assertTrue(Secciones.isEnabled(),"La seccion esta bloqueada");
		}

}
}