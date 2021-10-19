package com.cydeo.pages;

import com.cydeo.utilities.ConfigReader;
import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WLoginPage {


    @FindBy(id="ctl00_MainContent_username")
    public WebElement userNameField;

    @FindBy(id="ctl00_MainContent_password")
    public WebElement passwordField;

    @FindBy(id="ctl00_MainContent_login_button")
    public WebElement loginBtn;

    @FindBy(xpath = "//span[.='Invalid Login or Password.']")
    public WebElement errorMsg;
    //instruct selenium to start looking for element
    public WLoginPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    public void goTo(){
        Driver.getDriver().get(ConfigReader.read("weborder_url"));
    }
    public void login(String userName, String password){
       this.userNameField.sendKeys(userName);
       this.passwordField.sendKeys(password);
       this.loginBtn.click();

    }

    /**
     * Check error message is present if wrong credentials provided
     * loginErrorMsgPresent  simple return the result of isDisplayed method call
     */

    public boolean loginErrorMsgPresent(){

        return  this.errorMsg.isDisplayed()  ;

    }





}
