package com.cybertek.tests.day2_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


/*
EXPLANING HIGH LEVEL WHAT IS GOING ON THERE
 */

public class P2_CybertekUrlVerification {
    public static void main(String[] args) {


//        TC #2: Cybertekpractice toolverifications

        //SET UP BROWSER DRIVER
        WebDriverManager.chromedriver().setup();

//        1.Open Chrome browser
        WebDriver driver = new ChromeDriver();

        //MAXIMIZE THE PAGE
        driver.manage().window().maximize();

//        2.Go to http://practice.cybertekschool.com
        driver.get("http://practice.cybertekschool.com");//bu stepten sonra run and see verythin is work you are wxpwcted

//        3.Verify URL contains
//        Expected: cybertekschool

        String expectedInUrl = "cybertekschool";
        String actualUrl = driver.getCurrentUrl();
        if (actualUrl.contains(expectedInUrl)){
            System.out.println("URL verification PASSED!");
        } else {
            System.out.println("URL verification FAILED!");
        }

//        4.Verify title:
//        Expected: Practice

        String expectedTitle = "Practice";
        String actualTitle = driver.getTitle();

        if (actualTitle.equals(expectedTitle)){
            System.out.println("Title verification PASSED!");
        } else {
            System.out.println("Title verification FAILED!");
        }

    }
}
