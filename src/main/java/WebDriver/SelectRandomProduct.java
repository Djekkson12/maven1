package WebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.Random;

public class SelectRandomProduct {
    Paths paths;
    public WebDriver driver;


    public void selectRandomProductFromCategory() {

        List<WebElement> allProducts = driver.findElements(By.xpath(paths.getRandomCategorySelector()));
        Random rand = new Random();
        int randomProduct = rand.nextInt(allProducts.size());
        allProducts.get(randomProduct).click();

    }
}
