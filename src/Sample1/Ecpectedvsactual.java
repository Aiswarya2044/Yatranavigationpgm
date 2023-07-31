package Sample1;

import org.openqa.selenium.chrome.ChromeDriver;

public class Ecpectedvsactual {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver d = new ChromeDriver();
		d.get("https://www.google.com");
		
		String expected = "Google.com";
		String actual = d.getTitle();
		System.out.println("Actual title: "+actual);
		
		//Comparing
		if(actual.equals(expected))
		{
			System.out.println("Pass");
		}
		else
		{
			System.out.println("Fail");
		}

	}

}
