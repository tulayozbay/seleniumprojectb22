package com.cybertek.tests.day3_reviews_practices;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class F3_HeaderVerification {
    public static void main(String[] args) {

        //TC #3: Facebook header verification
        // 1.Open Chrome browser
        WebDriverManager.chromedriver().setup();//set up the driver
        WebDriver driver = new ChromeDriver();//creating my driver instance
        driver.manage().window().maximize();//maximize the page


        // 2.Go to https://www.facebook.com
        driver.get("https://www.facebook.com");


        // 3.Verify header text is as expected:
        //locating the web element
        WebElement header = driver.findElement(By.className("_8eso"));

        //Short cut for auto-generating variable type
        //alt + ENTER --> WINDOWS
        //option + ENTER --> MAC

        // Expected: “Connect with friends and the world around you on Facebook.”
       String expectedHeader= "Connect with friends and the world around you on Facebook.";
       String actualHeader = header.getText();
       //---> create webelement <----> getting the text<-

        if (actualHeader.equals(expectedHeader)){
            System.out.println("Header verification PASSED!");
        } else{
            System.out.println("Header verification FAILED!");
        }

    }
}