import okhttp3.Handshake;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import runner.BaseTest;

public class SimpleTest extends BaseTest {

    @Test
    public void simpleTest() throws InterruptedException {

        WebDriver browser = getDriver();
        browser.get("https://github.com/SergeiDemyanenko/PlatformaticaQA");
        WebElement name = browser.findElement(By.xpath("//strong/a"));

        Assert.assertEquals(name.getText(), "PlatformaticaQA");

        Thread.sleep(3000);
    }

    @Test
    public void descriptionTest()throws InterruptedException{

        WebDriver driver = getDriver();
        driver.get("https://github.com/SergeiDemyanenko/PlatformaticaQA");

        WebElement header = driver.findElement(By.xpath("//div//h2[.='About']"));

        Assert.assertEquals(header.getText(),"About");

        Thread.sleep(1000);
    }
}

