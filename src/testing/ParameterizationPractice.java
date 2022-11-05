package testing;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebElement;

public class ParameterizationPractice 
{
	public static void main(String[] args)  throws EncryptedDocumentException, IOException 
	{
		
//		
//		String path ="C:\\Users\\aksha\\Desktop\\test case for amazon cart.xlsx";
//		FileInputStream source = new FileInputStream(path);
//		String data =WorkbookFactory.create(source).getSheet("Sheet1").getRow(11).getCell(1).getStringCellValue();
//		
//		System.out.println(data);
//		
//	
		String path = "C:\\Users\\aksha\\Desktop\\test case for amazon cart.xlsx";
		
		FileInputStream file = new FileInputStream(path);
		
		Sheet sheet = WorkbookFactory.create(file).getSheet("Sheet1");
		
		try 
		{
		
			for (int a=7; a<sheet.getLastRowNum(); a++)
			{
			for (int b=0; b<=0; b++)
				{
					String value = sheet.getRow(a).getCell(b).getStringCellValue();
				
					System.out.println(value); 
				
				}
			}
		}
		
		finally
		{
			for (int a=8; a<sheet.getLastRowNum(); a++)
			{
				for (int b=0; b<=0; b++)
				{
					double value = sheet.getRow(a).getCell(b).getNumericCellValue();
					
					System.out.println(value); 
				}
			}
			
		}
		
		
		
	}
	

}
