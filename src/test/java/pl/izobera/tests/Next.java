package pl.izobera.tests;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.Assert.assertTrue;

/**
 * Created by izabeladrozdz on 03.07.2018.
 */
public class Next {


    @Test
    public void mainSiteTest() {
        WebDriver webDriver = new ChromeDriver();
        webDriver.get("http://grafika.swps.pl/");
        WebElement menuContact = webDriver.findElement(By.id("menu-item-567"));
        assertTrue(menuContact.isDisplayed());
        menuContact.click();
        webDriver.quit();
    }

}
