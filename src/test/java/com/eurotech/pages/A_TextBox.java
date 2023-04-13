package com.eurotech.pages;

import com.eurotech.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class A_TextBox extends BasePage{

    @FindBy(id="dashboard-h1")
    public WebElement dashboardText;

    @FindBy(xpath = "//p[contains(text(),'Welcome')]")
    public WebElement welcomeMessage;



    @FindBy(xpath = "//div[@class=\"element-list collapse show\"]/ul/li")
    public List<WebElement> subElements;

    @FindBy(xpath = "//h5[.='Forms']")
    public WebElement forms;

    @FindBy(xpath = "//span[.='Practice Form']/../..")
    public List<WebElement> subForms;

    @FindBy(xpath = "//h5[.='Alerts, Frame & Windows']")
    public WebElement alerts;

    @FindBy(xpath = "//div[@class=\"element-list collapse show\"]/ul/li")
    public List<WebElement> subAlerts;
    //----------------------------------------------------------
    @FindBy(xpath = "//div[@class='card mt-4 top-card']")
    public List<WebElement> mainList;

    public void writeMethod(){

        for (WebElement dnm:subElements){

            System.out.println(dnm.getText());

        }

    }
    //------------------------------------------------------------------------------------






    @FindBy(id = "userName")
    public WebElement userName;

    @FindBy(id = "userEmail")
    public WebElement userEmail;

    @FindBy(id = "currentAddress")
    public WebElement currentAdress;

    @FindBy(id = "permanentAddress")
    public WebElement permanentAdress;

    @FindBy(xpath = "//div[text()='Text Box']")
    public WebElement textBoxText;

    @FindBy(xpath= "//button[.='Submit']")
    public WebElement submitButton;

    @FindBy(xpath = "//p[@id='name']")
    public WebElement userNameControl;

    @FindBy(xpath = "//p[@id='email']")
    public WebElement eMailControl;

}