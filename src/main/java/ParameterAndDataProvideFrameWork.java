import java.io.IOException;
import java.util.Date;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



public class ParameterAndDataProvideFrameWork extends BaseClass {
           @BeforeClass
           public static void beforeclass() {
           launchBrowser("Chrome");
           implicitWait(10);
           System.out.println("Before Class");
           }
           @AfterClass
           public static void afterclass() {
//           driver.quit();
           System.out.println("After Class");
           }
           @BeforeMethod
           public void before() {
           Date d = new Date();
           System.out.println("Test starts..."+ d);
           }
           @AfterMethod
           public void after() {
           Date d = new Date();
           System.out.println("Test ends..."+ d);
           }
           @Parameters({"username","password","Location","Hotelname","HotelSuite"})
           @Test
           public static void test1(String user, String pass, String loc,String hotl,String hotlsut) throws IOException {
        	   launchUrl("http://adactinhotelapp.com/");
        	    LoginPage l = new LoginPage(); 
        	     fillTextBox(l.txtuser(), user);
        	     fillTextBox(l.txtpass(), pass);
        	     btnclick(l.btnclick());
        	     fillTextBox(l.selectloc(), loc);
        	     fillTextBox(l.selecthotl(), hotl);
        	 	 fillTextBox(l.selectromtype(), hotlsut);
        	     btnclick(l.btnsearch());
        	  	 btnclick(l.btnselehol());
        	     btnclick(l.btncon());
        	     fillTextBox(l.txtnm(),l.getExcelData("loc", "sheet1", 1, 0));
        	     fillTextBox(l.txtlstnm(),l.getExcelData("loc", "sheet1", 1, 1));
        	  	 fillTextBox(l.biladdrs(),l.getExcelData("loc", "sheet1", 1, 2));
        	  	 fillTextBox(l.crcdnum(),l.getExcelData("loc", "sheet1", 1, 3));
        	     fillTextBox(l.crcdtyp(), "American Express");
        	     fillTextBox(l.crcardexp(), "October");
        	     fillTextBox(l.crcdexpyear(), "2012");
        	     fillTextBox(l.crcardcv(), "867");
        	 	 btnclick(l.btnbooknw());
        	     System.out.println("Order no");
        	     System.out.println(getAttribute(l.prntorderno())); 
           }


}
