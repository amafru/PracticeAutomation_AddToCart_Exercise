package StepDefinitions;

import java.net.MalformedURLException;
import java.util.ArrayList;
import java.util.Collections;

import Context.Hooks;
import Pages.DressesPage;
import Pages.HomePage;
import io.cucumber.java.After;
import io.cucumber.java.en.*;


public class DressShoppingSteps {
	
	Hooks hooksObj;
	DressesPage dressesPageObj;
	HomePage homePageObj;
	{
		hooksObj = new Hooks();
		dressesPageObj = new DressesPage();
		homePageObj = new HomePage();
	}
	

	@Given("that a user visits the web site")
	public void that_a_user_visits_the_web_site() throws MalformedURLException {
	      
		hooksObj.GoToBaseUrl();
	}

	@And("they click on the Dresses tab")
	public void they_click_on_the_dresses_tab() {
	    
		hooksObj.ClickButton(homePageObj.dressesButton);
	}

	@When("the user selects the highest priced dress presented")
	public void the_user_selects_the_highest_priced_dress_presented() {
		
	Float dressOnePrice = hooksObj.ExtractPrice(dressesPageObj.dressOneDetails);
	Float dressTwoPrice = hooksObj.ExtractPrice(dressesPageObj.dressTwoDetails);
	Float dressThreePrice = hooksObj.ExtractPrice(dressesPageObj.dressThreeDetails);
	Float dressFourPrice = hooksObj.ExtractPrice(dressesPageObj.dressFourDetails);
	Float dressFivePrice = hooksObj.ExtractPrice(dressesPageObj.dressFiveDetails);
	
	//Returns a value for current displayed number of items on Dresses page (tech debt: refactor for reuse on other pages later)
	hooksObj.DressesPageItemsCount();
	
	ArrayList<Float> pricesCollection = new ArrayList<Float>();
	pricesCollection.add(dressOnePrice);
	pricesCollection.add(dressTwoPrice);
	pricesCollection.add(dressThreePrice);
	pricesCollection.add(dressFourPrice);
	pricesCollection.add(dressFivePrice);
	
	Float highestPriceItem = Collections.max(pricesCollection);
	
	
	if(highestPriceItem == dressOnePrice) {
		
		hooksObj.ClickButton(dressesPageObj.dressOneProductThumb);
		hooksObj.ClickButton(dressesPageObj.dressOneAddToCartFromProductPage);
	}
	else if(highestPriceItem == dressTwoPrice) {
		
		hooksObj.ClickButton(dressesPageObj.dressTwoProductThumb);
		hooksObj.ClickButton(dressesPageObj.dressTwoAddToCartFromProductPage);
	}
	else if(highestPriceItem == dressThreePrice) {
		
		hooksObj.ClickButton(dressesPageObj.dressThreeAddToCart);
	}
	else if(highestPriceItem == dressFourPrice) {
		
		hooksObj.ClickButton(dressesPageObj.dressFourAddToCart);
	}
	else if(highestPriceItem == dressFivePrice) {
		
		hooksObj.ClickButton(dressesPageObj.dressFiveAddToCart);
	}
	else {
		System.out.println("No items on the page match the identified highest price");
	}

}

	@Then("they should be able to add that to their shopping basket")
	public void they_should_be_able_to_add_that_to_their_shopping_basket() {
		
		try {
		hooksObj.AssertString(dressesPageObj.BasketTitleText, "1 item.");
		}
		catch (AssertionError e) {
	         System.out.println(e.getMessage());
	    }
	}
		
		@After
		public void afterScenario() {
			
			hooksObj.CloseBrowser();		
		}
	    
	}
