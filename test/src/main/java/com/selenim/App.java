package com.selenim;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.chrome.ChromeDriver;
import java.lang;
import io.github.bonigarcia.wdm.WebDriverManager;

public class App {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.selenium.dev/selenium/web/web-form.html");
        driver.manage().window().maximize();
        WebElement we = driver.findElement(By.xpath("//h1[@class='display-6']"));
        String name = we.getText();
        System.out.println(name);
        if (name.equals("Web form")) {
            System.out.println("Test case pass");

        } else {
            System.out.println("Test case fail");

        }

        driver.findElement(By.id("my-text-id")).sendKeys("hello");
        driver.findElement(By.name("my-password")).sendKeys("passHowq21");
        driver.findElement(By.name("my-textarea")).sendKeys("TextArea new group");
        driver.findElement(By.linkText("Return to index")).click();
        try {
            Thread.sleep(4000); // Sleep for 4 seconds
        } catch (InterruptedException e) { // ✅ Correct exception type
            System.out.println("not sleep"); // ✅ Correct print statement
            e.printStackTrace(); // ✅ Print the error details
        }
        driver.findElement(By.linkText("blank.html")).click();

        try {
            Thread.sleep(10000); // Sleep for 2 seconds
        } catch (InterruptedException e) { // ✅ Correct exception type
            System.out.println("not sleep"); // ✅ Correct print statement
            e.printStackTrace(); // ✅ Print the error details
        }

        driver.quit();
    }
}
