package pl.izobera.tests;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static junit.framework.TestCase.assertTrue;

/**
 * Created by izabeladrozdz on 06.07.2018.
 */
public class logowanie_google {

    @Test
    public void logintest() {
        WebDriver webDriver = new ChromeDriver();
        webDriver.get("/intl/pl/gmail/about/");
        WebElement menuContact = webDriver.findElement(By.className("hero_home__link__desktop"));
        assertTrue(menuContact.isDisplayed());
        webDriver.quit();
    }
}
