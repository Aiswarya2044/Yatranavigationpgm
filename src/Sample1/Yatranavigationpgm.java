package Sample1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Yatranavigationpgm {

	public static void main(String[] args) 
	{
		ChromeDriver d = new ChromeDriver();
		d.get("https://www.wappalyzer.com");
		d.navigate().to("https://www.wappalyzer.com/technologies/");
		d.navigate().to("https://www.wappalyzer.com/technologies/ecommerce/shopify/");
		d.navigate().to("https://www.wappalyzer.com/lists/?technologies=shopify");	
	}

}
