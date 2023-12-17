package hellocucumber;

import io.cucumber.java.en.*;

import org.junit.jupiter.api.Assertions.*;

public class StepDefinitions {

    private String today;
    private String actualAnswer;

    @Given("an example scenario")
    public void anExampleScenario() {
    }

    @When("all step definitions are implemented")
    public void allStepDefinitionsAreImplemented() {
    }

    @Then("the scenario passes")
    public void theScenarioPasses() {
    }

    @Given("today is Friday")
    public void today_is_friday() {
        today = "friday";
    }

    @Given("today is Sunday")
    public void today_is_sunday() {
        today = "sunday";
    }

    @Given("today is Tuesday")
    public void today_is_tuesday() {
        today = "Tuesday";
    }

    @Given("I ask whether it's Friday yet")
    public void i_ask_whether_it_s_friday_yet() {
        actualAnswer = IsItFriday.isItFriday(today);
    }

    @Given("I should be told {string}")
    public void i_should_be_told(String exceptedAnswer){
        assert exceptedAnswer.equals(actualAnswer);
    }

}

class IsItFriday {
    static String isItFriday(String today) {
        return today.toLowerCase().equals("friday") ? "TGIF" : "Nope"; 
    }
}