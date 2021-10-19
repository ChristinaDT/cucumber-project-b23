package com.cydeo.step_definitions;

import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.After;
import org.junit.Before;

import java.util.concurrent.TimeUnit;

public class CalculatorStepDef {
    @Given("calculator app is open")
    public void calculator_app_is_open() {

        System.out.println("@Given calculator_app_is_open");

    }
    @When("I add {int} with {int}")
    public void i_add_with(Integer num1, Integer num2) {

        System.out.println("When I add "+num1+ " with "+ num2);

    }
    @Then("I should get result {int} displayed")
    public void i_should_get_result_displayed(Integer result) {

        System.out.println("@Then Result should be " + result);

    }

    public static class Hooks {
        // We can set up a hook class that contains
        // methods that run before each scenario and after each scenario
        // or even when we learn tags
        // we can run certain code before and after each scenario that tagged with certain tag
        @Before
        public void setupDriver(){
            System.out.println("THIS IS FROM @Before inside hooks class");
            // set up implicit wait or all the browser related set up
            Driver.getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS) ;
        }

        @After
        public void tearDown(){
            System.out.println("THIS IS FROM @After inside hooks class");
            Driver.closeBrowser();

        }
    }
}
