package shoppingcart;

import java.util.*;
// Creating class ShoppingCart
public class ShoppingCart
{
    private HashMap<String, Double> productPrices;
    private LinkedHashMap<String, Integer> orderedItems;
    private TreeMap<Double, String> sortedByPrice;

    // Constructor of the class
    public ShoppingCart()
    {
        productPrices = new HashMap<>();
        orderedItems = new LinkedHashMap<>();
        sortedByPrice = new TreeMap<>();
    }
    // Adding product to cart
    public void addProduct(String product, double price, int quantity)
    {
        productPrices.put(product, price);
        orderedItems.put(product, quantity);
        sortedByPrice.put(price, product);
    }
    // Displaying the result
    public void displayCart()
    {
        System.out.println("Cart Items (Order Added) " + orderedItems);
        System.out.println("Products Sorted by Price " + sortedByPrice);
    }
}