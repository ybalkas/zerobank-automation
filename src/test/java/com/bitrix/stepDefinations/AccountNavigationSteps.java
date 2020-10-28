package com.bitrix.stepDefinations;

import com.bitrix.pages.DashboardPage;
import com.bitrix.pages.LoginPage;
import com.bitrix.utilities.BrowserUtils;
import com.bitrix.utilities.ConfigurationReader;
import com.bitrix.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class AccountNavigationSteps {

    @Given("the user is logged in")
    public void the_user_is_logged_in() {
        new LoginPage().Login();
    }

    @When("the user clicks on Savings link on the Account Summary page")
    public void the_user_clicks_on_Savings_link_on_the_Account_Summary_page() {
        new DashboardPage().savings.click();
    }

    @Then("the Account Activity page should be displayed")
    public void the_Account_Activity_page_should_be_displayed() {
        String expectedPage = "Account Activity";
        Assert.assertTrue(expectedPage,Driver.get().getTitle().contains(expectedPage));
    }

    @Then("Account drop down should have Savings selected")
    public void account_drop_down_should_have_Savings_selected() { DashboardPage dashboardPage = new DashboardPage();
        String expectedDropDown = "Savings";
        String actualDropdown = new DashboardPage().SelectMethod().getFirstSelectedOption().getText();
        Assert.assertEquals(expectedDropDown,actualDropdown);
    }

    @When("the user clicks on Brokerage link on the Account Summary page")
    public void the_user_clicks_on_Brokerage_link_on_the_Account_Summary_page() {
        new DashboardPage().brokerage.click();
    }

    @Then("Account drop down should have Brokerage selected")
    public void account_drop_down_should_have_Brokerage_selected() {
        String expectedDrop = "Brokerage";
        String actualDrop = new DashboardPage().SelectMethod().getFirstSelectedOption().getText();
        Assert.assertEquals(expectedDrop,actualDrop);
    }

    @When("the user clicks on Checking link on the Account Summary page")
    public void the_user_clicks_on_Checking_link_on_the_Account_Summary_page() {
        new DashboardPage().checking.click();
    }

    @Then("Account drop down should have Checking selected")
    public void account_drop_down_should_have_Checking_selected() {
        String expectedDrop = "Checking";
        String actualDrop = new DashboardPage().SelectMethod().getFirstSelectedOption().getText();
        Assert.assertEquals(expectedDrop,actualDrop);
    }

    @When("the user clicks on Loan link on the Account Summary page")
    public void the_user_clicks_on_Loan_link_on_the_Account_Summary_page() {
        new DashboardPage().loan.click();
    }

    @Then("Account drop down should have Loan selected")
    public void account_drop_down_should_have_Loan_selected() {
        String expectedDrop = "Loan";
        String actualDrop = new DashboardPage().SelectMethod().getFirstSelectedOption().getText();
        System.out.println(actualDrop);
        Assert.assertEquals(expectedDrop,actualDrop);
    }

}
