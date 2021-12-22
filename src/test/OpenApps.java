package src.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;


public class OpenApps {

    ChromeDriver driver;

    @BeforeTest
    public void OpenURL() {
        System.setProperty("webdriver.chrome.driver",
                System.getProperty("user.dir") + "\\Drivers\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://play.google.com");
    }

    @Test()
    public void UserCanOpenAppsPage() {
        WebElement appsbutton = driver.findElement(By.xpath("/html/body/div[1]/div[1]/c-wiz[1]/ul/li[2]"));
        appsbutton.click();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        String appsUrl = "https://play.google.com/store/apps";
        Assert.assertEquals(driver.getCurrentUrl(), appsUrl);
        WebElement categories = driver.findElement(By.cssSelector("div.wvAFH"));
        categories.click();
        WebElement education = driver.findElement(By.linkText("Education"));
        education.click();
        Assert.assertEquals(driver.getCurrentUrl(),"https://play.google.com/store/apps/category/EDUCATION");
    }

    @Test ()
    public void SearchForTed() {
        Actions a =new Actions(driver);
        WebElement searchTxtBox = driver.findElement(By.id("gbqfqwb"));
        a.moveToElement(searchTxtBox).click().sendKeys("TED").perform();
        WebElement searchBtn = driver.findElement(By.id("gbqfbw"));
        searchBtn.click();
        String TedPage = driver.getCurrentUrl();
        String expectedUrl = "https://play.google.com/store/search?q=TED";
        Assert.assertEquals(TedPage,expectedUrl);
    }

    @Test
    public void SearchForFacebook() {
        Actions a =new Actions(driver);
        WebElement searchTxtBox = driver.findElement(By.id("gbqfqwb"));
        a.moveToElement(searchTxtBox).click().sendKeys("Facebook").perform();
        WebElement searchBtn = driver.findElement(By.id("gbqfbw"));
        searchBtn.click();
        WebElement facebookIcon = driver.findElement(By.cssSelector("a.poRVub"));
        facebookIcon.isDisplayed();
    }

    @AfterTest
    public void teardown() {
        if (null != driver) {
            driver.quit();
        }
    }
}
