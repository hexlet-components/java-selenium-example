package example;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class SmokeTest extends BaseTest {
    @Test
    void openMainPage() {
        driver.get("https://example.com");
        assertTrue(driver.getTitle().contains("Example"));
    }
}
