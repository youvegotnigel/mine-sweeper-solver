package com.mind.sweeper;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Board {

    private WebDriver driver;
    int x;
    int y;


    public String getXpathById(String id){
        return "//div[@id='" + id + "']";
    }

    public String getXpathByClassName(String className){
        return "//div[@class='" + className + "' and not(@style='display: none;')]";
    }


    public void leftClick(By element) {
        driver.findElement(element).click();
    }

    public void rightClick(By element) {
        Actions actions = new Actions(driver);
        actions.contextClick(driver.findElement(element)).perform();
    }

    public void getClassName(By element) {
        String className = driver.findElement(element).getAttribute("class");
        System.out.println("The Class squareWithZero is : " + className);
    }

    public void getId(By element) {
        String id = driver.findElement(element).getAttribute("id");
        System.out.println("The id is : " + id);
    }

    public void explicitWaitMethod(By element) {
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(element));
    }


}
