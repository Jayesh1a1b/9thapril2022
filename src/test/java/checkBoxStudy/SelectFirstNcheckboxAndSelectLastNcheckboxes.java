package checkBoxStudy;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SelectFirstNcheckboxAndSelectLastNcheckboxes {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://itera-qa.azurewebsites.net/home/automation");
List<WebElement> checkboxes = driver.findElements(By.xpath("//input[@type='checkbox' and contains (@id,'day')]"));
System.out.println("Total no of  checkboxes"+checkboxes.size());
//Total no of checkboxes-how many no of checkbox select from last=starting index
//here total no of checkboxes =7,how many checkbox select from last =2
//7-2=5
int totalcheckboxes = checkboxes.size();//0,1,2,3,4,5,6=index start from 0 to 6 when sieze is 7;
/*for(int i=checkboxes.size()-2;i<totalcheckboxes;i++)
	//for(int i=7-2;i<7;i++)=for(int =5;i<7;i++)condition pass
	//for(int i=7-2+1;i<7;i++)=for(int=6;i<7;i++)condition pass
	//for(int i=7-2+1+1;i<7;i++)=for(int=7;i<7;i++)here condition failed because 7<7 condition failed 	                                   
{
	checkboxes.get(i).click();
}*/


//select first 3 checkboxes
for(int i=0;i<totalcheckboxes;i++)
{
	if(i<3)
	checkboxes.get(i).click();
}

	}

}
