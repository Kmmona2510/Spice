package pages;

import org.openqa.selenium.WebDriver;

import base.ProjectSpecification;

public class Selectflightspage extends ProjectSpecification {
	
	public Selectflightspage(WebDriver driver) {
		this.driver =driver;
	}
	
	//To select the flight 
	public Selectflightspage continue_button() {
		
		findElement("Xpath", "//div[@data-testid='continue-search-page-cta']").click();
		return this;
	}

	//It navigate booking page
	public BookingFormpage passengers() {
		
		return new BookingFormpage(driver);
	}
}
