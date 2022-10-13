import org.junit.jupiter.api.Test
import org.openqa.selenium.chrome.ChromeDriver

class servicosTest {

    @Test
    fun shouldOpenChrome() {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe")
        val driver = ChromeDriver()
        driver.get("https://bing.com")
    }

    @Test
    fun shouldGoogleSearch() {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe")
        val driver = ChromeDriver()
        driver.get("https://google.com/search?q=banana")
    }
}