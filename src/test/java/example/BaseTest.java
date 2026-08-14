package example;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

class BaseTest {
    protected WebDriver driver;

    @BeforeEach
    void setUp() {
        var options = new ChromeOptions();
        // На сервере сборки дисплея нет, поэтому браузер по умолчанию идёт без окна.
        // Локально окно возвращается переменной окружения HEADLESS=false.
        if (!"false".equals(System.getenv("HEADLESS"))) {
            options.addArguments("--headless=new");
        }
        driver = new ChromeDriver(options);
    }

    @AfterEach
    void tearDown() {
        driver.quit();
    }
}
