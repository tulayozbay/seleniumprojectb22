package com.cybertek.tests.day4_cssSelector_xpath;

import com.cybertek.utulities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class P6_xpath_MuultipleButtons {
    public static void main(String[] args) {
        //XPATH Practice
        //DO NOT USE ANY DEVELOPER TOOLS TO GET ANY LOCATORS.
        //TC #6: XPATH LOCATOR practice
        //1. Open Chrome browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        //maximize the page
        driver.manage().window().maximize();

        //2. Go to http://practice.cybertekschool.com/multiple_buttons
        driver.get("http://practice.cybertekschool.com/multiple_buttons");

        //3. Click on Button 1
        //locating using xpath with class attribute value
        //WebElement button1 = driver.findElement(By.xpath("//button[@class='btn btn-primary']"));//-->1st way

        //locating using text of the button with xpath
        //WebElement button1 = driver.findElement(By.xpath("//button[.='Button 1']"));

        //locating using "onclick" attribute value with xpath locator
        WebElement button1 = driver.findElement(By.xpath("//button[@onclick='button1()']"));

        button1.click();

        WebElement resultText = driver.findElement(By.xpath("//p[@id='result']"));

        //4. Verify text displayed is as expected:
        //Expected: “Clicked on button one!”
        String expectedText = "Clicked on button one!";
        String actualText = driver.getTitle();

        if (actualText.equals(expectedText)){
            System.out.println("Title verification PASSED!");
        } else {
            System.out.println("Title verification FAILED!");
        }

    }
}
