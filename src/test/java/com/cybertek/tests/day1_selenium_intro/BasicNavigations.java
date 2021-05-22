package com.cybertek.tests.day1_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicNavigations {
    public static void main(String[] args) throws InterruptedException {
        //1-setup the browser driver
        WebDriverManager.chromedriver().setup();//if we do not write this 1st section(only we write 2nd one which is below)
        //it is going to show us IllegalStateException when you run without 1 st section

        //2- create instance of selenium web driver
        //this line opens a browser(it shows emty browser without 3 rd section writing)
        WebDriver driver = new ChromeDriver();//after this one it opens empty page when you run.
        //Selenium is not smart but it is very god to do your every command
        //You have to give selenium clear and step by step command

        //this line will maximize the page
        driver.manage().window().maximize();

        //this is only work for mac will not work with Mac computer
        //driver.manage().window().fullscreen();

        //- 3 get the page for Tesla.com
        driver.get("https://www.tesla.com");

        System.out.println(" Current title: " + driver.getTitle());

        String currentUrl = driver.getCurrentUrl();

        System.out.println("currentUrl = " + currentUrl);

        //putting 3 seconds of wait / stops the code for 3 sec
        Thread.sleep(3000);

        //this method will close the currently opened browser
        //it will only close 1 browser or 1 tab
        driver.close();
//        driver.quit();

        //Going back using navigations
        driver.navigate().back();

        //putting 3 seconds of wait / stops the code for 3 sec
        Thread.sleep(3000);

        //Going forward using navigations
        driver.navigate().forward();

        //putting 3 seconds of wait / stops the code for 3 sec
        Thread.sleep(3000);

        //refreshing the page using navigations
        driver.navigate().refresh();

        //going to another url using .to() method
        driver.navigate().to("https://www.google.com");

        System.out.println(" Current title: " + driver.getTitle());

        currentUrl = driver.getCurrentUrl();

        System.out.println("currentUrl = " + currentUrl);




    }
}
