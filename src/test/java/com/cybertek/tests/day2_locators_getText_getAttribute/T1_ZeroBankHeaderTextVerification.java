package com.cybertek.tests.day2_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class T1_ZeroBankHeaderTextVerification {
    public static void main(String[] args) {
        //TC #1: Zero Bank header verification
        //1. Open Chrome browser
        WebDriverManager.chromedriver().setup();//set up the driver
        WebDriver driver = new ChromeDriver();//creating my driver instance
        driver.manage().window().maximize();//maximize the page

        //2. Go to http://zero.webappsecurity.com/login.html
        driver.get("http://zero.webappsecurity.com/login.html");

        //3. Verify header text
        //Expected: “Log in to ZeroBank"
        String expectedHeader ="Log in to ZeroBank";
        //1-locate the element
        //2-get the text of it using getText() method

        WebElement actualHeader = driver.findElement(By.tagName("h3"));

        String actualHeaderText = actualHeader.getText();

        if (actualHeaderText.equals(expectedHeader)){
            System.out.println("Header verification PASSED!");
        } else{
            System.out.println("Header verification FAILED!!!");
        }

    }
}
