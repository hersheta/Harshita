class loginstepdefination{
	
	WebDriver driver;
	HomePage homepage;
}
	
	@Before
	public void setup() {
		driver=new chromeDriver();
		
	}
	@After
	public void TearDown() {
		if(driver!==null) {
		driver.quit();
}
	
	
	
	
	@Given(I am on mylo login page)

public void login page() {
	driver.get("url");
}
@Given(When I enter username and pass)
.sendkeys
.sendkeys
@when(i click on login)
.click();
@then(I should be logged in succwssfully)
Assert.assertEquals(homepage.tile,true);

@Given( I enter invalid username and password).sendkeys
.sendKeys(dhdh):
	@when(I click onlogin)
.click
@rtthen("then I should see and error messGE INDICATING { string }"')
		Assert.assertEquals(homepage.messagename,true)
		
		@when(When I click on forget passswors)
.click

@then(I should be naviagted to forget password page)
Assert.asssertEquals(forgetpasswordpage.title,true)
}