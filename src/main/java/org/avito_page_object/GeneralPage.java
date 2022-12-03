package org.avito_page_object;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GeneralPage {
    WebDriver driver;

    public GeneralPage(WebDriver driver) {
        this.driver = driver;
    }

    private final By electronics = By.xpath("//a[text()= 'Электроника' and contains(@class, 'link-novisited-UCnee')]");

    public GeneralPage clickElectronics(){
        driver.findElement(electronics).click();
        return this;
    }
}
