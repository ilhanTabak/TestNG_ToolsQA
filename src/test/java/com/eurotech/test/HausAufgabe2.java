package com.eurotech.test;

import com.eurotech.pages.Elements.A_TextBox;
import com.eurotech.utilities.ConfigurationReader;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

public class HausAufgabe2 extends TestBase{
    A_TextBox dashBoardPage=new A_TextBox();
    @Test
    public void test2() throws InterruptedException {
        driver.get(ConfigurationReader.get("url"));
        for (int i = 0; i <dashBoardPage.mainList.size() ; i++) {
            JavascriptExecutor jse = (JavascriptExecutor) driver;
            jse.executeScript("window.scrollBy(0,500)");
            System.out.println( dashBoardPage.mainList.get(i).getText().toUpperCase());
            driver.findElement(By.xpath("//h5[.='"+dashBoardPage.mainList.get(i).getText()+"']")).click();
            dashBoardPage.writeMethod();
            System.out.println("-----------");
            driver.navigate().back();
            }
        }
    }

