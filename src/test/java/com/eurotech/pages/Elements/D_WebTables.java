package com.eurotech.pages.Elements;

import com.eurotech.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.Arrays;
import java.util.List;
public class D_WebTables extends BasePage {
    String[] lisste[] = new String[3][6];

    @FindBy(xpath = "//div[@class='rt-table']")
    public List<WebElement> tableList;

    @FindBy(id = "searchBox")
    public WebElement searchBox;

    @FindBy(xpath = "//div[@class='rt-tr-group'][1]/div/div[1]")
    public WebElement Cierra;

    @FindBy(id = "addNewRecordButton")
    public WebElement addButton;

    @FindBy(id = "firstName")
    public WebElement firstNameBox;

    @FindBy(id = "lastName")
    public WebElement lastNameBox;

    @FindBy(id = "userEmail")
    public WebElement userEmailBox;

    @FindBy(id = "age")
    public WebElement ageBox;

    @FindBy(id = "salary")
    public WebElement salaryBox;

    @FindBy(id = "department")
    public WebElement departmentBox;

    @FindBy(id = "submit")
    public WebElement submitButton;

    public void table() {
        for (int i = 1; i < 4; i++) {
            for (int j = 1; j < 7; j++) {
                lisste[i - 1][j - 1] = Driver.get().findElement(By.xpath("//div[@class='rt-tr-group'][" + i + "]/div/div[" + j + "]")).getText();
            }
        }
        System.out.println("Arrays.toString(lisste) = " + Arrays.deepToString(lisste));
    }

    public boolean isNumeric() {
        int countertrue=0;
        int counterFalse=0;
        for (int i = 1; i < 6; i++) {
            for (int j = 1; j < 3; j++) {
                String names = Driver.get().findElement(By.xpath("//div[@class='rt-tr-group'][" + i + "]/div/div[" + j + "]")).getText();
                for (int k = 0; k < names.length(); k++) {

                    if (Character.isDigit(names.charAt(k))) {
                        countertrue++;

                    }else{
                        counterFalse++;
                    }
                }
            }
        }
          if(countertrue>=1){

              return true;
          }else {
              return false;
          }
    }
    public void addMethodPozitive() {

        firstNameBox.sendKeys("ilhan");
        lastNameBox.sendKeys("Tabak");
        userEmailBox.sendKeys("ilhan@gmail.com");
        ageBox.sendKeys("34");
        salaryBox.sendKeys("2000");
        departmentBox.sendKeys("Anmeldung");
        submitButton.click();
    }

    public void addMethodNegative() {

        firstNameBox.sendKeys("ilhan");
        lastNameBox.sendKeys("Tabak");
        userEmailBox.sendKeys("ilhan@gmail.com");
        ageBox.sendKeys("34");
        salaryBox.sendKeys("2000");
        departmentBox.sendKeys("Buchhaltung");
        submitButton.click();
    }
}