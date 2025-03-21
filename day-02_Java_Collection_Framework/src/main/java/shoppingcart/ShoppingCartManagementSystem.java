package shoppingcart;
// Creating main class ShoppingCartManagementSystem
public class ShoppingCartManagementSystem
{
    // Main method
    public static void main(String[] args)
    {
        // Creating object of the ShoppingCart class
        ShoppingCart cart = new ShoppingCart();

        // Calling its method
        cart.addProduct("Laptop", 50000.0, 1);
        cart.addProduct("SmartPhone", 15000.0, 2);
        cart.displayCart();
    }
}
