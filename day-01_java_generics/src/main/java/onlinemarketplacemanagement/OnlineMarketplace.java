package onlinemarketplacemanagement;

// Base class representing a product category
abstract class ProductCategory {
    private final String categoryName;

    public ProductCategory(String categoryName) {
        this.categoryName = categoryName;
    }

    public String getCategoryName() {
        return categoryName;
    }
}

// Specific product categories
class BookCategory extends ProductCategory {
    public BookCategory() {
        super("Books");
    }
}

class ClothingCategory extends ProductCategory {
    public ClothingCategory() {
        super("Clothing");
    }
}

class GadgetCategory extends ProductCategory {
    public GadgetCategory() {
        super("Gadgets");
    }
}

// Generic product class with category-specific restrictions
class MarketplaceProduct<T extends ProductCategory> {
    private final String productName;
    private double productPrice;
    private final T productCategory;

    public MarketplaceProduct(String productName, double productPrice, T productCategory) {
        this.productName = productName;
        this.productPrice = productPrice;
        this.productCategory = productCategory;
    }

    public String getProductName() {
        return productName;
    }

    public double getProductPrice() {
        return productPrice;
    }

    public void applyDiscount(double discountPercentage) {
        this.productPrice -= this.productPrice * (discountPercentage / 100);
    }

    public T getProductCategory() {
        return productCategory;
    }
}

// Utility class to apply discounts to products
class MarketplaceManager {
    public static <T extends MarketplaceProduct<?>> void applyDiscount(T product, double discountPercentage) {
        product.applyDiscount(discountPercentage);
        System.out.println("Discount applied! New price of " + product.getProductName() + ": $" + product.getProductPrice());
    }
}

public class OnlineMarketplace {
    public static void main(String[] args)   {
        // Creating products with specific categories
        MarketplaceProduct<BookCategory> book = new MarketplaceProduct<>("Java Programming", 50.0, new BookCategory());
        MarketplaceProduct<ClothingCategory> shirt = new MarketplaceProduct<>("Formal Shirt", 30.0, new ClothingCategory());
        MarketplaceProduct<GadgetCategory> phone = new MarketplaceProduct<>("Smartphone", 500.0, new GadgetCategory());

        // Apply discounts dynamically
        MarketplaceManager.applyDiscount(book, 10);  // 10% off
        MarketplaceManager.applyDiscount(shirt, 15); // 15% off
        MarketplaceManager.applyDiscount(phone, 5);  // 5% off
    }
}
