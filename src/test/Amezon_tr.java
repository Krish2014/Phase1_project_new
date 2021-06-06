package test;





import java.io.File;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import java.util.concurrent.TimeUnit;

//import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class Amezon_tr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/amazon","root","root");
        Statement stmt = con.createStatement();  
        ResultSet rs = stmt.executeQuery("select * from elct"); 
        
       
    WebElement AllCategoryDropdown = driver.findElement(By.xpath("//select[@title ='Search in']"));
	Select category = new Select(AllCategoryDropdown) ;
	
	WebElement searchField = driver.findElement(By.xpath("//input[@name ='field-keywords']"));
	
	
	     
	while(rs.next()) {
        String cat = rs.getNString(1);
        category.selectByVisibleText(cat);
        
        String searchValue = rs.getString(2);
        searchField.sendKeys(searchValue);
       
	   }        
    
	WebElement submitValue = driver.findElement(By.xpath("//input[@type ='submit']"));
    submitValue.click();
	
	List<WebElement> resultList = driver.findElements(By.xpath("//*[@data-component-type='s-search-result']"));
	System.out.println("Total search count : " + resultList.size());

	WebElement resultMsg = driver.findElement(By.xpath("//*[contains(text(), '1-24')]"));
	String assertionMsg = resultMsg.getText();
	String msg = "1-24 of over 60,000 results for";
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
