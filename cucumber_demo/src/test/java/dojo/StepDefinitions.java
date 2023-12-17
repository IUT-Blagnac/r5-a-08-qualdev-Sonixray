package dojo;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;

import static org.junit.Assert.assertEquals;

import java.util.List;

public class StepDefinitions {

    private Order order;

    @Given("{string} who wants to buy a drink")
    public void someone_who_wants_to_buy_a_drink(String x) {
         order = new Order();
         order.declareOwner(x);
    }

    @When("an order is declared for {string}")
        public void an_order_is_declared_for_juliette(String x) {
        order.declareTarget(x);
    }

    @Then("there is {int} cocktail in the order")
    public void there_is_no_cocktail_in_the_order(int x) {
        List<String> cocktails = order.getCocktails();
        assertEquals(x, cocktails.size());
    }
}
