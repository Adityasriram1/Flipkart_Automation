package BasePackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

public class BaseClass {

    protected WebDriver driver;

    @BeforeTest
    public void openFlipkart() {

        driver = new ChromeDriver();   // initialize class variable (no WebDriver keyword)

        driver.manage().window().maximize();
        driver.get("https://www.flipkart.com");
    }
    
}