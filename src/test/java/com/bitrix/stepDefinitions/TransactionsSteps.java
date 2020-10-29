package com.bitrix.stepDefinitions;

import com.bitrix.pages.DashboardPage;
import com.bitrix.pages.LoginPage;
import com.bitrix.utilities.BrowserUtils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TransactionsSteps {

    @Given("the user accesses the Find Transactions tab")
    public void the_user_accesses_the_Find_Transactions_tab() {
        new LoginPage().Login();
        DashboardPage dashboardPage = new DashboardPage();
        dashboardPage.navigateTo("Account Activity");
        dashboardPage.navigateTo("Find Transactions");
    }

    @When("the user enters date range from {string} to {string}")
    public void the_user_enters_date_range_from_to(String str,String str2) {
        DashboardPage dashboardPage=new DashboardPage();
        BrowserUtils.waitFor(2);
        dashboardPage.fromDate.sendKeys(str);
        dashboardPage.toDate.sendKeys(str2);
    }


    @When("clicks search")
    public void clicks_search() {
        new DashboardPage().submit.click();
    }

    @Then("results table should only show transactions dates between {string} to {string}")
    public void results_table_should_only_show_transactions_dates_between_to(String str, String str2) {

    }

    @Then("the results should be sorted by most recent date")
    public void the_results_should_be_sorted_by_most_recent_date() {

    }

    @Then("the results table should only not contain transactions dated {string}")
    public void the_results_table_should_only_not_contain_transactions_dated(String str) {

    }

}
