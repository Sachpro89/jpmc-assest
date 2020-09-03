package pageObjects;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage {
	public WebDriver driver;
		
	public HomePage(WebDriver sdriver)
	{
		driver = sdriver;
		PageFactory.initElements(sdriver, this);
	}
	@FindBy(xpath = "/html/body/div/header/div[3]/nav/div[1]/div/div/a/img")
	WebElement logo;
	
	@FindBy(xpath = "//*[@id='tsf']/div[2]/div[1]/div[1]/div/div[2]/input")
	WebElement txtbox;
	
	@FindBy(xpath = "//*[@id='rso']/div[1]/div/div[1]/a/h3")
	WebElement firstLinkXpath;
	
	;
	
	// This method will perform the google search 
	public void searchParam (String search)
	{
		txtbox .sendKeys(search);
		txtbox.sendKeys(Keys.ENTER);
		
	}
	
	
	// this method will lick on the first link of google search 
	public void clickFirstLink()
	{
		firstLinkXpath.click();
		WebDriverWait wait = new WebDriverWait(driver, 100);
		System.out.println("The LOGO is verified");;
		
		}
	
	public void logoVisible()
	{
		WebDriverWait wait = new WebDriverWait(driver, 100);
		wait.until(ExpectedConditions.visibilityOf(logo));
	}
	
	
}