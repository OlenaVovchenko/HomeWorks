package org.example.lesson_07_05;

import org.example.ChromeRegistry;
import org.openqa.selenium.chrome.ChromeDriver;

//public class Main {
//    public static void main(String[] args) {
//        ChromeDriver driver = new ChromeRegistry().registerdriver();
//        driver.get("URL");
//        MainPage mainPage = new MainPage(driver);
//        mainPage.clickLoginButton();
//
//    }
//}
public class Demo {
    public static void main(String[] args) {
        ChromeDriver driver = new ChromeRegistry().registerdriver();
        MainPage mainPage = new MainPage(driver);
        mainPage.open()
                .clickLoginButton()
                .inputEmail("test@gmail.com")
                .inputPassword("12345678")
                .clickLogin();
    }
}