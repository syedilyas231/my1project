package automationbasic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.Set;

public class AutomationClass {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https:login.salesforce.com");
        driver.findElement(By.id("username")).sendKeys("syedilyas");
        driver.findElement(By.id("password")).sendKeys("12345");



    }
}
