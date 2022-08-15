package dropdownStudy;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SelectTagDropdownHandled {

	public static void main(String[] args) throws InterruptedException {
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.opencart.com/index.php?route=account/register");
	WebElement dropcountryele = driver.findElement(By.id("input-country"));
	Select select=new Select(dropcountryele);
//	//select by visible text
//	select.selectByVisibleText("Austria");
//	Thread.sleep(1000);
//	select.selectByValue("20");
//	Thread.sleep(1000);
//	select.selectByIndex(17);
//	Thread.sleep(1000);
	//selecting dropdown option without using  method
	
	List<WebElement> alloptions = select.getOptions();
	for(WebElement option:alloptions)
	{
		if(option.getText().equals("Argentina"))
		{
			option.click();
			break;//for comomg out loop
		}
	}
	
	
	
	
	
	
	
	
	
	
	}

}
