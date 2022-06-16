package DriverFactory;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;

public class DriverFactory {
	
	public static void goToMainPage(WebDriver driver) {
		driver.get("http://wikipedia.org");
	}
public static WebDriver AbrirBrowser(String browserName)
    {
    WebDriver driver = null;
    switch(browserName){
        case "CHROME":
        {
            System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
            Reporter.log("Abrir Navegador Chrome");
            driver = new ChromeDriver();
            break;
        }
        case "FIREFOX":
        {
            System.setProperty("webdriver.gecko.driver", "C:\\geckodriver-v0.29.1-win64\\geckodriver.exe");
            Reporter.log("Abrir Navegador Firefox");
            driver = new FirefoxDriver();
            break;
        }
        default:
        {
            Reporter.log("No se seleciono ningun navegador");
            System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
            Reporter.log("Abrir Navegador Chrome");
            driver = new ChromeDriver();
            break;

        }
    }
	driver.get(browserName);
	driver.manage().window().maximize();
    return driver;
  }

}
