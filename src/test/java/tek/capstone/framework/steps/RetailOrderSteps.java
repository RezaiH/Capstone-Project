package tek.capstone.framework.steps;

import java.util.List;
import java.util.Map;

import org.junit.Assert;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import tek.capstone.framework.pages.POMFactory;
import tek.capstone.framework.utilities.CommonUtility;

public class RetailOrderSteps extends CommonUtility{

	POMFactory factory = new POMFactory();
	
//	Test Case Eleven
	
	@And("User click on Orders section")
	public void userClickOnOrdersSection() {
		click(factory.homePage().ordersLogo);
		logger.info("User clicked on Orders option");
		slowDown();
	}
	@And("User click on first order in list")
	public void userClickOnFirstOrderInList() {
		click(factory.orderPage().firstOrder);
		logger.info("User clicked on the fishing rod image");
		slowDown();
	}
	@And("User click on Cancel The Order button")
	public void userClickOnCancelTheOrderButton() {
		click(factory.orderPage().cancelTheOrderBtn);
		logger.info("User clicked on Cancel the Order button");
		slowDown();
	}
	@And("User select the cancellation Reason {string}")
	public void userSelectTheCancellationReason(String cancelReason) {
		selectByVisibleText(factory.orderPage().cancellationDropD, cancelReason);
		logger.info("User selected the Cancellation reason as "+ cancelReason);
		slowDown();
	}
	@And("User click on Cancel Order button")
	public void userClickOnCancelOrderButton() {
		click(factory.orderPage().cancelOrderBttn);
		logger.info("User clickced on cancel order button");
		slowDown();
	}
	@Then("a cancellation message should be displayed {string}")
	public void aCancellationMessageShouldBeDisplayed(String cancellationMessage) {
		String actualMessage = getText(factory.orderPage().orderCancelledMessage);
		String expectedMessage = cancellationMessage;
		Assert.assertEquals(expectedMessage, actualMessage);
		logger.info(expectedMessage+ "---------");
		logger.info(expectedMessage + " is equal to "+ actualMessage);
	}
	
//	Test Case Twelve
	
	@And("User click on Return Items button")
	public void userClickOnReturnItemsButton() {
		click(factory.orderPage().returnItemBttn);
		logger.info("User clicked on return items button");
		slowDown();
	}
	@And("User select the Return Reason {string}")
	public void userSelectTheReturnReason(String reason) {
		selectByVisibleText(factory.orderPage().cancellationDropD, reason);
		logger.info("User selected the Return Reason as " + reason);
		slowDown();
	}
	@And("User select the drop off service {string}")
	public void userSelectTheDropOffService(String dropOff) {
		selectByVisibleText(factory.orderPage().dropOffDropD, dropOff);
		logger.info("User selected the drop off service as " + dropOff);
		slowDown();
	}
	@And("User click on Return Order button")
	public void userClickOnReturnOrderButton() {
		click(factory.orderPage().returnOrderBttn);
		logger.info("User clicked on Return Order button");
		slowDown();
	}
	@Then("a cancelation message should be displayed {string}")
	public void aCancelationMessageShouldBeDisplayed(String returnMessage) {
		Assert.assertTrue(isElementDisplayed(factory.orderPage().returnMessage));
		logger.info(returnMessage + "-----");
		logger.info(returnMessage + " is displayed! and test case is passed!");
	}
	
//	Test Case Thirteen
	@And("User click on Review button")
	public void userClickOnReviewButton() {
		click(factory.orderPage().reviewButton);
		logger.info("User clicked on Review Button");
		slowDown();
	}
	@And("User write Review headline {string} and review text {string}")
	public void userWriteReviewHeadlineAndReviewText(String headline, String review) {
		sendText(factory.orderPage().headlineInput, headline);
		slowDown();
		sendText(factory.orderPage().reviewInput, review);
		slowDown();
		logger.info("User added the Headline Title and provided the review Note");
	    slowDown();
	}
	@And("User click on Add your Review button")
	public void userClickOnAddYourReviewButton() {
		click(factory.orderPage().addYourReviewBttn);
		logger.info("User clicked on Add Your Review button");
		slowDown();
	}
	@Then("a review message should be displayed {string}")
	public void aReviewMessageShouldBeDisplayed(String reviewMe) {
		String actualRMessage = getText(factory.orderPage().reviewMessage);
		Assert.assertEquals(reviewMe, actualRMessage);
		logger.info(reviewMe + " is equal to "+ actualRMessage);
	}
	
	
	
	
}
