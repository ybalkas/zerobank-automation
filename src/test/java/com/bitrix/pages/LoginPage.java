package com.bitrix.pages;

import com.bitrix.utilities.ConfigurationReader;
import com.bitrix.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    public LoginPage(){ PageFactory.initElements(Driver.get(), this); }

    @FindBy(css = "input#user_login")
    public WebElement userName;

    @FindBy(css = "input#user_password")
    public WebElement password;

    @FindBy(name = "submit")
    public WebElement signIn;


    public void Login(){
        Driver.get().get(ConfigurationReader.get("url"));
        userName.sendKeys(ConfigurationReader.get("Username"));
        password.sendKeys(ConfigurationReader.get("Password"));
        signIn.click();
    }
}
