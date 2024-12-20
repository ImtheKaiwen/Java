import java.util.LinkedList;

public class Cart {
    LinkedList<Product> products = new LinkedList<>();
    public Cart(Product product){
        products.add(product);
    }
    Cart(){

    }
}
