package stepdefination;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScenarioOutlineSteps {
    WebDriver ilyas231;
    @Given("navigate to web page")
    public void m1(){
        ilyas231=new ChromeDriver();
        ilyas231.get("https://login.salesforce.com/?locale=in");
    }

    @And("click to login")
    public void click1() {
        ilyas231.findElement(By.xpath("//input[@name='Login']")).click();
    }


    @Then("validate the web")
    public void vali() {
        String error1=ilyas231.findElement(By.xpath("//div[@id='error']")).getText();
        System.out.println(error1);
    }

    @When("user enter  username{string} and  password{string}")
    public void m12(String username, String password) {
        ilyas231.findElement(By.id("username")).sendKeys(username);
        ilyas231.findElement(By.id("password")).sendKeys(password);
    }
}
