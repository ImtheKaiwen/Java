// Main menu logic
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Shop shop = new Shop();
        User user = new User("kerem", "keremkeskin@gmail.com", "123");
        user.setCart(new Cart());

        // Adding sample products
        shop.addProduct(new Electronic("Laptop", 1500.0, 5));
        shop.addProduct(new Electronic("Phone", 800.0, 10));

        Menu menu = new Menu();
        boolean run = true;

        while (run) {
            menu.mainMenu();
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1 -> {
                    System.out.println("--- List of Products ---");
                    for (Product product : shop.products) {
                        System.out.println(product);
                    }
                }
                case 2 -> {
                    System.out.print("Enter product name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter product category: ");
                    String category = scanner.nextLine();
                    System.out.print("Enter product cost: ");
                    double cost = scanner.nextDouble();
                    System.out.print("Enter product stock: ");
                    int stock = scanner.nextInt();
                    scanner.nextLine(); // Consume newline

                    Product product = new Electronic(name, cost, stock);
                    shop.addProduct(product);
                }
                case 3 -> {
                    System.out.print("Enter product name to delete: ");
                    String name = scanner.nextLine();
                    Product productToRemove = null;
                    for (Product product : shop.products) {
                        if (product.getName().equalsIgnoreCase(name)) {
                            productToRemove = product;
                            break;
                        }
                    }
                    if (productToRemove != null) {
                        shop.delete(productToRemove);
                    } else {
                        System.out.println("Product not found.");
                    }
                }
                case 4 -> {
                    System.out.println("--- Cart Items ---");
                    for (Product product : user.getCart().products) {
                        System.out.println(product);
                    }
                }
                case 5 -> {
                    System.out.print("Enter product name to add to cart: ");
                    String name = scanner.nextLine();
                    Product productToAdd = null;
                    for (Product product : shop.products) {
                        if (product.getName().equalsIgnoreCase(name)) {
                            productToAdd = product;
                            break;
                        }
                    }
                    if (productToAdd != null) {
                        user.addCart(productToAdd);
                    } else {
                        System.out.println("Product not found.");
                    }
                }
                case 6 -> {
                    System.out.print("Enter product name to remove from cart: ");
                    String name = scanner.nextLine();
                    Product productToRemoveFromCart = null;
                    for (Product product : user.getCart().products) {
                        if (product.getName().equalsIgnoreCase(name)) {
                            productToRemoveFromCart = product;
                            break;
                        }
                    }
                    if (productToRemoveFromCart != null) {
                        user.removeFromCard(productToRemoveFromCart);
                    } else {
                        System.out.println("Product not found in cart.");
                    }
                }
                case 7 -> {
                    user.deleteCart();
                    System.out.println("Cart cleared.");
                }
                case 8 -> {
                    user.buy(user.getCart());
                }
                case 9 -> {
                    System.out.println("Exiting... Goodbye!");
                    run = false;
                }
                default -> System.out.println("Invalid choice. Please try again.");
            }
        }
        scanner.close();
    }
}
