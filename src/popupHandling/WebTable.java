package popupHandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class WebTable 
{
	public static void main(String[] args) throws InterruptedException 
	{
		
		
		System.setProperty("webdriver.edge.driver", "C:\\Users\\aksha\\Downloads\\edgedriver_win64\\msedgedriver.exe");
		
		WebDriver driver = new EdgeDriver();
		
		driver.navigate().to("https://www.w3schools.com/html/html_tables.asp");
		Thread.sleep(2000);
		
	
		WebElement header2= driver.findElement(By.xpath("//table[@id='customers']//th[1]"));
		
		System.out.println(header2.getText());
		
		WebElement header1= driver.findElement(By.xpath("//table[@id='customers']//th[2]"));
		System.out.println(header1.getText());
		
		WebElement header3= driver.findElement(By.xpath("//table[@id='customers']//th[3]"));
		System.out.println(header3.getText());
		
		
		WebElement tabledata= driver.findElement(By.xpath("//table[@id='customers']//tr[5]//td[2]"));
		System.out.println(tabledata.getText());
		
		
		
		
		
	}

}
