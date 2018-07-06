package pl.izobera.tests;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static junit.framework.TestCase.assertTrue;

/**
 * Created by izabeladrozdz on 26.06.2018.
 */
public class NetizensSiteTests {

    @Test
    public void mainSiteTest() {
        WebDriver webDriver = new ChromeDriver();
        webDriver.get("http://www.netizens.pl/");
        WebElement menuContact = webDriver.findElement(By.className("main_sidebar__menu_contact"));
        assertTrue(menuContact.isDisplayed());
        webDriver.quit();
    }

}
