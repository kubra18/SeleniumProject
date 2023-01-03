package day01_DriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C04_ManageMethods {

    public static void main(String[] args) throws InterruptedException {


        WebDriver driver = new ChromeDriver();

        //Amazon soyfasina gidelim.
        driver.get("https://amazon.com");
        //Sayfanin konumunu ve boyutlarini yazdirin.
        System.out.println("Sayfanın konumu = " + driver.manage().window().getPosition());
        System.out.println("Sayfanın boyutları = " + driver.manage().window().getSize());
        //Sayfayi simge durumuna getirin.
        driver.manage().window().minimize();
        //simge durumunda 3 saniye bekleyip sayfayi maximize yapin.
        Thread.sleep(3000);
        driver.manage().window().maximize();
        //Sayfanin konumunu ve boyutlarini maximize durumunda yazdirin
        System.out.println("Sayfanın konumu = " + driver.manage().window().getPosition());
        System.out.println("Sayfanın boyutları = " + driver.manage().window().getSize());
        //Sayfayi fullscreen yapin.
        driver.manage().window().fullscreen();
        //Sayfanin konumunu ve boyutlarini fullscreen durumunda yazdirin.
        System.out.println("Sayfanın konumu = " + driver.manage().window().getPosition());
        System.out.println("Sayfanın boyutları = " + driver.manage().window().getSize());
        //Sayfayi kapatin.
        driver.close();


    }
}