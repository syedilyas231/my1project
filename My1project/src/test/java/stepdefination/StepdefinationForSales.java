package stepdefination;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import reusable.BaseCode;

public class StepdefinationForSales extends BaseCode {

//  public static WebDriver sd;// global declaration

//  @Given("navigate to webpage salesforce")
    public void url1() {
        sd = new ChromeDriver();
        sd.get("https://login.salesforce.com/?locale=in");
    }



    @And("click on login button")
    public void loginto() {

        sd.findElement(By.xpath("//input[@name='Login']")).click();
    }

    @Then("validate credentials of web page")
    public void validate() {
        String error = sd.findElement(By.xpath("//div[@id='error']")).getText();
        System.out.println(error);


}


    @When("user enter username {string} and password {string}")
    public void userEnt(String username, String password) {
        sd.findElement(By.xpath("//input[@name='username']")).sendKeys("syedilyas");
        sd.findElement(By.xpath("//input[@autocomplete='off']")).sendKeys("ilyas12345");
    }
}