package signin;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import utils.Base;

import java.io.File;
import java.io.IOException;


public class SignIn extends Base {
private static SignInRepo sr;
    public SignIn(){sr = new SignInRepo(driver);}
    String filePath = "/Users/ashwi/Downloads/booking/src/main/resources";

    public String signin(){

        sr.yourTrips.click();
        sr.signinBtn.click();

        //Switching to modal window iframe
        driver.switchTo().frame(driver.findElement(By.name("modal_window")));

       if (isElementVisible(sr.signinBtnInIframe)==true){
           sr.signinBtnInIframe.click();
       }
       //Storing error messages in error variable
        String error = sr.errors.getText();
//       driver.switchTo().defaultContent();

//        File scrFile = driver.getScreenshotAs(OutputType.FILE);
//        //The below method will save the screen shot in d drive with test method name
//        try {
//            FileHandler.copy(scrFile, new File(filePath+"scrimage.png"));
//            System.out.println("***Placed screen shot in "+filePath+" ***");
//        } catch (IOException e) {
//            e.printStackTrace();
//        }


        return error;
    }

}
