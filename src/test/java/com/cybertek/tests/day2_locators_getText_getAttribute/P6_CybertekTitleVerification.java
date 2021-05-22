package com.cybertek.tests.day2_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P6_CybertekTitleVerification  {
    public static void main(String[] args) throws InterruptedException {
        //TC #6: Practice Cybertek – Class locator practice
        //1. Open Chrome browser
        WebDriverManager.chromedriver().setup();//set up the driver
        WebDriver driver = new ChromeDriver();//creating my driver instance
        driver.manage().window().maximize();//maximize the page

        //2. Go to http://practice.cybertekschool.com/inputs
        driver.get("http://practice.cybertekschool.com/inputs");

        //3. Click “Home” button
        //1 st- locate the web elemnt using class attribute value
        //2nd- click

        Thread.sleep(3000);

        driver.findElement(By.className("nav-link")).click();

        //4. Verify title as expected:
        //Expected: Practice
        String expectedTitle = "Practice";
        String actualTitle =driver.getTitle();

        if (actualTitle.equals(expectedTitle)){
            System.out.println("Etsy title verification PASSED!");
        } else{
            System.out.println("Etsy title verification FAILED!!!");
        }

    }
}
