package reusable;

import io.github.bonigarcia.wdm.managers.OperaDriverManager;
import org.openqa.selenium.InvalidArgumentException;   // import pre-defined package by selenium
import org.openqa.selenium.WebDriver;               // import pre-defined package by selenium
import org.openqa.selenium.chrome.ChromeDriver;      // import pre-defined package by selenium
import org.openqa.selenium.edge.EdgeDriver;         // import pre-defined package by selenium
import org.openqa.selenium.firefox.FirefoxDriver;  // import pre-defined package by selenium
import org.openqa.selenium.safari.SafariDriver;  // import pre-defined package by selenium
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;               // import pre-defined package by java
import java.io.FileInputStream;    // import pre-defined package by java
import java.io.IOException;      // import pre-defined package by java
import java.time.Duration;
import java.util.Properties;   // import pre-defined package by java

public class BaseCode {
  public static WebDriver sd;  // public is access modifier --->we can use one class or method in other packages
                              // static is a method ----> use the method across packages without creating an objet
// Webdriver  ----> global declaration of variable name so no needs to create webdriver in each and every method
 public static void launchbrowser() throws IOException {

        FileInputStream fis=new FileInputStream(new File("src/main/resources/configaration/config.properties"));
          // fileinputsream class for read operations  ---> we can prove path of configaration file by using the file class
          // fileoutputstream class for write operations
        Properties props=new Properties(); // creating an object for class properties
        props.load(fis);   // load method to read and write operations
        props.getProperty("environment");

         if(props.getProperty("browser").equalsIgnoreCase("edge")){
              sd=new EdgeDriver();    // validation check
         }
         else if (props.getProperty("browser").equalsIgnoreCase("Chrome")){
             sd=new ChromeDriver();    // validation check
        }
            else if(props.getProperty("browser").equalsIgnoreCase("firefox")){
             sd=new FirefoxDriver();  // validation check
        }
          else if(props.getProperty("browser").equalsIgnoreCase("safari")){
              sd=new SafariDriver(); // validation check
        }
          else{

            throw new InvalidArgumentException("please check input");// else through the exception
        }
          sd.get(props.getProperty("environment"));  // get property of configration file
          sd.manage().window().maximize();  // for window maxmize / manage method-->window method-->maximize method

           sd.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));  // implicit wait time define only once in code it will apply all programme
                                    // apllied the implicit wait time by the  default method  provided by selenium i.e "implicit wait method"
                           // applied explicit wait time by the "WebDriver Wait class" provided by selenium
 }

}
