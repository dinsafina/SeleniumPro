package org.avito_page_object;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestUserJourney {

   static WebDriver driver;

        public static void main(String[] args) {
            System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
            driver = new ChromeDriver();
            driver.get("https://www.avito.ru/");

            GeneralPage generalPage = new GeneralPage(driver);
            generalPage.clickElectronics();

            ProductListPage productListPage = new ProductListPage(driver);
            productListPage.clickOfficeEquipment();

            SearchAdsInput searchAdsInput = new SearchAdsInput(driver);
            searchAdsInput.enterSearchField();

            ChangeCity changeCity = new ChangeCity(driver);
            changeCity.inputCityClick();
            changeCity.entryCityClick();
            changeCity.VladivostokClick();
            changeCity.showAdsButtonClick();

            DropDown dropDown = new DropDown(driver);
            dropDown.dropDownClick();
            dropDown.expensiveClick();

            ProductListResults productListResults = new ProductListResults(driver);
            productListResults.showFirstThreeResults();
        }
    }

