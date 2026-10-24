package example;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

class ElementTest extends BaseTest {
    @Test
    void checkHeadingText() {
        // Страница задаётся прямо в адресе: example.com убрал заголовок и просит не
        // использовать его для тестов, а внешний сайт делает прогон зависимым от сети.
        driver.get("data:text/html,<h1>Example Domain</h1>");

        var heading = driver.findElement(By.tagName("h1"));
        assertEquals("Example Domain", heading.getText());
    }
}
