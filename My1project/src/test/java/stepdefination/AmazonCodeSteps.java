package stepdefination;

import io.cucumber.java.en.Given;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import reusable.BaseCode;

import java.time.Duration;

import static reusable.BaseCode.sd;

public class AmazonCodeSteps extends BaseCode {
    @Given("select categery in homepage")
    public void selectcat() {
        WebElement selectnodeelement = sd.findElement(By.id("searchDropdownBox"));// creat webelement
        Select cat = new Select(selectnodeelement);// create an object for select class
//        cat.selectByIndex(3); // using by index
//        cat.selectByVisibleText("Baby"); // using by visibletext
        int dropdowncount = selectnodeelement.findElements(By.tagName("option")).size();//by size method count and store in data type int
        for (int i = 0; i < dropdowncount; i++) {
            String val = selectnodeelement.findElements(By.tagName("option")).get(i).getText();//extract text and store in string datatype
            System.out.println(val);// print statement
        }//

    }


    @Given("user navigate to baby wishlist page")
    public void usernavigatetobabywishlistpage() {
//        WebElement accountListElement = sd.findElement(By.id("nav-link-accountList"));
 WebElement accountListElement=sd.findElement(By.xpath("//a[@id='nav-link-accountList']"));//create webelement
        Actions act = new Actions(sd); // create an object for class actions
        act.clickAndHold(accountListElement).build().perform();   // run clickAndHold method using built and perform methods
//    sd.findElement(By.xpath("//span[text()='Baby Wishlist']")).click();
        WebDriverWait explicitwait=new WebDriverWait(sd,Duration.ofSeconds(10));// // apply explicit wait to perticular line by "webdriverWait calss"
       explicitwait.pollingEvery(Duration.ofSeconds(2));  // pollingevery method check every 2 sec node is loaded or not if its loaded then it will break the waiting loop of 10 sec
       explicitwait.ignoring(NoSuchElementException.class);  // ignoring the exception if its not loaded in 2 sec the it will through an exception
        explicitwait.until(ExpectedConditions.presenceOfElementLocated(By.linkText("Baby Wishlist"))); // validation of the field loaded or not -->until metod--> expextedCondition class--> presenceOfElementLocated method
        sd.findElement(By.linkText("Baby Wishlist")).click();// perform click operation
    }

    @Given("user handle the drag and drop")
    public void dragm(){
        WebElement frameelement=sd.findElement(By.className("demo-frame"));//create webelement to iframe
        sd.switchTo().frame(frameelement); //  switch to parent html to child html
        WebElement drag=sd.findElement(By.xpath("//div[@id='draggable']"));// create webelement to drag node
        WebElement drop=sd.findElement(By.xpath("//div[@id='droppable']"));// create webelement to drop node
        Actions DaD=new Actions(sd); // create object for actions class
        DaD.dragAndDrop(drag,drop).build().perform();// run dragAndDrop metod using by built and perform methodds
        sd.switchTo().defaultContent();// switch to child html to parent html
    }


}