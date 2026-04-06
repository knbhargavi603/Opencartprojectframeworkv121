package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountRegistrationPage extends BasePage {
	
		public AccountRegistrationPage(WebDriver driver) {
		super(driver);
		
	}
	
	@FindBy(xpath ="//input[@id ='input-firstname']")
			WebElement txtfirtname;
	@FindBy(xpath ="//input[@id ='input-lastname']")
	WebElement txtlastname;
	
	@FindBy(xpath = "//input[@id ='input-email']")
	WebElement txtemail;
	
	@FindBy(xpath = "//input[@id ='input-telephone']")
	WebElement txtTelephone;
	@FindBy(xpath = "//input[@id ='input-password']")
	WebElement txtPassword;
	
	@FindBy(xpath = "//input[@id ='input-confirm']")
	WebElement txtConfirmPassword;
	@FindBy(xpath = "//input[@name ='agree']")
	WebElement checkAgree;
	
    @FindBy(xpath = "//input[@value='Continue']")
    WebElement btnContinue;
    
    @FindBy(xpath = "//h1[text()]")
    WebElement txtMessage;
    
public void settxtfirtname(String fname) {
	txtfirtname.sendKeys(fname);
}
public void settxtlastname(String lname)
{
	txtlastname.sendKeys(lname);
}
public void settxtemail(String email) {
	txtemail.sendKeys(email);
}
public void settxtTelephone(String telephone) {
	txtTelephone.sendKeys(telephone);
}
public void settxtPassword(String pwd) {
	txtPassword.sendKeys(pwd);
}
public void settxtConfirmPassword(String confirmpwd) {
	txtConfirmPassword.sendKeys(confirmpwd);
}
public void setcheckAgree() {
	checkAgree.click();
}
public void setbtnContinue() {
	btnContinue.click();
}
public String getConfirmationmessage() {
	try {
		return(txtMessage.getText());
	}catch(Exception e){
		return (e.getMessage());
	}
}
}
