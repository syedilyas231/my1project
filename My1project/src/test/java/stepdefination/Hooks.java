package stepdefination;

import io.cucumber.java.*;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import reusable.BaseCode;

import java.io.IOException;

public class Hooks extends BaseCode {   // by using extends we can import basecode class

    @Before
    public void bef() throws IOException {
//     BaseCode ws=new BaseCode();
        System.out.println("execution start");
//     ws.launchbrowser();
BaseCode.launchbrowser();
    }
    @After
    public void aef(){
        System.out.println("execution end");
//        sd.close(); // close the current window page
//        sd.quit();  //  close all webpages
    }
    @BeforeStep
    public void beforestep(){
        System.out.println("before step");
    }
    @AfterStep
    public void takescreenshot(Scenario ssa){  // paramatarized methos by passing the scenario name
        System.out.println("screenshot taken");  // print statement
      byte[] imagescreen= ((TakesScreenshot)sd).getScreenshotAs(OutputType.BYTES);// take screenshot by creating byte array datatype
      ssa.attach(imagescreen,"image/png",ssa.getName());//in built method attach input passing the required
    }
}
