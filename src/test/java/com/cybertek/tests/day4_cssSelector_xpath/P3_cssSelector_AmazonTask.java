package com.cybertek.tests.day4_cssSelector_xpath;

import com.cybertek.utulities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class P3_cssSelector_AmazonTask {
    public static void main(String[] args) throws InterruptedException {
        //CSS Practice
        //DO NOT USE ANY DEVELOPER TOOLS TO GET ANY LOCATORS.
        //TC #3: Amazon link number verification
        //1. Open Chrome browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        //maximize the page
        driver.manage().window().maximize();

        //2. Go to https://www.amazon.com/
        driver.get("https://www.amazon.com/");

        //3. Enter search term (use cssSelector to locate search box)-->Amazonun search bari
        WebElement amazonSearchBar = driver.findElement(By.cssSelector("input[id='twotabsearchtextbox']"));
        //cok onemli--> neden ve nasil yaptik bunu input[id='twotabsearchtextbox']
        //bu bir kural css selector yapmak icin bir  syntax var o da :
        // TagName[attribute name='attribute value'] -->"" ta kullanilabilir ancak cok fazla hata verir

        Thread.sleep(2000);//herzaman bu ikisinin arasina konur

        amazonSearchBar.sendKeys("wooden spoon" + Keys.ENTER);

        //4. Verify title equals search term
        //Expected : "Amazon.com : wooden spoon"
        String expectedTitle = "Amazon.com : wooden spoon";
        String actualTitle = driver.getTitle();

        if (actualTitle.equals(expectedTitle)){
            System.out.println("Title verification PASSED!");
        } else {
            System.out.println("Title verification FAILED!");
        }


    }
}
