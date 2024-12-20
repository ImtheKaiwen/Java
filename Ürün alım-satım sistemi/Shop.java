import javax.sound.sampled.Port;
import java.util.LinkedList;

public class Shop{
    private User user;
    LinkedList<Product> products = new LinkedList<>();

    public boolean list(String category){
        for (var p : products){
            if(p.getCategory().equals(category)){
                System.out.println(p);
            }
            System.out.println("list success");
            return true;
        }
        System.out.println("failed");
        return false;
    }

    public void addProduct(Product product){
        products.add(product);
        System.out.println("Successfully added");
    }

    public void delete(Product product){
        for(var p: products){
            if(p.equals(product)){
                products.remove(p);
                System.out.println("Succesfully removed");
            }
        }
    }

}
