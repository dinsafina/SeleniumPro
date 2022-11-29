import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class AvitoExercise1 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Professional\\Documents\\chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();

        driver.get("https://www.avito.ru/");

        WebElement allCategories = driver.findElement(By.xpath("//a[text()= 'Электроника' and contains(@class, 'link-novisited-UCnee')]"));
        allCategories.click();

        WebElement orgtechnic = driver.findElement(By.xpath("//a[text() = 'Оргтехника и расходники'][1]"));
        orgtechnic.click();

        WebElement searchField = driver.findElement((By.xpath("//input[@aria-autocomplete='list']")));
        searchField.sendKeys("Принтер", Keys.ENTER);

        WebElement inputCity = driver.findElement(By.xpath("//div[@data-marker=\"search-form/region\"]"));
        inputCity.click();

        WebElement enterCity = driver.findElement(By.xpath("//input[@placeholder=\"Город или регион\"]"));
        enterCity.sendKeys("Владивосток");

        WebElement waitingEnteredCity = (new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//strong[text() = 'Владивосток']"))));

        WebElement Vladivostok = driver.findElement(By.xpath("//li[@data-marker=\"suggest(0)\"]"));
        Vladivostok.click();

        WebElement showAdsButton = driver.findElement(By.xpath("//button[@data-marker=\"popup-location/save-button\"]"));
        showAdsButton.click();

        WebElement dropDown = driver.findElement(By.xpath("//div[@class=\"select-select-box-jJiQW select-size-s-VX5kS\"]"));
        dropDown.click();

        WebElement waitingExpensive = (new WebDriverWait(driver, Duration.ofSeconds(3))
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//option[text()= 'Дороже']"))));

        WebElement expensive = driver.findElement(By.xpath("//option[text()= 'Дороже']"));
        expensive.click();


        List<WebElement> products = driver.findElements(By.xpath("//h3[@itemprop=\"name\"]"));
        List<WebElement> sublist = products.subList(1, 4);

        List<WebElement> products2 = driver.findElements(By.xpath("//span[@class=\"price-text-_YGDY text-text-LurtD text-size-s-BxGpL\"]"));
        List<WebElement> sublist2 = products2.subList(1, 4);

        for (int i = 0; i< sublist.size(); i++) {
            System.out.println(sublist.get(i).getText() + ", цена: " + sublist2.get(i).getText());
        }
    }
}
