package com.eurotech.test.Tasks;

import com.eurotech.pages.TaskPage;
import com.eurotech.test.TestBase;
import com.eurotech.utilities.Driver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Task1 extends TestBase{
    TaskPage taskPage=new TaskPage();


    @Test
    public void Test1(){
        Driver.get().get("https://demo.applitools.com");
        taskPage.signIn();
        Assert.assertEquals(taskPage.text.getText(),"Your nearest branch closes in: 30m 5s");
        String Currenturl=Driver.get().getCurrentUrl();
        Assert.assertEquals(Currenturl,"https://demo.applitools.com/app.html");



    }



}
