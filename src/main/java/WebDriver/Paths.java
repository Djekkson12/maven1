package WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Paths {

    private String login = "/html/body/footer/div/div/div[4]/ul/li[1]/a";
    private String LoginPage = "//*[@id=\"input-email\"]";
    private String LoginButton = "/html/body/div[2]/div/div/div/div[2]/div/form/div[2]/input";
    private String AccountLog = "Brent@test1.com";
    private String InsertPass = "123456";
    private String AccountPass = "/html/body/div[2]/div/div/div/div[2]/div/form/input[1]";
    private String SearchButton = "//*[@id=\"search\"]/input";
    private String SearchItem = "iMac";
    private String SelectProduct = "/html/body/header/div/div/div[2]/div/span/button/i";
    private String AddProduct = "/html/body/div[2]/div/div/div[3]/div/div/div[2]/div[2]/button[1]/i";
    private String CheckCart = "/html/body/header/div/div/div[3]/div/button";
    private String AssertCheck = "/html/body/header/div/div/div[3]/div/ul/li[2]/div/p/a[2]/strong/i";
    private String ShoppingCart = "/html/body/div[2]/div[1]/a[2]";
    private String CartRemove = "/html/body/div[2]/div/div/form/div/table/tbody/tr/td[4]/div/span/button[2]";
    private String AssertCheck1 = "/html/body/div[2]/div/div/p";
    private String RandomCategorySelector = "//*[@id=\"content\"]/div[4]/div/div[1]";

    @FindBy(xpath = "/html/body/header/div/div/div[1]/div/h1/a")
    public WebElement Header;

    @FindBy(xpath = "/html/body/div[1]/nav/div[2]/ul/li[2]/a")
    public WebElement YourStoreButton;

    @FindBy(xpath = "/html/body/div[1]/nav/div[2]/ul/li[2]/div/a")
    public WebElement SelectCategory;

    @FindBy(xpath = "/html/body/div[2]/div/div/div/div[2]/div[2]/div/button")
    public WebElement AddToCartButton;

    @FindBy(xpath = "/html/body/nav/div/div[2]/ul/li[4]/a")
    public WebElement GoToCart;

    @FindBy(xpath = "/html/body/div[2]/div/div/form/div/table/tbody/tr[2]/td[4]/div/span/button[2]")
    public WebElement RemoveOneProduct;


    public String getLogin() {
        return login;
    }

    public String getLoginPage() {
        return LoginPage;
    }

    public String getLoginButton() {
        return LoginButton;
    }

    public String getAccountLog() {
        return AccountLog;
    }

    public String getInsertPass() {
        return InsertPass;
    }

    public String getAccountPass() {
        return AccountPass;
    }

    public String getSearchButton() {
        return SearchButton;
    }

    public String getSearchItem() {
        return SearchItem;
    }

    public String getSelectProduct() {
        return SelectProduct;
    }

    public String getAddProduct() {
        return AddProduct;
    }

    public String getCheckCart() {
        return CheckCart;
    }

    public String getAssertCheck() {
        return AssertCheck;
    }

    public String getShoppingCart() {
        return ShoppingCart;
    }

    public String getCartRemove() {
        return CartRemove;
    }

    public String getAssertCheck1() {
        return AssertCheck1;
    }

    public String getRandomCategorySelector() {
        return RandomCategorySelector;
    }
}

