package checkBoxStudy;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HowToSelectSpecificCheckboxAndAllCheckbox {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://itera-qa.azurewebsites.net/home/automation");
		//1.select specific check box
		//driver.findElement(By.id("monday")).click();//select Monday
	System.out.println("---------------------------------------------------------------------------------");	
		//2.select all the check Box
		List<WebElement> checkboxes = driver.findElements(By.xpath("//input[@type='checkbox' and contains (@id,'day')]"));
		
		System.out.println("Total no of  checkboxes"+checkboxes.size());
		//using for loop
		/*for(int i=0;i<checkboxes.size();i++)
		{
			checkboxes.get(i).click();
		}*/
		System.out.println("---------------------------------------------------------------------------------");	
		//using for each loop
		for(WebElement chBox:checkboxes)
		{
			chBox.click();
			
		}
	}

}
