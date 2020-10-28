package com.bitrix.stepDefinations;

import com.bitrix.pages.DashboardPage;
import com.bitrix.pages.LoginPage;
import com.bitrix.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class AccountNaviSceOutline {

    @Given("the user is logged in")
    public void the_user_is_logged_in() {
        new LoginPage().Login();
    }

    @When("the user clicks on {string} link on the Account Summary page")
    public void the_user_clicks_on_link_on_the_Account_Summary_page(String str) {
        new DashboardPage().navigateTo(str);
    }

    @Then("the Account Activity page should be displayed")
    public void the_Account_Activity_page_should_be_displayed() {
        String expectedPage = "Account Activity";
        Assert.assertTrue(expectedPage, Driver.get().getTitle().contains(expectedPage));
    }

    @Then("Account drop down should have {string} selected")
    public void account_drop_down_should_have_selected(String dropDown) {
        String expectedDrop = dropDown;
        String actualDrop = new DashboardPage().SelectMethod().getFirstSelectedOption().getText();
        Assert.assertEquals(expectedDrop,actualDrop);
    }
}
