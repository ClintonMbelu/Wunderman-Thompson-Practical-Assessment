package webSitesTests;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Pages.HomePage;

public class PurinaHomePageSearchFilterPagination {
    public static HomePage homePage;
    
	public static void main(String[] args) {	
		WebDriverManager.chromedriver().setup();    //set up Chrome browser driver
		homePage = new HomePage();
		homePage.openBrowserAwesite();
		homePage.declineCookies();
		homePage.searchForPuppy();
		homePage.filterByProduct();
		homePage.PaginateToNextPage();
		homePage.ValidateTotalProduct();
	}
}
