package page.classes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SearchPage {
	//public static WebElement element=null;
	
	//return origin
	public static WebElement originTextBox(WebDriver driver) {
		return (driver.findElement(By.id("package-origin-hp-package")));
	}
	
	public static void fillOriginTextBox(WebDriver driver,String origin) {
		driver.findElement(By.id("package-origin-hp-package")).sendKeys(origin);
	}
	
	//return destination
	public static WebElement destinationTextBox(WebDriver driver) {
		return (driver.findElement(By.id("package-destination-hp-package")));
	}
	
	public static void fillDestinationTextBox(WebDriver driver,String destination) {
		driver.findElement(By.id("package-destination-hp-package")).sendKeys(destination);
	}
	
	//return departing date
	public static WebElement departureDateTextBox(WebDriver driver) {
		return (driver.findElement(By.id("package-departing-hp-package")));
	}
	
	public static void fillDepartureDateTextBox(WebDriver driver,String deptDate) {
		driver.findElement(By.id("package-departing-hp-package")).sendKeys(deptDate);
	}
	
	//return return date
		public static WebElement returnDateTextBox(WebDriver driver) {
			return (driver.findElement(By.id("package-returning-hp-package")));
		}
		
		public static void fillReturnDateTextBox(WebDriver driver,String retDate) {
			driver.findElement(By.id("package-returning-hp-package")).clear();
			driver.findElement(By.id("package-returning-hp-package")).sendKeys(retDate);
		}
		
	//return search button
		public static WebElement returnSearchButton(WebDriver driver) {
			return (driver.findElement(By.id("search-button-hp-package")));
		}
		
	//click on search button
		public static void clickOnSearchButton(WebDriver driver) {
			returnSearchButton(driver).click();
		}
		
		//Navigate to flight tab
		public static void navigateToFlightsTab(WebDriver driver) {
			driver.findElement(By.id("tab-flight-tab-hp")).click();
		}
}
