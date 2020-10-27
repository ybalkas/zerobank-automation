package com.bitrix.pages;

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

    public void Login(String usernameStr, String passwordStr){
        userName.sendKeys(usernameStr);
        password.sendKeys(passwordStr);
        signIn.click();

    }
}
