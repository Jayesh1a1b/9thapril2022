package dropdownStudy;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropdownHandledWithNoSelectTag {

	public static void main(String[] args) {
ChromeOptions options=new ChromeOptions();
		
options.addArguments("--disable-notifications");

		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver(options);
		driver.get("https://www.hdfcbank.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//Here for inspect use shortcut ctrl+shift+C
		WebElement ProductType = driver.findElement(By.xpath("(//div[@class='dropdown'])[1]"));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		ProductType.click();
		List<WebElement> ProductTypes = driver.findElements(By.xpath("//ul[@class='dropdown1 dropdown-menu']/li"));
		System.out.println("Number of options:"+ProductTypes.size());
		//Approach 1 for print all option
		/*for(WebElement dropoption:ProductTypes)
		{
		System.out.println(dropoption.getText());	
		}*/
		//Approach 2 for print specific option
		for(WebElement dropoption:ProductTypes)
		{
			if(dropoption.getText().equals("Accounts"))
					{
				dropoption.click();
				break;
					}
		
		}
		WebElement product = driver.findElement(By.xpath("//div[@class='drp2']"));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		product.click();
		List<WebElement> drop2option = driver.findElements(By.xpath("//ul[@class='dropdown2 dropdown-menu']/li"));
		System.out.println("Number of option in drop2 :"+drop2option.size());
		//Approach 1 print all option
		for(WebElement option2:drop2option)
		{
			System.out.println(option2.getText());
		}
//Approach 2 print specific option
		for(WebElement option2:drop2option)
		{
			if(option2.getText().equals("Rural Accounts"))
			{
				option2.click();
			}
		}
		
	}

}
