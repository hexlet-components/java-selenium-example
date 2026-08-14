package example;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

class ElementTest extends BaseTest {
    @Test
    void checkHeadingText() {
        driver.get("https://example.com");

        var heading = driver.findElement(By.tagName("h1"));
        assertEquals("Example Domain", heading.getText());
    }
}
