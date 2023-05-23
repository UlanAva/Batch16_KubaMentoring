package lamba_test;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class Test1 {

    @Test
    public void successfulLogin() throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remove-allow-origins=*");
        WebDriver driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.navigate().to("https://www.lambdatest.com/selenium-playground");

        WebElement inputForm= driver.findElement(By.xpath("//a[contains(text(),'Input Form Submit')]"));
        inputForm.click();
        Thread.sleep(2000);
        WebElement name= driver.findElement(By.cssSelector("#name"));
        name.sendKeys("Ulan");
        WebElement email= driver.findElement(By.cssSelector("#inputEmail4"));
        email.sendKeys("ulan@gmail.com");
        WebElement password= driver.findElement(By.cssSelector("#inputPassword4"));
        password.sendKeys("Sabik");
        WebElement company= driver.findElement(By.cssSelector("#company"));
        company.sendKeys("Code Fish");
        WebElement website= driver.findElement(By.cssSelector("#websitename"));
        website.sendKeys("codefish.com");
        WebElement city= driver.findElement(By.cssSelector("#inputCity"));
        city.sendKeys("Chicago");
        WebElement address= driver.findElement(By.cssSelector("#inputAddress1"));
        address.sendKeys("123 Main Street");
        WebElement address2= driver.findElement(By.cssSelector("#inputAddress2"));
        address2.sendKeys("321 Long Ave");
        WebElement state= driver.findElement(By.cssSelector("#inputState"));
        state.sendKeys("Illinois");
        WebElement zip= driver.findElement(By.cssSelector("#inputZip"));
        zip.sendKeys("60656");
        WebElement submit= driver.findElement(By.xpath("//button[contains(text(),'Submit')]"));
        submit.click();
        Thread.sleep(2000);
        WebElement message= driver.findElement(By.xpath("//p[@class='success-msg hidden']"));
        Assert.assertTrue(message.isDisplayed());
        System.out.println(message.getText());
        Thread.sleep(2000);
        driver.quit();




    }
}