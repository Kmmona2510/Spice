package test;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import base.ProjectSpecification;
import pages.Homepage;

public class TC003a_Onewaytest  extends ProjectSpecification{
	@Test
	public void one_way() throws InterruptedException {
		
		Homepage oneway = new Homepage(driver);
		oneway.oneway()
		.from()
		.to()
		.depature_Date()
		.passengers()
		.currency()
		.searchflight_Button()
		.select_Flights()
		.continue_button()
		.passengers()
		.bookingTitle()
		.firstname()
		.lastname()
		.contact_Number()
		.email_Id()
		.city()
		.passenger_Checkclick()
		.clickContinue()
		.addon()
		.continuebutton();
		
	//For validation	
	String title = driver.getTitle();
	System.out.println(title);
	
	if(title.contains("Flight Booking for Domestic and International, Cheap Air Tickets")) {
		System.out.println("Booking Successful");
	}
	else {
		System.out.println("Booking not successful");
	}
		
		}

}
