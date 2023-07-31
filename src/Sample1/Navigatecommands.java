package Sample1;

import org.openqa.selenium.chrome.ChromeDriver;

public class Navigatecommands {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		
		//navigate to
		driver.navigate().to("https://www.flipkart.com");
		
		//back
		driver.navigate().back();
		
		//forward
		driver.navigate().forward();
		
		//refresh
		driver.navigate().refresh();

	}

}
