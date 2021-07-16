package PasosDefinidos;

import io.cucumber.java.es.*;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class FormularioguruDefinido {

   WebDriver driver;


    @Dado("la web guru este disponible")
    public void la_web_guru_este_disponible() {
        System.setProperty("webdriver.chrome.driver","src/test/resources/driver/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://demoqa.com/text-box");
        driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);



    }
    @Cuando("seleccione la opcion radio button")
    public void seleccione_la_opcion_radio_button() {

       // driver.findElement(By.id("item-2")).getText();
        //JavascriptExecutor executor=(JavascriptExecutor) driver;
        driver.findElement(By.xpath("//ul[@class=\"menu-list\"]")).click();


    }

    @Y ("selecciono la opcion yes")
    public void selecciono_la_opcion_yes() {

       // driver.findElement(By.xpath("//input[@id='yesRadio']//following-sibling::label")).click();
       // driver.findElement(By.xpath("//input[@id='impressiveRadio']//following-sibling::label")).click();
        driver.findElement(By.xpath("//label[@for='yesRadio']")).click();

    }


    @Entonces("me muestra el mensaje")
    public void me_muestra_el_mensaje() {

    }




}
