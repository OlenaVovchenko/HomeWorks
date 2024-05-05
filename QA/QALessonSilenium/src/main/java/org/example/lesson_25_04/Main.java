package org.example.lesson_25_04;
import org.example.ChromeRegistry;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {
    public static void main(String[] args) {
        ChromeDriver driver = new ChromeRegistry().registerdriver();
//        driver.get("https://qa-faculty.github.io/tariff-plan/");
//
//        driver.findElement(By.id("name")).sendKeys("Team Number2");
//        driver.findElement(By.id("email")).sendKeys("jkhjhgj@gmail.com");
//        driver.findElement(By.id("phone")).sendKeys("+5446787");
////        driver.findElement(By.xpath(".//input[@type='submit']")).click();
//        driver.findElement(By.xpath(".//input[@onclick=\"validatePersonalInfo(event)\"]")).click();
//
////        WebElement editboxName = driver.findElement(By.id("name"));
////        editboxName.sendKeys("newName");
//
//try{
//    List<String> name = new ArrayList<>();
//    name.get(2);
//    System.out.println("my code is ok before catch exeption");
//}catch (IndexOutOfBoundsException ex){
//    System.out.println("My cod is ok after catch exeption");
//}
//    }

//    try{
//        List<String> name = new ArrayList<>();
//        name.get(2); // exeption
//        System.out.println("my code is ok before catch exeption");
//    }catch (RuntimeException ex){
//        System.out.println("My cod is ok");
//    }
//}
        //dlya Weit
//try{
//        driver.findElemnt(By.xpath("xpath")); // ne naxodit i padart po excetion
//    } catch (Exception ex){
//        Thread.sleep(1000);
//    }
//    driver.findElemnet(By.xpath("xpath"));  // page loaded i on nashel element
//code
        driver.get("https://ivannetreba.github.io/furniture-store/index.html");
        driver.findElement(By.xpath("//*[@href='about.html']")).click();
        driver.findElement(By.xpath(".//button[@data-id=\"history\"]")).click();
        driver.findElement(By.xpath(".//div[@id=\"history\"]")).isDisplayed();

        driver.findElement(By.xpath(".//button[@data-id=\"vision\"]")).click();
        driver.findElement(By.xpath(".//div[@id=\"vision\"]")).isDisplayed();

        driver.findElement(By.xpath(" .//button[@data-id=\"goals\"]")).click();
        driver.findElement(By.xpath(".//div[@id=\"goals\"]")).isDisplayed();
        driver.quit();
    }
}