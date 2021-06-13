import java.util.Collections;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import junit.framework.Assert;

public class TestPHPPage {

	    public static void main(String[] args) throws Exception 
	    {
	        System.setProperty("webdriver.chrome.driver", "C:\\WorkSpace_GCP\\TestPHPPortal\\src\\resourse\\chromedriver.exe");
	        ChromeOptions options = new ChromeOptions();
	        options.addArguments("start-maximized");
	        options.setExperimentalOption("useAutomationExtension", false);
	        options.setExperimentalOption("excludeSwitches", Collections.singletonList("enable-automation"));
	        WebDriver driver =  new ChromeDriver(options); 
	        //driver.get("https://accounts.google.com/signin");
	        driver.get("https://google.com");
	        
	        String Expectedtitle = "Google";
	      //it will fetch the actual title 
	      String Actualtitle = driver.getTitle();
	      System.out.println("Before Assetion " + Expectedtitle + Actualtitle);
	      //it will compare actual title and expected title
	      Assert.assertEquals(Actualtitle, Expectedtitle);
	      //print out the result
	      System.out.println("After Assertion " + Expectedtitle + Actualtitle + " Title matched ");
	   /*     new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='identifierId']"))).sendKeys("emailID");
	        driver.findElement(By.id("identifierNext")).click();
	        new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@name='password']"))).sendKeys("password");
	        driver.findElement(By.id("passwordNext")).click();*/
	    }
	}


