package week2.day1;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OpenUrl {

	

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.findElementById("username").sendKeys("DemoSalesManager");
		driver.findElementById("password").sendKeys("crmsfa");
		driver.findElementByClassName("decorativeSubmit").click();
		System.out.println("Title is " + driver.getTitle());
		if (driver.getTitle().contains("TestLeaf")) {
			System.out.println("Title contains TestLeaf");
		} else {
			System.out.println("title not contaimns");
		}
		driver.findElementByLinkText("CRM/SFA").click();
		Thread.sleep(5000);
		driver.findElementByLinkText("Leads").click();
		driver.findElementByLinkText("Create Lead").click();
		driver.findElementById("createLeadForm_companyName").sendKeys("CTS");
		driver.findElementById("createLeadForm_firstName").sendKeys("Naveen");
		driver.findElementById("createLeadForm_lastName").sendKeys("Kumar");
		WebElement source = driver.findElementById("createLeadForm_dataSourceId");
		Select dropDown1 = new Select(source);
		dropDown1.selectByVisibleText("Partner");
		WebElement MarketingCampaign = driver.findElementById("createLeadForm_marketingCampaignId");
		Select dropDown2 = new Select(MarketingCampaign);
		dropDown2.selectByVisibleText("Road and Track");
		driver.findElementById("createLeadForm_firstNameLocal").sendKeys("Naveen");
		driver.findElementById("createLeadForm_lastNameLocal").sendKeys("Kumar");
		driver.findElementById("createLeadForm_personalTitle").sendKeys("Mr");
		driver.findElementById("createLeadForm_birthDate").sendKeys("10/03/1998");
		driver.findElementById("createLeadForm_generalProfTitle").sendKeys("MyProfile");
		driver.findElementById("createLeadForm_departmentName").sendKeys("Health");
		driver.findElementById("createLeadForm_annualRevenue").sendKeys("20000");
		WebElement currrency = driver.findElementById("createLeadForm_currencyUomId");
		Select dropDown3 = new Select(currrency);
		dropDown3.selectByIndex(3);
		WebElement industry = driver.findElementById("createLeadForm_industryEnumId");
		Select dropDown4 = new Select(industry);
		dropDown4.selectByValue("IND_SOFTWARE");
		driver.findElementById("createLeadForm_numberEmployees").sendKeys("120000");
		WebElement owner = driver.findElementById("createLeadForm_ownershipEnumId");
		Select dropDown5 = new Select(owner);
		dropDown5.selectByValue("OWN_CCORP");
		driver.findElementById("createLeadForm_sicCode").sendKeys("123");
		driver.findElementById("createLeadForm_tickerSymbol").sendKeys("@334");
		driver.findElementById("createLeadForm_description").sendKeys("Im working in cts");
		driver.findElementById("createLeadForm_importantNote").sendKeys("do not disturb");
		driver.findElementById("createLeadForm_primaryPhoneCountryCode").sendKeys("2");
		driver.findElementById("createLeadForm_primaryPhoneAreaCode").sendKeys("234");
		driver.findElementById("createLeadForm_primaryPhoneNumber").sendKeys("8197838529");
		driver.findElementById("createLeadForm_primaryPhoneExtension").sendKeys("qwer");
		driver.findElementById("createLeadForm_primaryPhoneAskForName").sendKeys("Naveen");
		driver.findElementById("createLeadForm_primaryEmail").sendKeys("naveenkumarng8197@gmail.com");
		driver.findElementById("createLeadForm_primaryWebUrl").sendKeys("amazon");
		driver.findElementById("createLeadForm_generalToName").sendKeys("Naveen");
		driver.findElementById("createLeadForm_generalAttnName").sendKeys("Kumar");
		driver.findElementById("createLeadForm_generalAddress1").sendKeys("Nagamangala");
		driver.findElementById("createLeadForm_generalAddress2").sendKeys("Shidlaghatta");
		driver.findElementById("createLeadForm_generalCity").sendKeys("Chikkaballapur");
		WebElement state = driver.findElementById("createLeadForm_generalStateProvinceGeoId");
		Select dropDown6 = new Select(state);
		dropDown6.selectByValue("IN");
		driver.findElementById("createLeadForm_generalPostalCode").sendKeys("562102");
		WebElement country = driver.findElementById("createLeadForm_generalCountryGeoId");
		Select dropDown7 = new Select(country);
		dropDown7.selectByValue("IND");
		driver.findElementById("createLeadForm_generalPostalCodeExt").sendKeys("1234");
		driver.findElementByClassName("smallSubmit").click();
		driver.findElementByLinkText("Duplicate Lead").click();
		driver.findElementById("createLeadForm_companyName").clear();
		driver.findElementById("createLeadForm_companyName").sendKeys("Amazon");
		driver.findElementByClassName("smallSubmit").click();
		WebElement name = driver.findElementById("viewLead_companyName_sp");
		System.out.println(name.getText());
		driver.
		if (.contains(duplicateName)) {
			System.out.println("verification successfull");
		} else {
			System.out.println("verification failed");
		}
		driver.close();

	}
}
