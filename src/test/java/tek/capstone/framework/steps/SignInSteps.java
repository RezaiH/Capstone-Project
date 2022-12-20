package tek.capstone.framework.steps;

import java.util.List;
import java.util.Map;

import org.junit.Assert;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import tek.capstone.framework.pages.POMFactory;
import tek.capstone.framework.utilities.CommonUtility;

public class SignInSteps extends CommonUtility{

	POMFactory factory = new POMFactory();
	
//	Test Case One
	
	@Given("User is on Retail website")
	public void userIsOnRetailWebsite() {
	String expectedTitle = "React App";
    String actualTitle = getTitle();
    Assert.assertEquals(expectedTitle, actualTitle);
	logger.info(expectedTitle + " is equal to " + actualTitle);
//	Below are a couple extra Assertions
    String expectedText = "Shop By Category";
    String actualText = getText(factory.homePage().shopByCategoryText);
    Assert.assertEquals(expectedText, actualText);
    logger.info(actualText + " is equal to "+ expectedText);
    String expectedLogo = "TEKSCHOOL";
    String actualLogo = getText(factory.homePage().tekSchoolLogo);
    Assert.assertEquals(expectedLogo, actualLogo);
    logger.info(expectedLogo + " is equal to "+ actualLogo);
	
	}
	@When("User click on Sign in option")
	public void userClickOnSignInOption() {
		click(factory.homePage().signInOption);
		logger.info("User clicked on signin button!");
	}
	@When("User enter email {string} and password {string}")
	public void userEnterEmailAndPassword(String email, String password) {
//	  factory.signInPage().emailField.sendKeys(email);
//	  factory.signInPage().passwordField.sendKeys(password);
	  sendText(factory.signInPage().emailField, email);
	  sendText(factory.signInPage().passwordField, password);
	  logger.info("User entered the email and password!");
	}
	@When("User click on login button")
	public void userClickOnLoginButton() {
//	  factory.signInPage().loginButton.click();
		click(factory.signInPage().loginButton);
	  logger.info("User clicked on login button");
	}
	@Then("User should be logged in into the Account")
	public void userShouldBeLoggedInIntoTheAccount() {
	 String expectedLogo = "Account";
	 Assert.assertTrue(isElementDisplayed(factory.homePage().accountLogo));
	 logger.info(expectedLogo + " is equal to "+ getText(factory.homePage().accountLogo));
	}
	
	
//	Test Case Two
	
	@And("User click on Create New Account button")
	public void userClickOnCreateNewAccountButton() {
		slowDown();
		click(factory.signInPage().createNewAccBttn);
		logger.info("User clicked on Create New Account option.");
	}
	
//	List of Map
	@And("User fill the signUp form with below data")
	public void userFillTheSignUpFormWithBelowData(DataTable table) {
		slowDown();
		List<Map<String, String>> dTable = table.asMaps(String.class, String.class);
		slowDown();
		sendText(factory.signInPage().nameInput, dTable.get(0).get("name"));
		slowDown();
		sendText(factory.signInPage().emailInput, dTable.get(0).get("email"));
		slowDown();
		sendText(factory.signInPage().passwordInput, dTable.get(0).get("password"));
		slowDown();
		sendText(factory.signInPage().confirmPassInput, dTable.get(0).get("confirmPassword"));
        logger.info("User provided all the above required information in the form");
	}
	
//	List of List   Note: In list of list we comment the colums in the feature file
//	not the values
//	@And("User fill the signUp form with below data")
//	public void userFillTheSignUpFormWithBelowData(DataTable data) {
//		List<List<String>> signUpData = data.asLists(String.class);
//		sendText(factory.signInPage().nameInput, signUpData.get(0).get(0));
//		sendText(factory.signInPage().emailInput, signUpData.get(0).get(1));
//		sendText(factory.signInPage().passwordInput, signUpData.get(0).get(2));
//		sendText(factory.signInPage().confirmPassInput, signUpData.get(0).get(3));
//	}
	
	
	
	@And("User click on SignUp button")
	public void userClickOnSignUpButton() {
		slowDown();
		click(factory.signInPage().signUpBttn);
		logger.info("User clicked on Sign Up button");
	}
	
	@Then("User should be logged into account page")
	public void userShouldBeLoggedIntoAccountPage() {
		slowDown();
		String expectedValue = "Log out";
		String actualValue = getText(factory.homePage().logoutLogo);
		Assert.assertEquals(expectedValue, actualValue);
		logger.info(expectedValue + " is equal to " + actualValue);
	}
}
