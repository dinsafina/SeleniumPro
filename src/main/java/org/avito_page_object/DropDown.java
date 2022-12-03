package org.avito_page_object;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class DropDown {
    WebDriver driver;

    public DropDown(WebDriver driver) {
        this.driver = driver;
    }

    private final By dropDown = By.xpath("//div[@class=\"select-select-box-jJiQW select-size-s-VX5kS\"]");

    private final By selectExpensive = By.xpath("//option[text()= 'Дороже']");

    public DropDown dropDownClick(){
        driver.findElement(dropDown).click();
        WebElement waitingExpensive = (new WebDriverWait(driver, Duration.ofSeconds(3))
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//option[text()= 'Дороже']"))));
        return this;
    }

    public DropDown expensiveClick(){
        driver.findElement(selectExpensive).click();
        return this;
    }
}
