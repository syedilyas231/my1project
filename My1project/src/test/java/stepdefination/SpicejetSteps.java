package stepdefination;

import io.cucumber.java.en.Given;
import org.openqa.selenium.By;
import reusable.BaseCode;

public class SpicejetSteps extends BaseCode {
    @Given("user handle the dynamic dropdown")
    public void spice(){
        sd.findElement(By.xpath("//div[@data-testid='to-testID-origin']")).click();

    }
}
