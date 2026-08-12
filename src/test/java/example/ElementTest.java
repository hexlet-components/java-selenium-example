package example;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

class ElementTest {
    @Test
    void checkHeadingText() {
        var driver = new ChromeDriver();
        driver.get("https://example.com");

        var heading = driver.findElement(By.tagName("h1"));
        assertEquals("Example Domain", heading.getText());

        driver.quit();
    }
}
