package com.eurotech.test;


import com.eurotech.pages.*;
import com.eurotech.utilities.ConfigurationReader;
import com.eurotech.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class HausAufgabe extends TestBase {
    A_TextBox textBox = new A_TextBox();
    B_CheckBox checkBox = new B_CheckBox();
    C_RadioButton radioButton = new C_RadioButton();
    D_WebTables webTables = new D_WebTables();
    E_Buttons buttons=new E_Buttons();

    @Test
    public void Test1_TextBox() {
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        extentLogger = report.createTest("text box test");
        driver.get(ConfigurationReader.get("url"));
        extentLogger.info("make scroll down");
        jse.executeScript("window.scrollBy(0,500)");
        extentLogger.info("click elemnts button");
        textBox.elementsButton.click();
        extentLogger.info("click Text Box button");
        textBox.subElementsClick("Text Box");
        extentLogger.info("verify that here Text Box Page");
        Assert.assertEquals(textBox.pageControl("Text Box"), "Text Box");
        extentLogger.info("enter username");
        textBox.userName.sendKeys(ConfigurationReader.get("fullName"));
        extentLogger.info("enter email adresse");
        textBox.userEmail.sendKeys(ConfigurationReader.get("emailAdresse"));
        extentLogger.info("enter current adresse");
        textBox.currentAdress.sendKeys(ConfigurationReader.get("currentAdresse"));
        extentLogger.info("enter permanent adresse");
        textBox.permanentAdress.sendKeys(ConfigurationReader.get("permanentAdresse"));
        extentLogger.info("make scroll down");
        jse.executeScript("window.scrollBy(0,500)");
        textBox.submitButton.click();
        String name = textBox.userNameControl.getText();
        String email = textBox.eMailControl.getText();
        extentLogger.info("Verify name not contain numbers");
        Assert.assertTrue(!name.matches("[0-9+]"), "digit control");
        extentLogger.info("Verify name must contain @");
        Assert.assertTrue(email.contains("@"));
        driver.navigate().back();
        driver.navigate().back();
    }

    @Test
    public void Test2_CheckBox() {
        extentLogger = report.createTest("Check box test");
        driver.get(ConfigurationReader.get("url"));
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        extentLogger.info("make scroll down");
        jse.executeScript("window.scrollBy(0,500)");
        extentLogger.info("element button click");
        checkBox.elementsButton.click();
        extentLogger.info("check box button click");
        checkBox.subElementsClick("Check Box");
        extentLogger.info("verify that here Check Box Page");
        Assert.assertEquals(checkBox.pageControl("Check Box"), "Check Box");
        extentLogger.info("click all of the checkbox");
        checkBox.checkBoxMethod();
        extentLogger.info("click home checkbox");
        checkBox.homeCheckBox.click();
        extentLogger.info("Verify that checkboxes has been clicked");
        Assert.assertFalse(checkBox.selectedList.isEmpty());
        driver.navigate().back();
        driver.navigate().back();

    }

    @Test
    public void Test3_RadioButton() {
        extentLogger = report.createTest("Radio Button test");
        driver.get(ConfigurationReader.get("url"));
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        extentLogger.info("make scroll down");
        jse.executeScript("window.scrollBy(0,500)");
        extentLogger.info("element button click");
        radioButton.elementsButton.click();
        extentLogger.info("Radio button click");
        radioButton.subElementsClick("Radio Button");
        extentLogger.info("verify that here Radio Button Page");
        Assert.assertEquals(checkBox.pageControl("Radio Button"), "Radio Button");
        extentLogger.info("Yes button click");
        radioButton.radioYes.click();
        extentLogger.info("Verify that YesButton has been clicked");
        Assert.assertEquals(radioButton.buttonControl.getText(), "Yes");
        radioButton.radioImpressive.click();
        extentLogger.info("Verify that IpressiveButton has been clicked");
        Assert.assertEquals(radioButton.buttonControl.getText(), "Impressive");
        extentLogger.info("No button click");
        radioButton.radioNo.click();
        extentLogger.info("Verify that No Button has been not worked");
        Assert.assertNotEquals(radioButton.buttonControl.getText(), "No");
        driver.navigate().back();
        driver.navigate().back();
    }

    @Test
    public void Test4_WebTables() {
        extentLogger = report.createTest("Web Tables test");
        driver.get(ConfigurationReader.get("url"));
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        extentLogger.info("make scroll down");
        jse.executeScript("window.scrollBy(0,500)");
        extentLogger.info("element button click");
        webTables.elementsButton.click();
        extentLogger.info("Web Tables click");
        radioButton.subElementsClick("Web Tables");
        extentLogger.info("verify that here Web Tables Page");
        Assert.assertEquals(checkBox.pageControl("Web Tables"), "Web Tables");
        extentLogger.info("Add button click");
        webTables.addButton.click();
        extentLogger.info("for pozitive scenerio sent texts in the boxes");
        webTables.addMethodPozitive();
        webTables.addButton.click();
        extentLogger.info("for negative scenerio sent texts in the boxes");
        webTables.addMethodNegative();
        extentLogger.info("Verify name and lastname contain numeric character");
        Assert.assertFalse(webTables.isNumeric());
        extentLogger.info("Sent a text in the SearcBox");
        webTables.searchBox.sendKeys("Cierra");
        extentLogger.info("verify that SearchBox working");
        Assert.assertEquals(webTables.Cierra.getText(), "Cierra");
        webTables.searchBox.clear();
        driver.navigate().back();
        driver.navigate().back();


    }

    @Test
    public void Test5_Buttons() throws InterruptedException {

        extentLogger = report.createTest("Web Tables test");
        driver.get(ConfigurationReader.get("url"));
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        extentLogger.info("make scroll down");
        jse.executeScript("window.scrollBy(0,500)");
        extentLogger.info("element button click");
        buttons.elementsButton.click();
        extentLogger.info("Buttons click");
        buttons.subElementsClick("Buttons");
        extentLogger.info("verify that here Buttons Page");
        Assert.assertEquals(buttons.pageControl("Buttons"), "Buttons");
        extentLogger.info("Double click to DoubleClick button");
        actions.doubleClick(buttons.DoubleClick).perform();
        actions.doubleClick(buttons.DoubleClick).perform();
        extentLogger.info("verify that to double click button has been clicked");
        Assert.assertEquals(buttons.doubleClickMessage.getText(),"You have done a double click");
        extentLogger.info("Right click to RightClickButton");
        actions.contextClick(buttons.rightClickBtn).perform();
        extentLogger.info("verify that to right click button has been clicked");
        Assert.assertEquals(buttons.rightClickMessage.getText(),"You have done a right click");
        extentLogger.info("Left click to LeftClickButton");
        buttons.ClickMeButton.click();
        extentLogger.info("verify that to left click button has been clicked");
        Assert.assertEquals(buttons.dynamicClickMessage.getText(),"You have done a dynamic click");


        //webTables.table();

    }
}