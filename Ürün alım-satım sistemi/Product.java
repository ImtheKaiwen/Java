import jdk.dynalink.beans.StaticClass;

public abstract class Product {
    static int total_products = 0;
    private int stock;
    private String name;
    private String category;
    private double cost;
    private int id;

    Product(String name, String category, double cost, int stock){
        this.name = name;
        this.category = category;
        this.cost = cost;
        this.stock = stock;
        this.id = total_products++;
    }

    public String getCategory() {
        return category;
    }

    public String getName() {
        return name;
    }

    public double getCost() {
        return cost;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    @Override
    public String toString() {
        return String.format("name: %s category: %s cost: %.2f stock: %d",getName(),getCategory(),getCost(),getStock());
    }
}
