import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BaseClass {
           public LoginPage() {
        	   PageFactory.initElements(driver, this);
           }
           @FindBy(id="username")
           private WebElement usrname;
           
           @FindBy(id="password") 
           private WebElement pass;
           
           @FindBy(xpath="//input[@type='Submit']") 
           private WebElement btlgn;
           
           @FindBy(name="location") 
           private WebElement loc;
           
           @FindBy(name="hotels") 
           private WebElement hotl;
           
           @FindBy(name="room_type") 
           private WebElement romtype;
           
           @FindBy(name="Submit") 
           private WebElement clicksearch;
           
           @FindBy(name="radiobutton_0") 
           private WebElement btnselecthotl;
           
           @FindBy(name="continue") 
           private WebElement btnconti;
           
           @FindBy(name="first_name") 
           private WebElement textnm;
           
           @FindBy(name="last_name") 
           private WebElement ltnme;
           
           @FindBy(name="address") 
           private WebElement billngaddrss;
           
           @FindBy(name="cc_num") 
           private WebElement crcardno;
           
           @FindBy(name="cc_type") 
           private WebElement crcardtyp;
           
           @FindBy(name="cc_exp_month") 
           private WebElement crexpmonth;
           
           @FindBy(name="cc_exp_year") 
           private WebElement crexpyear;
           
           @FindBy(name="cc_cvv") 
           private WebElement crcvv;
           
           @FindBy(name="book_now") 
           private WebElement booknw;
           
           @FindBy(name="order_no") 
           private WebElement ordno;
           
         public WebElement txtuser() {
       		return usrname;
           }
           public WebElement txtpass() {
      		return pass;
           } 
           public WebElement btnclick() {
       		return btlgn;
            }
           public WebElement selectloc() {
        		return loc;
             }
           public WebElement selecthotl() {
         		return hotl;
              }
           public WebElement selectromtype() {
          		return romtype;
               }
           public WebElement btnsearch() {
       		return clicksearch;
            }
           public WebElement btnselehol() {
        		return btnselecthotl;
             }
           public WebElement btncon() {
         		return btnconti;
              }
           public WebElement txtnm() {
          		return textnm;
               }
           public WebElement txtlstnm() {
       		return ltnme;
            }
           public WebElement biladdrs() {
        		return billngaddrss;
             }
           public WebElement crcdnum() {
         		return crcardno;
              }
           
           public WebElement crcdtyp() {
          		return crcardtyp;
               }
           public WebElement crcardexp() {
       		return crexpmonth;
            }
           public WebElement crcdexpyear() {
       		return crexpyear;
            }
           
           public WebElement crcardcv() {
        		return crcvv;
             }
           public WebElement btnbooknw() {
         		return booknw;
              }
           public WebElement prntorderno() {
          		return ordno;
               }
           
//         @CacheLookup
//         @FindBys({@FindBy(id="email"),
//                 @FindBy(xpath="//input[@name='email']")})
//         private List<WebElement> txtUsername;
  //    
//       @FindAll({@FindBy(id="password"),
//      	       @FindBy(xpath="//input[@name='pass']")})
//         private WebElement txtPassword;
//       
//       @FindBy(name="login") 
//      private WebElement btnlogin;
//       
//       public List<WebElement> getTxtUsername(){
//        return txtUsername;
//       }
//       public WebElement getTxtPassword(){
//           return txtPassword;
//          }
//       public WebElement getBtnLogin(){
//           return btnlogin;
//          }
//       public void login(String name,String pass) {
//  		fillTextBox(getTxtUsername().get(0), name);
//  		fillTextBox(getTxtPassword(), pass);
//  		btnclick(getBtnLogin());
  	}
 
           
           
           
           
           
           
           
           
           
           
           
           
           
           
           
           
           
           
           
}
