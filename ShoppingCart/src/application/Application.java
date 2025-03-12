package application;
import products.Product;
import shoppingcart.ShoppingCart;


public class Application {

	public static void main(String[] args) {
		ShoppingCart cart = new ShoppingCart();
		Product productOne = new Product("A123", 100.0, "TV");
		cart.action(productOne,"add");
		Product productTwo = new Product("A665", 75.0, "MP3 Player");
		cart.action(productTwo,"add");
		Product productThree = new Product("A665", 75.0, "MP3 Player");
		cart.action(productThree,"add");
		
		cart.action(null,"print");
		
		cart.action(productThree,"remove");
		cart.action(productTwo,"remove");
		
		cart.action(null,"print");

	}

}
