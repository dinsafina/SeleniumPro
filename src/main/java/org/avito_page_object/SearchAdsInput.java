package org.avito_page_object;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class SearchAdsInput {
    WebDriver driver;

    public SearchAdsInput(WebDriver driver) {
        this.driver = driver;
    }

    private final By searchField = By.xpath("//input[@aria-autocomplete='list']");

    public SearchAdsInput enterSearchField() {
        driver.findElement(searchField).sendKeys("Принтер", Keys.ENTER);
        return this;
    }
}
