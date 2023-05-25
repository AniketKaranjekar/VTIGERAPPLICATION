package mock;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class VtigerLead {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.edge.driver","C:\\Users\\mansi computer\\Downloads\\edgedriver_win64\\edgedriver\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demo.vtiger.com/vtigercrm/index.php");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//button[text()='Sign in']")).click();
		driver.findElement(By.id("appnavigator")).click();
		WebElement ele = driver.findElement(By.xpath("//span[text()=' MARKETING']"));
		Actions action = new Actions(driver);
		action.moveToElement(ele).perform();
		driver.findElement(By.xpath("//a[@title='Leads']")).click();
		driver.findElement(By.id("Leads_listView_basicAction_LBL_ADD_RECORD")).click();
		driver.findElement(By.xpath("//span[text()='None']")).click();
        driver.findElement(By.xpath("(//div[text()='Mr.'])[1]")).click();
		driver.findElement(By.name("firstname")).sendKeys("Aniket");
		driver.findElement(By.name("lastname")).sendKeys("Karanjekar");
		driver.findElement(By.name("phone")).sendKeys("987654326");
		driver.findElement(By.name("company")).sendKeys("abc123");
		driver.findElement(By.name("mobile")).sendKeys("abc123");
		driver.findElement(By.name("mobile")).sendKeys("8765490876");
		driver.findElement(By.name("designation")).sendKeys("tester");
		driver.findElement(By.name("fax")).sendKeys("as@12ew");
		driver.findElement(By.id("s2id_autogen3")).click();
		driver.findElement(By.xpath("(//div[text()='Cold Call'])[1]")).click();
		driver.findElement(By.name("email")).sendKeys("asa@gmail.com");
		driver.findElement(By.id("s2id_autogen5")).click();
		driver.findElement(By.xpath("(//div[text()='Banking'])[1]")).click();
		driver.findElement(By.name("website")).sendKeys("acti123.com");
		driver.findElement(By.name("annualrevenue")).sendKeys("1234");
		driver.findElement(By.id("select2-chosen-8")).click();
		driver.findElement(By.xpath("(//div[text()='Contact in Future'])[1]")).click();
		driver.findElement(By.name("noofemployees")).sendKeys("1000");
		JavascriptExecutor js=(JavascriptExecutor)driver;
        js.executeScript("window.scrollBy(0,400)");
		driver.findElement(By.xpath("(//a[@class='select2-choice'])[5]")).click();
		driver.findElement(By.xpath("(//div[text()='Active'])[1]")).click();
	    driver.findElement(By.id("Leads_editView_fieldName_emailoptout")).click();
        driver.findElement(By.name("secondaryemail")).sendKeys("qwe@gmail.com");
		driver.findElement(By.name("lane")).sendKeys("pune");
		driver.findElement(By.name("pobox")).sendKeys("qwddde");
		driver.findElement(By.name("code")).sendKeys("441614");
		driver.findElement(By.name("city")).sendKeys("pune");
		driver.findElement(By.name("country")).sendKeys("india");
		driver.findElement(By.name("state")).sendKeys("MH");
		driver.findElement(By.name("description")).sendKeys("MHdjdjsjsjjsjs");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		driver.findElement(By.xpath("//span[@title='Atlas Jeniffer(admin)']")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("menubar_item_right_LBL_SIGN_OUT")).click();
	}
}
