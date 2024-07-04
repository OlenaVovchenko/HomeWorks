import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static com.codeborne.selenide.Selenide.$x;
import static com.codeborne.selenide.Selenide.open;

public class PageTest {
    @Given("open website")
    public void open_website() {
        open("https://ivannetreba.github.io/furniture-store/about.html");
        throw new io.cucumber.java.PendingException();
    }
    @When("click button History")
    public void click_button_history() {
        $x(".//button[@data-id=\"\"history\"\"]").click();
        throw new io.cucumber.java.PendingException();
    }
    @Then("history description is displayed")
    public void history_description_is_displayed() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("click button Vision")
    public void click_button_vision() {
        $x(".//button[@data-id=\"\"vision\"\"]").click();
        throw new io.cucumber.java.PendingException();
    }
    @When("click button Goals")
    public void click_button_goals() {
        $x(".//button[@data-id=\"\"goals\"\"]").click();
        throw new io.cucumber.java.PendingException();
    }
    @Then("the website is opened")
    public void the_website_is_opened() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("text with description is displayed")
    public void text_with_description_is_displayed() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

}
