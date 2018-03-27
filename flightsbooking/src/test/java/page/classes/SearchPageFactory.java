package page.classes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchPageFactory {
		
	public  SearchPageFactory(WebDriver driver) {
		
	//	PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="tab-flight-tab-hp")
	WebElement flightTab;
			
	@FindBy(id="flight-origin-hp-flight")
	WebElement originCity;
	
	@FindBy(id="flight-destination-hp-flight")
	WebElement destinationCity;
	
	@FindBy(id="flight-departing-hp-flight")
	WebElement departureDate;
	
	@FindBy(id="flight-returning-hp-flight")
	WebElement returnDate;
			
	
	@FindBy(id="flight-type-roundtrip-label-hp-flight")
	WebElement roundTrip;
	
	@FindBy(id="flight-type-multi-dest-label-hp-flight")
	WebElement multiCity;
	
	@FindBy(xpath="//*[@id='gcw-flights-form-hp-flight']/div[8]/label/button")
	WebElement search;
	
	
	
	/**
	 * Click the Flight Tab!
	 */
	public void clickFlightTab() {
		flightTab.click();
	}
	public void clickSearch() {
		search.click();
	}
	public void clickRoundTrip() {
		roundTrip.click();
	}
	public void clickMultiCity() {
		multiCity.click();
	}
	public void setOriginCity(String city) {
		originCity.sendKeys(city);
	}
	public void setdestinationCity(String city) {
		destinationCity.sendKeys(city);
	}
	public void setDepartureDate(String date) {
		departureDate.sendKeys(date);
	}
	public void setReturnDate(String date) {
		returnDate.clear();
		returnDate.sendKeys(date);
	}
	

}
