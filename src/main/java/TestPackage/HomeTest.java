package TestPackage;
import java.util.Set;

import org.testng.annotations.Test;

import BasePackage.BaseClass;
import Pages.HomePage;
import Pages.Iphonepage;
import Pages.RedirectionIphone;
public class HomeTest extends BaseClass {
	
  @Test(priority=1)
  public void EnterText() throws InterruptedException {
	  HomePage hp=new HomePage(driver);
	  Thread.sleep(2000);
	  hp.EntertextinSearchbox("Iphone 15");
	  
  }
  @Test(priority=2)
  public void ClickOnIphone() throws InterruptedException {
	  Iphonepage ip=new Iphonepage(driver);
	  Thread.sleep(2000);
	  ip.blackiphone();}
  @Test(priority=3)
  public void switchtoproducttab() throws InterruptedException {
	  RedirectionIphone ri=new RedirectionIphone(driver);
	  ri.switchtowindow();
  }
  @Test(priority=4)
  public void Redirection() throws InterruptedException {
	  
	  RedirectionIphone ri=new RedirectionIphone(driver);
	  ri.redirectionpage();
	  
	  
	 
}}