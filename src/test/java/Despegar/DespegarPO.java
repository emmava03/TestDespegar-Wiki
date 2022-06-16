package Despegar;

import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import DriverFactory.DriverFactory;
import PageObjets.DespegarHome;

public class DespegarPO {
	
	private static
	WebDriver driver;
	DespegarHome MainPage;
	
   @BeforeMethod(alwaysRun=true)
   public void Comienzo(ITestContext context) {
	   String navegadorTestSuite = context.getCurrentXmlTest().getParameter("Navegador");
	   String navegador = navegadorTestSuite != null ? navegadorTestSuite : "CHROME";
	   driver = DriverFactory.AbrirBrowser(navegador);
	   MainPage = new DespegarHome(driver);
   }
   
   @DataProvider(name = "DPCiudadesDespegar")
   public Object [][] dpMethod() {
	return new Object [][] {{"Cordoba"}, {"Buenos Aires"}, {"Santa Fe"}};
   }
   
  @Test(groups = {"DespegarPO"}, dataProvider = "DPCiudadesDespegar")
   public void testDespegarPO(String DPCiudadesDespegar) throws InterruptedException {
	   MainPage.AreaHoteles();
	   MainPage.Ciudad(DPCiudadesDespegar);
	   MainPage.Calendario();
	   MainPage.FechaIda();
	   MainPage.FechaVuelta();
	   MainPage.AplicarFecha();
	   MainPage.Habitaciones();
	   MainPage.HabitacionAdulto();
	   MainPage.HabitacionMenor();
	   MainPage.SelecionarMenor();
	   MainPage.AplicarHabitacion();
	   MainPage.Buscar();
	   MainPage.Detalles();
   }
   
   @AfterMethod(alwaysRun=true)
   public void Fin () {
	   driver.close();
   }

}
