package webSitesTests;

import Pages.HomePage;
import io.github.bonigarcia.wdm.WebDriverManager;

public class SortProductByPrice {
	
	public static HomePage homePage;
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();    //set up Chrome browser driver
		homePage = new HomePage();
		homePage.OpenProduct();
		homePage.declineCookies();
		homePage.clickComparComparePrices();
	}

}
