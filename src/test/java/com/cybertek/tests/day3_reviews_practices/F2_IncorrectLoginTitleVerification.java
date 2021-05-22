package com.cybertek.tests.day3_reviews_practices;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class F2_IncorrectLoginTitleVerification {
    public static void main(String[] args) throws InterruptedException {

        //TC #2: Facebook incorrect login title verification
        // 1.Open Chrome browser
        //setup browser driver
        WebDriverManager.chromedriver().setup();

        //create driver instance and open browser
        WebDriver driver = new ChromeDriver();

        //use the 'driver' object created to selenium methods
        //maximize browser
        driver.manage().window().maximize();


        // 2.Go to https://www.facebook.com
        driver.get("https://www.facebook.com");


        //Locating the web element using id locator and storing it in WebElement type.
        WebElement inputUserName = driver.findElement(By.id("email"));


        // 3.Enter incorrect username
        // We will call it storing element
        inputUserName.sendKeys("something@gmail.com");

        //Locate the web element using
        WebElement inputPassword = driver.findElement(By.id("pass"));

        // 4.Enter incorrect password
        inputPassword.sendKeys("some wrong password" + Keys.ENTER);

        // 5.Verify title changed to:
        // Expected: “Log into Facebook”
        String expectedTitle ="Log into Facebook";
        System.out.println("expectedTitle = " + expectedTitle);

        //We can put Thread.sleep(5000); between this 2 String.
        //When we put this it will
        //Freezing the code for 5 secs so that Chorome browser can catch up with loading the page
        Thread.sleep(5000);

        String actualTitle = driver.getTitle();
        System.out.println("actualTitle = " + actualTitle);

        if (actualTitle.equals(expectedTitle)){
            System.out.println("Title verification PASSED!");
        } else{
            System.out.println("Title verification FAILED!");
        }

    }
}
