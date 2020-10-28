package com.bitrix.pages;

import com.bitrix.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public abstract class BasePage {

    @FindBy(xpath = "//a[contains(text(),'Account Activity')]")
    public WebElement accountActivity;

    @FindBy(xpath = "(//a[contains(text(),'Savings')])[1]")
    public WebElement savings;

    @FindBy(css = "#aa_accountId")
    public WebElement accountDrops;

    @FindBy(xpath = "//a[contains(text(),'Brokerage')]")
    public WebElement brokerage;

    @FindBy(xpath = "//a[contains(text(),'Checking')]")
    public WebElement checking;

    @FindBy(xpath = "//a[contains(text(),'Loan')]")
    public WebElement loan;

    public BasePage() {
        PageFactory.initElements(Driver.get(), this);
    }

    public Select SelectMethod(){
        WebElement dropDown = new DashboardPage().accountDrops;
        Select select = new Select(dropDown);
        return select;
    }

    public void navigateTo(String str){
        String textLocator = "//a[contains(text(),'"+str+"')]";
        WebElement textElement = Driver.get().findElement(By.xpath(textLocator));
        new Actions(Driver.get()).moveToElement(textElement).doubleClick().build().perform();
    }


}
