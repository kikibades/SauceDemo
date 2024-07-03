package com.juaracoding.pages;

import com.juaracoding.Drivers.DriverSingleton;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Logout {

    private WebDriver driver;

    public Logout(){
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//button[@id='react-burger-menu-btn']")
    private WebElement MenuBtn;

    @FindBy(xpath = "//a[@id='logout_sidebar_link']")
    private WebElement LogoutBtn;

    public void LogoutNow(){
        MenuBtn.click();
        DriverSingleton.delay(2);
        LogoutBtn.click();
    }



}
