package com.kodilla.selenium.allegro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class AllegroTestingApp {


    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "c:\\selenium-drivers\\chrome\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.allegro.pl/");
        Thread.sleep(2000);

        WebElement acceptCookies = driver.findElement(By.xpath("//html/body/div[3]/div[8]/div/div/div/div/div[2]/div[2]/button[1]"));
        acceptCookies.click();


        WebElement inputField = driver.findElement(By.xpath("//*[@data-box-name=\"allegro.metrumHeader.search\"]/div/form/div[3]/div/select"));
        inputField.sendKeys("Elektronika");
        inputField = driver.findElement(By.xpath("//*[@data-box-name=\"allegro.metrumHeader.search\"]/div/form/input"));
        inputField.sendKeys("Mavic mini");
        inputField = driver.findElement(By.xpath("//*[@data-box-name=\"allegro.metrumHeader.search\"]/div/form/button"));
        inputField.click();
    }
}
