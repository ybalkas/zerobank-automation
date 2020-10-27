package com.bitrix.pages;

import com.bitrix.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public abstract class BasePage {

    @FindBy(xpath = "//a[contains(text(),'Account Activity')]")
    public WebElement accountActivity;

    @FindBy(xpath = "(//a[contains(text(),'Savings')])[1]")
    public WebElement savings;

    public BasePage() {
        PageFactory.initElements(Driver.get(), this);
    }


}
