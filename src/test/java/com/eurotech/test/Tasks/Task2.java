package com.eurotech.test.Tasks;

import com.eurotech.pages.TaskPage;
import com.eurotech.test.TestBase;
import com.eurotech.utilities.Driver;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Task2 extends TestBase {
    TaskPage taskPage=new TaskPage();

   /*    Task 2


           1) Bu siteye gidin. -> https://www.snapdeal.com/

           2) "teddy bear" aratın ve  Search butonuna tıklayın.

           3) Bu yazının göründüğünü doğrulayınız. -> (We've got 344 results for 'teddy bear')
           Not: Bu yazıdaki sayı değişiklik gösterebilir. Önemli olan cümle kalıbı.

           4) Snepdeal logosuna tıklayınız.

           5) URL'in bu olduğunu doğrulayın. (https://www.snapdeal.com/)

        */


    @Test




    public void Test1() throws InterruptedException {
        Driver.get().get("https://www.snapdeal.com");
        Driver.get().manage().window().maximize();
        taskPage.searchBox.sendKeys("teddy bear");
        taskPage.searchBox.sendKeys(Keys.ENTER);
        Driver.get().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        Assert.assertTrue(taskPage.upperText.getText().contains("results for teddy bear"));
        taskPage.logo.click();
        Assert.assertEquals(Driver.get().getCurrentUrl(),"https://www.snapdeal.com/");


    }



}
