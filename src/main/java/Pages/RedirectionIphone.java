package Pages;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RedirectionIphone {
	WebDriver driver;
	public RedirectionIphone(WebDriver driver) {
		this.driver=driver;
	}
	By cartsymbol=By.xpath("//*[@class='css-175oi2r' and @style='transform:translateY(0px) scale(1)']");
	public void switchtowindow() throws InterruptedException {
		String parentwindow=driver.getWindowHandle();
		Set<String> allwindows=driver.getWindowHandles();
		  for(String window:allwindows) {
			  if(!window.equals(parentwindow)) {
				  driver.switchTo().window(window);
				  Thread.sleep(2000);
				  
			  }
			  
		  }
	}
	public void redirectionpage() {
	 driver.findElement(cartsymbol).click();	
	}

}
