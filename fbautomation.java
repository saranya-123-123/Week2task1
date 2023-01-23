package week2task;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class fbautomation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeDriver driver=new ChromeDriver();
		//firefoxDriver driver=new FirefoxDriver
		//EdgeDriver driver=new EdgeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			
		
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		driver.findElement(By.xpath("//input[contains(@name,'first')]")).sendKeys("Saranya");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Karthi");
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("karthikeyansaranya433@gmail.com");
		driver.findElement(By.xpath("//input[@name='reg_email_confirmation__']")).sendKeys("karthikeyansaranya433@gmail.com");
		driver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys("Saranya@123");
		WebElement el1 = driver.findElement(By.name("birthday_day"));
		Select bd=new Select(el1);
		bd.selectByValue("29");
		WebElement el2 = driver.findElement(By.name("birthday_month"));
		Select bm =new Select(el2);
		bm.selectByVisibleText("Dec");
		WebElement el3 = driver.findElement(By.name("birthday_year"));
		Select by =new Select(el3);
		by.selectByVisibleText("1995");
		WebElement el4 = driver.findElement(By.xpath("//label[text()='Female']"));
		boolean selected = el4.isSelected();
		el4.click();
		driver.findElement(By.xpath("//button[@name='websubmit']")).click();
			
		
		
		
	}
		
		
		
		
	}
