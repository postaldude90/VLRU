package ru.vl;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class FavoritesTest extends DriverSetting{

    @Test
    public void FavoritesTest() {

        WebElement menuCategories = driver.findElement(By.xpath("//a[contains(@href, '#')]"));
        menuCategories.click();

        WebElement catgrs = driver.findElement(By.xpath("//span[contains(.,'Транспорт и перевозки')]"));
        catgrs.click();

        WebElement company = driver.findElement(By.xpath("//a[contains(text(),'Vl Good')]"));
        company.click();

        WebElement btnFavorites = driver.findElement(By.cssSelector(".border-wrap:nth-child(2) > span"));
        btnFavorites.click();

        WebElement btnLinkedFavorites = driver.findElement(By.xpath("//a[contains(text(),'Перейти в избранное')]"));
        btnLinkedFavorites.click();

        WebElement btnClearAll = driver.findElement(By.xpath("//span[contains(.,'Очистить список')]"));
        btnClearAll.click();

        WebElement btnRestore = driver.findElementByXPath("//span[contains(.,'Восстановить')]");
        btnRestore.click();


        /*List<WebElement> listCatgrs = driver.findElements(By.className("j_parentNode  has-children"));
        listCatgrs.contains("id");
        */

    }
}
