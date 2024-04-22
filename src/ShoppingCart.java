import java.util.LinkedList;

public class ShoppingCart {
  private LinkedList<Produs> shoppingCart;
  
    
  public ShoppingCart(LinkedList<Produs> shoppingCart) {
	this.shoppingCart = shoppingCart;
}


public void addProduct(Produs p) {
	  shoppingCart.add(p);
  }
  public double totalprice() {
	  double sum=0;
	  for(Produs p: shoppingCart)
		  sum += p.getPrice();
	  return sum;
  }
}
