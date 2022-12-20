package tek.capstone.framework.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import tek.capstone.framework.base.BaseSetup;

public class RetailHomePage extends BaseSetup{
	
	public RetailHomePage() {
		PageFactory.initElements(getDriver(), this);
	}
	
//******************************* Shop By Department Sidebar
	@FindBy(xpath = "//button[@id ='hamburgerBtn']")
	public WebElement allLogo;
	
	@FindBy(xpath = "//h1[@id = \"contentHeader\"]")
	public WebElement shopByDepartmentText;
	
	@FindBy(xpath = "//span[text()='Electronics']")
	public WebElement electronicsOptionSidebar;
	
	@FindBy(xpath = "//span[text()='Computers']")
	public WebElement computersOptionSidebar;
	
	@FindBy(xpath = "//span[text()='Smart Home']")
	public WebElement smartHomeOptionSidebar;
	
	@FindBy(xpath = "//span[text()='Sports']")
	public WebElement sportsOptionSidebar;
	
	@FindBy(xpath = "//span[text()='Automative']")
	public WebElement automativeOptionSidebar;
	
	
	
//	**************************** Department Sidebar Options
	@FindBy(xpath = "//div[@data-id='6']")
	public WebElement tvAndVideo;
	
	@FindBy(xpath = "//div[@data-id='7']")
	public WebElement videoGames;
	
	@FindBy(xpath = "//span[text()='Accessories']")
	public WebElement accessories;
	
	@FindBy(xpath = "//span[text()='Networking']")
	public WebElement networking;
	
	@FindBy(xpath = "//span[text()='Smart Home Lightning']")
	public WebElement smartHomeLightning;
	
	@FindBy(xpath = "//span[text()='Plugs and Outlets']")
	public WebElement plugsAndOutlets;
	
	@FindBy(xpath = "//span[text()=\"Athletic Clothing\"]")
	public WebElement athleticClothing;
	
	@FindBy(xpath = "//span[text()=\"Exercise & Fitness\"]")
	public WebElement exerciseAndFitness;
	
	@FindBy(xpath = "//span[text()=\"Automative Parts & Accessories\"]")
	public WebElement automativeAndAccessories;
	
	@FindBy(xpath = "//span[text()=\"MotorCycle & Powersports\"]")
	public WebElement motorcycleAndPowerports;
	
	

	@FindBy(xpath = "//div[@id='cartBtn']")
	public WebElement cartLogo;
	
	@FindBy(css = "[class='top-nav__logo active']")
	public WebElement tekSchoolLogo;
	
	@FindBy(xpath = "//a[text()='Test Selenium']")
	public WebElement testSeleniumLogo;
	
	@FindBy(xpath = "//span[text()=\"All\"]")
	public WebElement allText;
	
	@FindBy(css = ".search__select")
	public WebElement allDepartments;
	
	@FindBy(id = "searchInput")
	public WebElement searchField;
	
	@FindBy(xpath = "//button[@id = \"searchBtn\"]")
	public WebElement searchBttn;
	
	@FindBy(xpath = "//a[text()='Account']")
	public WebElement accountLogo;
	
	@FindBy(id = "orderLink")
	public WebElement ordersLogo;
	
	@FindBy(id = "logoutBtn")
	public WebElement logoutLogo;
	
	@FindBy(id = "signinLink")
	public WebElement signInOption;
	
	@FindBy(xpath = "//h1[text()=\"Shop By Category\"]")
	public WebElement shopByCategoryText;
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
