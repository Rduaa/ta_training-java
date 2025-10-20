package com.epam.training.ruslanduadze.webdriverintro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HelloSelenium {
    public static void main(String[] args) throws InterruptedException {
        // Setup ChromeDriver via WebDriverManager
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        try {
            // Open a simple page
            driver.get("https://example.org");

            // Wait until the title contains expected text (up to 10 seconds)
            new WebDriverWait(driver, Duration.ofSeconds(10))
                    .until(ExpectedConditions.titleContains("Example Domain"));

            System.out.println("Title: " + driver.getTitle());

            // Pause for demo purposes so the window stays visible
            Thread.sleep(3000); // 3 seconds
        } finally {
            // Always close the browser at the end
            driver.quit();
        }
    }
}


