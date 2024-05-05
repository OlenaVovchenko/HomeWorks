package org.example.mytestchrome;

import org.example.ChromeRegistry;
import org.openqa.selenium.chrome.ChromeDriver;

public class Mainachrome {
    public static void main(String[] args) {
        ChromeDriver driver = new ChromeRegistry().registerdriver();
    }
}
