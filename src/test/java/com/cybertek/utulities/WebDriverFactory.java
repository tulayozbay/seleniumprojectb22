package com.cybertek.utulities;

//Task : New method Creation
//Method name : getDriver
//Static method-->when you make static you do not have to create a object
//Accepts String arg : browserType
//  - This arg will determine what type of browser is opened
//  - if "chrome" passed --> it will open chrome browser
//  - if "firefox" passed --> it will open firefox browser
// RETURN TYPE: "WebDriver"


import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverFactory {
    //Static method-->when you make static you do not have to create a object
    public static WebDriver getDriver(String browserType){//Static method// RETURN TYPE: "WebDriver"//Method name : getDriver//Accepts String arg : browserType

        if (browserType.equalsIgnoreCase("chrome")){
            WebDriverManager.chromedriver().setup();

            return new ChromeDriver();

        } else if (browserType.equalsIgnoreCase("firefox")){
            WebDriverManager.firefoxdriver().setup();

            return new FirefoxDriver();

        }else {
            System.out.println("Given browser type does not exist. Driver = null");
            return null;//--> bunu yaptik cunku birseye return olmali yoksa hala kirmizidir, Error verir.
        }

    }

}
