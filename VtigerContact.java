package mock;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.idealized.Javascript;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class VtigerContact
{
	public static void main(String[] args) throws InterruptedException, IOException {
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
		driver.findElement(By.xpath("//a[@title='Contacts']")).click();
		driver.findElement(By.id("Contacts_listView_basicAction_LBL_ADD_RECORD")).click();
		driver.findElement(By.xpath("//span[text()='None']")).click();
        driver.findElement(By.xpath("(//div[text()='Mr.'])[1]")).click();
		driver.findElement(By.name("firstname")).sendKeys("Aniket");
		driver.findElement(By.name("lastname")).sendKeys("Karanjekar");
		driver.findElement(By.name("phone")).sendKeys("987654326");
		driver.findElement(By.name("mobile")).sendKeys("8765490876");
		driver.findElement(By.id("select2-chosen-4")).click();
		driver.findElement(By.xpath("//div[text()='Cold Call']")).click();
		driver.findElement(By.name("homephone")).sendKeys("1234567634");
		driver.findElement(By.name("title")).sendKeys("amkede");
		driver.findElement(By.name("otherphone")).sendKeys("1234189040");
		driver.findElement(By.name("department")).sendKeys("sellli");
		driver.findElement(By.name("fax")).sendKeys("sellli");
		driver.findElement(By.name("email")).sendKeys("kbc@gmail.com");
		driver.findElement(By.name("birthday")).click();
		driver.findElement(By.xpath("(//td[text()='1'])[1]")).click();
		driver.findElement(By.name("assistant")).sendKeys("smith");
		driver.findElement(By.name("assistantphone")).sendKeys("5558670943");
		driver.findElement(By.name("secondaryemail")).sendKeys("xyz@gmail.com");
		JavascriptExecutor js=(JavascriptExecutor)driver;
        js.executeScript("window.scrollBy(0,500)");
		driver.findElement(By.id("Contacts_editView_fieldName_emailoptout")).click();
		driver.findElement(By.id("Contacts_editView_fieldName_donotcall")).click();
		driver.findElement(By.id("Contacts_editView_fieldName_reference")).click();
		driver.findElement(By.id("Contacts_editView_fieldName_notify_owner")).click();
		driver.findElement(By.name("mailingstreet")).sendKeys("a to z");
		driver.findElement(By.name("otherstreet")).sendKeys("QWERTYUI");
		driver.findElement(By.name("mailingpobox")).sendKeys("ABC");
		driver.findElement(By.name("otherpobox")).sendKeys("MNOP");
		driver.findElement(By.name("mailingcity")).sendKeys("QWE");
		driver.findElement(By.name("othercity")).sendKeys("AKV");
		driver.findElement(By.name("mailingstate")).sendKeys("XZPF");
		driver.findElement(By.name("otherstate")).sendKeys("SPCMT");
		driver.findElement(By.name("mailingzip")).sendKeys("SOWNVTG");
		driver.findElement(By.name("otherzip")).sendKeys("XNZAPQOJ");
		driver.findElement(By.name("mailingcountry")).sendKeys("QPWUZNAI");
		driver.findElement(By.name("othercountry")).sendKeys("QPWNAI");
		driver.findElement(By.name("description")).sendKeys("QWERTYUIOPLKJHGGDDSAAZXVBMM");
		
		driver.findElement(By.xpath("//input[@name='imagename[]']")).sendKeys("E:\\mansi computer\\Pictures\\Screenshots\\Screenshot (5).png");
//		driver.findElement(By.name("imagename[]")).click();
//		Thread.sleep(2000);
//	    Runtime.getRuntime().exec("C:\\Users\\mansi computer\\Desktop\\POPFileUploding.exe");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		driver.findElement(By.xpath("//span[@title='Atlas Jeniffer(admin)']")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("menubar_item_right_LBL_SIGN_OUT")).click();
	}
}