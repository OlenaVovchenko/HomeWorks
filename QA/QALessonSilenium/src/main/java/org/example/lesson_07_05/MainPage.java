package org.example.lesson_07_05;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MainPage extends BasePage{

    @FindBy(xpath = "//li[@class=\"nav-user\"]")
    private WebElement loginButton;


    public MainPage(WebDriver driver) {
        super(driver);
    }

    public LoginPage clickLoginButton(){
        loginButton.click();
        return new LoginPage(driver);
    }

    public MainPage open(){
        driver.get("https://refactoring.guru/");
        return this;
    }
}

//public class MainPage extends BasePage{
////    @FindBy(xpath = "//a[@class=\"btn d-block d-sm-inline-block btn-lg btn-primary\"]")
////    private WebElement refactorButton;
//
//@FindBy(xpath = ".//div/a[@href=\"https://refactoring.guru/login\"]")
//private WebElement logInButton;
//
//    public MainPage(WebDriver driver) {
//        super(driver);
//
//    }
//    public void clickRefactorButton(){
//        refactorButton.click();
//    }
//public void clickLoginButton(){
//        logInButton.click();
//}
//    public MainPage clickRefactorButton(){
//        refactorButton.click();
//        return this;
//    }
//public LoginPage clickLoginButton() {
//    logInButton.click();
//    return  new LoginPage(driver);
//}
//    public  MainPage open(){
//driver.get("https://refactoring.guru/");
//return this;
//    }
//}


