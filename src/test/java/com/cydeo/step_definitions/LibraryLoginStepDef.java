package com.cydeo.step_definitions;

import com.cydeo.pages.LibraryLoginPage;
import com.cydeo.utilities.BrowserUtil;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.Assert.assertEquals;

public class LibraryLoginStepDef {
    LibraryLoginPage loginPage=new LibraryLoginPage();
    @Given("user is at library login page")
    public void user_is_at_library_login_page() {
        loginPage.goTo();
    }


    @When("user use username {string} and passcode {string}")
    public void userUseUsernameAndPasscode(String email, String password) {
 loginPage.login(email,password);
    }

    @Then("user should be at dashboard page")
    public void userShouldBeAtDashboardPage() {
        BrowserUtil.waitFor(1);
        // check the title is now Library after logging in
        assertEquals("Library", Driver.getDriver().getTitle() ) ;

    }
}
