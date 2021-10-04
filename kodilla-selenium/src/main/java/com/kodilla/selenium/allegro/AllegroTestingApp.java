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
        Thread.sleep(5000);
        WebElement findField = driver.findElement(By.xpath("//html/body/div/div/header/div/div/div/form/div/select/optgroup/[option value = \"/kategoria/elektronika\"]"));
        findField.submit();
    }
}
