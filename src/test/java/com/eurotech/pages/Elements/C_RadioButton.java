package com.eurotech.pages.Elements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class C_RadioButton extends BasePage{

    @FindBy(xpath ="//label[@for='yesRadio']")
    public WebElement radioYes;

    @FindBy(className = "text-success")
    public WebElement buttonControl;

    @FindBy(xpath ="//label[@for='noRadio']")
    public WebElement radioNo;

    @FindBy(xpath ="//label[@for='impressiveRadio']")
    public WebElement radioImpressive;




}
