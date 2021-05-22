package com.cybertek.tests.day2_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class T2_ZeroBankAttributeVerification {
    public static void main(String[] args) {
        //TC #2: Zero Bank link text verification
        //1. Open Chrome browser
        WebDriverManager.chromedriver().setup();//set up the driver
        WebDriver driver = new ChromeDriver();//creating my driver instance
        driver.manage().window().maximize();//maximize the page

        //2. Go to http://zero.webappsecurity.com/login.html
        driver.get("http://zero.webappsecurity.com/login.html");

        //LOCATE THE LINK AND STORE OF WebElement

        WebElement zeroBankLink = driver.findElement(By.className("brand"));
        //all of the below is locating same webElement
        //WebElement zeroBankLink = driver.findElement(By.linkText("Zero Bank"));
        //WebElement zeroBankLink = driver.findElement(By.className("brand"));


        //3. Verify link text from top left:
        //Expected: “Zero Bank”
        String expectedLinkText = "Zero Bank";
        String actualLinkText = zeroBankLink.getText();//smaething with this--> driver.findElement(By.className("brand")).getText();
        driver.findElement(By.className("brand")).getText();

        if (actualLinkText.equals(expectedLinkText)){
            System.out.println("Link text verification PASSED!");
        } else{
            System.out.println("Link text verification FAILED!!!");
        }

        //4. Verify link href attribute value contains:
        //Expected: “index.html”
        String expectedInHrefValue = "index.html";
        String actualHrefValue = zeroBankLink.getAttribute("href");

        if (actualHrefValue.equals(expectedInHrefValue)){
            System.out.println("HREF attribute value verification PASSED!");
        } else{
            System.out.println("HREF attribute value verification FAILED!!!");
        }


    }
}
