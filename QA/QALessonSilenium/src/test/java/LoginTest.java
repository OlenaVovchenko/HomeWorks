import com.google.common.annotations.VisibleForTesting;
import org.example.ChromeRegistry;
import org.example.lesson_07_05.MainPage;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {
    @Test
    public void testLoginWithInvalidCredentionals(){
        ChromeDriver driver = new ChromeRegistry().registerdriver();
        MainPage mainPage = new MainPage(driver);
        mainPage.open()
                .clickLoginButton()
                .inputEmail("test@gmail.com")
                .inputPassword("12345678")
                .clickLogin();
    }
}
