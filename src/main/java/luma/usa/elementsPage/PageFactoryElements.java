package luma.usa.elementsPage;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import luma.usa.BasePage.SuperClass;
import luma.usa.genaricfunctions.CommonMethods;
import luma.usa.genaricfunctions.WaitHelper;

public class PageFactoryElements extends SuperClass  { // "extends" from SuperClass java inheritance concept

	public PageFactoryElements() {
		PageFactory.initElements(driver, this); // this (current class property or elements) is java reserve keyword &
												// PageFactory.initElements coming from Selenium
												// PageFactoryElements is a constructor from java

	}

	// How we can store the webElemet

	@FindBy(linkText = "Sign In") // store all the webElemet by @FindBy annotation
	@CacheLookup // In order to find the cache memory so that my test cases performance will be
					// faster.

	private WebElement signInBtn; // WebElement we declare the locator object name ex: Clicking signInBtn

	public WebElement getSignInBtn() { // Encapsulation concept: private access modifier & getter method
		return signInBtn;
	}

	@FindBy(id = "email")
	@CacheLookup

	private WebElement EnterUserName;

	public WebElement getEnterUserName() {
		return EnterUserName;
	}

	@FindBy(id = "pass")
	@CacheLookup

	private WebElement EnterPassword;

	public WebElement getEnterPassword() {
		return EnterPassword;
	}

	@FindBy(xpath = "//button[@id='send2']")
	@CacheLookup

	private WebElement ClickOnSignBtn;

	public WebElement getClickOnSignBtn() {
		return ClickOnSignBtn;
	}

	@FindBy(linkText = "Men")
	@CacheLookup

	private WebElement SelectMenModule;

	public WebElement getSelectMenModule() {
		return SelectMenModule;
	}

	@FindBy(linkText = "Tops")
	@CacheLookup

	private WebElement SelectTopsFromMenModule;

	public WebElement getSelectTopsFromMenModule() {
		return SelectTopsFromMenModule;
	}

	@FindBy(linkText = "Jackets")
	@CacheLookup

	private WebElement SelectJacketFromMenModule;

	public WebElement getSelectJacketFromMenModule() {
		return SelectJacketFromMenModule;
	}

	@FindBy(xpath = "(//*[@Class='product-item-link'])[3]")
	@CacheLookup

	private WebElement SelectJupiterAll_WeatherTrainer;

	public WebElement getSelectJupiterAll_WeatherTrainer() {
		return SelectJupiterAll_WeatherTrainer;
	}

	@FindBy(xpath = "//*[@id='option-label-size-143-item-166']")
	@CacheLookup

	private WebElement SelectSize;

	public WebElement getSelectSize() {
		return SelectSize;
	}

	@FindBy(xpath = "//*[@id='option-label-color-93-item-53']")
	@CacheLookup

	private WebElement SelectColor;

	public WebElement getSelectColor() {
		return SelectColor;
	}

	//
	@FindBy(xpath = "//*[@id='qty']")
	@CacheLookup

	private WebElement SelectQuantity;

	public WebElement getSelectQuantity() {
		return SelectQuantity;
	}//

	@FindBy(xpath = "//*[@id='product-addtocart-button']")
	@CacheLookup

	private WebElement ClickOnAddtoCart;

	public WebElement getClickOnAddtoCart() {//
		return ClickOnAddtoCart;
	}

	@FindBy(linkText = "shopping cart")
	@CacheLookup

	private WebElement ClickShoppingCart;

	public WebElement getClickShoppingCart() {//
		return ClickShoppingCart;
	}

	@FindBy(xpath = "(//*[contains(text(),'Proceed to Checkout')])[2]")
	@CacheLookup

	private WebElement Proceed_to_Checkout;

	public WebElement getProceed_to_Checkout() {//
		return Proceed_to_Checkout;
	}

	//
	@FindBy(xpath = "//*[text()='New Address']")
	@CacheLookup

	private WebElement AddNewAddress;

	public WebElement getAddNewAddress() {//
		return AddNewAddress;
	}

	// ------------adding new shipping address
	@FindBy(xpath = "//*[@name='firstname']")
	@CacheLookup

	private WebElement EnterFirstName;

	public WebElement getEnterFirstName() {//
		return EnterFirstName;
	}

	@FindBy(xpath = "//*[@name='lastname']")
	@CacheLookup

	private WebElement EnterLastName;

	public WebElement getEnterLastName() {//
		return EnterLastName;
	}

	@FindBy(xpath = "//*[@name='company']")
	@CacheLookup

	private WebElement EnterCompanyName;

	public WebElement getEnterCompanyName() {//
		return EnterCompanyName;
	}

	@FindBy(xpath = "//*[@name='street[0]']")
	@CacheLookup

	private WebElement EnterCustomerAddress;

	public WebElement getEnterCustomerAddress() {//
		return EnterCustomerAddress;
	}

	@FindBy(xpath = "//*[@name='city']")
	@CacheLookup

	private WebElement EnterCity;

	public WebElement getEnterCity() {//
		return EnterCity;
	}

	@FindBy(xpath = "(// *[@class='select'])[1]")
	@CacheLookup

	private WebElement SelectState;

	public WebElement getSelectState() {//
		return SelectState;
	}

	@FindBy(xpath = "//*[@name='postcode']")
	@CacheLookup

	private WebElement EnterZipCode;

	public WebElement getEnterZipCode() {//
		return EnterZipCode;
	}

	@FindBy(xpath = "//*[@name='country_id']")
	@CacheLookup

	private WebElement SelectCountry;

	public WebElement getSelectCountry() {//
		return SelectCountry;
	}

	@FindBy(xpath = "//*[@name='telephone']")
	@CacheLookup
// 
	private WebElement EnterPhoneNumber;

	public WebElement getEnterPhoneNumber() {//
		return EnterPhoneNumber;
	}

	@FindBy(xpath = "//*[contains(text(),'Ship here')]")
	@CacheLookup

	private WebElement ClickOnShiphere;

	public WebElement getClickOnShiphere() {//
		return ClickOnShiphere;
	}

	@FindBy(xpath = "(//*[@name='ko_unique_1'])[1]")
	@CacheLookup

	private WebElement SelectShippingMethod;

	public WebElement getSelectShippingMethod() {//
		return SelectShippingMethod;
	}

	@FindBy(xpath = "//*[contains(text(),'Next')]")
	@CacheLookup

	private WebElement ClickNextBtn;

	public WebElement getClickNextBtn() {//
		return ClickNextBtn;
	}

	@FindBy(xpath = "//*[contains(text(),'Place Order')]")
	@CacheLookup

	private WebElement ClickPlaceOrder;

	public WebElement getClickPlaceOrder() {//
		return ClickPlaceOrder;
	}

	@FindBy(xpath = "//*[text()='Thank you for your purchase!'")
	@CacheLookup

	private WebElement VerifyTextMessage;

	public WebElement getVerifyTextMessage() {//
		return VerifyTextMessage;
	}
	@FindBy(xpath = "(//*[@class='radio'])[1]")
	@CacheLookup

	private WebElement ShippingMethod;

	public WebElement getShippingMethod() {//
		return ShippingMethod;
	}
	
	
	@FindBy(xpath = "//*[text()='Next']")
	@CacheLookup

	private WebElement ClickNext;

	public WebElement getClickNext() {//
		return ClickNext;
	}
	
	//Place Order
	
	@FindBy(xpath = "//*[text()='Place Order']")
	@CacheLookup

	private WebElement placeOrder;

	public WebElement getplaceOrder() {//
		return placeOrder;
	}
	
	//
	@FindBy(xpath = "//*[text()='Thank you for your purchase!']")
	@CacheLookup

	private WebElement VerifyOrderConf;

	public WebElement getVerifyOrderConf() {//
		return VerifyOrderConf;
	}
	
	//------------
	// xpath for list of web elements 
	@FindBy(xpath = "(// *[@class='select'])[1]/option")
	@CacheLookup

	private List<WebElement> selectListOfState;

	public List<WebElement> getselectListOfState() {//
		return selectListOfState;
	}
	
	// xpath for list of web elements 
		@FindBy(xpath = "(// *[@class='select'])[2]/option")
		@CacheLookup

		private List<WebElement> selectListOfCountry;

		public List<WebElement> getselectListOfCountry() {//
			return selectListOfCountry;
		}


	public void addNewShippingDetails() {
		WaitHelper.seleniumWait(getAddNewAddress());
		CommonMethods.jsClick(getAddNewAddress());

		WaitHelper.seleniumWait(getEnterFirstName());
		getEnterFirstName().clear();
		getEnterFirstName().sendKeys("Tanu");

		WaitHelper.seleniumWait(getEnterLastName());
		getEnterLastName().clear();
		getEnterLastName().sendKeys("Mohammad");

		WaitHelper.seleniumWait(getEnterCompanyName());
		getEnterCompanyName().clear();
		getEnterCompanyName().sendKeys("Amazon");

		WaitHelper.seleniumWait(getEnterCustomerAddress());
		getEnterCustomerAddress().clear();
		getEnterCustomerAddress().sendKeys("123 Main Street");

		WaitHelper.seleniumWait(getEnterCity());
		getEnterCity().clear();
		getEnterCity().sendKeys("Queens");

		// selectState
		//WaitHelper.waitUntilVisibelityOfElements(getselectListOfState());
		CommonMethods.dropdownMenu(getSelectState(), "New York");
		//CommonMethods.handledropdown(getselectListOfState(), "New York");
		
		WaitHelper.seleniumWait(getEnterZipCode());
		getEnterZipCode().clear();
		getEnterZipCode().sendKeys("11433");
		
		// Select country
		//WaitHelper.waitUntilVisibelityOfElements(getselectListOfCountry());
		CommonMethods.actionClick(getSelectCountry());
		//CommonMethods.handledropdown(getselectListOfCountry(), "United States");

		WaitHelper.seleniumWait(getEnterPhoneNumber());
		getEnterPhoneNumber().clear();
		getEnterPhoneNumber().sendKeys("645-202-5679");

		WaitHelper.seleniumWait(getClickOnShiphere());
		CommonMethods.actionClick(getClickOnShiphere());

	}

//------------------------------------
	public void applicationLogin() {
		
		WaitHelper.seleniumWait(getSignInBtn());
		CommonMethods.actionClick(getSignInBtn());
		
		WaitHelper.seleniumWait(getEnterUserName());
		getEnterUserName().sendKeys(prop.getProperty("userName"));
		
		WaitHelper.seleniumWait(getEnterPassword());
		getEnterPassword().sendKeys(prop.getProperty("passWord"));
		
		
		WaitHelper.seleniumWait(getClickOnSignBtn());
		CommonMethods.actionClick(getClickOnSignBtn());

	}

}
