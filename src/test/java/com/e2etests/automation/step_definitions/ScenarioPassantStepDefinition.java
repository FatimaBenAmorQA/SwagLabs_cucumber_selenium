package com.e2etests.automation.step_definitions;


import com.e2etests.automation.page_object.ScenarioPassantPage;
import com.e2etests.automation.utils.ConfigFileReader;
import com.e2etests.automation.utils.SeleniumUtils;
import com.e2etests.automation.utils.Setup;
import com.e2etests.automation.utils.Validations;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ScenarioPassantStepDefinition {
	
	private ScenarioPassantPage scenarioPassantPage;
	private SeleniumUtils seleniumUtils;
	private Validations validations;
	private ConfigFileReader configFileReader;
	
	public ScenarioPassantStepDefinition() {
		this.scenarioPassantPage = new ScenarioPassantPage();
		this.seleniumUtils = new SeleniumUtils();
		this.configFileReader = new ConfigFileReader();
		this.validations = new Validations();
	}
	


	@Given("Je me rends sur le site SwagLabs")
	public void jeMeRendsSurLeSiteSwagLabs() {
		seleniumUtils.get(configFileReader.getProperties("sawgLabs.url"));

	}
	@When("Je saisie le username")
	public void jeSaisieLeUsername() {
		seleniumUtils.writeText(scenarioPassantPage.usernameField, configFileReader.getProperties("sawgLabs.username"));

	}
	@When("Je saisie le password")
	public void jeSaisieLePassword() {
		seleniumUtils.writeText(scenarioPassantPage.passwordField, configFileReader.getProperties("sawgLabs.password"));

	}
	@When("Je clique sur le bouton Login")
	public void jeCliqueSurLeBoutonLogin() {
		seleniumUtils.click(scenarioPassantPage.loginButton);
	}
	
	@Then("La page des produit s affichent")
	public void laPageDesProduitSAffichent() throws InterruptedException {
		Long mediumWait =  seleniumUtils.getWait("MediumWait");
		Thread.sleep(mediumWait);
		validations.assertTrueBoolean(scenarioPassantPage.messgaeSawgLabs);

	}
	@When("Je clique sur le bouton Add to cart du produit BackPack")
	public void jeCliqueSurLeBoutonAddToCartDuProduitBackPack() {
		seleniumUtils.click(scenarioPassantPage.AddToCartButtonbackpack);

	}
	@When("Je clique sur le bouton Add to cart du produit T-Shirt")
	public void jeCliqueSurLeBoutonAddToCartDuProduitTShirt() {
		seleniumUtils.click(scenarioPassantPage.AddToCartButtonTshirt);
	}
	@Then("Les produit s ajoutent dans le panier")
	public void lesProduitSAjoutentDansLePanier() {
		validations.assertEquals(scenarioPassantPage.panier.getText(), configFileReader.getProperties("sawgLabs.number"));

	}

	@When("Je clique sur l icone panier")
	public void jeCliqueSurLIconePanier() {
		seleniumUtils.click(scenarioPassantPage.panier);

	}
	@When("Je clique sur le bouton remove")
	public void jeCliqueSurLeBoutonRemove() throws InterruptedException {
		Long mediumWait =  seleniumUtils.getWait("MediumWait");
		Thread.sleep(mediumWait);
		seleniumUtils.click(scenarioPassantPage.removeButtonbackpack);
	}
	@Then("Le produit sera supprimé du panier")
	public void leProduitSeraSuppriméDuPanier() {
		validations.assertEquals(scenarioPassantPage.panier.getText(), configFileReader.getProperties("sawgLabs.numberRemoved"));
	}


	@When("Je clique sur le bouton checkout")
	public void jeCliqueSurLeBoutonCheckout() {
		seleniumUtils.click(scenarioPassantPage.checkoutButton);

	}

	@When("Je rempli le username")
	public void jeRempliLeUsername() {
		seleniumUtils.writeText(scenarioPassantPage.firstNameField, configFileReader.getProperties("sawgLabs.firstname"));


	}
	@When("Je saisie le lastname")
	public void jeSaisieLeLastname() {
		seleniumUtils.writeText(scenarioPassantPage.lastNameField, configFileReader.getProperties("sawgLabs.lastname"));

	}


	@When("Je saisie le code postal")
	public void jeSaisieLeCodePostal() {
		seleniumUtils.writeText(scenarioPassantPage.codeField, configFileReader.getProperties("sawgLabs.code"));

	}
	@When("je clique sur le bouton continue")
	public void jeCliqueSurLeBoutonContinue() {
		seleniumUtils.click(scenarioPassantPage.continueButton);

	}
	@Then("une page overview s affiche")
	public void unePageOverviewSAffiche() {
		String currentUrl = seleniumUtils.getCurrentUrl();
		validations.assertEquals(currentUrl, configFileReader.getProperties("sawgLabs.overview"));
		

	}
	@When("je clique sur le bouton finish")
	public void jeCliqueSurLeBoutonFinish() {
		seleniumUtils.click(scenarioPassantPage.finishButton);

	}
	@Then("une page Checkout:Complete s affiche")
	public void unePageCheckoutCompleteSAffiche() {
		validations.assertEquals(scenarioPassantPage.completeHeadermessage, configFileReader.getProperties("sawgLabs.completeheaderMessage"));
	}

	@When("Je clique sur le menu burger")
	public void jeCliqueSurLeMenuBurger() {
		seleniumUtils.click(scenarioPassantPage.burgerButton);

	}
	@When("Je clique surle bouton Logout")
	public void jeCliqueSurleBoutonLogout() throws InterruptedException {
		seleniumUtils.scrollPageToLeft(Setup.driver);
		Long mediumWait =  seleniumUtils.getWait("MediumWait");
		Thread.sleep(mediumWait);
		seleniumUtils.click(scenarioPassantPage.logoutButton);

	}
	@Then("Je me redirige vers la page d authentification {string}")
	public void jeMeRedirigeVersLaPageDAuthentification(String string) {
		String currentUrl = seleniumUtils.getCurrentUrl();
		validations.assertEquals(currentUrl, configFileReader.getProperties("sawgLabs.url"));
	}






}
