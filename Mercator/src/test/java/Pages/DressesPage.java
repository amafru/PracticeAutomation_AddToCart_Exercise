package Pages;

import org.openqa.selenium.By;

public class DressesPage {
	
	public By dressOneDetails = By.cssSelector("#center_column > ul > li.ajax_block_product.col-xs-12.col-sm-6.col-md-4.first-in-line.first-item-of-tablet-line.first-item-of-mobile-line > div > div.right-block > div.content_price > span");
	public By dressTwoDetails = By.cssSelector("#center_column > ul > li:nth-child(2) > div > div.right-block > div.content_price > span");
	public By dressThreeDetails = By.cssSelector("#center_column > ul > li.ajax_block_product.col-xs-12.col-sm-6.col-md-4.last-in-line.first-item-of-tablet-line.last-item-of-mobile-line > div > div.right-block > div.content_price > span.price.product-price");
	public By dressFourDetails = By.cssSelector("#center_column > ul > li.ajax_block_product.col-xs-12.col-sm-6.col-md-4.first-in-line.last-line.last-item-of-tablet-line.first-item-of-mobile-line.last-mobile-line > div > div.right-block > div.content_price > span");
	public By dressFiveDetails = By.cssSelector("#center_column > ul > li.ajax_block_product.col-xs-12.col-sm-6.col-md-4.last-line.first-item-of-tablet-line.last-mobile-line > div > div.right-block > div.content_price > span.price.product-price");
	
	public By dressOneAddToCart = By.cssSelector("#center_column > ul > li.ajax_block_product.col-xs-12.col-sm-6.col-md-4.first-in-line.first-item-of-tablet-line.first-item-of-mobile-line > div > div.right-block > div.button-container > a.button.ajax_add_to_cart_button.btn.btn-default > span");
	public By dressTwoAddToCart = By.cssSelector("#center_column > ul > li:nth-child(2) > div > div.right-block > div.button-container > a.button.ajax_add_to_cart_button.btn.btn-default > span");
	public By dressThreeAddToCart = By.cssSelector("#center_column > ul > li.ajax_block_product.col-xs-12.col-sm-6.col-md-4.last-in-line.first-item-of-tablet-line.last-item-of-mobile-line > div > div.right-block > div.button-container > a.button.ajax_add_to_cart_button.btn.btn-default > span");
	public By dressFourAddToCart = By.cssSelector("#center_column > ul > li.ajax_block_product.col-xs-12.col-sm-6.col-md-4.first-in-line.last-line.last-item-of-tablet-line.first-item-of-mobile-line.last-mobile-line > div > div.right-block > div.button-container > a.button.ajax_add_to_cart_button.btn.btn-default > span");
	public By dressFiveAddToCart = By.cssSelector("#center_column > ul > li.ajax_block_product.col-xs-12.col-sm-6.col-md-4.last-line.first-item-of-tablet-line.last-mobile-line > div > div.right-block > div.button-container > a.button.ajax_add_to_cart_button.btn.btn-default > span");
	
	public By dressOneProductThumb = By.cssSelector("#center_column > ul > li.ajax_block_product.col-xs-12.col-sm-6.col-md-4.first-in-line.first-item-of-tablet-line.first-item-of-mobile-line > div > div.left-block > div > a.product_img_link > img");
	public By dressTwoProductThumb= By.cssSelector("#center_column > ul > li:nth-child(2) > div > div.right-block > h5 > a");
	public By dressThreeProductThumb = By.cssSelector("#center_column > ul > li.ajax_block_product.col-xs-12.col-sm-6.col-md-4.last-in-line.first-item-of-tablet-line.last-item-of-mobile-line > div > div.left-block > div > a.product_img_link > img");
	public By dressFourProductThumb = By.cssSelector("#center_column > ul > li.ajax_block_product.col-xs-12.col-sm-6.col-md-4.first-in-line.last-line.last-item-of-tablet-line.first-item-of-mobile-line.last-mobile-line > div > div.left-block > div > a.product_img_link > img");
	public By dressFiveProductThumb = By.cssSelector("#center_column > ul > li.ajax_block_product.col-xs-12.col-sm-6.col-md-4.last-line.first-item-of-tablet-line.last-mobile-line > div > div.left-block > div > a.product_img_link > img");
	
	public By dressOneAddToCartFromProductPage = By.cssSelector("#add_to_cart > button > span");
	public By dressTwoAddToCartFromProductPage = By.cssSelector("#add_to_cart > button");
	public By dressThreeAddToCartFromProductPage = By.cssSelector("#add_to_cart > button > span");
	public By dressFourAddToCartFromProductPage = By.cssSelector("#add_to_cart > button > span");
	public By dressFiveAddToCartFromProductPage = By.cssSelector("#add_to_cart > button > span");
	
	public By BasketTitleText = By.cssSelector("#layer_cart > div.clearfix > div.layer_cart_cart.col-xs-12.col-md-6 > h2 > span.ajax_cart_product_txt");
}
