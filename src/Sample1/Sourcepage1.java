package Sample1;

import org.openqa.selenium.chrome.ChromeDriver;

public class Sourcepage1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver d = new ChromeDriver();
		d.get("https://www.google.com");
		
		String s = d.getPageSource(); //to get page source 
		if(s.contains("Gmail"))
		{
			System.out.println("Pass");
		}
		else
		{
			System.out.println("Fail");
		}

	}

	}


