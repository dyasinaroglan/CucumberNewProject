package stepdefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.testng.Assert;

import pages.LoginTest1Pages;
import utils.ParentClass;

public class LoginTest1Stepdefs extends ParentClass {

    LoginTest1Pages lo = new LoginTest1Pages();

    @Given("go to site {string}")
    public void goToSite(String url) {
        goToHomePage(url);
    }
    @And("login button click")
    public void loginButtonClick() {
        clickTo(lo.loginButton);
    }
    @When("Input credentials to login with headers table {string}")
    public void ınputCredentialsToLoginWithHeadersTable(String email) {
        sendKeysTo(lo.email,email);

    }
    @And("selanjutnya button click")
    public void selanjutnyaButtonClick() {
        clickTo(lo.selanjutnyaButton);
    }

    @And("Login page is displayed")
    public void loginPageIsDisplayed() {
        Assert.assertTrue(lo.loginPageisDisplayed());
        Assert.assertEquals(lo.getLoginHeaderTitle(),"Silakan masuk ke akun Anda");
        Assert.assertEquals(lo.getRegisterQuestionRext(),"Belum punya akun Bhinneka? Daftar");

    }

}
