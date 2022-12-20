package tek.capstone.framework.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import tek.capstone.framework.base.BaseSetup;

public class RetailSignInPage extends BaseSetup{

	public RetailSignInPage() {
		PageFactory.initElements(getDriver(), this);
	}

//	SignIn Page
	
	@FindBy(xpath = "//h1[@class='login__title']")
	public WebElement tekschoolTextOnSignIn;
	
	@FindBy(xpath = "//input[@id='email']")
	public WebElement emailField;
	
	@FindBy(css = "input#password")
	public WebElement passwordField;
	
	@FindBy(css = "[type='submit']")
	public WebElement loginButton;
	
	@FindBy(xpath = "//p[text()='Or']")
	public WebElement orText;
	
	@FindBy(id = "newAccountBtn")
	public WebElement createNewAccBttn;
	
	@FindBy(css = ".login__company-btn")
	public WebElement wantTTSomething;
	
//	Sign Up page
	
	@FindBy(css = ".signup__input[name='name']")
	public WebElement nameInput;
	
	@FindBy(id = "emailInput")
	public WebElement emailInput;
	
	@FindBy(id = "passwordInput")
	public WebElement passwordInput;
	
	@FindBy(id = "confirmPasswordInput")
	public WebElement confirmPassInput;
	
	@FindBy(xpath = "//button[text()= 'Sign Up']")
	public WebElement signUpBttn;
	
	
	
	
	
	
	
	
}
