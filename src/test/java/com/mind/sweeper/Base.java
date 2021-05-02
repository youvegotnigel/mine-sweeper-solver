package com.mind.sweeper;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.List;

public class Base {

    private WebDriver driver;
    private By newGameButton = By.id("face");
    private By importLink = By.id("import-link");
    private By textArea = By.xpath("//td[contains(text(),'Import')]/../following-sibling::tr[1]/td/textarea");
    private By loadGameButton = By.xpath("//input[@value='Load Game']");

    private By firstSquare = By.xpath(getXpathById("5_5"));
    private By square2 = By.xpath(getXpathById("1_9"));

    private By squareWithZero = By.xpath(getXpathByClassName("square open0"));
    private By squareWithOne = By.xpath(getXpathByClassName("square open1"));
    private By squareWithTwo = By.xpath(getXpathByClassName("square open2"));
    private By squareWithThree = By.xpath(getXpathByClassName("square open3"));
    private By squareWithFour = By.xpath(getXpathByClassName("square open4"));
    private By squareWithFive = By.xpath(getXpathByClassName("square open5"));
    private By squareWithSix = By.xpath(getXpathByClassName("square open6"));
    private By squareWithSeven = By.xpath(getXpathByClassName("square open7"));
    private By squareWithEight = By.xpath(getXpathByClassName("square open8"));

    private By squareWithBlank = By.xpath(getXpathByClassName("square blank"));
    private By squareWithFlaged = By.xpath(getXpathByClassName("square bombflagged"));


    private String Game_ID = "eyJ2ZXJzaW9uIjoxLCJnYW1lVHlwZUlkIjoxLCJudW1Sb3dzIjo5LCJudW1Db2xzIjo5LCJudW1NaW5lcyI6MTAsImdyaWRPYmoiOltbMSwyLDIsMSwwLDEsMSwxLDAsMCwwXSxbMSwtOSwtOSxbMSwxLDAsMF0sWzAsMSwwLDBdLFsxLDEsMCwwXSwtMTAsWzIsMSwwLDBdLFsxLDEsMCwwXSxbMSwxLDAsMF0sWzAsMSwwLDBdXSxbMSxbMiwxLDAsMF0sWzMsMSwwLDBdLFsyLDEsMCwwXSxbMSwxLDAsMF0sWzEsMSwwLDBdLFsxLDEsMCwwXSxbMiwxLDAsMF0sLTEwLFsxLDEsMCwwXSxbMCwxLDAsMF1dLFswLFswLDEsMCwwXSxbMSwxLDAsMF0sLTEwLFsxLDEsMCwwXSxbMCwxLDAsMF0sWzAsMSwwLDBdLFsxLDEsMCwwXSxbMSwxLDAsMF0sWzEsMSwwLDBdLFswLDEsMCwwXV0sWzAsWzAsMSwwLDBdLFsxLDEsMCwwXSxbMSwxLDAsMF0sWzEsMSwwLDBdLFswLDEsMCwwXSxbMCwxLDAsMF0sWzAsMSwwLDBdLFswLDEsMCwwXSxbMCwxLDAsMF0sMF0sWzAsWzAsMSwwLDBdLFswLDEsMCwwXSxbMCwxLDAsMF0sWzAsMSwwLDBdLFswLDEsMCwwXSxbMCwxLDAsMF0sWzAsMSwwLDBdLFswLDEsMCwwXSxbMCwxLDAsMF0sMF0sWzEsWzEsMSwwLDBdLFsxLDEsMCwwXSxbMCwxLDAsMF0sWzAsMSwwLDBdLFswLDEsMCwwXSxbMCwxLDAsMF0sWzEsMSwwLDBdLFsxLDEsMCwwXSxbMSwxLDAsMF0sMF0sWzEsLTEwLFsxLDEsMCwwXSxbMCwxLDAsMF0sWzEsMSwwLDBdLFsxLDEsMCwwXSxbMSwxLDAsMF0sWzEsMSwwLDBdLC0xMCxbMSwxLDAsMF0sWzAsMSwwLDBdXSxbMSxbMSwxLDAsMF0sWzIsMSwwLDBdLFsxLDEsMCwwXSxbMywxLDAsMF0sLTksWzIsMSwwLDBdLFsxLDEsMCwwXSxbMSwxLDAsMF0sWzEsMSwwLDBdLFswLDEsMCwwXV0sWzAsWzAsMSwwLDBdLFsxLDEsMCwwXSwtMTAsWzMsMSwwLDBdLC05LFsyLDEsMCwwXSxbMCwxLDAsMF0sWzAsMSwwLDBdLFswLDEsMCwwXSxbMCwxLDAsMF1dLFswLDAsMSxbMSwxLDAsMF0sWzIsMSwwLDBdLFsxLDEsMCwwXSwxLDAsMCwwLDBdXSwidGltZSI6MTI4fQ==";

    @BeforeClass
    public void setup() {

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.get("https://minesweeperonline.com/#beginner-150");
        Assert.assertEquals(driver.getTitle(), "Minesweeper Online - Play Free Online Minesweeper");

    }

    @Test(enabled = false)
    public void test() {

        getClassName(firstSquare);
        leftClick(firstSquare);
        getClassName(firstSquare);
        getId(firstSquare);

        rightClick(square2);
        getClassName(square2);
        getId(square2);

        try {
            explicitWaitMethod(squareWithZero);

            List<WebElement> zero = driver.findElements(squareWithZero);
            List<WebElement> one = driver.findElements(squareWithOne);
            List<WebElement> two = driver.findElements(squareWithTwo);
            List<WebElement> three = driver.findElements(squareWithThree);
            List<WebElement> four = driver.findElements(squareWithFour);
            List<WebElement> five = driver.findElements(squareWithFive);
            List<WebElement> six = driver.findElements(squareWithSix);
            List<WebElement> seven = driver.findElements(squareWithSeven);
            List<WebElement> eight = driver.findElements(squareWithEight);

            List<WebElement> blank = driver.findElements(squareWithBlank);

            printList(zero, "ZERO");
            printList(one, "ONE");
            printList(two, "TWO");
            printList(three, "THREE");
            printList(four, "FOUR");
            printList(five, "FIVE");
            printList(six, "SIX");
            printList(seven, "SEVEN");
            printList(eight, "EIGHT");

            printList(blank, "BLANK");

        } catch (Exception e) {
            System.out.println("ERROR");
        }


    }

    @Test
    public void win(){

        //click on import button
        explicitWaitMethod(importLink);
        driver.findElement(importLink).click();

        //send the code
        explicitWaitMethod(textArea);
        driver.findElement(textArea).sendKeys(Game_ID);

        //click load game
        explicitWaitMethod(loadGameButton);
        driver.findElement(loadGameButton).click();

        //get all unmarked squares
        List<WebElement> blank = driver.findElements(squareWithBlank);
        printList(blank, "BLANK");

        //flag all unmarked squares
        for (WebElement e : blank) {
            Actions actions = new Actions(driver);
            actions.contextClick(e).perform();

        }

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void printList(List<WebElement> list, String name){

        System.out.println("\nThe List of "+ name +"\n================");
        for (WebElement e : list) {
            //System.out.println(e.getAttribute("id"));
        }
        System.out.println("List size " + list.size());
    }

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

    @Test
    public void getAdjacentSquares(){

        String value = "3_3";
        String[] splitString = value.split("_");


    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }
}
