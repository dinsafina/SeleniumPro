package org.avito_page_object;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductListPage {
    WebDriver driver;

    public ProductListPage(WebDriver driver) {
       this.driver = driver;
    }

    private final By  officeEquipment = By.xpath("//a[text() = 'Оргтехника и расходники'][1]");

    public ProductListPage clickOfficeEquipment(){
        driver.findElement(officeEquipment).click();
        return this;
    }
}
