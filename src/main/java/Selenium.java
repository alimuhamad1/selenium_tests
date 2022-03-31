import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class Selenium {
    public static void main(String[] args) throws InterruptedException {


        WebDriverManager.firefoxdriver().setup();
        WebDriverManager.chromedriver().setup();
        WebDriverManager.safaridriver().setup();

        WebDriver driver = new ChromeDriver();



        driver.get("https://www.bing.com/");


                System.out.println(driver.getTitle());



        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));
        Thread.sleep(5 * 1000);


        WebElement searchBox = driver.findElement(By.name("q"));
        WebElement searchButton = driver.findElement(By.id("images"));
        searchButton.click();
        driver.findElement(By.name("q")).sendKeys("java" + Keys.ENTER);
        WebElement name = driver.findElement(By.id("b-scopeListItem-images"));
        String textValue = name.getText();
        System.out.println(textValue);

        Thread.sleep(5000);

        driver.quit();






    }
}
