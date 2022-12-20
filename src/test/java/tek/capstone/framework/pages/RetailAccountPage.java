package tek.capstone.framework.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import tek.capstone.framework.base.BaseSetup;

public class RetailAccountPage extends BaseSetup{

	public RetailAccountPage() {
		PageFactory.initElements(getDriver(), this);
	}
	
//	***************************Profile Information updated
	
	@FindBy(id = "nameInput")
	public WebElement nameInput;
	
	@FindBy(id = "phoneNumberInput")
	public WebElement phoneNumInput;
	
	@FindBy(id = "emailInput")
	public WebElement emailInput;
	
	
//	*************************Update Password 
	
	@FindBy(xpath = "//input[@name='previousPassword']")
	public WebElement previousPasswordInput;
	
	@FindBy(id = "newPasswordInput")
	public WebElement newPasswordInput;
	
	@FindBy(id = "confirmPasswordInput")
	public WebElement confirmPasswordInput;
	
	@FindBy(xpath = "//button[text()='Update']")
	public WebElement updateIcon;
	
	@FindBy(xpath = "//div[text()='Personal Information Updated Successfully']")
	public WebElement updateMessage;
	
	@FindBy(xpath = "//div[text()='Password Updated Successfully']")
	public WebElement updatePasswordAlertMessage; 
	
	@FindBy(xpath = "//button[@id='credentialsSubmitBtn']")
	public WebElement changePasswordIcon;
	
//	***************************Payment Added
	@FindBy(id = "addPaymentBtn")
	public WebElement addAPaymentMethod;
	
	@FindBy(id = "cardNumberInput")
	public WebElement cardNumberInput;
	
	@FindBy(id = "nameOnCardInput")
	public WebElement nameOnCardInput;
	
	@FindBy(id = "expirationMonthInput")
	public WebElement monthDropD;
	
	@FindBy(id = "expirationYearInput")
	public WebElement yearDropD;
	
	@FindBy(id = "securityCodeInput")
	public WebElement securityCodeInput;
	
	@FindBy(xpath = "//button[text()= \"Add Your card\"]")
	public WebElement addYourCardIcon;
	
//	*********************** Payment Updated
	@FindBy(xpath = "//div[text()='Payment Method added sucessfully']")
	public WebElement paymentAdded;
	
	@FindBy(xpath = "//div[@class='false account__payment-item']")
	public WebElement addedDebitCard;
	
	@FindBy(xpath = "//button[text()='Edit']")
	public WebElement editButton;
	
	@FindBy(id = "paymentSubmitBtn")
	public WebElement updateYourCard;
	
	@FindBy(xpath = "//div[text()=\"Payment Method updated Successfully\"]")
	public WebElement paymentUpdateMessage;
	
//	************************** Remove Debit Or Credit Card
	@FindBy(xpath = "//button[text()='remove']")
	public WebElement removeAddedDebitBttn;
	
	@FindBy(xpath = "(//p[@class='account__payment__sub-text'])[4]")
	public WebElement debitCardEnding1111;
	
	@FindBy(id = "nameOnCardInput")
	public WebElement testRemoveNameInput;
	
//	************************* Add Address
	@FindBy(css = ".account__address-new")
	public WebElement addAddress;
	
	@FindBy(id = "countryDropdown")
	public WebElement countryDropD;
	
	@FindBy(id = "fullNameInput")
	public WebElement fullNameInput;
	
	@FindBy(id = "phoneNumberInput")
	public WebElement phoneNumberInput;
	
	@FindBy(id = "streetInput")
	public WebElement addressInput;
	
	@FindBy(id = "apartmentInput")
	public WebElement aptNumber;
	
	@FindBy(id = "cityInput")
	public WebElement cityInput;
	
	@FindBy(xpath = "//select[@name=\"state\"]")
	public WebElement stateDropD;
	
	@FindBy(xpath = "//option[text()='Kabul']")
	public WebElement kabulCity;
	
	@FindBy(id = "zipCodeInput")
	public WebElement zipCodeInput;
	
	@FindBy(xpath = "//button[text()='Add Your Address']")
	public WebElement addYourAddressBttn;
	
	@FindBy(xpath = "//div[text()='Address Added Successfully']")
	public WebElement addressAddedMessage;
	
	
//	**************************** Edit Address
	@FindBy(xpath = "(//button[text()='Edit'])[1]")
	public WebElement editAddress;
	
	@FindBy(xpath = "//button[text()='Update Your Address']")
	public WebElement updateYourAddressBttn;
	
	@FindBy(xpath = "//div[text()='Address Updated Successfully']")
	public WebElement addressUpdatedSuccessfully;
	
//	***************************** Remove Address 
	@FindBy(xpath = "(//button[text()='Remove'])[3]")
	public WebElement removeAddress;
	
	@FindBy(xpath = "//p[text()='Hussain Rezai']")
	public WebElement assertRemovedAdd;
	
	
	
//	Extra WebElements of the Account page
	
	@FindBy(css =".account__information-profile-image")
	public WebElement profileImage;
	
	@FindBy(css = "h1.account__information-username")
	public WebElement nameUnderProfilePic;
	
	@FindBy(css = "h1.account__information-email")
	public WebElement emailUnderProfilePic;
	
	@FindBy(xpath = "//h1[text()='Wallet']")
	public WebElement walletText;
	
	@FindBy(css = ".account__payments-title")
	public WebElement cardsAndAccounts;
	
	@FindBy(css = "h1.account__payment-new-title")
	public WebElement addDebitCardOrCreditCardText;
	
	@FindBy(xpath = "//img[@alt=\"credit cards\"]")
	public WebElement creditCardsPics;
	
	@FindBy(xpath = "//p[text()=\"TekSchool accepts most major credit and debit cards:\"]")
	public WebElement tekSchoolAcceptsCreditsCardsText;
	
	@FindBy(xpath = "//p[text()='Visa Card' and @class=\"account__payment-sub-title\"]")
	public WebElement checkingVisaCardIfRemoved;
	
	
	
	
	
}
