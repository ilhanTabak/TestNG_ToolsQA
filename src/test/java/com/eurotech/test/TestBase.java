package com.eurotech.test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.eurotech.utilities.BrowserUtils;
import com.eurotech.utilities.ConfigurationReader;
import com.eurotech.utilities.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class TestBase {
    protected WebDriver driver;
    protected Actions actions;
    protected WebDriverWait wait;

    protected ExtentReports report;
    protected ExtentHtmlReporter htmlReporter;

    protected ExtentTest extentLogger;


    @BeforeTest
    public void setUpTest(){
        report=new ExtentReports();

        String projectPath=System.getProperty("user.dir");

        String path=projectPath+"/test-output/report.html";
        htmlReporter= new ExtentHtmlReporter(path);
        report.attachReporter(htmlReporter);
        htmlReporter.config().setReportName("Eurotech smoke test");
        report.setSystemInfo("Environment","Production");
        report.setSystemInfo("Browser", ConfigurationReader.get("browser"));
        report.setSystemInfo("OS",System.getProperty("os.name"));
        report.setSystemInfo("Test Engineer","Ilhan T");


    }
    @AfterTest
    public void tearDownTest(){
        report.flush();

    }



    @BeforeMethod
    public void setUp(){
        driver= Driver.get();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        actions=new Actions(driver);
        wait=new WebDriverWait(Driver.get(),15);
        //driver.get(ConfigurationReader.get("url"));
    }

    @AfterMethod
    public void tearDown(ITestResult result) throws InterruptedException, IOException {

        if(result.getStatus()==ITestResult.FAILURE){

            extentLogger.fail(result.getName());
            String screenShotPath= BrowserUtils.getScreenshot(result.getName());
            extentLogger.addScreenCaptureFromPath(screenShotPath);
            extentLogger.fail(result.getThrowable());
        }


        Thread.sleep(2000);
        //driver.close();
        // Driver.closeDriver();

    }
}