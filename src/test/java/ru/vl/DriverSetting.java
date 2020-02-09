package ru.vl;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverSetting {

    ChromeDriver driver;

    @Before
    public void setDriver() {

        System.setProperty("webdriver.chrome.driver", "H:\\VLRU\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.vl.ru/vladivostok");

        //String title = driver.getTitle();
        //Assert.assertTrue(title.equals("Справочник компаний"));
    }

    @After
    public  void close() {
        driver.quit();
    }
}
