package WebDriver;

import org.junit.After;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import javax.swing.border.TitledBorder;
import java.util.concurrent.TimeUnit;

import static org.testng.Assert.assertEquals;


public class webDriver {


    public WebDriver driver;

    // @BeforeClass
    // public void launchBrowser() {

    // driver = new ChromeDriver();
    //  driver.get("http://172.23.176.167/");
    //  driver.manage().window().maximize();
    //  }


    @Test
    public void run() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\chromedriver.exe");
        this.driver = new ChromeDriver();
        driver.get("http://172.23.176.167/");
        driver.manage().window().maximize();

        driver.findElement(By.xpath("/html/body/footer/div/div/div[4]/ul/li[1]/a")).click();
        driver.findElement(By.xpath("//*[@id=\"input-email\"]")).sendKeys("Brent@test1.com");
        driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[2]/div/form/div[2]/input")).sendKeys("123456");
        Thread.sleep(3000);
        driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[2]/div/form/input[1]")).click();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        WebDriverWait wait = new WebDriverWait(driver, 4);

        driver.findElement(By.xpath("//*[@id=\"search\"]/input"));
        WebElement element = driver.findElement(By.name("search"));
        element.sendKeys("iMac");
        driver.findElement(By.xpath("/html/body/header/div/div/div[2]/div/span/button/i")).click();
        driver.findElement(By.xpath("/html/body/div[2]/div/div/div[3]/div/div/div[2]/div[2]/button[1]/i")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("/html/body/header/div/div/div[3]/div/button")).click();
        //assertEquals("Checkout", "iMac", this.driver.getTitle());

    }


    // @After
    // public void tearDown() throws Exception {
    //     this.driver.quit();    }


}
