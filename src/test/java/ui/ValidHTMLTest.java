package ui;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


import static org.junit.Assert.assertEquals;

public class ValidHTMLTest {
    private WebDriver driver;

    @Before
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }

    @After
    public void clean() {
        driver.quit();
    }

    @Test // Voer deze test uit als je je project opgeladen hebt
    public void isValidHtml() {
        driver.get("https://validator.w3.org/#validate_by_uri+with_options");
        WebElement invulveld = driver.findElement(By.id("uri"));

        // verander naar de url die je wil valideren
        invulveld.sendKeys("https://webontwerp.ucll.be/web1/reeksen/");

        Select dropdown = new Select(driver.findElement(By.id("uri-doctype")));
        dropdown.selectByValue("HTML5");

        WebElement button = driver.findElement(By.cssSelector(".submit_button"));
        button.click();

        WebElement pass = driver.findElement(By.cssSelector("p.success"));
        assertEquals("Document checking completed. No errors or warnings to show.", pass.getText());
    }
}
