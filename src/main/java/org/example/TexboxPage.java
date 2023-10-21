package org.example;
//Incorporación de librerías
//Incorporación de librerías

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.File;
import java.io.IOException;

//Clase donde se implemta a POMP
public class TexboxPage {

    //Atributos
    private WebDriver driver;


    //Metodo Constructor privado para acceder al navegador
    public TexboxPage(WebDriver driver) {
        this.driver = driver;
    }


    //Metodos y Comportamiento en POM

    //Metodos para acceder a la pagina WEB
    public void nevigateTo() {
        driver.get("https://demoqa.com/text-box");
    }

    //Metodos para tomar captura de pantalla
    public void takescrenShot(String path) throws IOException {
        File srcFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        File desFile = new File(path);
        FileUtils.copyFile(srcFile, desFile);
    }


}
