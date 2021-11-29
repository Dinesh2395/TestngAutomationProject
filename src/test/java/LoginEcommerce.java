import java.awt.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;


public class LoginEcommerce extends BaseClass {
             public LoginEcommerce() {
             PageFactory.initElements(driver, this);
             }
	        @FindBy(id="twotabsearchtextbox")
	        private WebElement srcbox;

	        @FindBy(id="nav-search-submit-button")
	        private WebElement searchbtn;
	        	        
//	        @FindBy(xpath="//span[contains(text(),'(Inspiron 3505, D560613WIN9SE)')]|//span[.='Soft Mint Color'][2]")
//	        private WebElement delllp2;
//	        
//	        @FindBy(xpath="//span[contains(text(),'Dell Vostro 3400 14')]|//span[.='Black'][2]")
//	        private WebElement delllp3;
//	        
//	        @FindBy(xpath="//span[contains(text(),'Dell Inspiron 3502')]")
//	        private WebElement delllp4;
//	        
//	        @FindBy(xpath="//span[contains(text(),'2021 Dell New Inspiron 15 3511')]")
//	        private WebElement delllp5;
//	        
//	        @FindBy(xpath="//span[contains(text(),'Dell Vostro 3405 14')]")
//	        private WebElement delllp6;
//	        
//	        @FindBy(xpath="//span[contains(text(),'Dell 14 (2021) Thin & Light i3-1005G1 Laptop')]")
//	        private WebElement delllp7;
//	        
//	        @FindBy(xpath="//span[contains(text(),'Dell Vostro 3401 35.56 cm')]")
//	        private WebElement delllp8;
//	        
//	        @FindBy(xpath="//span[contains(text(),'Dell Vostro 3400 14\" FHD Display Laptop')][1]")
//	        private WebElement delllp9;
//	        
//	        @FindBy(xpath="//span[contains(text(),'Dell Vostro 3401 14\" FHD Anti Glare')][1]")
//	        private WebElement delllp10;
//	        
//	        @FindBy(xpath="//span[contains(text(),'Dell Inspiron 3501 39.62 cm')]")
//	        private WebElement delllp11;
//	        
//	        @FindBy(xpath="//span[contains(text(),'Dell Vostro 3405 AMD Ryzen 5')]")
//	        private WebElement delllp12;
//	        
//	        @FindBy(xpath="//span[contains(text(),'Dell 15 (2021) i5-1135G7 Laptop')]")
//	        private WebElement delllp13;
//	        
//	        @FindBy(xpath="//span[contains(text(),'2021 Newest Dell Inspiron 3511')]")
//	        private WebElement delllp14;
//        
            public WebElement searchbox() {
            return srcbox;
            }
            public WebElement searchbuttn() {
                return searchbtn;
                }
//            public WebElement laptop1() {
//                return delllp1;
//                }
//            public WebElement laptop2() {
//                return delllp2;
//                }
//            public WebElement laptop3() {
//                return delllp3;
//                }
//            public WebElement laptop4() {
//                return delllp4;
//                }
//            public WebElement laptop5() {
//            	return delllp5;
//            }
//            public WebElement laptop6() {
//            	return delllp6;
//            }
//            public WebElement laptop7() {
//            	return delllp7;
//            }
//            public WebElement laptop8() {
//            	return delllp8;
//            }
//            public WebElement laptop9() {
//            	return delllp9;
//            }
//            public WebElement laptop10() {
//            	return delllp10;
//            }
//            public WebElement laptop11() {
//            	return delllp11;
//            }
//
//            public WebElement laptop12() {
//            	return delllp12;
//            }
//
//            public WebElement laptop13() {
//            	return delllp13;
//            }
//
//            public WebElement laptop14() {
//            	return delllp14;
//            }


}
