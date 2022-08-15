package dropdownStudy;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MultipleDropdownBoxUsingGenericMethodFB {
	
	


	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/r.php?locale=en_GB&display=page");
		Thread.sleep(2000);	
		//aproach1
/*WebElement date = driver.findElement(By.id("day"));
WebElement month = driver.findElement(By.id("month"));
WebElement year = driver.findElement(By.id("year"));

Select s1=new Select(date);
s1.selectByVisibleText("12");
Thread.sleep(2000);
Select s=new Select(month);
s.selectByVisibleText("Jun");
Thread.sleep(2000);
Select s2=new Select(year);
s2.selectByVisibleText("2018");*/
//Aproach2 
		WebElement date = driver.findElement(By.id("day"));
		selectOptionFromDropdown(date,"10");
		WebElement month = driver.findElement(By.id("month"));
		selectOptionFromDropdown(month,"Aug");
		WebElement year = driver.findElement(By.id("year"));
		selectOptionFromDropdown(year,"2015");
			
	}
	public static void selectOptionFromDropdown(WebElement ele,String value)//make static method for calling
	{
		Select s3=new Select(ele);
		List<WebElement> alloptions = s3.getOptions();
		for(WebElement option:alloptions)
		{
			if(option.getText().equals(value))
			{
				option.click();
				break;
			}
		}
		
		
	}
}
