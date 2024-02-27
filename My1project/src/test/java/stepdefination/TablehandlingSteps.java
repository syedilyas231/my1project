package stepdefination;

import io.cucumber.java.en.Given;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static reusable.BaseCode.sd;

public class TablehandlingSteps {
    @Given("user extract the coloum 1 value")
    public void m122(){
       WebElement infosystab=sd.findElement(By.xpath("//table[@class='infobox vcard']"));
       int colcount=  infosystab.findElements(By.tagName("th")).size();
       for(int n=2;n<colcount;n++) {
          String col1 = infosystab.findElements(By.tagName("th")).get(n).getText();
          System.out.println(col1);

      }

        int colcount1=  infosystab.findElements(By.tagName("td")).size();
        for(int h=2;h<colcount1;h++) {
            String col11 = infosystab.findElements(By.tagName("td")).get(h).getText();
            System.out.println(col11);

        }

    }

}
