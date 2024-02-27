package samplewebpagelearnmore;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SampleWebPageLearnMore {
    public static void main(String[] args) {
        WebDriver sd231=new ChromeDriver();
        sd231.get("https://learnmoreplayground.blogspot.com/p/loginpage.html?m=1");
        sd231.findElement(By.xpath("//input[@id='username']")).sendKeys("syedilyas");
        sd231.findElement(By.xpath("//input[@id='password']")).sendKeys("ilyas226624");
        sd231.findElement(By.xpath("//button[@onclick='login()']")).click();
      String em= sd231.findElement(By.id("errorMessage")).getText();
      //  String em=sd231.findElement(By.xpath("//p[@id='errorMessage']")).getText();
        System.out.println(em);
        String ar="Invalid Credentials.Please Check Once";
    if( em.equals(ar)){
        System.out.println("good");
    }
    else{
        System.out.println("false");
    }
    }
}
