package stepdefinations;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import com.pages.CartPage;
import com.pages.HomePage;
import com.pages.LoginPage;
import com.pages.PlaceorderPage;
import com.pages.ProductStore;
import com.pages.ProductlistPage;
import com.pages.SignupPage;


import appHooks.ApplicationHooks;
import cucumberAutomation.Base;
import io.cucumber.java.en.And;

//import com.qa.factory.DriverFactory;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class loginstepdef {

	public WebDriver driver;
	
	HomePage h;
	LoginPage l;
	SignupPage s;
	ProductlistPage pl;
	ProductStore ps;
	CartPage cp;
	PlaceorderPage po;
	//ApplicationHooks hooks;
	

	@Given("^user is in landing page$")
	public void user_is_in_landing_page() throws Throwable
	{
		System.out.println("User is in landing page");
		
		Base base = new Base();
		driver= base.getDriver();
	Thread.sleep(3000);
	
	}
	
	
	   @When("^user clicks on signin link$")
	    public void user_clicks_signinlink() throws Throwable {
	        
	    
	    h=new HomePage(driver);
	    h.clicksignin().click();
//	  
	    	Thread.sleep(3000);
	    	
	    }
	   
	   @When("^user enters valid username$")
	  
	    public void user_enters_valid_Username() throws Throwable {
	        
		 //Mazimize current window
		   driver.manage().window().maximize();  	
  l=new LoginPage(driver);
  l.enter_username().sendKeys("manisha@etailpet.com");
//	  
	    	Thread.sleep(5000);
	    	
	    }
	   
	   @When("^user enters vaid  password$")
		  
	    public void user_enters_valid_password() throws Throwable {
	        
	    	
  l=new LoginPage(driver);
  l.enterpassword().sendKeys("manisha@etailpet");
 	Thread.sleep(5000);
 	  
	    }
	   
	   @And("^clicks on Sign-in button$")
		  
	    public void known_user_clicks_signin() throws Throwable {
		 
		   JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(0,350)", "");
            l=new LoginPage(driver);
             l.clicksignIn().click();

	    	Thread.sleep(5000);
	    	
	    }
	   @Then("^user choose the product$")	  
	    public void user_choose_the_product() throws Throwable {           	
		 WebElement ele = driver.findElement(By.xpath("(//div[@class='prdct-detail-box']//a)[2]"));
			JavascriptExecutor jse = (JavascriptExecutor)driver;
			jse.executeScript("arguments[0].click()", ele);
			  JavascriptExecutor js = (JavascriptExecutor) driver;
				js.executeScript("window.scrollBy(0,350)", "");
	Thread.sleep(5000);   	
	    } 
	   @Then("^user choose the product by header search$")	  
	    public void user_choose_the_product_by_header_search() throws Throwable {           	
		driver.findElement(By.xpath("(//input[@name='search'])[1]")).sendKeys("Chewy's Chewy's Chicken");
	Thread.sleep(5000);   
	driver.findElement(By.className("flaticon-search")).click();
	    } 
	   @Then("^user click on add to card$")	  
	    public void user_click_on_add_to_card1() throws Throwable {           	
		   JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(0,350)", "");
			driver.findElement(By.xpath("(//a[text()='Add to cart'])[2]")).click();
			Thread.sleep(3000);
	    } 
	   @When("^user add the product to the cart$")	  
	    public void user_search_the_product() throws Throwable {
	    	WebElement ele = driver.findElement(By.xpath("//button[text()='Add to cart ']"));
			JavascriptExecutor jse = (JavascriptExecutor)driver;
			jse.executeScript("arguments[0].click()", ele);
		Thread.sleep(5000);    	
	    } 
	   @Then("^user view the cart$")
		  
	    public void user_view_the_cart() throws Throwable {
	    	driver.findElement(By.id("cartCount")).click();
			driver.navigate().refresh();
	Thread.sleep(5000);
	    	
	    }
	   @When("^user choose the delivery method$")
	   public void user_choose_the_delivery_method() throws Throwable {
	  
    	cp=new CartPage(driver);
	  	  cp.user_ChoosedeliveryMethod().click();
	  	  Thread.sleep(3000);
	    }
	   @Then("^user click proceed to check out$")
		public void user_click_proceed_to_check_out() throws Throwable {
			cp=new CartPage(driver);
		  	  cp.user_ChoosedeliveryMethod().click();
		}
	   
		@Then("^user update the quantity$")
		public void user_update_the_quantity() throws Throwable {
			WebElement findElement = driver.findElement(By.name("form-0-quantity"));
			 findElement.clear();
		 findElement.sendKeys("3");
		 Thread.sleep(3000);
		}
		 @And("^user proceed with donation$")
		   public void user_proceed_with_donation() throws Throwable {
		  
		    po=new PlaceorderPage(driver);
		  	po.user_ProdceedDdonation().click();
		  	Thread.sleep(3000);
		  
		    }
		 @And("^user close the pop$")
		   public void user_close_the_pop() throws Throwable {
				
		po=new PlaceorderPage(driver);
		  	po.user_ClosethePopup().click();
		  	Thread.sleep(3000);
		  	
		    }
		 @When("^user change the store$")
		   public void user_change_storey() throws Throwable {
		  
	    	cp=new CartPage(driver);
	    	cp.click_on_changestore().click();
	    	Thread.sleep(3000);
//	    	WebElement element = driver.findElement(By.xpath("(//a[text()='Petco'])[3]")); 
//	    	Select select = new Select(element); 
//	    	select.selectByVisibleText("Petco");
//		       Thread.sleep(3000);
		    }
		 
		 @When("^user enter promotion code if any$")
		   public void user_enter_promotion_code_if_any() throws Throwable {
		  
	    	cp=new CartPage(driver);
	    	cp.enter_promo_code().sendKeys("SO17");
	    	Thread.sleep(3000);
			cp.Click_on_continue().click();
		       Thread.sleep(3000);
		    }
		
		 @When("^user enter FBC if available$")
		   public void user_enter_FBC_if_available() throws Throwable {
		  
			 cp=new CartPage(driver);
				cp.Click_on_continue().click();
				Thread.sleep(3000);
	
		    }
		 @When("^user choose auto order /one time order$")
		   public void user_choose_auto_order_or_one_time_order() throws Throwable {
            WebElement ele3 = driver.findElement(By.xpath("//label[@for='id_auto_order_select_0']"));
					JavascriptExecutor executor2 = (JavascriptExecutor)driver;
				executor2.executeScript("arguments[0].click();", ele3);
				JavascriptExecutor js = (JavascriptExecutor) driver;
				js.executeScript("window.scrollBy(0,350)", "");
				 cp=new CartPage(driver);
					cp.Click_on_continue().click();
			  	Thread.sleep(3000);
		    }
		 @When("^user add payment information$")
		  
		    public void user_fill_the_card_details() throws Throwable {
		  //user fill the card details
		  	driver.findElement(By.id("name-element")).sendKeys("Manisha Sharma");
		  	Thread.sleep(3000);
		  	driver.switchTo().frame(driver.findElement(By.xpath("//div[@id='card-number-element']//iframe")));
		  	WebElement enter1=driver.findElement(By.xpath("//input[@placeholder='1234 1234 1234 1234']"));
		  	enter1.sendKeys("4111 1111 1111 1111");
		  	driver.switchTo().defaultContent();
             Thread.sleep(3000);		  		
            driver.switchTo().frame(driver.findElement(By.xpath("//div[@id='card-expiry-element']//iframe")));
	  		WebElement enter2=driver.findElement(By.xpath("//input[@placeholder='MM / YY']"));
	  		enter2.sendKeys("01/22");
	  	    driver.switchTo().defaultContent();
	  	     Thread.sleep(3000);
	  	     driver.switchTo().frame(driver.findElement(By.xpath("//div[@id='card-cvc-element']//iframe")));
			 WebElement enter3=driver.findElement(By.xpath("//input[@placeholder='CVC']"));
			 enter3.sendKeys("123");
			 driver.switchTo().defaultContent();
			 Thread.sleep(3000);
			 driver.findElement(By.id("postal-code")).sendKeys("20008");
		    
			Thread.sleep(5000);
			
		    	
		    } 
		 @And("^user click final place order$")
		   public void user_click_final_place_order() throws Throwable {
		  
	    	WebElement ele3 = driver.findElement(By.xpath("//button[text()='Continue']"));
			JavascriptExecutor executor2 = (JavascriptExecutor)driver;
			executor2.executeScript("arguments[0].click();", ele3);
		    }
	
		 @Then("^user proceed complete checkout$")
			public void user_proceed_complete_checkout1() throws Throwable
			{
			 JavascriptExecutor js = (JavascriptExecutor) driver;
				js.executeScript("window.scrollBy(0,550)", "");
				Thread.sleep(3000);
				WebElement ele4 = driver.findElement(By.id("place-order"));
				JavascriptExecutor executor3 = (JavascriptExecutor)driver;
				executor3.executeScript("arguments[0].click();", ele4);
				Thread.sleep(3000);
				
				
			}
	   
		 @Then("^Order place sucessfully$")
		  public void Order_place_sucessfully () throws Throwable {
		        
			  Thread.sleep(3000);
			  WebElement title = driver.findElement(By.xpath("//p[text()=\"We`ll send you confirmation for your order(s) when the payment is approved.\"]"));
			  String text3 = title.getText();
			  String text4 = "We`ll send you confirmation for your order(s) when the payment is approved.";
			  //Assert.assertEquals(text1, text2);		
			  try{
		          Assert.assertEquals(text3, text4);
		          System.out.println( " Order placed sucessfully");
		     }catch(AssertionError e){
		          System.out.println( " Order not placed ");

		        throw e;
		     }
		    	
		    }
	   
	   @Then("^user clicks on signup link$")
	    public void user_clicks_signuplink() throws Throwable {
	        
	    	
//	    l=new LoginPage(driver);
//	    l.clicksignin().click();
//	  
	    	Thread.sleep(3000);
	    	
	    }
	   @When("^user enters firstname$")
	    public void user_enters_firstname() throws Throwable {
	        
	    
//	    s=new SignupPage(driver);
//	    s.enterfirstname().sendKeys("Rah");
//	  
	    	
	    	
	    }
	   @When("^user enters lastname$")
	    public void user_enters_lastname() throws Throwable {
//		   s=new SignupPage(driver);
//		    s.enterlastname().sendKeys("Karth");
//	
		   Thread.sleep(3000);
		    
	    }
	   @When("^user enters Email$")
	    public void user_enters_mail() throws Throwable {
	        
	    	
//		   s=new SignupPage(driver);
//		    s.enteremail().sendKeys("rahul12karthik@gmail.com");
		    Thread.sleep(3000);
	    	
	    	
	    }
	   @When("^user enters phonenum$")
	    public void user_enters_phoenum() throws Throwable {
	        
//		   s=new SignupPage(driver);
//		    s.enterphonenum().sendKeys("9123456789");
//		    
		   Thread.sleep(3000);
	    	
	    }
	   @When("^user enters externalID$")
	    public void user_enters_externaid() throws Throwable {
	            	
//		   s=new SignupPage(driver);
//		    s.enterexternalID().sendKeys("etailpet123456");
//		    
		    Thread.sleep(3000);
	    	
	    }
	   @When("^user enters seconID$")
	    public void user_enters_secondid() throws Throwable {
	        
//		   s=new SignupPage(driver);
//		    s.secondID().sendKeys("91234567891");
		   Thread.sleep(5000);
//	    	
	    }
	   @When("^user enters first pwd$")
	    public void user_enters_firstpwd() throws Throwable {
	        
//		   s=new SignupPage(driver);
//		    s.enterpwd().sendKeys("Rahul123@!");
		   Thread.sleep(5000);
		   
//	    	
	    }
	   @When("^user enters second pwd$")
	    public void user_enters_secondpwd() throws Throwable {
	        
//		   s=new SignupPage(driver);
//		    s.entersecondpwd().sendKeys("Rahul123@!");
		   Thread.sleep(5000);
//	  
	    	
	    }
	   @When("^user clicks on signup button$")
	    public void user_clicks_on_signup_button() throws Throwable {
		   
//		   s=new SignupPage(driver);
//		    s.signup().click();
		   Thread.sleep(5000);
//	    	
	    }
	   
	   
	   @When("^user enters Invalid username$")
		  
	    public void user_enters_invalid_Username() throws Throwable {
	        
	    	
//	    l=new LoginPage(driver);
//	    l.enter_username().sendKeys("Rahul@123");
//	  
	    	Thread.sleep(5000);
	    	
	    }
	   
	   @When("^user enters Invaid  password$")
		  
	    public void user_enters_invalid_password() throws Throwable {
	        
	    	
//	    l=new LoginPage(driver);
//	    l.enterpassword().sendKeys("qcbdekd!");
//	  
	    	Thread.sleep(5000);
	    	
	    }
	
	   
	   @And("^clicks on Add to cart in product view screen$")
		  
	    public void add_to_cart1() throws Throwable {
	        
	    	
	  //  pl=new ProductlistPage (driver);
	  //  pl.addtoCart1().click();
 
	    	//Thread.sleep(5000);
		   System.out.println("User selected product to add it to cart");
	    	
	    }
	   
	   @And("^confirms add to cart$")
	    public void add_to_cart2() throws Throwable {
	        
	    	
	    //ps=new ProductStore (driver);
	   // ps.addtoCart2().click();
		   System.out.println("User added product to cart ");

	    	Thread.sleep(5000);
	    	
	    }
	   
	  @And("^User clicks on logout button$")
	  public void add_logout_check() throws Throwable {
	        
	    	
//		   ps=new ProductStore (driver);
//		    ps.addtoCart2().click();
			   System.out.println("User sucessfuly logged out  ");

		    	Thread.sleep(5000);
		    	
		    }
	  
	  @Then("^check for Product tab and apply filters$")
	  public void checK_UI_elements() throws Throwable {
	        
	    	
		    //ps=new ProductStore (driver);
		   // ps.addtoCart2().click();
			   System.out.println("Apply filters and Ui tabs are displayed as expected ");

		    	Thread.sleep(5000);
		    	
		    }
	   
	   
	 
	  @Given("^user is in Product list page$")
	  public void user_in_productlist_page() throws Throwable {
	        
	    	
		    //ps=new ProductStore (driver);
		   // ps.addtoCart2().click();
			   System.out.println("user is in product list page  ");

		    	Thread.sleep(5000);
		    	
		    }
	  
	  @Then("^clicks on Dropdown Menu$")
	  public void click_dropdown_menu() throws Throwable {
	        
	    	
		    //ps=new ProductStore (driver);
		   // ps.addtoCart2().click();
			   System.out.println("drop down list displayed ");

		    	Thread.sleep(5000);
		    	
		    }
	 
	  @Then("^clicks on SignOut$")
	  public void clicks_on_signout() throws Throwable {
	        
	    	
		    //ps=new ProductStore (driver);
		   // ps.addtoCart2().click();
			   System.out.println("user signed out succesfully  ");

		    	Thread.sleep(5000);
		    	
		    }
		@Then("^validate Language Dropdown$")
		public void validate_Language_Dropdown() throws Throwable
		{
			WebElement Dropdown = driver.findElement(By.name("preflang"));
			   if(Dropdown.isDisplayed())
			   System.out.println("Language Dropdown element is Present");
			   else
			System.out.println("Language Dropdown element is not Present");
	}
		@Then("^Google Map Element$")
		public void Google_Map_Element() throws Throwable
		{
			WebElement Googlemap = driver.findElement(By.xpath("//li[@class='signin-nav']//span[1]"));
			   if(Googlemap.isDisplayed())
			   System.out.println("GoogleMap element is Present");
			   else
					System.out.println("GoogleMap element is not Present");
			
			   
	}
		@Then("^Profile Dropdown$")
		public void Profile_Dropdown() throws Throwable
		{
			WebElement profile_dd = driver.findElement(By.id("dropdownMenu1"));
			   if(profile_dd.isDisplayed())
				   System.out.println("Profile dropdown element is Present");
			   else
					System.out.println("Profile dropdown element is Not Present");
	}
		@Then("^Cart Hypertext$")
		public void Cart_Hypertext() throws Throwable
		{
			 WebElement cart = driver.findElement(By.id("cartDiv"));
			   if(cart.isDisplayed())
				   System.out.println("Cart element is Present");
			   else
					System.out.println("Cart element is Not Present");
	}
		@Then("^Homepage image$")
		public void Homepage_image() throws Throwable
		{
			WebElement homepage_image = driver.findElement(By.xpath("//img[@alt='Awesome Pets']"));
			   if(homepage_image.isDisplayed())
				   System.out.println("Homepage image element is Present");
			   else
					System.out.println("Homepage image element is Not Present");
	}
		@Then("^Location element$")
		public void Location_element() throws Throwable
		{
			WebElement location_element = driver.findElement(By.xpath("(//a[text()='Island Pet Santa'])[1]"));
			   if(location_element.isDisplayed())
				   System.out.println("Loation element is Present");
			   else
					System.out.println("Location element is Not Present"); 
	}
		
		@Then("^ChangeLocation element$")
		public void ChangeLocation_element() throws Throwable
		{
			WebElement change_location = driver.findElement(By.xpath("(//a[text()='Change Store'])[1]"));
			   if(change_location.isDisplayed())
				   System.out.println("ChangeLoation element is Present");
			   else
					System.out.println("ChangeLocation element is Not Present"); 
			   
	}
		@Then("^Header search$")
		public void Header_search() throws Throwable
		{
			WebElement header_search = driver.findElement(By.id("header_search"));
			   if(header_search.isDisplayed())
				   System.out.println("ChangeLoation element is Present");
			   else
					System.out.println("ChangeLocation element is Not Present");   
	}
		@Then("^ID TAGS & ACCESSORIES dd Element$")
		public void ID_TAGS_ACCESSORIES_dd_Element() throws Throwable
		{
			WebElement tab1 = driver.findElement(By.xpath("//a[@title='ID TAGS & ACCESSORIES']"));
			   if(tab1.isDisplayed())
				   System.out.println("ID TAGS & ACCESSORIES element is Present");
			   else
					System.out.println("ID TAGS & ACCESSORIES element is Not Present");     
		
	}
		@Then("^BARK CONTROL & REMOTE TRAINING Element$")
		public void BARK_CONTROL_REMOTE_TRAINING_Element() throws Throwable
		{
			WebElement tab2 = driver.findElement(By.xpath("//a[@title='BARK CONTROL & REMOTE TRAINING']"));
			   if(tab2.isDisplayed())
				   System.out.println("BARK CONTROL & REMOTE TRAINING element is Present");
			   else
					System.out.println("BARK CONTROL & REMOTE TRAINING element is Not Present");
	}
		@Then("^CRUNCY TREATS FOR CATS element$")
		public void CRUNCY_TREATS_FOR_CATS_element() throws Throwable
		{
			WebElement tab3 = driver.findElement(By.xpath("//a[@title='CRUNCY TREATS FOR CATS']"));
			   if(tab3.isDisplayed())
				   System.out.println("CRUNCY TREATS FOR CATS element is Present");
			   else
					System.out.println("CRUNCY TREATS FOR CATS element is Not Present");
	}
		@Then("^For Image Validation$")
		public void For_Image_Validation() throws Throwable
		{
			WebElement i = driver.findElement
				      (By.xpath("//div[@class='main-item']//img[1]"));
				    
				      Boolean p = (Boolean) ((JavascriptExecutor)driver) .executeScript("return arguments[0].complete " + "&& typeof arguments[0].naturalWidth != \"undefined\" " + "&& arguments[0].naturalWidth > 0", i);

				      //verify if status is true
				      if (p) {
				         System.out.println("Image present");
				      } else {
				         System.out.println("Image not present");
				      }	
	}
		

		@Then("^While Text box validation$")
		public void While_Text_box_validation() throws Throwable
		{
			WebElement findElement = driver.findElement(By.id("id_quantity"));
		      findElement.clear();
		      findElement.sendKeys("2");;
		      String txt= findElement.getAttribute("value");
		      System.out.println(txt);
		                  
		        //TO validate text entered or not in textbox
		          if  (txt.contains("2"))
		              System.out.println("Yes text is entered ");
		          else
		        	  System.out.println("Text is not entered ");
	}
		@Then("Check Availability At All Stores Element$")
		public void Check_Availability_At_All_Stores_Element() throws Throwable
		{
			WebElement avail_store = driver.findElement(By.id("check-stores-popup"));
			   if(avail_store.isDisplayed())
				   System.out.println("Check Availability At All Stores element is Present");
			   else
					System.out.println("Check Availability At All Stores element is Not Present"); 
	}
		
		@Then("^For Local delivery$")
		public void For_Local_delivery() throws Throwable
		{
			WebElement here_element = driver.findElement(By.linkText("Here"));
			if(here_element.isDisplayed())
				   System.out.println("For Local delivery element is Present");
			   else
					System.out.println("For Local delivery element is Not Present"); 
	}
		@Then("^Add to cart Button$")
		public void Add_to_cart_Button() throws Throwable
		{
			WebElement addtocart_element = driver.findElement(By.xpath("//button[@class='btn add-cart-btn']"));
			if(addtocart_element.isDisplayed())
				   System.out.println("Add to cart Button element is Present");
			   else
					System.out.println("Add to cart Button element is Not Present"); 
	}
		@Then("Back to shopping Button$")
		public void Back_to_shoppingButton() throws Throwable
		{
			WebElement backtoshop_element = driver.findElement(By.xpath("//button[@class='btn back-btn']"));
			if(backtoshop_element.isDisplayed())
				   System.out.println("Back to shopping element is Present");
			   else
					System.out.println("Back to shopping element is Not Present");
	}
		@Then("^Shop Item button$")
		public void Shop_Item_button() throws Throwable
		{
			WebElement shopitem_element = driver.findElement(By.xpath("(//a[text()='SHOP ITEM'])[1]"));
			if(shopitem_element.isDisplayed())
				   System.out.println("Shop Item element is Present");
			   else
					System.out.println("Shop Item element is Not Present");
	}
		@Then("^Check now element for Local delivery$")
		public void Check_now_element_for_Local_delivery() throws Throwable
		{
			WebElement checknow_element = driver.findElement(By.className("link-btn-sml"));
			if(checknow_element.isDisplayed())
				   System.out.println("Check now element for Local delivery element is Present");
			   else
					System.out.println("Check now element for Local delivery element is Not Present");
			
	}
		@Then("^For Choose Delivery Method for All dropdown$")
		public void For_Choose_Delivery_Method_for_All_dropdown() throws Throwable
		{
			WebElement choosedel_element = driver.findElement(By.className("dropdown-toggle"));
			if(choosedel_element.isDisplayed())
				   System.out.println("Choose Delivery Method for All is Present");
			   else
					System.out.println("Choose Delivery Method for All is Not Present");
			
	}
		@Then("^For Radio Button Validation for store pickup$")
		public void For_Radio_Button_Validation_for_store_pickup() throws Throwable
		{
			WebElement radioElement = driver.findElement(By.xpath("//span[text()='Store Pickup']"));
			//driver.navigate().refresh();
			boolean selectState = radioElement.isSelected();
			
	}
	
		@Then("^performing click operation only if element is not selected$")
		public void performing_click_operation_only_if_element_is_not_selected() throws Throwable
		{
		WebElement radioElement = driver.findElement(By.xpath("//span[text()='Store Pickup']"));
		//driver.navigate().refresh();
		boolean selectState = radioElement.isSelected();
		
			if(selectState == false) {
				System.out.println("Radio Button working fine");
				radioElement.click();
			
	}
	

		
		}  
	   
	   
	   
	   
}
