package Academy;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Homepage extends Drivername {
	
	@Test
	public void bacePageNavigation() throws IOException, InterruptedException {
		driver=InitializeDriver();
		driver.get("http://automationpractice.itsutra.com/Courses");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//tr[1]//td[5]//a[1]")).click();
	}

}
