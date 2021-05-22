package com.cybertek.tests.day4_cssSelector_xpath;

import com.cybertek.utulities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T5_WebOrdersLogin {
    public static void main(String[] args) {
        //TC#5: Basic login authentication
        // 1.Open Chrome browser
        //setup browser driver
        //WebDriverManager.chromedriver().setup();

        //create driver instance and open browser
        //WebDriver driver = new ChromeDriver();

        //NOTES we can do this instead of those two
        //WebDriverManager.chromedriver().setup();
        //WebDriver driver = new ChromeDriver();
        WebDriver driver = WebDriverFactory.getDriver("chrome");


        //use the 'driver' object created to selenium methods
        //maximize browser
        driver.manage().window().maximize();


        // 2-Go to: http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx");

        // 3-Verify title equals:Expected: Web Orders Login
        String expectedTitle = "Web Orders Login";
        String actualTitle = driver.getTitle();

        if (actualTitle.equals(expectedTitle)){
            System.out.println("Login page title verification PASSED!");
        } else{
            System.out.println("Login page title verification FAILED!!!");
        }

        //Locating the web element using id locator and storing it in WebElement type.
        WebElement inputUserName = driver.findElement(By.id("ctl00_MainContent_username"));
        // 4-Enter username: Tester
        // We will call it storing element
        inputUserName.sendKeys("Tester");



        //Locate the web element using
        WebElement inputPassword = driver.findElement(By.id("ctl00_MainContent_password"));
        // 5-Enter password: test
        inputPassword.sendKeys("test");


        // 6-Click “Sign In” button
        WebElement loginButton = driver.findElement(By.id("ctl00_MainContent_login_button"));
        loginButton.click();//bunun yerine  + Keys.ENTER de yazilabilir inputPassword.sendKeys("test"); bura ya hem de bu sekilde inputPassword.sendKeys("test"+ Keys.ENTER);


        // 7-Verify title equals:
        // Expected: Web Orders
        String expectedHomePageTitle = "Web Orders";
        String actualHomePageTitle = driver.getTitle();

        if (actualHomePageTitle.equals(expectedHomePageTitle)){
            System.out.println("Home page title verification PASSED!");
        } else{
            System.out.println("Home page title verification FAILED!!!");
        }

    }
}
