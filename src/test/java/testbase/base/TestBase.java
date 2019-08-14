package testbase.base;

import com.sun.jna.platform.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Duration;
import org.openqa.selenium.support.ui.Sleeper;
import org.testng.IHookCallBack;
import org.testng.IHookable;
import org.testng.ITestResult;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import utils.Base;
import utils.InitiateDriver;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class TestBase {
    protected RemoteWebDriver driver;

    @BeforeTest(alwaysRun = true)
    public void setup(){
    InitiateDriver initiateDriver = new InitiateDriver();
    driver = initiateDriver.getDriver();
    driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
    Base.driver = driver;
    driver.get("https://www.cleartrip.com/");





    }

    @AfterTest(alwaysRun = true)
    //close the browser
    public void quitTheBrowser()
    {
        driver.quit();
    }


}
