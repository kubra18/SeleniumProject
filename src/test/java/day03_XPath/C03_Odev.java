package day03_XPath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C03_Odev {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("https://www.amazon.com/");
        WebElement aramaKutusu = driver.findElement(By.xpath("//*[@id='twotabsearchtextbox']"));
        String actualTagname = aramaKutusu.getTagName();
        String expectedTagname = "input";
        if (actualTagname.equals(expectedTagname)){
            System.out.println("tag name testi passed "+actualTagname);

        }else System.out.println("tag name testi failed "+actualTagname);

        String actualAttributeName = aramaKutusu.getAttribute("name");
        String expectedAttributeName = "field-keywords";
        if (actualAttributeName.equals(expectedAttributeName)){
            System.out.println("Attribute testi passed");

        }else System.out.println("Attribute testi failed");
        driver.close();

    }
}

//-Amazon sayfasına gidiniz
//-Arama kutusunu locate ediniz
//-Arama kutusunun tagName'inin input olduğunu test ediniz
//-Arama kutusunun name atributu'nun değerinin field-keywords olduğunu test ediniz
//-Sayfayı kapatınız