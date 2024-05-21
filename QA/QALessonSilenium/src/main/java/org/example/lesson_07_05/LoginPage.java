package org.example.lesson_07_05;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.concurrent.TimeUnit;

public class LoginPage extends BasePage{

    @FindBy(id = "email")
    private WebElement emailEditBox;

    @FindBy(id = "password")
    private WebElement passwordEditBox;

    @FindBy(xpath = "//button[@type='submit']")
    private WebElement loginButton;


    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public LoginPage inputEmail(String email){
        emailEditBox.sendKeys(email);
        return this;
    }

    public LoginPage inputPassword(String password){
        passwordEditBox.sendKeys(password);
        return this;
    }

    public LoginPage clickLogin(){
//        try {
//            sleep(5000);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }

        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

//        new WebDriverWait(driver, Duration.ofSeconds(5))
//                .until(ExpectedConditions.elementToBeClickable(loginButton));
        loginButton.click();
        return this;
    }
}
