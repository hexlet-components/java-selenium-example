package example;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.jupiter.api.Assertions.assertTrue;

class SmokeTest {
    @Test
    void openMainPage() {
        var driver = new ChromeDriver();
        driver.get("https://example.com");
        assertTrue(driver.getTitle().contains("Example"));
        driver.quit();
    }
}
