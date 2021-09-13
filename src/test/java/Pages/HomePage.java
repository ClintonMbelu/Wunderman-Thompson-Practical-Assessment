package Pages;

import org.openqa.selenium.chrome.ChromeDriver;

public class HomePage {
	private ChromeDriver driver;
	
	public HomePage(){
        driver = new ChromeDriver();   // creating an object for the Chrome driver
	}
		
	public void openBrowserAwesite() {
		driver.get("http://www.purina.co.uk");   //Launch chrome browser and open Purina website 
		driver.manage().window().maximize();
	}
	
	
	//go to product and price.
	public void OpenProduct() {
		driver.get("https://www.purina.co.uk/dog/dog-food/product-adventuros-ancient-grain-buffalo");   //Launch chrome browser and open Purina website 
		System.out.println("navigated to Product page");
		driver.manage().window().maximize();
	}
	
	//search for puppy on the search textbox
	public void searchForPuppy() {
		driver.findElementByXPath("//div[@class='header--navigation twb-container']//input[@id='edit-search-api-fulltext']").click();
		System.out.println("clicked the search textbox");
		driver.findElementByXPath("//div[@class='header--navigation twb-container']//input[@id='edit-search-api-fulltext']").sendKeys("Puppy");
		System.out.println("Puppy sent to Search Textbox");
		driver.findElementByXPath("//div[@class='header--navigation twb-container']//input[@id='edit-submit-nppe-ttt-search']").click();
		System.out.println("Search icon clicked");
	}
	
	//decline cookies and remove 
	public void declineCookies() {
		driver.findElementByXPath("//button[@id='_evidon-barrier-declinebutton']").click();
		System.out.println("Decline button on cookies clicked");
		if(driver.findElementByXPath("//button[@class='ui-button ui-corner-all ui-widget ui-button-icon-only ui-dialog-titlebar-close']").isDisplayed()){
			System.out.println("Newsletter window");
			driver.findElementByXPath("//button[@class='ui-button ui-corner-all ui-widget ui-button-icon-only ui-dialog-titlebar-close']").click();
	 }
  }
	
	//Filter by product 
	public void filterByProduct() {
		driver.findElementByXPath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]/ul[1]/li[2]/a[1]/span[1]").click();
		System.out.println("Filtered by product");
		if(driver.findElementByXPath("//div[@class='view-header']/div[@class='total-results']").isDisplayed()) {
			System.out.println("Total results");
			System.out.println(driver.findElementByXPath("//div[@class='view-header']/div[@class='total-results']").getText().toString());
		}
	}
	
	// Navigate to the next product page
	public void PaginateToNextPage(){
		driver.findElementByXPath("//li[@class='pager__item pager__item--next']/a[1]").click();
		System.out.println("Navigated to next page");
	}
	
	//Verify Total product has not changed
	public void ValidateTotalProduct() {
		if(driver.findElementByXPath("//div[@class='view-header']/div[@class='total-results']").isDisplayed()) {
			System.out.println("Total results");
			System.out.println(driver.findElementByXPath("//div[@class='view-header']/div[@class='total-results']").getText().toString());
		}
	}
	
	//Click compare prices
	public void clickComparComparePrices() {
		driver.findElementByXPath("//div[@class='dsu-product--second-info-container-wrapper']//button[@class='btn button-primary btn-buynow']").click();
		System.out.println("Compare prices clicked");
	}
	
			
}
