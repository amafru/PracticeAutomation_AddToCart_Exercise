package Context;
import static org.junit.Assert.assertTrue;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hooks {
	
	WebDriver driver;
	public String baseUrl = "http://automationpractice.com/index.php";
	
	public void GoToBaseUrl() {
		
		String projectLocation = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver",projectLocation+"/src/test/resources/drivers/chromedriver.exe");
		
		driver = new ChromeDriver();
		driver.navigate().to(baseUrl);
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
	}
	
	public void ClickButton(By elementToClick) {
		driver.findElement(elementToClick).click();
	}
	
	public Float ExtractPrice(By elementToExtract) {
		

		String returnDressAttributes = driver.findElement(elementToExtract).getText();
		String extractPriceFromDressAttributes = returnDressAttributes.replaceAll("[^0-9.]", "");
		Float dressPrice = Float.parseFloat(extractPriceFromDressAttributes);
		return dressPrice;
	}
	
	
	public int DressesPageItemsCount() {
		
		WebElement productCounter = driver.findElement(By.cssSelector("#center_column > div.content_sortPagiBar.clearfix > div.top-pagination-content.clearfix > div.product-count"));
		String productCounterExtractedValue = productCounter.getText();
		
		//Extract the specific value for TOTAL items using index location from above string
		String subStringExtract = productCounterExtractedValue.substring(17, 18);

		
		//Convert that extracted value from index into an integer
		int numberOfItems = Integer.parseInt(subStringExtract);
		System.out.println("Converted integer value for number of items is: " + numberOfItems);
		return numberOfItems;
	}
	
	public void AssertString(By element, String expectedString)
	{
		String actualResult = driver.findElement(element).getText();
		assertTrue(actualResult.contains(expectedString));
	}
	
	public void CloseBrowser() {
		driver.close();
	}


}
