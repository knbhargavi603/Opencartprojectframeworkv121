package testCases;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.AccountRegistrationPage;
import pageObjects.HomePage;

public class TC_AccountRegitrationTest extends BaseClass{

	@Test
	public void verify_account_registration() throws InterruptedException {
		logger.info("****Started Testing****");
		try {
		HomePage hp = new HomePage(driver);
		hp.clickMyaccount();
		logger.info("***We clicked on my Account link***");
		Thread.sleep(3000);
		hp.clickRegister();
		logger.info("***We clicked on Register link***");
		Thread.sleep(3000);
		  
		AccountRegistrationPage AR = new AccountRegistrationPage(driver);
		logger.info("***Providing customer details***");
		AR.settxtfirtname(randomeString().toUpperCase());
		AR.settxtlastname(randomeString().toUpperCase());
		AR.settxtemail(randomeString()+"@gmail.com");
		AR.settxtTelephone(randomeNumber());
		
		String password =randomeAlphanumeric();
		AR.settxtPassword(password);
		AR.settxtConfirmPassword(password);
		AR.setcheckAgree();
		AR.setbtnContinue();
		
		logger.info("***Validating expected message***");
		String confmessage = AR.getConfirmationmessage();
		Assert.assertEquals(confmessage, "Your Account Has Been Created!");
		
		Thread.sleep(3000);
	}
		catch(Exception e)
		{
			logger.error("Test failed..");
			logger.debug("debug logs..");
			Assert.fail();
		}
		logger.info("**Finished TC_AccountRegitrationTest**..");
		
	}
		
}
