import java.util.Date;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
public class EcommerceMobiles extends BaseClass{
         @BeforeClass
         public static void beforeclass() {
         launchBrowser("Chrome");
         implicitWait(0);
         System.out.println("Before Class");
         }
         @AfterClass
         public static void afterclass() {
//         driver.quit();
         System.out.println("After Class");
         }
         @BeforeMethod
         public void beforemethod() {
         Date d = new Date();
         System.out.println("Start Test...."+d);
         }
         @AfterMethod
         public void aftermethod() {    
         Date d = new Date();
         System.out.println("End Test...."+d);
         }
         @Test
         public static void test1() {
         launchUrl("https://www.amazon.in/");
         LoginEcommerce l = new LoginEcommerce();
         l.fillTextBox(l.searchbox(), "dell laptop");
         btnclick(l.searchbuttn());
         List<WebElement> laptop = driver.findElements(By.xpath("//span[@class='a-price']"));
         WebElement e;
         for (int i = 0; i <laptop.size(); i++) {
			e = laptop.get(i);
			System.out.println(e.getText());
		}          }

}
