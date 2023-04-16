package com.eurotech.pages;

import com.eurotech.pages.Elements.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TaskPage extends BasePage {


    public void signIn(){
        userName.sendKeys("batch7@gmail.com");
        password.sendKeys("batchYedi");
        SignIn.click();






    }




    @FindBy(id = "username")
    public WebElement userName;

    @FindBy(id = "password")
    public WebElement password;

    @FindBy(id = "log-in")
    public WebElement SignIn;

    @FindBy(id = "time")
    public WebElement text;

    @FindBy(id = "inputValEnter")
    public WebElement searchBox;

    @FindBy (xpath = "//span[@class='nnn']")
    public WebElement upperText;

    @FindBy(xpath = "(//img[@title='Snapdeal'])[1]")
    public WebElement logo;



}
