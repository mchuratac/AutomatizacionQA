package PasosDefinidos;

import io.cucumber.java.es.*;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;


public class FormularioDefinido {

    WebDriver driver;

    @Dado("que la web DEMOQA esta disponible")
    public void que_la_web_demoqa_esta_disponible() {
        System.setProperty("webdriver.chrome.driver","src/test/resources/driver/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://demoqa.com/text-box");
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

    }
    @Cuando("registro mis datos")
    public void registro_mis_datos() {

        driver.findElement(By.id("userName")).sendKeys("Magaly Churata");
        driver.findElement(By.id("userEmail")).sendKeys("mchuratac@outlook.com");
        driver.findElement(By.id("currentAddress")).sendKeys("Av. calle real asoc. santa mercedes");
        driver.findElement(By.id("permanentAddress")).sendKeys("El Agustino");

    }

    @Y ("Doy click en el boton")
    public void doy_clic_en_el_boton() {
       // driver.findElement(By.id("submit")).click();
       //driver.findElement(By.xpath("//button[@class=\"btn btn-primary\"]")).click();
        JavascriptExecutor executor=(JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click();",driver.findElement(By.id("submit")));
    }




    @Entonces("se muestran mis datos en la pantalla")
    public void se_muestran_mis_datos_en_la_pantalla() {



        System.out.println(driver.findElement(By.id("name")).getText());
        System.out.println(driver.findElement(By.id("email")).getText());
        driver.findElement(By.id("currentAddress")).isDisplayed();
        driver.findElement(By.id("permanentAddress")).isDisplayed();

        //limpiar cookies
        driver.manage().deleteAllCookies();
        //driver.close();



    }



}
