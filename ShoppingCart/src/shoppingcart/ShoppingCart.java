package shoppingcart;
import java.util.ArrayList;


import java.util.Iterator;

import products.Product;

public class ShoppingCart {
	ArrayList<CartLine> cartLineList = new ArrayList<CartLine>();

	public void action(Product product, String action) {
		if (action.equals("add")){
		for (CartLine cartLineItem : cartLineList) {
			if (cartLineItem.getProduct().getProductnumber().equals(product.getProductnumber())) {
				cartLineItem.setCartLineId(cartLineItem.getCartLineId()+1);
				return;
			}
		}
		CartLine cartLine = new CartLine();
		cartLine.setP(product);
		cartLine.setCartLineId(1);
		cartLineList.add(cartLine);
		}
		else{
			if (action.equals("remove")){
			Iterator<CartLine> cartLineIterator = cartLineList.iterator();
			while (cartLineIterator.hasNext()){
				CartLine cartLine = cartLineIterator.next();
				if (cartLine.setCartLineId().getProductnumber().equals(product.getProductnumber())){
					if (cartLine.getCartLineId()>1){
						cartLine.setCartLineId(cartLine.getCartLineId()-1);
					}
					else{
						cartLineIterator.remove();
					}
				}
			}
			}
			else{ //action is print
				System.out.println("Content of the shoppingcart:");
				for (CartLine cartLine : cartLineList) {
					System.out.println(cartLine.getCartLineId() + " "
							+ cartLine.setCartLineId().getProductnumber() + " "
							+ cartLine.setCartLineId().getDescription() + " "
							+ cartLine.setCartLineId().getPrice());
				}
				System.out.println("Total price ="+getTotalPrice());
			}
		}
	}

	
	// get total price
	public double getTotalPrice(){
		double totalPrice = 0.0;
		for (CartLine cartLine : cartLineList) {
			totalPrice=totalPrice+(cartLine.getProduct().getPrice() * cartLine.getCartLineId());
		}
		return totalPrice;
	}
}
