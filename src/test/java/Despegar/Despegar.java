package Despegar;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

@Test
public class Despegar
{
WebDriverWait Wait = null;
	
public void ValidarBusquedaDespegar() throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		Wait = new WebDriverWait(driver, 30);
		driver.manage().window().maximize();
		driver.get("https://www.despegar.com.ar/");
		
		
		WebElement Hoteles = driver
				.findElement(By.xpath("//label[contains(text(),'Alojamientos')]"));
		Hoteles.click();
		
		
		WebElement inputTag = driver.findElement(
				By.xpath("//div[@id=\'searchbox-sbox-box-hotels\']//div[@class='sbox5-box-container']//input[@class='input-tag']"));
		inputTag.click();
        inputTag.sendKeys("Buenos Aires");
        Thread.sleep(1000);
        inputTag.sendKeys(Keys.CONTROL);
        Thread.sleep(1000);
        inputTag.sendKeys(Keys.ENTER);
        Thread.sleep(1000);
        
        
		WebElement CalendarioDespegarIr = driver.findElement(By.xpath(
				"//div[@class='sbox5-box-dates-ovr sbox5-dates-container']//div[@class='sbox5-dates-input1-container']//div[@class='input-container']//input[@class='input-tag']"));
		CalendarioDespegarIr.click();
		Wait.until(ExpectedConditions.elementToBeClickable(By.xpath(
				"//div[@class='sbox5-box-dates-ovr sbox5-dates-container']//div[@class='sbox5-dates-input1-container']//div[@class='input-container']//input[@class='input-tag']")));

		
		WebElement FechaEntradaDespegarIr = driver.findElement(
				By.xpath("//div[@class='sbox5-floating-tooltip sbox5-floating-tooltip-opened']//div[@class='sbox5-monthgrid-datenumber -today']"));
		Wait.until(ExpectedConditions.elementToBeClickable(
				By.xpath("//div[@class='sbox5-floating-tooltip sbox5-floating-tooltip-opened']//div[@class='sbox5-monthgrid-datenumber -today']")));
		FechaEntradaDespegarIr.click();
		
		
		WebElement FechaSalidaDespegarIr = driver
				.findElement(By.xpath("//div[@class='sbox5-floating-tooltip sbox5-floating-tooltip-opened']//div[@class='sbox5-monthgrid-dates sbox5-monthgrid-dates-31']//div[@class='sbox5-monthgrid-datenumber-number'][text()='3']"));
		Wait.until(ExpectedConditions.elementToBeClickable
				(By.xpath("//div[@class='sbox5-floating-tooltip sbox5-floating-tooltip-opened']//div[@class='sbox5-monthgrid-dates sbox5-monthgrid-dates-31']//div[@class='sbox5-monthgrid-datenumber-number'][text()='3']")));
		FechaSalidaDespegarIr.click();
		
		
		WebElement aplicarFecha = driver
				.findElement(By.xpath("//button[@class='sbox5-3-btn -primary -md']"));
		aplicarFecha.click();
		
		
		WebElement Hab = driver.findElement
				(By.xpath("//input[@class='sbox5-3-first-input']"));
		Hab.click();
	    Wait.until(ExpectedConditions.elementToBeClickable
	    		(By.xpath("//input[@class='sbox5-3-first-input']")));
		
		
		WebElement HabAdultos = driver.findElement
				(By.xpath("//div[@class='sbox5-floating-tooltip sbox5-floating-tooltip-opened']//div[@class='stepper__room__row'][1]//button[@class='steppers-icon-right stepper__icon']"));
		Wait.until(ExpectedConditions.elementToBeClickable
				(By.xpath("//div[@class='sbox5-floating-tooltip sbox5-floating-tooltip-opened']//div[@class='stepper__room__row'][1]//button[@class='steppers-icon-right stepper__icon']")));
		HabAdultos.click();
		
		
		WebElement HabMenores = driver.findElement
				(By.xpath("//div[@class='sbox5-floating-tooltip sbox5-floating-tooltip-opened']//div[@class='stepper__room__row'][2]//button[@class='steppers-icon-right stepper__icon']"));
		Wait.until(ExpectedConditions.elementToBeClickable
				(By.xpath("//div[@class='sbox5-floating-tooltip sbox5-floating-tooltip-opened']//div[@class='stepper__room__row'][2]//button[@class='steppers-icon-right stepper__icon']")));
		HabMenores.click();
		
		
		WebElement SelectMenor9 = driver.findElement
				(By.xpath("//div[@class='sbox5-floating-tooltip sbox5-floating-tooltip-opened']//div[@class='stepper__room__row'][3]//select[@class='select']//option[@value='9']"));
		Wait.until(ExpectedConditions.elementToBeClickable
				(By.xpath("//div[@class='sbox5-floating-tooltip sbox5-floating-tooltip-opened']//div[@class='stepper__room__row'][3]//select[@class='select']//option[@value='9']")));
		SelectMenor9.click();
		
		
		WebElement AplicarHab = driver
				.findElement(By.xpath("//div[@class='sbox5-floating-tooltip sbox5-floating-tooltip-opened']//div[@class='stepper__room__footer ']//a[@class='sbox5-3-btn -md -primary']"));
	    AplicarHab.click();
		
		
		WebElement Buscar = driver
				.findElement(By.xpath("//button[@class='sbox5-box-button-ovr sbox5-3-btn -secondary -icon -lg']"));
		Buscar.click();
		
		
		WebElement VerDetalles = driver.findElement
				(By.xpath("//button[@class='eva-3-btn -md -primary -eva-3-fwidth']"));
		VerDetalles.click();
		Wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@class='eva-3-btn -md -primary -eva-3-fwidth']")));
		Assert.assertTrue(VerDetalles.isDisplayed());
		driver.quit();
		
	}

	private WebDriverWait WebDriverWait(WebDriver driver, Duration ofSeconds) {
		// TODO Auto-generated method stub
		return null;
	}
}