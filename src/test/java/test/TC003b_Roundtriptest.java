package test;

import org.testng.annotations.Test;

import base.ProjectSpecification;
import pages.Homepage;
import pages.Onewaytrippage;

public class TC003b_Roundtriptest extends ProjectSpecification {
	@Test
	public void round_Trip() throws InterruptedException {
		
		Homepage roundtrip = new Homepage(driver);
		roundtrip.roundway()
		.roundFrom()
		.roundTo()
		.roundDepature()
		.roundReturn()
		.roundPassengers()
		.searchflight_Button();
		
	Onewaytrippage roundchain = new Onewaytrippage(driver);
	
	roundchain.select_Flights()
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
	
	//for validation
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
