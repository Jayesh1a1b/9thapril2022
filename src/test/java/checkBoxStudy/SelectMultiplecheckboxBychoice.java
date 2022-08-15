package checkBoxStudy;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SelectMultiplecheckboxBychoice {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://itera-qa.azurewebsites.net/home/automation");
List<WebElement> checkboxes = driver.findElements(By.xpath("//input[@type='checkbox' and contains (@id,'day')]"));
System.out.println("Total no of  checkboxes"+checkboxes.size());
for(WebElement chbox:checkboxes)
{
	String checkboxname = chbox.getAttribute("id");
	if(checkboxname.equalsIgnoreCase("monday") || checkboxname.equalsIgnoreCase("friday"))
	{
		chbox.click();
	}		
}
	}

}
