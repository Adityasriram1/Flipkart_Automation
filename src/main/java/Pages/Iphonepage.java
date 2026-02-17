package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Iphonepage {
	WebDriver driver;
	public Iphonepage(WebDriver driver) {
		this.driver=driver;
	}
	By iblack=By.xpath("//*[text()='Apple iPhone 15 (Black, 128 GB)']");
	public void blackiphone() {
		driver.findElement(iblack).click();
	}

}
