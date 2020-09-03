package stepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjects.HomePage;

public class StepsToVerify {
	
	public WebDriver driver ;
	public HomePage hp;
	
	@Given("User launch chrome browser")
	public void user_launch_chrome_browser() {
	    //System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"//Drivers/chromedriver.exe" );
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"//src//test//resources/Drivers/chromedriver.exe" );
	    driver = new ChromeDriver();
		hp = new HomePage(driver);
	    		
	    
	}

	
	@When("^User opens URL \"([^\"]*)\"$")
	public void user_opens_URL(String URL) {
		driver.get(URL);
	    driver.manage().window().maximize();
	   
	}
	
	
	@When("^User search for \"([^\"]*)\"$")
	public void user_search_for(String search)  {
		hp.searchParam(search);
	    
	}
	@When("^User click on the first Link$")
	public void user_click_on_the_first_Link() {
	    hp.clickFirstLink();
	 
	}
	
	@Then("^user should be able to see the LOGO$")
	public void user_should_be_able_to_see_the_LOGO()  {
	   hp.logoVisible();
	   System.out.println("Logo is Visible");
	    
	}

	@Then("^Page Title should be \"([^\"]*)\"$")
	public void page_Title_should_be(String title) {
	   String tit = driver.getTitle();
	   if (title.equals(tit))
	   {
		   System.out.println("Title Matched, The Title is "+ tit );
	   }
	   else 
	   {
		   System.out.println("Title did not match, So Closing the browser ");
		   driver.close();
		   
	   }
	}
		

	@Then("close the browser")
	public void close_the_browser()  {
	    driver.quit();
	    
	}
}
	
	