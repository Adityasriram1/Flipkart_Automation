package TestPackage;
import java.util.Set;
import utilities.ScreenshotUtils;

import org.testng.Assert;
import org.testng.annotations.Test;

import BasePackage.BaseClass;
import Pages.HomePage;
import Pages.Iphonepage;
import Pages.RedirectionIphone;
public class HomeTest extends BaseClass {
	
  @Test(priority=1,dataProvider="testdata",dataProviderClass=utilities.datadrivernproviders.class)
  public void EnterText(String iname) throws InterruptedException {
	  HomePage hp=new HomePage(driver);
	  Thread.sleep(2000);
	  hp.EntertextinSearchbox(iname);
	  Assert.assertTrue(true);
	  ScreenshotUtils.CaptureScreenshot(driver,"EnterText");
	  
  }
  @Test(priority=2,dependsOnMethods="EnterText")
  public void ClickOnIphone() throws InterruptedException {
	  Iphonepage ip=new Iphonepage(driver);
	  Thread.sleep(2000);
	  ip.blackiphone();
	  ScreenshotUtils.CaptureScreenshot(driver,"ClickOnIphone");
	  }
  @Test(priority=3)
  public void switchtoproducttab() throws InterruptedException {
	  RedirectionIphone ri=new RedirectionIphone(driver);
	  ri.switchtowindow();
	  Thread.sleep(2000);
	  ScreenshotUtils.CaptureScreenshot(driver,"switchtoproducttab");
  }
  @Test(priority=4)
  public void Redirection() throws InterruptedException {
	  Thread.sleep(5000);
	  RedirectionIphone ri=new RedirectionIphone(driver);
	  Thread.sleep(5000);
	  ri.redirectionpage();
	  ScreenshotUtils.CaptureScreenshot(driver,"Redirection");

	  
	 
}}