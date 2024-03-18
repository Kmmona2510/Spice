package pages;

import org.openqa.selenium.WebDriver;

import base.ProjectSpecification;

public class BookingFormpage extends ProjectSpecification {

	public BookingFormpage(WebDriver driver) {
		this.driver = driver;
	}

	// To select the title
	public BookingFormpage bookingTitle() {

		findElement("Xpath", "//div[@data-testid='title-contact-detail-card']").click();
		findElement("Xpath", "(//div[@class='css-1dbjc4n'])[6]").click();
		return this;
	}

	// To send the first name
	public BookingFormpage firstname() {

		findElement("Xpath", "//input[@data-testid='first-inputbox-contact-details']").sendKeys("Mohana");
		return this;
	}

	// To send the last name
	public BookingFormpage lastname() {

		findElement("Xpath", "//input[@data-testid='last-inputbox-contact-details']").sendKeys("Moorthi");
		return this;
	}

	// To send the contactnumber
	public BookingFormpage contact_Number() {

		findElement("Xpath", "//input[@data-testid='contact-number-input-box']").sendKeys("9788759874");
		return this;

	}

	// To give the email id
	public BookingFormpage email_Id() {

		findElement("Xpath", "//input[@data-testid='emailAddress-inputbox-contact-details']").sendKeys("mohana1@gmail.com");
		return this;
	}

	// To select the country
	public BookingFormpage country() {

		findElement("Xpath", "//div[@class='css-76zvg2 css-bfa6kz r-1862ga2 r-poiln3 r-1gkfh8e']").click();
		findElement("Xpath", "(//div[text()='India'])[2]").click();
		return this;
	}

	// To select the city
	public BookingFormpage city() {

		findElement("Xpath", "//input[@data-testid='city-inputbox-contact-details']").sendKeys("Chennai");
		return this;

	}

	// To click the passenger check box
	public BookingFormpage passenger_Checkclick() {

		findElement("Xpath", "(//div[@class='css-1dbjc4n r-zso239'])[5]").click();
		return this;

	}

	// To click the continue button
	public BookingFormpage clickContinue() {

		findElement("Xpath", "//div[@data-testid='traveller-info-continue-cta']").click();
		return this;
	}

	// After click the continue button it navigate the Addon page
	public Addonspage addon() {

		return new Addonspage(driver);
	}

}
