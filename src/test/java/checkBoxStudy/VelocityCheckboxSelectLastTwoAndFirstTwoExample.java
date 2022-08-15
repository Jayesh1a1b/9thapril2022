package checkBoxStudy;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class VelocityCheckboxSelectLastTwoAndFirstTwoExample {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://vctcpune.com/selenium/practice.html#serviceid");
List<WebElement> checkboxes = driver.findElements(By.xpath("//input[@type='checkbox']"));
System.out.println("Total no of checkboxes "+checkboxes.size());
//1.select last two checkboxes
//total no of checkboxes-how many last checkboxes want to select=starting index
//3-2=1;
int TotalNoOfCheckboxes = checkboxes.size();
/*for(int i=checkboxes.size()-2;i<TotalNoOfCheckboxes;i++)
	//1<3 condition true, 
	//after increment 2<3 condition true, 
	//after increment 3<3 condition fail
{
	checkboxes.get(i).click();
}*/
//2.select First two checkboxes
for(int i=0;i<TotalNoOfCheckboxes;i++)
{
	if(i<2)
	{
		checkboxes.get(i).click();
	}
}

	}

}
