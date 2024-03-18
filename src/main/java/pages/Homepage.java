package pages;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.WebDriver;

import base.ProjectSpecification;

public class Homepage extends ProjectSpecification {

	public Homepage(WebDriver driver) {
		this.driver = driver;

	}

	// For signup page
	public Signuppage signup() {

		// click the signup button
		findElement("Xpath", "//div[text()='Signup']").click();
		// get all window values
		Set<String> window = driver.getWindowHandles();
		// covert to list for switching window
		List<String> windows = new ArrayList();
		// add all the window using add method
		windows.addAll(window);
		// switch to signup window
		driver.switchTo().window(windows.get(1));
		// get the title of the current window
		String title = driver.getTitle();
		// print the window title
		System.out.println("The page is signinpage" + title);
		return new Signuppage(driver);

	}

	// For loginpage
	public Loginpage login() {

		// click login button
		findElement("Xpath", "//div[text()='Login']").click();
		return new Loginpage(driver);

	}

	// For oneway trip
	public Onewaytrippage oneway() {

		// Click the oneway trip button
		findElement("Xpath", "//div[@class='css-1dbjc4n r-zso239']").click();
		return new Onewaytrippage(driver);

	}

	// For Roundwaytrip
	public Roundtrippage roundway() {
		// Click roundwaytrip button
		findElement("Xpath", "(//div[@class='css-1dbjc4n r-zso239'])[2]").click();
		return new Roundtrippage(driver);

	}

	// TO check Fields available in booking page
	public Bookingpage available_Fields() {

		return new Bookingpage(driver);

	}

}
