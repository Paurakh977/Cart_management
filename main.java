import models.Cart;
import models.Order;

public class main {
    public static void main(String[] args) {
        Cart cart_1=new Cart(1,"Gucci",new int []{1000,200,1200}, new String[] {"Coat","Shoes","Shirt"});
        Order order_1=new Order(cart_1);
        order_1.display_total();
    }
}
