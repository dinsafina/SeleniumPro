package org.avito_page_object;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class ProductListResults {

    WebDriver driver;

    public ProductListResults(WebDriver driver) {
        this.driver = driver;
    }

    public void showFirstThreeResults(){
        List<WebElement> products = driver.findElements(By.xpath("//h3[@itemprop=\"name\"]"));
        List<WebElement> priceSublist = products.subList(1, 4);

        List<WebElement> products2 = driver.findElements(By.xpath("//span[@class=\"price-text-_YGDY text-text-LurtD text-size-s-BxGpL\"]"));
        List<WebElement> priceSublist2 = products2.subList(1, 4);

        for (int i = 0; i< priceSublist.size(); i++) {
            System.out.println(priceSublist.get(i).getText() + ", цена: " + priceSublist2.get(i).getText());
        }
    }

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Professional\\Documents\\chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.avito.ru/");

        GeneralPage generalPage = new GeneralPage(driver);
        generalPage.clickElectronics();

        ProductListPage productListPage = new ProductListPage(driver);
        productListPage.clickOfficeEquipment();

        ProductListResults productListResults = new ProductListResults(driver);
        productListResults.showFirstThreeResults();
    }
}


