import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class FrntBck {

	private WebDriver driver;

	@BeforeEach
	public void setUp() throws InterruptedException {

		// Set the path to your WebDriver executable
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("start-maximized");

		// Initialize the WebDriver
		driver = new ChromeDriver(options);

		// pausing execution of code to visually check if get chrome maximized
		Thread.sleep(2000);
	}

	@Test
	public void testFrBk() throws InterruptedException {
		// get frontend url
		driver.get("http://localhost:8080/");

		// get frontend text
		WebElement msg_fr = driver.findElement(By.xpath("/html/body/h1"));
		String s = msg_fr.getText();

		// pausing execution of code to visually check of the page loads
		Thread.sleep(5000);

		// get backend url
		driver.get("http://localhost:3000/greet");

		// get backend text
		String pageSource = driver.getPageSource();

		// pausing execution of code to visually check of the page loads
		Thread.sleep(5000);

		// verify if the backend page contains the text message of the frontend
		assertEquals(true, pageSource.contains(s));
	}

	@AfterEach
	public void tearDown() {
		if (driver != null) {
			driver.quit();
		}
	}
}
