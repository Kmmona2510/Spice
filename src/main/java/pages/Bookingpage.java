package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import base.ProjectSpecification;

public class Bookingpage extends ProjectSpecification {

	public Bookingpage(WebDriver driver) {

		this.driver = driver;
	}
	
	//To check the checkin field available in booking page
	public Bookingpage fields_Checkin() {

		WebElement check = findElement("Xpath", "//div[text()='check-in']");
		if (check.isDisplayed()) {
			System.out.println("The checkin filed is available in booking page");
		} else {
			System.out.println("The check-in field is not available in booking page");
		}

		return this;
	}
	
	//To check the flightstatus field available in booking page
	public Bookingpage field_Flightstatus() {
		
		WebElement flight = findElement("Xpath", "//div[text()='flight status']");
		if (flight.isDisplayed()) {
			System.out.println("The Flight status field is available in booking page");
		} else {
			System.out.println("The Flight status field is  not available in booking page");
		}
		return this;
	}

	//To check the managebooking field availble in booking page
	public Bookingpage field_ManageBooking() {
		
		WebElement manage = findElement("Xpath", "//div[text()='manage booking']");

		if (manage.isDisplayed()) {
			System.out.println("The manage booking field is available in booking page");
		} else {
			System.out.println("The manage booking field is not available in booking page");
		}
		
		return this;
	}

}
