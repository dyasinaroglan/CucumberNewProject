package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.Browsers;
import utils.Driver;
import utils.ParentClass;

public class LoginTest1Pages extends ParentClass {

    public LoginTest1Pages(){
        PageFactory.initElements(driver, this);
    }

    @FindBy(className = "bt-split-screen__header")
    public WebElement loginHeaderTitle;

    @FindBy(id = "email")
    public WebElement email;

    @FindBy(id = "next")
    public WebElement selanjutnyaButton;

    @FindBy(xpath = "(//button[@class='ant-btn'])[1]")
    public WebElement facebook;

    @FindBy(xpath = "(//button[@class='ant-btn'])[2]")
    public WebElement google;

    @FindBy(xpath = "(//button[@class='ant-btn'])[3]")
    public WebElement apple;

    @FindBy(css = "div[class='bt-question-register']")
    public WebElement registerQuestionText;

    @FindBy(xpath = "//a[@href='/register']")
    public WebElement registerLink;


    public boolean loginPageisDisplayed(){
        loginHeaderTitle.isDisplayed();
        email.isDisplayed();
        selanjutnyaButton.isDisplayed();
        facebook.isDisplayed();
        google.isDisplayed();
        apple.isDisplayed();
        registerQuestionText.isDisplayed();
        registerLink.isDisplayed();
        return true;
    }

    public String getLoginHeaderTitle(){
        return loginHeaderTitle.getText();
    }
    public String getRegisterQuestionRext(){
        return  registerQuestionText.getText();
    }
    @FindBy(className = "menu-dekstop css-1avegbk")
    public WebElement loginButton;

 /*
    public SearchPages(){
        PageFactory.initElements(driver,this);
    }

  */
    @FindBy(xpath = "(//img[@alt='Bhinneka.com'])[1]")
    public WebElement logo;

    @FindBy(css = "input[id='searchProduct']")
    public WebElement searchButton;

    @FindBy(id = "Icon-/-Large")
    public WebElement iconBox;

    @FindBy(xpath = "//div[@class='css-1n963ky']//a[@aria-label='Merchant']")
    public WebElement homeLogo;

    @FindBy(xpath = "//div[@class='css-mmq9kd']")
    public WebElement peopleLogo;

    @FindBy(css = "div[class='product-title']")
    public WebElement products;



    public boolean searchPageisDisplayed(){
        logo.isDisplayed();
        searchButton.isDisplayed();
        iconBox.isDisplayed();
        homeLogo.isDisplayed();
        peopleLogo.isDisplayed();
        return true;
    }
    public String searchListProducts(){
        return products.getText();
    }
}
