import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrimerTest {

    public static void main(String arg[]){
        System.setProperty("webdriver.chrome.driver","src/test/resources/driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://demo.guru99.com/payment-gateway/");
        driver.manage().window().maximize();
        driver.close();
    }

}
