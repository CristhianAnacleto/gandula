import org.openqa.selenium.chrome.ChromeDriver

class servicos {

    fun openChrome() {
        try {
            System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe")
            val driver = ChromeDriver()
            driver.get("https://bing.com")
        } catch (e: Exception) {
            e.printStackTrace()
        }
    }

    fun googleSearch(text: String) {
        try {
            System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe")
            val driver = ChromeDriver()
            driver.get("https://google.com/search?q=$text")
        } catch (e: Exception) {
            e.printStackTrace()
        }
    }
}