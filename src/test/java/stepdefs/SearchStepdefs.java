package stepdefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Keys;
import pages.PageObjects;

public class SearchStepdefs {

    PageObjects pageObjects = new PageObjects();

    @Given("user goes to homepage")
    public void userGoesToHomepage() {
        pageObjects.goToHomePage();
    }

    @When("user search for {string}")
    public void userSearchFor(String text) {
        pageObjects.sendKeysTo(pageObjects.searchFieldInput,text + Keys.ENTER);
    }

    @Then("products name should contain {string}")
    public void productsNameShouldContain(String text) {
        pageObjects.verifyTextinSearchProducts(text);
    }
}
