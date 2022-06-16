package PageObjets;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;



public class DespegarHome {
	
	private WebDriver driver = null;
	WebDriverWait wait = null;
	
	
	@FindBy(css="a.shifu-3-button-circle HOTELS paint-circle ")
	private WebElement Hoteles;
	
	@FindBy(css="sbox5-box-container .sbox-places-destination--1xd0k .input-tag")
	private WebElement InputTag;
	
	@FindBy(css="sbox5-box-dates-ovr sbox5-dates-container .sbox5-dates-input1-container .input-container")
	private WebElement CalendarioDespegarIr;
	
	@FindBy(css="sbox5-floating-tooltip.sbox5-floating-tooltip-opened .sbox-monthgrid.sbox-compact-view .sbox5-monthgrid-datenumber.-today")
	private WebElement FechaEntradaDespegarIr;
	
	@FindBy(css="sbox5-floating-tooltip sbox5-floating-tooltip-opened .sbox5-monthgrid-dates sbox5-monthgrid-dates-31 .sbox5-monthgrid-datenumber-number[value='3']")
	private WebElement FechaSalidaDespegarIr;
	
	@FindBy(css="div.sbox5-floating-tooltip sbox5-floating-tooltip-opened > button.sbox5-3-btn.-primary.-md")
	private WebElement aplicarFecha;
	
	@FindBy(css="sbox5-3-distribution-passengers.sbox5-3-validation.-top-right .sbox5-3-second-input-wrapper")
	private WebElement Hab;
	
	@FindBy(css="stepper__rom .stepper__distribution_container .stepper__rom__row:nth-child(1) .steppers-icon-right")
	private WebElement HabAdultos;
	
	@FindBy(css="stepper__rom .stepper__distribution_container .stepper__rom__row:nth-child(2) .steppers-icon-right")
	private WebElement HabMenores;
	
	@FindBy(css="select-container .select .select-option[value='9']")
	private WebElement SelectMenor9;
	
	@FindBy(css="div.sbox5-floating-tooltip.sbox5-floating-tooltip-opened .sbox5-3-btn.-md.-primary .btn-text")
	private WebElement AplicarHab;
	
	@FindBy(css="button.sbox5-box-button-ovr.sbox5-3-btn.-secondary.-icon.-lg .btn-text")
	private WebElement Buscar;
	
	@FindBy(xpath="//button[@class='eva-3-btn -md -primary -eva-3-fwidth']")
	private WebElement VerDetalles;
	
	
	public DespegarHome (WebDriver driver) 
	{
		
		this.driver = driver;
		PageFactory.initElements(driver, this);
		this.wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		

	}
	
	public void AreaHoteles() throws InterruptedException 
	{
		Hoteles.click();
	}
	
	public void Ciudad(String pcia) throws InterruptedException 
	{
		InputTag.click();
        InputTag.sendKeys("pcia");
        Thread.sleep(1000);
        InputTag.sendKeys(Keys.CONTROL);
        Thread.sleep(1000);
        InputTag.sendKeys(Keys.ENTER);
      
	}
   
	public void Calendario() throws InterruptedException 
	{
		wait.until(ExpectedConditions.elementToBeClickable(CalendarioDespegarIr));
		CalendarioDespegarIr.click();
        
    }
	
	public void FechaIda() throws InterruptedException
	{
		wait.until(ExpectedConditions.elementToBeClickable(FechaEntradaDespegarIr));
		FechaEntradaDespegarIr.click();
		
	}
	
	public void FechaVuelta() throws InterruptedException
	{
		wait.until(ExpectedConditions.elementToBeClickable(FechaSalidaDespegarIr));
	    FechaSalidaDespegarIr.click();
	}	
	
	public void AplicarFecha() throws InterruptedException
	{
		wait.until(ExpectedConditions.elementToBeClickable(aplicarFecha));
		aplicarFecha.click();
	}

	public void Habitaciones() throws InterruptedException
	{
		wait.until(ExpectedConditions.elementToBeClickable(Hab));
		Hab.click();
		
	}
    
	public void HabitacionAdulto() throws InterruptedException
	{
		wait.until(ExpectedConditions.elementToBeClickable(HabAdultos));
		HabAdultos.click();
		
	}

	public void HabitacionMenor() throws InterruptedException
	{
		wait.until(ExpectedConditions.elementToBeClickable(HabMenores));
		HabMenores.click();
		
	}
	
	public void SelecionarMenor() throws InterruptedException
	{
		wait.until(ExpectedConditions.elementToBeClickable(SelectMenor9));
		SelectMenor9.click();
	}
	
	public void AplicarHabitacion() throws InterruptedException
	{
		AplicarHab.click();
	}
	
	public void Buscar() throws InterruptedException
	{
		Buscar.click();
	}
	
	public void Detalles() throws InterruptedException
	{
		wait.until(ExpectedConditions.elementToBeClickable(VerDetalles));
		VerDetalles.click();
	}


}
	