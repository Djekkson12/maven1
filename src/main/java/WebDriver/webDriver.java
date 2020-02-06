package WebDriver;

import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import javax.swing.border.TitledBorder;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import static org.testng.Assert.assertEquals;


public class webDriver {

    Paths paths;
    SelectRandomProduct selectRandomProduct;
    public WebDriver driver;


    @Before
    public void launchBrowser() {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\chromedriver.exe");
        this.driver = new ChromeDriver();
        driver.get("http://172.23.176.167/");
        driver.manage().window().maximize();
    }


    @Test
    public void run() throws InterruptedException {


        driver.findElement(By.xpath(paths.getLogin())).click();
        driver.findElement(By.xpath(paths.getLoginPage())).sendKeys(paths.getAccountLog());
        driver.findElement(By.xpath(paths.getLoginButton())).sendKeys(paths.getInsertPass());
        Thread.sleep(2000);
        driver.findElement(By.xpath(paths.getAccountPass())).click();
        driver.findElement(By.xpath(paths.getSearchButton()));

        WebElement element = driver.findElement(By.name("search"));
        element.sendKeys(paths.getSearchItem());
        driver.findElement(By.xpath(paths.getSelectProduct())).click();
        driver.findElement(By.xpath(paths.getAddProduct())).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath(paths.getCheckCart())).click();
        Assert.assertTrue(driver.findElement(By.xpath(paths.getAssertCheck())).isDisplayed());

    }

    @Test
    public void Test2() throws InterruptedException {

        driver.findElement(By.xpath(paths.getLogin())).click();
        driver.findElement(By.xpath(paths.getLoginPage())).sendKeys(paths.getAccountLog());
        driver.findElement(By.xpath(paths.getLoginButton())).sendKeys(paths.getInsertPass());
        Thread.sleep(2000);
        driver.findElement(By.xpath(paths.getAccountPass())).click();
        driver.findElement(By.xpath(paths.getSearchButton()));

        WebElement element = driver.findElement(By.name("search"));
        element.sendKeys(paths.getSearchItem());
        driver.findElement(By.xpath(paths.getSelectProduct())).click();
        driver.findElement(By.xpath(paths.getAddProduct())).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath(paths.getShoppingCart())).click();
        driver.findElement(By.xpath(paths.getCartRemove())).click();
        Assert.assertTrue(driver.findElement(By.xpath(paths.getAssertCheck1())).isDisplayed());


    }


    @Test
    public void Test3() throws InterruptedException {

        driver.findElement(By.xpath(paths.getLogin())).click();
        driver.findElement(By.xpath(paths.getLoginPage())).sendKeys(paths.getAccountLog());
        driver.findElement(By.xpath(paths.getLoginButton())).sendKeys(paths.getInsertPass());
        Thread.sleep(2000);
        driver.findElement(By.xpath(paths.getAccountPass())).click();
        driver.findElement(By.xpath(paths.getSearchButton()));
        Thread.sleep(1000);
        paths.Header.click();
        Thread.sleep(1000);
        paths.YourStoreButton.click();
        Thread.sleep(1000);
        paths.SelectCategory.click();
        Thread.sleep(1000);
        selectRandomProduct.selectRandomProductFromCategory();
        paths.AddToCartButton.click();
        paths.YourStoreButton.click();
        Thread.sleep(1000);
        paths.SelectCategory.click();
        selectRandomProduct.selectRandomProductFromCategory();
        paths.AddToCartButton.click();
        Thread.sleep(1000);
        paths.GoToCart.click();
        Thread.sleep(1000);
        paths.RemoveOneProduct.click();
        // Assert.assertFalse(driver.findElement(By.xpath("/html/body/div[2]/div/div/form/div/table/tbody/tr[2]/td[4]/div/span/button[2]")).isDisplayed());

    }

//    @After
//    public void tearDown() {
//        this.driver.quit();
//    }
}
