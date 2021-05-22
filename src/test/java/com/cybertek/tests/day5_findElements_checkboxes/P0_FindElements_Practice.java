package com.cybertek.tests.day5_findElements_checkboxes;

import com.cybertek.utulities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class P0_FindElements_Practice {
    public static void main(String[] args) {

        //TC #0: FINDELEMENTS
        //1. Open Chrome browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        //maximize the page
        driver.manage().window().maximize();

        //instead of thread.sleep use this as a bottom
        //If web element is not found , this will up to given seconds
        //if web element is located before 15 seconds, it will move on
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);


        //2. Go to http://practice.cybertekschool.com/forgot_password
        driver.get("http://practice.cybertekschool.com/forgot_password");

        //WE NEED TO CREATE A LOCATOR THAT RETURNS US ALL THE LINKS ON THE PAGE
        //--> //body//a--> This locator will return all of the links on the page

        //we are storing all of the links that are returned by findElements method
        List<WebElement> listOfLinks = driver.findElements(By.xpath("//body//a"));//buradaki methoda dikkat finElements sonu s

        //3. Print out the texts of all links
        for (WebElement each : listOfLinks) {

            System.out.println(each.getText());//it is returning the String
            //output:
            //Home
            //Cybertek School

            //this is as a bottom give us attribute value
            System.out.println(each.getAttribute("href"));//linklerini veriyor outputta
            //output
            //Home
            //http://practice.cybertekschool.com/
            //Cybertek School
            //https://cybertekschool.com/

        }

        //iter +  enter ---> shortcut for foreach loop
        //fori + enter --> shortcut for fori loop


        //4. Print out how many total link

        int numberOfLinks = listOfLinks.size();

        System.out.println("numberOfLinks = " + numberOfLinks);
        //output: numberOfLinks = 2

    }

}
