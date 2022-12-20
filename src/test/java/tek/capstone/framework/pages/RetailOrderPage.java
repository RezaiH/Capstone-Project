package tek.capstone.framework.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import tek.capstone.framework.base.BaseSetup;

public class RetailOrderPage extends BaseSetup{

	public RetailOrderPage() {
		PageFactory.initElements(getDriver(), this);
	}
//	************************************ Add Item to Cart
	
	@FindBy(xpath = "//img[@alt='Kasa Outdoor Smart Plug']")
	public WebElement kasaOutletImage;
	
	@FindBy(xpath = "//select[@class='product__select']")
	public WebElement kasaQuantitySelectDropD;
	
	@FindBy(id = "addToCartBtn")
	public WebElement kasaAddToCartBttn;
	
	@FindBy(xpath = "//span[@id='cartQuantity']")
	public WebElement cartQuantity;
	
	
	
//	******************************* Placing Order Without Shipping Address
	
	@FindBy(xpath = "//button[text()='Proceed to Checkout']")
	public WebElement proceedToCheckout;
	
	@FindBy(id = "addAddressBtn")
	public WebElement addNewAddressLink;
	
	@FindBy(id = "addPaymentBtn")
	public WebElement addCreditOrDebitCardLink;
	
	@FindBy(id = "placeOrderBtn")
	public WebElement placeYourOrder;
	
	@FindBy(xpath = "//p[text()='Order Placed, Thanks']")
	public WebElement orderPlacedThanks;
	
	@FindBy(xpath = "//img[@alt='Apex Legends - 1,000 Apex Coins']")
	public WebElement apexLegendImg;
	
	@FindBy(xpath = "//div[@data-id='70']")
	public WebElement fishingRod;
	
//	*********************** Cancel Order
	@FindBy(xpath = "(//p[text()='Show Details'])[1]")
	public WebElement firstOrder;
	
	@FindBy(xpath = "//button[@id='cancelBtn']")
	public WebElement cancelTheOrderBtn;
	
	@FindBy(xpath = "//select[@id = 'reasonInput']")
	public WebElement cancellationDropD;
	
	@FindBy(xpath = "//button[@id='orderSubmitBtn']")
	public WebElement cancelOrderBttn;
	
	@FindBy(xpath = "//p[text()='Your Order Has Been Cancelled']")
	public WebElement orderCancelledMessage;
	
	
//	***************************** Return Order
	@FindBy(id = "returnBtn")
	public WebElement returnItemBttn;
	
	@FindBy(id = "dropOffInput")
	public WebElement dropOffDropD;
	
	@FindBy(id = "orderSubmitBtn")
	public WebElement returnOrderBttn;
	
	@FindBy(xpath = "//p[text()='Return was successfull']")
	public WebElement returnMessage;
	
	
	
//	**************************** Add Review On Order
	@FindBy(xpath = "//button[text()='Review']")
	public WebElement reviewButton;
	
	@FindBy(id = "headlineInput")
	public WebElement headlineInput;
	
	@FindBy(id = "descriptionInput")
	public WebElement reviewInput;
	
	@FindBy(id = "reviewSubmitBtn")
	public WebElement addYourReviewBttn;
	
	@FindBy(xpath = "//div[text()='Your review was added successfully']")
	public WebElement reviewMessage;
	
	
	
	
	
	
	
}
