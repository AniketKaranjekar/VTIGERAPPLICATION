package mock;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class VtigerOrganization
{
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.edge.driver","C:\\Users\\mansi computer\\Downloads\\edgedriver_win64\\edgedriver\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
		driver.get("https://demo.vtiger.com/vtigercrm/index.php");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//button[text()='Sign in']")).click();
		driver.findElement(By.id("appnavigator")).click();
		WebElement ele = driver.findElement(By.xpath("//span[text()=' MARKETING']"));
		Actions action = new Actions(driver);
		action.moveToElement(ele).perform();
		driver.findElement(By.xpath("//a[@title='Organizations']")).click();
		driver.findElement(By.id("Accounts_listView_basicAction_LBL_ADD_RECORD")).click();
		driver.findElement(By.name("accountname")).sendKeys("Qspider");
		driver.findElement(By.name("website")).sendKeys("www.qsi.com");
		driver.findElement(By.name("phone")).sendKeys("987654326");
		driver.findElement(By.name("tickersymbol")).sendKeys("qw23s22");
		driver.findElement(By.name("fax")).sendKeys("sellli");
		driver.findElement(By.id("Accounts_editView_fieldName_account_id_select")).click();
		driver.findElement(By.xpath("//a[text()='City']")).click();
		driver.findElement(By.name("otherphone")).sendKeys("1234189040");
		driver.findElement(By.name("employees")).sendKeys("00");
		driver.findElement(By.name("email1")).sendKeys("kbc@gmail.com");
		driver.findElement(By.name("email2")).sendKeys("kbc1@gmail.com");
		driver.findElement(By.name("ownership")).sendKeys("ak");
		driver.findElement(By.id("select2-chosen-2")).click();
		driver.findElement(By.xpath("//div[text()='Apparel']")).click();
		driver.findElement(By.id("select2-chosen-4")).click();
		driver.findElement(By.xpath("//div[text()='Acquired']")).click();
		driver.findElement(By.id("select2-chosen-6")).click();
		driver.findElement(By.xpath("//div[text()='Analyst']")).click();
		driver.findElement(By.name("siccode")).sendKeys("98723");
		JavascriptExecutor js=(JavascriptExecutor)driver;
        js.executeScript("window.scrollBy(0,400)");
		driver.findElement(By.id("Accounts_editView_fieldName_emailoptout")).click();
		driver.findElement(By.name("annual_revenue")).sendKeys("500000");
		driver.findElement(By.id("Accounts_editView_fieldName_notify_owner")).click();
		driver.findElement(By.name("bill_street")).sendKeys("a to z");
		driver.findElement(By.name("ship_street")).sendKeys("aassz");
		driver.findElement(By.name("bill_pobox")).sendKeys("QWERTYUI");
		driver.findElement(By.name("ship_pobox")).sendKeys("ABC");
		driver.findElement(By.name("bill_city")).sendKeys("MNOP");
		driver.findElement(By.name("ship_city")).sendKeys("QWE");
		driver.findElement(By.name("bill_state")).sendKeys("AKV");
		driver.findElement(By.name("ship_state")).sendKeys("XZPF");
		driver.findElement(By.name("bill_code")).sendKeys("SPCMT");
		driver.findElement(By.name("ship_code")).sendKeys("SOWNVTG");
		driver.findElement(By.name("bill_country")).sendKeys("QPWUZNAI");
		driver.findElement(By.name("ship_country")).sendKeys("QPWNAI");
		driver.findElement(By.name("description")).sendKeys("QWERTYUIOPLKJHGGDDSAAZXVBMM");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		driver.findElement(By.xpath("//span[@title='Atlas Jeniffer(admin)']")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("menubar_item_right_LBL_SIGN_OUT")).click();
    }

}