package test;

import org.testng.annotations.Test;

import base.ProjectSpecification;
import pages.Homepage;

public class TC009_Bookingpagetest  extends ProjectSpecification{
	@Test
	public void checkin_Display() {
		
		Homepage booking = new Homepage(driver);
		
		booking.available_Fields()
		.fields_Checkin()
		.field_Flightstatus()
		.field_ManageBooking();
		
		
	}
	
	
	

}
