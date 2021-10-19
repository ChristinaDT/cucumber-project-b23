package com.cydeo.pages;


import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WCommonAreaPage {

    @FindBy(id="ctl00_logout")
    public WebElement logoutLink;

    @FindBy(linkText ="View all orders")
    public WebElement viewAllOrderTab;

    @FindBy(linkText = "View all products")
    public WebElement viewAllProductTab;

    @FindBy(linkText = "Order")
    public WebElement orderTab ;

    public WCommonAreaPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }





}
