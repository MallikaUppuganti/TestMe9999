package mytestTestMeApp;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class MyTest9999 {
	WebDriver driver;
	
	@Given("TestMeApp is fully up and running")
	public void testmeapp_is_fully_up_and_running() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		System.setProperty("webdriver.chrome.driver","C:\\Users\\training_h2a.06.15\\Desktop\\Testing\\Week 3\\SeleniumBroDrivers\\chromedriver.exe\\");
		driver=new ChromeDriver();
		driver.get("http://10.232.237.143:443/TestMeApp/login.htm");
		driver.manage().window().maximize();
	}

	@Then("Registered user will enter valid credentials")
	public void registered_user_will_enter_valid_credentials() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		driver.findElement(By .name("userName")).sendKeys("lalitha");
		driver.findElement(By .name("password")).sendKeys("Password123");
		driver.findElement(By .name("Login")).click();
		
	}

	@Then("Verifies for the Login Status of her Credentials")
	public void verifies_for_the_Login_Status_of_her_Credentials() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		String exp = driver.findElement(By .xpath("//*[@id=\"header\"]/div[1]/div/div/div[2]/div/ul/a")).getText();
		String act = "SignOut";
		Assert.assertEquals(exp,act);
		driver.close();
	}

}
