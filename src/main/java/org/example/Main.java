package org.example;
//Ejercicio realizado con a arquitectuta POM

//Incorporación de librerías

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        //Configuración de Selenium
        System.setProperty("webdriver.gecko.driver", "C:\\Users\\VG2G0EE\\seleniumFox\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();

        //Objeto creado  por medio del contructor
        TexboxPage textboxPage = new TexboxPage(driver);

        //Referancia a lo metodos  de textBoxPage

        try {
            //Mandamos abrir la pagina
            textboxPage.nevigateTo();
            textboxPage.takescrenShot("C:\\Users\\VG2G0EE\\Pictures\\imagenes\\ejemploMain.png");
            System.out.println("Se genero la captura de la pantalla desde MAIN");

        } catch (IOException e) {

            System.out.println("Existe un error al capturar la pantalla");
        }

    }
}