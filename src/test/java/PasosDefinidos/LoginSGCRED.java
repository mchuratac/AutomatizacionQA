package PasosDefinidos;
import io.cucumber.java.es.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class LoginSGCRED {

    WebDriver driver;




    @Dado("que la pagina web esta disponible")
    public void que_la_pagina_web_esta_disponible() {

        System.setProperty("webdriver.chrome.driver","src/test/resources/driver/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("http://10.0.203.12:8083/propuesta/");
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);


    }
    @Cuando("el usuario ingresa su nombre de usuario y contrasena")
    public void el_usuario_ingresa_su_nombre_de_usuario_y_contrasena() {
        driver.findElement(By.name("txtUsuario")).sendKeys("ANGI");
        driver.findElement(By.name("txtPassword")).sendKeys("prueba");
    }
    @Cuando("hace click en el boton ingresar")
    public void hace_click_en_el_boton_ingresar() {
        driver.findElement(By.xpath("//button[@type='submit']")).click();


    }
    @Entonces("el sistema debe mostrar la home SGCRED")
    public void el_sistema_debe_mostrar_la_home_sgcred() {

    }



}
