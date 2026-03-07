package BasePackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

public class BaseClass {

    protected WebDriver driver;

    @BeforeTest
    @Parameters("browser")
    public void openFlipkart(String br) {
    	if(br.equalsIgnoreCase("chrome")) {

        driver = new ChromeDriver();   // initialize class variable (no WebDriver keyword)
    	}
    	else if(br.equalsIgnoreCase("edge")) {
    		driver=new EdgeDriver();
    	}
    	else {
    		System.out.println("Invalid browser name");return;
    	}
    	 
        driver.manage().window().maximize();
        driver.get("https://www.flipkart.com");
    }
    @AfterTest
	public void closeBrowser() {
    	driver.quit();
    }
   
    
}