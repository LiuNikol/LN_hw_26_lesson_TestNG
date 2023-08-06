import objects.HillelMainPage;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static configuration.BaseClass.driver;

public class IthillelWebsiteTests {
    HillelMainPage hillelMainPage;
    private final String mainURL="https://ithillel.ua/";
    @BeforeClass
    public void bb() {
        driver.get(mainURL);
        hillelMainPage= new HillelMainPage(driver);
    }

    @Test(priority = 1)
    public void testMainMenuPresence() {
        boolean isMenuPresent = hillelMainPage.isCourseMenuDisplayed();
        Assert.assertTrue(isMenuPresent, "Пункт меню 'КУРСИ' не знайдено на сторінці");
    }

    @Test(priority = 2, dependsOnMethods = "testMainMenuPresence")
    public void testCertificatePage() {
        // Відкриття сторінки з сертифікатами (наприклад, https://ithillel.ua/certificates)
        driver.get("https://ithillel.ua/certificates");

        // Додаткові перевірки для сторінки з сертифікатами
        // Тут можна реалізувати додаткові перевірки, які потрібні для даної сторінки
    }

    @AfterClass
    public void tearDown() {
        // Закриття браузера після виконання тестів
        if (driver != null) {
            driver.quit();
        }
    }
}