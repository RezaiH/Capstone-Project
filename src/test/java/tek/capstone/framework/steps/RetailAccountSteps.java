package tek.capstone.framework.steps;

import java.util.List;
import java.util.Map;

import org.junit.Assert;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import tek.capstone.framework.pages.POMFactory;
import tek.capstone.framework.utilities.CommonUtility;

public class RetailAccountSteps extends CommonUtility{

	POMFactory factory = new POMFactory();
	
//	Test Case Three
	
  @When("User click on Account option")
  public void userClickOnAccountOption() {
	  click(factory.homePage().accountLogo);
	  logger.info("User clicked on Account logo");
  }
  
  @And("User update Name {string} and Phone {string}")
  public void userUpdateNameAndPhone(String name, String phone) {
	  slowDown();
	  clear(factory.accountPage().nameInput);
	  sendText(factory.accountPage().nameInput, name);
	  logger.info("User updated the name");
	  slowDown();
	  clear(factory.accountPage().phoneNumInput);
	  sendText(factory.accountPage().phoneNumInput, phone);
	  logger.info("User updated the phone number");
	
  }

  @And("User click on Update button")
  public void userClickOnUpdateButton() {
//	  waitTillClickable(factory.accountPage().updateIcon);
	  click(factory.accountPage().updateIcon);
	  logger.info("User clicked on Update icon");
  }
  
  @Then("User profile information should be updated")
  public void userProfileInformationShouldBeUpdated() {
	  waitTillPresence(factory.accountPage().updateMessage);
	  String expectedMessage = "Personal Information Updated Successfully";
	  String actualMessage = getText(factory.accountPage().updateMessage);
	  Assert.assertEquals(expectedMessage, actualMessage);
	  logger.info(expectedMessage+ " is equal to " + actualMessage);
  }
//  Test Case Four
  
  @And("User enter below information")
  public void userEnterBelowInformation(DataTable data) {
	  slowDown();
	  List<Map<String, String>> updateInfo = data.asMaps(String.class, String.class);
	  sendText(factory.accountPage().previousPasswordInput, updateInfo.get(0).get("previousPassword"));
      sendText(factory.accountPage().newPasswordInput, updateInfo.get(0).get("newPassword"));
      sendText(factory.accountPage().confirmPasswordInput, updateInfo.get(0).get("confirmPassword"));
      logger.info("User updated the password");
  }
  @And("User click on Change Password button")
  public void userClickOnChangePasswordButton() {
	  slowDown();
	  click(factory.accountPage().changePasswordIcon);
	  logger.info("User clicked on Change Password icon");
  }
  @Then("a message should be displayed {string}")
  public void aMessageShouldBeDisplayed(String message) {
	  slowDown();
	  String actualMessage = getText(factory.accountPage().updatePasswordAlertMessage);
	  slowDown();
	  Assert.assertEquals(message, actualMessage);
      logger.info(message + " is equal to "+ actualMessage);
  }
  
  
//  Test Case Five
  @And("User click on Add a payment method link")
  public void userClickOnAddAPaymentMethodLink() {
	  click(factory.accountPage().addAPaymentMethod);
	  logger.info("User clicked on add a payment method link");
  }
  @And("User fill Debit or credit card information")
  public void userFillDebitOrCreditCardInformation(DataTable data) {
//	  List<List<String>> payInfo = data.asLists(String.class);
//	  sendText(factory.accountPage().cardNumberInput, payInfo.get(0).get(0));
//	  sendText(factory.accountPage().nameOnCardInput, payInfo.get(0).get(1));
//	  sendText(factory.accountPage().expirationMonth, payInfo.get(0).get(2));
//	  sendText(factory.accountPage().expirationYear, payInfo.get(0).get(3));
//	  sendText(factory.accountPage().securityCodeInput, payInfo.get(0).get(4));
//	  logger.info("User entered the required details in the form");
	  List<Map<String, String>> payInfo = data.asMaps(String.class, String.class);
	  slowDown();
	  sendText(factory.accountPage().cardNumberInput, payInfo.get(0).get("cardNumber"));
	  slowDown();
	  sendText(factory.accountPage().nameOnCardInput, payInfo.get(0).get("nameOnCard"));
	  slowDown();
	  sendText(factory.accountPage().yearDropD, payInfo.get(0).get("expirationYear"));
	  slowDown();
	  sendText(factory.accountPage().monthDropD, payInfo.get(0).get("expirationMonth"));
	  slowDown();
	  sendText(factory.accountPage().securityCodeInput, payInfo.get(0).get("securityCode"));
	  logger.info("User filled out the Debit card form with above information");
	  slowDown();
  }
  
  @And("User click on Add your card button")
  public void userClickOnAddYourCardButton() {
	  slowDown();
	  click(factory.accountPage().addYourCardIcon);
	  logger.info("User clicked on add your card button");
  }
  
  @Then("a message should be displayed as {string}")
  public void aMessageShouldBeDisplayedAs(String message) {
	  String actualPop_up = getText(factory.accountPage().paymentAdded);
	  logger.info(actualPop_up + "****************");
	  slowDown();
	  logger.info(actualPop_up + " is equal to "+ message);
  }
  
//  Test Case Six
  @And("User click on added Debit card or Credit card")
  public void userClickOnAddedDebitCardOrCreditCard() {
	  slowDown();
	  click(factory.accountPage().addedDebitCard);
	  logger.info("User clicked on added Debit card or Credit card");
  }
  
  @And("User click on Edit option of card section")
  public void userClickOnEditOptionOfCardSection() {
	  slowDown();
	  click(factory.accountPage().editButton);
	  logger.info("User clicked on Edit option of the Debit card section");
  }
  @And("User edit information with below data")
  public void userEditInformationWithBelowData(DataTable editDebitCard) {
	  List<List<String>> editInformation = editDebitCard.asLists(String.class);
	  slowDown();
	  clearTextUsingSendKeys(factory.accountPage().cardNumberInput);
	  slowDown();
	  sendText(factory.accountPage().cardNumberInput, editInformation.get(0).get(0));
	  slowDown();
	  clearTextUsingSendKeys(factory.accountPage().nameOnCardInput);
	  slowDown();
	  sendText(factory.accountPage().nameOnCardInput, editInformation.get(0).get(1));
	  slowDown();
//	  selectByVisibleText(factory.accountPage().expirationMonthDropD, "10");
	  selectByVisibleText(factory.accountPage().yearDropD, editInformation.get(0).get(2));
	  slowDown();
//	  selectByVisibleText(factory.accountPage().expirationYearDropD, "2040");
	  selectByVisibleText(factory.accountPage().monthDropD, editInformation.get(0).get(3));
	  slowDown();
	  clearTextUsingSendKeys(factory.accountPage().securityCodeInput);
	  slowDown();
	  sendText(factory.accountPage().securityCodeInput, editInformation.get(0).get(4));
	  logger.info("User updated the Debit or Credit card form");
	  slowDown();
	  
  }
  @And("User click on Update Your Card button")
  public void userClickOnUpdateYourCardButton() {
	  slowDown();
	  click(factory.accountPage().updateYourCard);
	  logger.info("User clicked on Update Your Card button");
	  
  }
  
  @Then("a message should show up {string}")
  public void aMessageShouldShowUp(String message) {
	  slowDown();
	  String actualMessage = getText(factory.accountPage().paymentUpdateMessage);
	  logger.info(actualMessage);
	  logger.info(message + " is equal to " + actualMessage);

  }
  
//  Test Case Seven
    @And("User click on remove option of card section")
    public void userClickOnRemoveOptionOfCardSection() {
    	click(factory.accountPage().removeAddedDebitBttn);
    	logger.info("User removed the added Debit or Credit card");
    	slowDown();
    }
  
  @Then("payment details should be removed")
  public void paymentDetailsShouldBeRemoved() {
  String expectedName = "Mudaser";
  String actualName = getText(factory.accountPage().testRemoveNameInput);
  if(actualName == expectedName) {
	  logger.info("Visa Card is not removed from the systeme");
  }else {
	  logger.info("Visa card is successfully removed from the system");
  }
  }
  
//  Test Case Eight
  @And("User click on Add address option")
  public void userClickOnAddAddressOption() {
	  click(factory.accountPage().addAddress);
	  logger.info("User clicked on Add Address option");
	  slowDown();
  }
  @And("User fill new address form with below information")
  public void userFillNewAddressFormWithBelowInformation(DataTable data) {
	  selectByValue(factory.accountPage().countryDropD, "United States");
	  logger.info("User clicked on country drop down and selected United States");
	  List<Map<String, String>> addressForm = data.asMaps(String.class, String.class);
	  sendText(factory.accountPage().fullNameInput, addressForm.get(0).get("fullName"));
	slowDown();
	  sendText(factory.accountPage().phoneNumberInput, addressForm.get(0).get("phoneNumber"));
	  slowDown();
	  sendText(factory.accountPage().addressInput, addressForm.get(0).get("streetAddress"));
	slowDown();
	  sendText(factory.accountPage().aptNumber, addressForm.get(0).get("apt"));
	slowDown();
	  sendText(factory.accountPage().cityInput, addressForm.get(0).get("city"));
	slowDown();
	  selectByValue(factory.accountPage().stateDropD, "Maryland");
	  slowDown();
	  sendText(factory.accountPage().zipCodeInput, addressForm.get(0).get("zipCode"));
    slowDown();
	  logger.info("User entered the information in the Address form");
	  slowDown();
  }
  @And("User click on Add Your Address button")
  public void userClickOnAddYourAddressButton() {
	  slowDown();
	  click(factory.accountPage().addYourAddressBttn);
	  logger.info("User clicked on Add Your Address button");
	  
  }
  @Then("a message should display {string}")
  public void aMessageShouldDisplay(String address) {
	  slowDown();
	  String actualMessage = getText(factory.accountPage().addressAddedMessage);
	 logger.info(actualMessage + "***************");
	  Assert.assertEquals(address, actualMessage);
	  logger.info(address+ " is equal to " + actualMessage);
  }
  
//  Just For Test 
  @And("User fill the address form with below information")
  public void userFillTheAddressFormWithBelowInformation(DataTable test) {
	  List<List<String>> addressForm = test.asLists(String.class);
	  selectByVisibleText(factory.accountPage().countryDropD, "Afghanistan");
	  slowDown();
	  sendText(factory.accountPage().fullNameInput, addressForm.get(0).get(1));
	  slowDown();
	  sendText(factory.accountPage().phoneNumberInput, addressForm.get(0).get(2));
	  slowDown();
	  sendText(factory.accountPage().addressInput, addressForm.get(0).get(3));
	  slowDown();
	  sendText(factory.accountPage().aptNumber, addressForm.get(0).get(4));
	  slowDown();
	  sendText(factory.accountPage().cityInput, addressForm.get(0).get(5));
	  slowDown();
	  selectByVisibleText(factory.accountPage().stateDropD, "Kabul");
	  slowDown();
	  sendText(factory.accountPage().zipCodeInput, addressForm.get(0).get(7));
	  logger.info("User provided the address detail in the form");
  }
  
//  Test Case Nine
  @And("User click on edit address option")
  public void userClickOnEditAddressOption() {
	  slowDown();
	  click(factory.accountPage().editAddress);
	  logger.info("User clicked on Edit button");
  }
  @And("User update address form with below information")
  public void userUpdateAddressFormWithBelowInformation(DataTable data) {
	  List<List<String>> addressInfo = data.asLists(String.class);
	  selectByValue(factory.accountPage().countryDropD, "United States");
	  slowDown();
	  clearTextUsingSendKeys(factory.accountPage().fullNameInput);
	  slowDown();
	  sendText(factory.accountPage().fullNameInput, addressInfo.get(0).get(1));
	  slowDown();
	  clearTextUsingSendKeys(factory.accountPage().phoneNumberInput);
	  sendText(factory.accountPage().phoneNumberInput, addressInfo.get(0).get(2));
	  slowDown();
	  clearTextUsingSendKeys(factory.accountPage().addressInput);
	  sendText(factory.accountPage().addressInput, addressInfo.get(0).get(3));
	  slowDown();
	  clearTextUsingSendKeys(factory.accountPage().aptNumber);
	  sendText(factory.accountPage().aptNumber, addressInfo.get(0).get(4));
	  slowDown();
	  clearTextUsingSendKeys(factory.accountPage().cityInput);
	  sendText(factory.accountPage().cityInput, addressInfo.get(0).get(5));
	  slowDown();
	  selectByValue(factory.accountPage().stateDropD, "Virginia");
	  slowDown();
	  clearTextUsingSendKeys(factory.accountPage().zipCodeInput);
	  sendText(factory.accountPage().zipCodeInput, addressInfo.get(0).get(7));
	  logger.info("User updated the address form with new information");
  }
	  @And("User click on Update Your Address button")
	  public void userClickOnUpdateYourAddressButton() {
		  slowDown();
		  click(factory.accountPage().updateYourAddressBttn);
		  logger.info("User clicked on Update Your Address button");
	  }
  @Then("a message should come as {string}")
  public void aMessageShouldComeAs(String message) {
	  slowDown();
	  String actualMessage = getText(factory.accountPage().addressUpdatedSuccessfully);
	  logger.info(actualMessage);
	  slowDown();
	  Assert.assertEquals(message, actualMessage);
	  logger.info(message + " is equal to " + actualMessage);
  }
  
//  Test Case Ten
  @And("User click on Remove option of Address section")
  public void userClickOnRemoveOptionOfAddressSection() {
	  slowDown();
	  click(factory.accountPage().removeAddress);
	  logger.info("User clicked on the Remove option");
	  
  }
  
  @Then("Address details should be removed") 
  public void addressDetailsShouldBeRemoved() {
	  slowDown();
   Assert.assertFalse(isNotDisplayed(factory.accountPage().removeAddress));
   logger.info("User removed the target address from the application");
  }
}
