package com.cybertek.tests.day4_cssSelector_xpath;

import com.cybertek.utulities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class P1_cssSelector_Cybertek {
    public static void main(String[] args) {

//         * TC #1: PracticeCybertek.com_ForgotPassword WebElement verification
//         * 1. Open Chrome browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        //maximize the page
        driver.manage().window().maximize();

//         * 2. Go to http://practice.cybertekschool.com/forgot_password
        driver.get("http://practice.cybertekschool.com/forgot_password");

//         * 3. Locate all the WebElements on the page using XPATH and/or CSS locator only (total of 6)
//         * a. “Home” link
        WebElement homeLink = driver.findElement(By.cssSelector("a[class='nav-link'"));
        //WebElement homeLink = driver.findElement(By.cssSelector("a.nav-link"));//a.nav-link --> bu sekilde de yazilabilir

//         * b. “Forgot password” header
        WebElement forgotPasswordHeader = driver.findElement(By.tagName("h2"));

//         * c. “E-mail” text
        WebElement emailLabel = driver.findElement(By.cssSelector("label[for='email']"));

//         * d. E-mail input box
        WebElement inputEmail = driver.findElement(By.cssSelector("input[name='email']"));

//         * e. “Retrieve password” button
        WebElement retrievePassword = driver.findElement(By.cssSelector("button[id='form_submit']"));


//         * f. “Powered by Cybertek School” text--> x
        WebElement poweredByText = driver.findElement(By.cssSelector("div[style='text-align: center;']"));

//         * 4. Verify all WebElements are displayed.
        System.out.println("homeLink.isDisplayed() = " + homeLink.isDisplayed());
        System.out.println("forgotPasswordHeader.isDisplayed() = " + forgotPasswordHeader.isDisplayed());
        System.out.println("emailLabel.isDisplayed() = " + emailLabel.isDisplayed());
        System.out.println("inputEmail.isDisplayed() = " + inputEmail.isDisplayed());
        System.out.println("retrievePassword.isDisplayed() = " + retrievePassword.isDisplayed());
        System.out.println("poweredByText.isDisplayed() = " + poweredByText.isDisplayed());
        //isDisplayed(); method return to boolean

    }
}
