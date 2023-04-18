import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class LoginStepdefinatio {
	WebDriver driver;
	Homepage homepage;


@Before()
	public void Setup()
	{
		driver=new ChromeDriver();
		
		
	}
	@After()
		public void Teardown() {
		if(driver==null) {
			driver.quit();
			
		}
	}
	@Given(I ma opn login page)
	public void loginpage() {
		driver.get("url");
		loginpage=new Loginpage(driver);
	}
		
	@Given("I enter username and password")
	public void Enter_username_and_password(String username, String password) {
		loginpage.enteremail(username);
		loginpage.enterpassword(password);
	}
	@When("I click on login")
	public void login() {
		loginpage.clicklogin();
	}
	@Then("I should be logged in Successfully")
	Assert.assertEquals(homepage.clicklogout(),true);
}
@Given("I enter invalid username and password")
public void send invalidusernameandpassword(String useername, String password) {
	loginppage.enterinvalidusername("username");
	loginpage.enterinvalidpassword(password);
	@When("I click on login")
	public void login() {
		loginpage.login();
	}
	
	@then("i should be getting invalid username and password error"){
		public void publish errormessage(String errormessage)
	Assert.assertEquals(driver.findElement(By.cssSelector(null)).isDisplayed();
	

}
@When("I click onn forget password")
public void forgetpasssword() {
	password.click();
}
@Then("I should be navigated to password reset page")
public void resetpassword() {
	Assert.asserEquals(loginpage.getesetpasswordpageurl().contains("Pagename"));
}
}

	
}

