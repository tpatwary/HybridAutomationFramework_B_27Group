package luma.usa.Stepdefination;

import org.testng.Assert;

import io.cucumber.java.en.*;

import luma.usa.BasePage.SuperClass;
import luma.usa.elementsPage.PageFactoryElements;
import luma.usa.genaricfunctions.CommonMethods;
import luma.usa.genaricfunctions.WaitHelper;

public class FunctionalStepDef extends SuperClass {

	PageFactoryElements pf;

	@Given("user able to login the application")
	public void user_able_to_login_the_application() throws InterruptedException {

		pf = new PageFactoryElements();
		pf.applicationLogin();

	}

	@When("user able to select Jackets from Men module")
	public void user_able_to_select_jackets_from_men_module() {

		log.info(">>>>> User able to select Men module <<<<< ");
		WaitHelper.seleniumWait(pf.getSelectMenModule());
		CommonMethods.HoverOver(pf.getSelectMenModule());

		log.info(">>>>> User able to select Tops module <<<<< ");
		WaitHelper.seleniumWait(pf.getSelectTopsFromMenModule());
		CommonMethods.HoverOver(pf.getSelectTopsFromMenModule());

		log.info(">>>>> user able to select Jackets from Men module <<<<< ");
		WaitHelper.seleniumWait(pf.getSelectJacketFromMenModule());
		CommonMethods.actionClick(pf.getSelectJacketFromMenModule());

	}

	@When("user able to select a Jacket product's size, color, quantity")
	public void user_able_to_select_a_jacket_product_s_size_color_quantity() throws InterruptedException {

		log.info(">>>>> user able to select a Jacket<<<<< ");
		CommonMethods.actionClick(pf.getSelectJupiterAll_WeatherTrainer());

		log.info(">>>>> user able to select a Jacket size <<<<< ");
		WaitHelper.seleniumWait(pf.getSelectSize());
		CommonMethods.actionClick(pf.getSelectSize());

		log.info(">>>>> user able to select a Jacket Color <<<<< ");
		WaitHelper.seleniumWait(pf.getSelectColor());
		CommonMethods.actionClick(pf.getSelectColor());

		log.info(">>>>> user able to select a Jacket Quantity <<<<< ");
		WaitHelper.seleniumWait(pf.getSelectQuantity());
		pf.getSelectQuantity().clear();// clear the existing value
		pf.getSelectQuantity().sendKeys("1");

	}

	@When("user able to click add to cart button")
	public void user_able_to_click_add_to_cart_button() {

		log.info(">>>>> user able to click add to cart button <<<<< ");
		WaitHelper.seleniumWait(pf.getClickOnAddtoCart());
		CommonMethods.actionClick(pf.getClickOnAddtoCart());
	}

	@When("user able to click on the shopping cart pop-up")
	public void user_able_to_click_on_the_shopping_cart_pop_up() {

		log.info(">>>>> user able to click on the shopping cart pop-up<<<<< ");
		WaitHelper.seleniumWait(pf.getClickShoppingCart());
		CommonMethods.actionClick(pf.getClickShoppingCart());

	}

	@When("user able to click on the proceed to checkout")
	public void user_able_to_click_on_the_proceed_to_checkout() {

		log.info(">>>>> user able to click on the proceed to checkout<<<<< ");
		WaitHelper.seleniumWait(pf.getProceed_to_Checkout());
		CommonMethods.actionClick(pf.getProceed_to_Checkout());
	}

	@When("user able to add shipping information")
	public void user_able_to_add_shipping_information() {

		log.info(">>>>> user able to add shipping information <<<<< ");

		pf.addNewShippingDetails();

	}

	@When("user able to select shipping method radial button and click on next button")
	public void user_able_to_select_shipping_method_radial_button_and_click_on_next_button() {

		// CommonMethods.jsClick(pf.getSelectShippingMethod());

		log.info(">>>>> user able to select shipping method radial button and click on next button <<<<< ");

		CommonMethods.getPageRefresh();
		WaitHelper.seleniumWait(pf.getSelectShippingMethod());
		CommonMethods.actionClick(pf.getShippingMethod());

		WaitHelper.seleniumWait(pf.getClickNext());
		// CommonMethods.jsClick(pf.getClickNext());
		CommonMethods.actionClick(pf.getClickNext());

	}

	@When("user able to click on the place order button")
	public void user_able_to_click_on_the_place_order_button() {

		log.info(">>>>> user able to click on the place order button <<<<< ");
		WaitHelper.seleniumWait(pf.getplaceOrder());
		CommonMethods.jsClick(pf.getplaceOrder());
	}

	@Then("user able to verify the confirmation message {string}")
	public void user_able_to_verify_the_confirmation_message(String ExpectedResult) {

		log.info(">>>>> user able to verify the confirmation message <<<<< ");
		// In order to verify test cases we use Assert

		Assert.assertEquals(ExpectedResult, pf.getVerifyOrderConf().getText());

		System.out.println("Orders Confirmation::" + pf.getVerifyOrderConf().getText());

	}

}
