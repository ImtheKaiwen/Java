public class User implements userFunctions{
    private String username;
    private String email;
    private String password;

    private Cart cart;
    private double budget = 200000;

    User(String username, String email, String password){
        this.username = username;
        this.email = email;
        this.password = password;
    }

    @Override
    public void buy(Cart cart) {
        double total = 0;
        for(var p: cart.products){
            total += p.getCost();
        }
        if(total > budget){
            System.out.println("Budget not enough");
        }
        else{
            for(var p: cart.products){
                p.setStock(p.getStock()-1);
                cart.products.remove(p);
            }
            budget -= total;
            System.out.println("Successfully");
        }
    }

    @Override
    public void addCart(Product product) {
        cart.products.add(product);
        System.out.println("success");
    }

    @Override
    public void removeFromCard(Product product) {
        for (var p: cart.products){
            if(p.equals(product)){
                cart.products.remove(p);
            }
        }
        if(cart.products.contains(product)) System.out.println("Failed");
        else System.out.println("success");
    }

    @Override
    public void deleteCart() {
        for(var p: cart.products){
            cart.products.remove(p);
        }
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Cart getCart() {
        return cart;
    }

    public void setCart(Cart cart) {
        this.cart = cart;
    }
}
