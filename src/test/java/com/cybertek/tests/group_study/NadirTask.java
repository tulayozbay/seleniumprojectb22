package com.cybertek.tests.group_study;

import com.cybertek.utulities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

/*
https://www.lambdatest.com/blog/junit-parameterized-test-selenium/
 */

public class NadirTask {
    public static void main(String[] args) {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        //you should go to the link now
        driver.get("https://qa3.vytrack.com/user/login");

        WebElement inputUserName = driver.findElement(By.id("prependedInput"));
        inputUserName.sendKeys("user7");

        WebElement inputPassword = driver.findElement(By.id("prependedInput2"));
        inputPassword.sendKeys("UserUser123" + Keys.ENTER);

        //We can do as a bottom instead of + Keys.ENTER
//        WebElement submitButton = driver.findElement(By.id("_submit"));
//        submitButton.click();

        List<WebElement> list = driver.findElements(By.id("user-menu"));//findElements ile findElement arasindaki fark
        //findElements return the ArrayList
        //findElement return WebElement
        if (list.size() == 0){
            System.out.println("Login Failed!");
        } else {
            System.out.println("Login successful");
        }

        //this is second way to do instead of after line 29 start List

//        if (driver.findElement(By.className("alert-error")).getText().equalsIgnoreCase("Invalid user name or password.")){
//            System.out.println("Login successfully");
//        } else {
//            System.out.println("login failed.");
//        }

    }
}
