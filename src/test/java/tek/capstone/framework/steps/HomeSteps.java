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

public class HomeSteps extends CommonUtility{

	POMFactory factory = new POMFactory();
	
//	Test Case Fourteen
	
	@When("User click on All section")
	public void userClickOnAllSection() {
		click(factory.homePage().allLogo);
		logger.info("User clicked on All (three lines icon)");
		slowDown();
	}
	@Then("below options are present in Shop By department sidebar")
	public void belowOptionsArePresentInShopByDepartmentSidebar(DataTable data) {
     List<List<String>> shopByDepartSidebar = data.asLists(String.class);
    Assert.assertTrue(isElementDisplayed(factory.homePage().electronicsOptionSidebar, shopByDepartSidebar.get(0).get(0)));
    logger.info(getText(factory.homePage().electronicsOptionSidebar)+ " is present"); 
    Assert.assertTrue(isElementDisplayed(factory.homePage().computersOptionSidebar, shopByDepartSidebar.get(0).get(1)));
    logger.info(getText(factory.homePage().computersOptionSidebar)+ " is present");
    Assert.assertTrue(isElementDisplayed(factory.homePage().smartHomeOptionSidebar, shopByDepartSidebar.get(0).get(2)));
    logger.info(getText(factory.homePage().smartHomeOptionSidebar)+ " is present");
    Assert.assertTrue(isElementDisplayed(factory.homePage().sportsOptionSidebar, shopByDepartSidebar.get(0).get(3)));
    logger.info(getText(factory.homePage().sportsOptionSidebar)+ " is present");
    Assert.assertTrue(isElementDisplayed(factory.homePage().automativeOptionSidebar, shopByDepartSidebar.get(0).get(4)));
    logger.info(getText(factory.homePage().automativeOptionSidebar)+ " is present");

	}
//	Test Case Fifteen
	
	@And("User should be logged in into Account")
	public void userShouldBeLoggedInIntoAccount() {
		String expectedVal = "Orders";
		String actualVal = getText(factory.homePage().ordersLogo);
		Assert.assertEquals(expectedVal, actualVal);
		logger.info(expectedVal+ " is equal to "+ actualVal); 
		slowDown();
	}
	
	@And("User change the category to {string}")
	public void userChangeTheCategoryToSmartHome(String category) {
		selectByVisibleText(factory.homePage().allDepartments, category);
		logger.info("User clicked on Smart Home option");
		slowDown();
	}
	@And("User search for an item {string}")
	public void userSearchForAnItem(String inputValue) {
		sendText(factory.homePage().searchField, inputValue);
		logger.info("User entered the value in the search input");
		slowDown();
	}
	@And("User click on Search icon")
	public void userClickOnSearchIcon() {
		clickElementWithJS(factory.homePage().searchBttn);
		logger.info("User clicked on Search button");
		slowDown();
	}
	@And("User click on item")
	public void userClickOnItem() {
		click(factory.orderPage().kasaOutletImage);
		logger.info("User clicked on the kasa outlet image");
		slowDown();
	}
	@And("User select quantity {string}")
	public void userSelectQuantity(String itemNum) {
		slowDown();
		selectByValue(factory.orderPage().kasaQuantitySelectDropD, itemNum);
		logger.info("User clicked on Quantity dropdown and selected 2");
		//slowDown();
	}
	@And("User click on add to Cart button")
	public void userClickOnAddtoCartButton() {
		click(factory.orderPage().kasaAddToCartBttn);
		logger.info("User clicked on Add to Cart button");
		slowDown();
	}
	@Then("the cart icon quantity should change to {string}")
	public void theCartIconQuantityShouldChangeTo(String quantityNum) {
		
		String actualNum = getText(factory.orderPage().cartQuantity);
		Assert.assertEquals(actualNum, quantityNum);
		logger.info(actualNum + " is equal to "+ quantityNum);
		slowDown();
	}
	
//	Test Case Sixteen
	
	@And("User click on Cart option")
	public void userClickOnCartOption() {
		click(factory.homePage().cartLogo);
		logger.info("User clicked on Cart option");
		slowDown();
	}
	@And("User click on Proceed to Checkout button")
	public void userClickOnProceedToCheckoutButton() {
		click(factory.orderPage().proceedToCheckout);
		logger.info("User clicked on Proceed to Checkout button");
		slowDown();
	}
	@And("User click Add a new address link for shipping address")
	public void userClickAddANewAddressLinkForShippingAddress() {
		click(factory.orderPage().addNewAddressLink);
		logger.info("User clicked on Add a new address link");
		slowDown();
	}
	@And("User fill new address form with below data")
	public void userFillNewAddressFormWithBelowInformation(DataTable addInfo) {
		List<Map<String, String>> addressInfo = addInfo.asMaps(String.class, String.class);
		selectByValue(factory.accountPage().countryDropD, "Afghanistan");
		logger.info("User clicked on Country drop down list and selected Afghanistan");
		slowDown();
		sendText(factory.accountPage().fullNameInput, addressInfo.get(0).get("fullName"));
		logger.info("User provided the full name in the Full Name field");
		slowDown();
		sendText(factory.accountPage().phoneNumInput, addressInfo.get(0).get("phoneNumber"));
		logger.info("User provided the cell phone number in the Phone Number field");
		slowDown();
		sendText(factory.accountPage().addressInput, addressInfo.get(0).get("streetAddress"));
	    logger.info("User provided the address in the Address field");
	    slowDown();
	    sendText(factory.accountPage().aptNumber, addressInfo.get(0).get("apt"));
	    logger.info("User provided the apartment number in the Apt field");
	    slowDown();
	    sendText(factory.accountPage().cityInput, addressInfo.get(0).get("city"));
	    logger.info("User provided the city name in the City field");
	    slowDown();
	    selectByVisibleText(factory.accountPage().stateDropD, addressInfo.get(0).get("state"));
        logger.info("User clicked on State drop down list and selected Badakhshan");
	    slowDown();
	    sendText(factory.accountPage().zipCodeInput, addressInfo.get(0).get("zipCode"));
	    logger.info("User provided the zip code in the Zip Code field");
	    slowDown();
	}

	@And("User click on Add a Credit Card or Debit Card for payment method")
	public void userClickOnAddACreditCardOrDebitCardForPaymentMethod() {
		slowDown();
		click(factory.accountPage().addAPaymentMethod);
		logger.info("User clicked on Add a Credit or Debit Card link");
		slowDown();
	}
	@And("User fill Debit or Credit Card information")
	public void userFillDebitOrCreditCardInformation(DataTable paymentInfo) {
		List<Map<String, String>> paymentDetail = paymentInfo.asMaps(String.class, String.class);
		sendText(factory.accountPage().cardNumberInput, paymentDetail.get(0).get("cardNumber"));
		logger.info("User entered the card number in the Card Number field");
		slowDown();
		sendText(factory.accountPage().nameOnCardInput, paymentDetail.get(0).get("nameOnCard"));
		logger.info("User entered the name in the Name on Card field");
		slowDown();
		selectByVisibleText(factory.accountPage().yearDropD, paymentDetail.get(0).get("expirationYear"));
		logger.info("User selected 2040 as the Expiration year");
		slowDown();
		selectByVisibleText(factory.accountPage().monthDropD, paymentDetail.get(0).get("expirationMonth"));
		logger.info("User selected 7 as the month of the year");
		slowDown();
		sendText(factory.accountPage().securityCodeInput, paymentDetail.get(0).get("securityCode"));
	    logger.info("User entered the security code in the Security Code field");
	    slowDown();
	}

	@And("User click on Place Your Order")
	public void userClickOnPlaceYourOrder() {
		click(factory.orderPage().placeYourOrder);
		logger.info("User clicked on Place Your Order icon");
		slowDown();
	}
	@Then("a message displays {string}")
	public void aMessageDisplays(String message) {
		String expectedMessage = "Order Placed, Thanks";
		String actualMessage = getText(factory.orderPage().orderPlacedThanks);
		Assert.assertEquals(expectedMessage, actualMessage);
		logger.info(expectedMessage + " is equal to " + actualMessage);
	}
	
//	Test Case Seventeen
	
	@And("User change category to {string}")
    public void userChangeCategoryTo(String electronic ) {
		selectByVisibleText(factory.homePage().allDepartments, electronic);
		logger.info("User clicked on All Departments icon and selected Electronics");
		slowDown();
	}
	
	@And("User search for the item {string}")
	public void userSearchForTheItem(String apexLegend) {
		sendText(factory.homePage().searchField, apexLegend);
		logger.info("User entered Apex Legends in the search field");
		slowDown();
	}
	@And("User click on the item")
	public void userClickOnTheItem() {
		slowDown();
		click(factory.orderPage().apexLegendImg);
		logger.info("User clicked on the Apex Legend picture");
		slowDown();
	}
	@And("User select the quantity {string}")
	public void userSelectTheQuantity(String quantity) {
		selectByValue(factory.orderPage().kasaQuantitySelectDropD, quantity);
		logger.info("User clicked on Quantity bar and selected 5");
	}
	@Then("a message should appear {string}")
	public void aMessageShouldBeDisplayed(String orderPlacedTanx) {
		String expectedMessage = "Order Placed, Thanks";
		String actualMessage = getText(factory.orderPage().orderPlacedThanks);
        Assert.assertEquals(expectedMessage, actualMessage);
        logger.info(expectedMessage + " is equal to " + actualMessage);
	}
	
//	Test Case Eighteen
	
	@And("User on {string}")
	public void userOn(String department) {
		String expectedText = "Shop By department";
		String actualText = getText(factory.homePage().shopByDepartmentText);
		Assert.assertEquals(expectedText, actualText);
		logger.info(expectedText+ " is equal to " + actualText);
	}
	
	@Then("below options are present in department")
	public void belowOptionsArePresentInDepartment(DataTable departOptions) {
		List<List<String>> optionList = departOptions.asLists(String.class);
		String electronics = "Electronics";
		String computers = "Computers";
		String smartHome = "Smart Home";
		String sports = "Sports";
		String automative = "Automative";
		
		if(electronics.equals(getText(factory.homePage().electronicsOptionSidebar))) {
			click(factory.homePage().electronicsOptionSidebar);
			if(optionList.get(0).get(0).equals(getText(factory.homePage().tvAndVideo))
				&& optionList.get(0).get(1).equals(getText(factory.homePage().videoGames))) {
					Assert.assertTrue(true);
				}
			
		}
		else if(computers.equals(getText(factory.homePage().computersOptionSidebar))) {
			click(factory.homePage().computersOptionSidebar);
			if(optionList.get(1).get(0).equals(getText(factory.homePage().accessories))
					&& optionList.get(1).get(1).equals(getText(factory.homePage().networking))) {
				Assert.assertTrue(true);
			}
				
		}
		else if(smartHome.equals(getText(factory.homePage().smartHomeOptionSidebar))) {
			click(factory.homePage().smartHomeOptionSidebar);
			if(optionList.get(2).get(0).equals(getText(factory.homePage().smartHomeLightning))
				&& optionList.get(2).get(1).equals(getText(factory.homePage().plugsAndOutlets))){
					Assert.assertTrue(true);
				}
		}
		else if(sports.equals(getText(factory.homePage().sportsOptionSidebar))) {
			click(factory.homePage().sportsOptionSidebar);
			if(optionList.get(3).get(0).equals(getText(factory.homePage().athleticClothing))
					&& optionList.get(3).get(1).equals(getText(factory.homePage().exerciseAndFitness))) {
				Assert.assertTrue(true);
			}
		}
		else if(automative.equals(getText(factory.homePage().automativeOptionSidebar))) {
			click(factory.homePage().automativeOptionSidebar);
			if(optionList.get(4).get(0).equals(getText(factory.homePage().automativeAndAccessories))
					&& optionList.get(4).get(1).equals(getText(factory.homePage().motorcycleAndPowerports))) {
				Assert.assertTrue(true);
			}
		}else {
			Assert.assertTrue(false);
		}
		logger.info(electronics + " ," + computers + " ," + smartHome + " ,"+ sports + " ," + automative + " are all present in the Department Sidebar.");
	}
	
	
	
}
	