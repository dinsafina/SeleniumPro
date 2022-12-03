package org.avito_page_object;

import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ChangeCity {
    WebDriver driver;

    public ChangeCity(WebDriver driver) {
        this.driver = driver;
    }

    private final By inputCity = By.xpath("//div[@data-marker=\"search-form/region\"]");

    private final By entryCity = By.xpath("//input[@placeholder=\"Город или регион\"]");

    private final By Vladivostok = By.xpath("//li[@data-marker=\"suggest(0)\"]");

    private final By showAdsButton = By.xpath("//button[@data-marker=\"popup-location/save-button\"]");

    public ChangeCity inputCityClick() {
        driver.findElement(inputCity).click();
        return this;
    }

    public ChangeCity entryCityClick() {
        driver.findElement(entryCity).sendKeys("Владивосток");
        return this;
    }

    public ChangeCity VladivostokClick() {
        WebElement waitingEnteredCity = (new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//strong[text() = 'Владивосток']"))));
        driver.findElement(Vladivostok).click();
        return this;
    }

    public ChangeCity showAdsButtonClick() {
        driver.findElement(showAdsButton).click();
        return this;
    }
}
