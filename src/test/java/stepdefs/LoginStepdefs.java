package stepdefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import utils.ParentClass;
import static pages.Locators.*;

public class LoginStepdefs extends ParentClass {

    @Given("user is on homepage")
    public void userIsOnHomepage() {
        goToHomePage(url);
    }

    @When("User click SignIn link")
    public void userClickSignInLink() {
       wait.until(ExpectedConditions.visibilityOfElementLocated(signIn)).click();
    }

    @Then("User should be able to navigate to Authentication page")
    public void userShouldBeAbleToNavigateToAuthenticationPage() throws InterruptedException {
        wait.until(ExpectedConditions.visibilityOfElementLocated(createAnAccount)).isDisplayed();
        /*
        Thread.sleep(2000);
        WebElement element = driver.findElement(By.cssSelector("create-account_form"));
        scrollIntoView(element);
        Thread.sleep(1000);
        Assert.assertTrue(element.isDisplayed());

         */
        //isDisplayed() elemen locatorlarda kullanılıyor. By da kullanılmıyor.
    }

    @And("User should see SignIn Panel")
    public void userShouldSeeSignInPanel() {
        WebElement element = driver.findElement(By.cssSelector("#login_form"));
        Assert.assertTrue(element.isDisplayed());
    }

    @Given("User enter Email address as {string} , password as {string}")
    public void userEnterEmailAddressAsPasswordAs(String email, String password) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(lemail)).sendKeys(email);
        wait.until(ExpectedConditions.visibilityOfElementLocated(lpassword)).sendKeys(password);

    }

    @And("click SIgnIn button")
    public void clickSIgnInButton() {
        clickTo(signInButton);
    }

    @Then("User should loggedIn sucessfully")
    public void userShouldLoggedInSucessfully() {
        Assert.assertEquals(driver.getTitle(),"My account - My Store");
    }

    @And("User should be on My Account page")
    public void userShouldBeOnMyAccountPage() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(lMyAccountPage)).isDisplayed();
    }

    @When("User enter Email address {string}, password {string}")
    public void userEnterEmailAddressPassword(String email, String password) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(lemail)).sendKeys(email);
        wait.until(ExpectedConditions.visibilityOfElementLocated(lpassword)).sendKeys(password);
    }

    @Then("User should see validation message as {string}")
    public void userShouldSeeValidationMessageAs(String errorMessage) {
        WebElement element = driver.findElement(By.cssSelector("div[class='alert alert-danger'] ol li"));
        Assert.assertEquals(element.getText(),errorMessage);
    }
}
