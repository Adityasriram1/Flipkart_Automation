package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.Keys;

public class HomePage {
	WebDriver driver;
	public HomePage(WebDriver driver) {
		this.driver=driver;
	}
	By optionalpopup=By.xpath("//*[@class='b3wTlE']");
	By SearchBox=By.xpath("(//*[@class='nw1UBF v1zwn25'])[1]");
	public void optionalpopupbutton() {
		driver.findElement(optionalpopup).click();
	}
	public void EntertextinSearchbox(String TextName) {
	 driver.findElement(SearchBox).sendKeys(TextName + Keys.ENTER);
	}
}