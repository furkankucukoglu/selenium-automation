package tests;
import okio.Timeout;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import sun.awt.windows.ThemeReader;

import java.sql.Driver;
import java.sql.Time;
import java.time.Duration;
import java.util.*;
import java.util.concurrent.TimeUnit;


public class Test1 {

    public static <HomePage, ProductPage> void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        //sayfaya gidilir.
        driver.get("https://www.a101.com.tr/");

        //çerezler kapatılır.
        driver.findElement(By.id("CybotCookiebotDialogBodyLevelButtonLevelOptinAllowAll")).click();

        //istenilen ürüne gidilir.
        driver.findElement(By.xpath("//a[@title='GİYİM & AKSESUAR']")).click();
        driver.findElement(By.xpath("//a[@data-value='1565']")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//a[@data-value='1567']")).click();
        Thread.sleep(3000);
        driver.findElement(By.className("lazyloaded")).click();
        driver.findElement(By.xpath("//button[@data-pk='18864']")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//a[@rel='nofollow'][1]")).click();
        Thread.sleep(3000);
        driver.findElement(By.className("sepet")).click();
        driver.findElement(By.linkText("Sepeti Onayla")).click();
        driver.findElement(By.linkText("ÜYE OLMADAN DEVAM ET")).click();
        Thread.sleep(3000);
        driver.findElement(By.name("user_email")).sendKeys("random@gmail.com");
        Thread.sleep(3000);
        driver.findElement(By.xpath("/html/body/section/div[1]/div/div[2]/div/div/form/button")).click();
        Thread.sleep(5000);
        driver.findElement(By.linkText("Yeni adres oluştur")).click();
        driver.findElement(By.name("title")).sendKeys("Ev adresim");
        driver.findElement(By.name("first_name")).sendKeys("furkan");
        driver.findElement(By.name("last_name")).sendKeys("küçükoğlu");
        driver.findElement(By.name("phone_number")).sendKeys("05055055555");
        driver.findElement(By.name("city")).sendKeys("İSTANBUL");
        driver.findElement(By.name("city")).sendKeys(Keys.ENTER);
        Thread.sleep(3000);
        driver.findElement(By.name("township")).sendKeys("BAĞCILAR");
        driver.findElement(By.name("township")).sendKeys(Keys.ENTER);
        Thread.sleep(1000);
        driver.findElement(By.name("district")).sendKeys("G MAH");
        driver.findElement(By.className("js-district")).sendKeys(Keys.ENTER);

        driver.findElement((By.name("line"))).sendKeys("randomm mah. random sk. BAĞCILAR/İSTANBUL");
        Thread.sleep(3000);

        driver.findElement(By.cssSelector("button[class='button green address-modal-submit-button js-set-country js-prevent-emoji js-address-form-submit-button']")).click();
        Thread.sleep(2000);

        driver.findElement(By.xpath("//label[@class='js-checkout-cargo-item'][1]")).click();
        driver.findElement(By.xpath("//button[@data-index='1']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//div[@data-type='gpay'][1]")).click();
        driver.findElement(By.cssSelector("input[class='checkout__contract__checkbox js-checkout-agreement']")).click();
        driver.findElement(By.className("closePopupPersona")).click();





















    }


}

