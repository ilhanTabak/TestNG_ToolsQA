package com.eurotech.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class E_Buttons extends BasePage{

    @FindBy(id = "doubleClickBtn")
    public WebElement DoubleClick;

    @FindBy(id = "doubleClickMessage")
    public WebElement doubleClickMessage;

    @FindBy(id="rightClickBtn")
    public WebElement rightClickBtn;

    @FindBy(id = "rightClickMessage")
    public WebElement rightClickMessage;

    @FindBy(xpath = "//button[.='Click Me']")
    public WebElement ClickMeButton;

    @FindBy(id = "dynamicClickMessage")
    public WebElement dynamicClickMessage;
}
