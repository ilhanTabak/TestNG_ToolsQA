package com.eurotech.pages;

import com.eurotech.test.TestBase;
import com.eurotech.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class B_CheckBox extends BasePage {




    public void checkBoxMethod(){
        for (int i = 1; i <7 ; i++) {
            Driver.get().findElement(By.xpath("(//button[@title='Toggle'])["+i+"]")).click();
        }




    }



    @FindBy(xpath = "//label[@for='tree-node-home']")
    public WebElement homeCheckBox;

    @FindBy(xpath = "//div[@id='result']/span")
    public List<WebElement> selectedList;



}
