package seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.Set;

public class SeleniumBasics
{
    public static void main(String[] args) {

        WebDriver ilyasSyed= new ChromeDriver();
      ilyasSyed.get("https://login.salesforce.com/?locale=in");
//       ilyasSyed.findElement(By.id("username")).sendKeys("syedILYAS");
//       ilyasSyed.findElement(By.id("password")).sendKeys("ilyas@1234");
//       ilyasSyed.findElement(By.name("Login")).click();
        ilyasSyed.findElement(By.xpath("//input[@name='username']")).sendKeys("syedilyas");
        ilyasSyed.findElement(By.xpath("//input[@autocomplete='off']")).sendKeys("ilyas12345");
        ilyasSyed.findElement(By.xpath("//input[@name='Login']")).click();
         String errorMassage=ilyasSyed.findElement(By.xpath("//div[@id='error']")).getText();
        System.out.println(errorMassage);

        }

}
