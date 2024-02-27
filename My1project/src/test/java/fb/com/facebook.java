package fb.com;
import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.config.WebDriverManagerException;
import io.github.bonigarcia.wdm.managers.OperaDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
public class facebook {
    public static void main(String[] args) throws InterruptedException {
 // TC 1
        WebDriverManager.edgedriver().setup();
     WebDriver ilyas=new EdgeDriver();
     // TC 2
        ilyas.get("https://www.google.com/#sbfbu=1&pi=");
        // TC 3  (we have wait until 5 sec)
        Thread.sleep(5000);
        // TC 4
        String title=ilyas.getTitle();
        System.out.println(title);
        // TC 5  (2 ways to close browser)
       // ilyas.close();  it will close the active tab//
        ilyas.quit(); //-- it will close entire browser//
    }
    }

