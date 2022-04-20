package pages;

import org.openqa.selenium.By;

public interface Locators {

    String url = "http://automationpractice.com/index.php";

    By signIn = By.cssSelector("a[class='login']");
    By createAnAccount = By.xpath("(//h3[@class='page-subheading'])[1]");

    By lemail = By.xpath("(//input[@class='is_required validate account_input form-control'])[2]");
    By lpassword = By.xpath("(//input[@class='is_required validate account_input form-control'])[3]");
    By signInButton = By.id("SubmitLogin");
    By lMyAccountPage = By.cssSelector("h1[class='page-heading']");
}
