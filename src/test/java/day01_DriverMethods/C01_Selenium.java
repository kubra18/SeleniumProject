package day01_DriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C01_Selenium {
    public static void main(String[] args) {

        /*
            En temel haliyle otomasyon yapmak için  Class'ımıza otaomasyon için gerekli olan
        webdriver'in yerini göstermemiz gerekir. Bunun için java kütüphanesinden System.setProperty()
        methodunun içine ilk olarak driver'i yazarız. İkinci olarak driver'in fiziki yolunu kopyalarız
         */
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.amazon.com");


    }
}