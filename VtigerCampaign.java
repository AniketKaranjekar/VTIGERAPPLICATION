package mock;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class VtigerCampaign 
{
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
		driver.findElement(By.xpath("//a[@title='Campaigns']")).click();
		driver.findElement(By.id("Campaigns_listView_basicAction_LBL_ADD_RECORD")).click();
		driver.findElement(By.name("campaignname")).sendKeys("Qspider");
		driver.findElement(By.id("select2-chosen-4")).click();
		driver.findElement(By.xpath("//div[text()='Planning']")).click();
		driver.findElement(By.id("select2-chosen-6")).click();
		driver.findElement(By.xpath("//div[text()='Conference']")).click();
		driver.findElement(By.name("targetaudience")).sendKeys("10000");
		driver.findElement(By.name("closingdate")).click();
		driver.findElement(By.xpath("(//td[text()='1'])[1]")).click();
		driver.findElement(By.name("sponsor")).sendKeys("qsp");
		driver.findElement(By.name("targetsize")).sendKeys("100");
		driver.findElement(By.name("numsent")).sendKeys("80");
		driver.findElement(By.name("budgetcost")).sendKeys("2000");
		driver.findElement(By.name("actualcost")).sendKeys("3000");
		JavascriptExecutor js=(JavascriptExecutor)driver;
        js.executeScript("window.scrollBy(0,500)");
		driver.findElement(By.id("s2id_autogen7")).click();
		driver.findElement(By.xpath("//div[text()='Excellent']")).click();
		driver.findElement(By.name("expectedrevenue")).sendKeys("50000");
		driver.findElement(By.name("expectedsalescount")).sendKeys("100");
		driver.findElement(By.name("actualsalescount")).sendKeys("50");
		driver.findElement(By.name("expectedresponsecount")).sendKeys("50");
		driver.findElement(By.name("actualresponsecount")).sendKeys("45");
		driver.findElement(By.name("expectedroi")).sendKeys("30000");
		driver.findElement(By.name("actualroi")).sendKeys("400000");
		driver.findElement(By.name("description")).sendKeys("qwertghjhgfdfghjhgfdfghg");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		driver.findElement(By.xpath("//span[@title='Atlas Jeniffer(admin)']")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("menubar_item_right_LBL_SIGN_OUT")).click();
	}

}