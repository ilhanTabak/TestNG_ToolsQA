package com.eurotech.pages.Elements;

import com.eurotech.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public abstract class BasePage {

    public BasePage() {

        PageFactory.initElements(Driver.get(), this);
    }

    @FindBy(id = "rcc-confirm-button")
    public WebElement understandBtn;

    @FindBy(className = "nav__menu-item")
    public List<WebElement> menuList;

    @FindBy(xpath = "//a[text()='Developers']")
    public WebElement developers;

    @FindBy(xpath = "//a[text()='All Posts']")
    public WebElement allPosts;

    // @FindBy(xpath = "//span[text()='My Account']")
    // public WebElement myAccount;

    @FindBy(id ="navbar-menu-list2-item3-text" )
    public WebElement myAccount;

    @FindBy(id="navbar-menu-list-item1-myposts")
    public WebElement myPosts;

    @FindBy(id = "post-form-btn")
    public WebElement submit;

    @FindBy(id="navbar-menu-list-item3-text")
    public WebElement logOut;

    public void navigateToMenu(String menuName){

        Driver.get().findElement(By.xpath("//*[text()='"+menuName+"']")).click();
    }
    //--------------------------------------------------------------------------------

    public void subElementsClick(String name){
        Driver.get().findElement(By.xpath("//span[.='"+name+"']")).click();
    }
    public String pageControl(String name){
        return Driver.get().findElement(By.xpath("//div[text()='"+name+"']")).getText();

    }

    @FindBy(xpath = "//h5[.='Elements']")
    public WebElement elementsButton;



}