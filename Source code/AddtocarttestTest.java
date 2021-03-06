// Generated by Selenium IDE
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsNot.not;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import java.util.*;
import java.net.MalformedURLException;
import java.net.URL;
public class AddtocarttestTest {
  private WebDriver driver;
  private Map<String, Object> vars;
  JavascriptExecutor js;
  @Before
  public void setUp() {
    driver = new ChromeDriver();
    js = (JavascriptExecutor) driver;
    vars = new HashMap<String, Object>();
  }
  @After
  public void tearDown() {
    driver.quit();
  }
  @Test
  public void addtocarttest() {
    driver.get("https://www.foodpanda.com/");
    driver.manage().window().setSize(new Dimension(1366, 728));
    {
      WebElement element = driver.findElement(By.cssSelector(".has-tip:nth-child(7)"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).perform();
    }
    {
      WebElement element = driver.findElement(By.tagName("body"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element, 0, 0).perform();
    }
    driver.findElement(By.cssSelector(".has-tip:nth-child(7) > img")).click();
    driver.findElement(By.cssSelector(".restaurants-search-form__button--full")).click();
    {
      WebElement element = driver.findElement(By.cssSelector(".filters-text"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).perform();
    }
    {
      WebElement element = driver.findElement(By.tagName("body"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element, 0, 0).perform();
    }
    {
      WebElement element = driver.findElement(By.cssSelector("li:nth-child(2) img"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).perform();
    }
    {
      WebElement element = driver.findElement(By.tagName("body"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element, 0, 0).perform();
    }
    js.executeScript("window.scrollTo(0,957)");
    driver.findElement(By.cssSelector(".restaurants-search")).click();
    driver.findElement(By.cssSelector(".search-autocomplete-item:nth-child(2) .f-14")).click();
    driver.findElement(By.cssSelector(".vendor-tile-wrapper:nth-child(1) .vendor-picture")).click();
    js.executeScript("window.scrollTo(0,633)");
    driver.findElement(By.cssSelector("#menu__category-id-0 .dish-card:nth-child(6) > .product-button-overlay")).click();
    driver.findElement(By.cssSelector("#menu__category-id-0 .dish-card:nth-child(6) > .product-button-overlay")).click();
    driver.findElement(By.cssSelector("#menu__category-id-0 .dish-card:nth-child(6)")).click();
    driver.findElement(By.cssSelector("#menu__category-id-0 .dish-card:nth-child(6) > .product-button-overlay")).click();
    driver.findElement(By.cssSelector("#menu__category-id-0 .dish-card:nth-child(6) > .product-button-overlay")).click();
    driver.findElement(By.cssSelector("#menu__category-id-0 .dish-card:nth-child(2) > .product-button-overlay")).click();
    driver.findElement(By.cssSelector("#Italian\\ Thin\\ Crust28603649-label > .radio-button")).click();
    driver.findElement(By.cssSelector("#Tex\\ -\\ Mex\\ Chicken28603650-label > .radio-button")).click();
    driver.findElement(By.cssSelector("#Italian\\ Thin\\ Crust28603649-label .box-flex > span")).click();
    driver.findElement(By.cssSelector(".sm\\3Aw-100")).click();
    driver.findElement(By.cssSelector(".product-add-to-cart-button")).click();
    js.executeScript("window.scrollTo(0,547)");
  }
}
