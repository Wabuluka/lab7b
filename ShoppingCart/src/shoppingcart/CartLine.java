package shoppingcart;
import products.Product;

public class CartLine {
	int cartLineId;
	Product product;

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public int getCartLineId() {
		return cartLineId;
	}

	public void setCartLineId(int cartLineId) {
		this.cartLineId = cartLineId;
	}

}
