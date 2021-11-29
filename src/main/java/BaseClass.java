import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public static WebDriver driver;
    
    public static WebDriver launchBrowser(String browsername) {
		switch (browsername) {
		case "Chrome":
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			break;

		default:
			System.err.println("Invalid Browser Name");
			break;
		}
		
		return driver;
	}        
    public static void launchUrl(String url) {			
	   driver.get(url);
	   driver.manage().window().maximize();  
    }
     public static void implicitWait(long sec) {
	  driver.manage().timeouts().implicitlyWait(sec, TimeUnit.SECONDS);	
    }      
    public static void fillTextBox(WebElement element,String value) {
		element.sendKeys(value);
    }        
    public static void btnclick(WebElement e) {
		e.click();
    }
   public static String getcurrentUrl() {
	String url = driver.getCurrentUrl();
	return url;
   }
   public static void quitBrowser() {
	driver.quit();
  }
   public static String getTitle() {
	return driver.getTitle();
}
  public static String getAttribute(WebElement e) {
	return e.getAttribute("value");		
}
   public static void moveToElement(WebElement target) {
	Actions a = new Actions(driver);
	a.moveToElement(target).perform();
}
   public static void dragAnddrop(WebElement source,WebElement target) {
	Actions a = new Actions(driver);
	a.dragAndDrop(source, target).perform();
}
   public static void selectByIndex(WebElement element,int index) {
	Select s = new Select(element);
	s.selectByIndex(index);
}
   public static WebElement findElement(String locatorname,String locvalue) {
	WebElement e= null;
	if (locatorname.equals("id")) {
		e= driver.findElement(By.id(locvalue));
	} else if (locatorname.equals("name")) {
		e= driver.findElement(By.name(locvalue));
	}
	else if (locatorname.equals("xpath")) {
		e= driver.findElement(By.xpath(locvalue));
	}
	return e;
}
   public static void takeScreenShot(String imagename) throws IOException {
   TakesScreenshot tk = (TakesScreenshot) driver;
   File src = tk.getScreenshotAs(OutputType.FILE);
   File des = new File(
		   System.getProperty("user.dir") + "C:\\Users\\Manoj\\eclipse-workspace\\maven_project_1stday\\src\\ScreenShot\\"+ imagename + ".png");
       FileUtils.copyFile(src, des);   
   }
   
   public static void jsSendKeys(WebElement e,String data) {
   JavascriptExecutor js = (JavascriptExecutor) driver;
   js.executeScript("arguments[0].setAttribute('value','"+ data +"')",e);
   
   }
  
     public static String getExcelData(String file,String sheetname,int rowno,int cellno) throws IOException  {
	 File loc = new File(
			 "C:\\Users\\Manoj\\eclipse-workspace\\TestngNewLogin\\src\\Excel\\UserData.xlsx");
		FileInputStream st = new FileInputStream(loc);
		Workbook w=new XSSFWorkbook(st);      
	    Sheet s = w.getSheet(sheetname);
	    Row row = s.getRow(rowno);
	    Cell cell = row.getCell(cellno);
	    int type = cell.getCellType();
	    
	    String value=null;
	    if (type == 1) {
	    	value = cell.getStringCellValue();
	    } else {
	    	if (DateUtil.isCellDateFormatted(cell)) {
	    		value = new SimpleDateFormat("dd-mm-yyyy").format(cell.getDateCellValue());
	     } else {
	    	 value = String.valueOf((long) cell.getNumericCellValue());
	    	 
	     }
	    }
	return value;     
      
 }
    public static String gettext(WebElement t) {
    	return t.getText();
    }


}
     
