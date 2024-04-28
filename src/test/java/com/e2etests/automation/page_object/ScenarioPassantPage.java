package com.e2etests.automation.page_object;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.e2etests.automation.utils.Setup;

public class ScenarioPassantPage {
	
	
	/* @FindBy */
	
	@FindBy(how = How.ID, using = "user-name")
	public static WebElement usernameField;
	
	@FindBy(how = How.ID, using = "password")
	public static WebElement passwordField;
	
	@FindBy(how = How.ID, using = "login-button")
	public static WebElement loginButton;
	
	@FindBy(how = How.CLASS_NAME, using = "app_logo")
	public static WebElement messgaeSawgLabs;
	
	@FindBy(how = How.ID, using = "add-to-cart-sauce-labs-backpack")
	public static WebElement AddToCartButtonbackpack;
	
	@FindBy(how = How.ID, using = "add-to-cart-sauce-labs-bolt-t-shirt")
	public static WebElement AddToCartButtonTshirt;
	
	@FindBy(how = How.XPATH, using = "//div[@id='shopping_cart_container']")
	public static WebElement panier;
	
	@FindBy(how = How.ID, using = "remove-sauce-labs-backpack")
	public static WebElement removeButtonbackpack;
	
	@FindBy(how = How.ID, using = "checkout")
	public static WebElement checkoutButton;
	
	@FindBy(how = How.ID, using = "first-name")
	public static WebElement firstNameField;
	
	
	@FindBy(how = How.ID, using = "last-name")
	public static WebElement lastNameField;
	
	
	@FindBy(how = How.ID, using = "postal-code")
	public static WebElement codeField;

	@FindBy(how = How.ID, using = "continue")
	public static WebElement continueButton;
	
	@FindBy(how = How.ID, using = "finish")
	public static WebElement finishButton;
	
	@FindBy(how = How.CLASS_NAME, using = "complete-header")
	public static WebElement completeHeadermessage;
	
	@FindBy(how = How.ID, using = "react-burger-menu-btn")
	public static WebElement burgerButton;
	
	@FindBy(how = How.ID, using = "logout_sidebar_link")
	public static WebElement logoutButton;
	
	
	public ScenarioPassantPage() {
		PageFactory.initElements(Setup.driver, this);
	}

}
