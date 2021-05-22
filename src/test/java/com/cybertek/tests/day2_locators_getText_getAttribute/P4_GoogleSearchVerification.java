package com.cybertek.tests.day2_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P4_GoogleSearchVerification {
    public static void main(String[] args) {

        //TC #4:	Google	search
        //1- Open	a	chrome	browser

        WebDriverManager.chromedriver().setup();//set up the driver
        WebDriver driver = new ChromeDriver();//creating my driver instance
        driver.manage().window().maximize();//maximize the page

        //2- Go	to:	https://www.google.com
        driver.get("https://www.google.com");//buraya www yu koymazsam ben de tam anlamiyla calismiyor bu yuzden bunu koymam gerekir

        //3- Write	“apple”	in	search	box
        //4- Click	google	search	button
        driver.findElement(By.name("q")).sendKeys("apple" + Keys.ENTER);//burada demek istedigi ise search boxa apple yaz ve enter a bas.
        //bunuyani "q" yu www.google.com a gidip search box i inspect ettigimizde input classin icinde name attribute var orda name"q" yaziyor. onu kopyaliyorsun


        //5- Verify	title:
        //Expected:	Title	should	start	with	“apple”	wor
        String expectedInTitle = "apple";
        String actualTitle = driver.getTitle();

        if (actualTitle.startsWith(expectedInTitle)){
            System.out.println("Title verification PASSED!");
        } else{
            System.out.println("Title verification FAILED!");
        }

    }
}
