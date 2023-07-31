package Sample1;

import org.openqa.selenium.chrome.ChromeDriver;

public class First {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.com"); //to open chrome
		
		//to get title of application
		String actual = driver.getTitle();
		System.out.println("actual title: "+actual);

			}

}
