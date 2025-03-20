package smartwarehousesystem;

import java.util.ArrayList;
import java.util.List;

// Base class for all warehouse items
abstract class WarehouseItem {
    private final String itemName;

    public WarehouseItem(String itemName) {
        this.itemName = itemName;
    }

    public String getItemName() {
        return itemName;
    }
}

// Different categories of warehouse items
class ElectronicItem extends WarehouseItem {
    public ElectronicItem(String itemName) {
        super(itemName);
    }
}

class GroceryItem extends WarehouseItem {
    public GroceryItem(String itemName) {
        super(itemName);
    }
}

class FurnitureItem extends WarehouseItem {
    public FurnitureItem(String itemName) {
        super(itemName);
    }
}

// Generic storage for warehouse items
class WarehouseStorage<T extends WarehouseItem> {
    private final List<T> storedItems = new ArrayList<>();

    public void addItem(T item) {
        storedItems.add(item);
    }

    public List<T> getStoredItems() {
        return storedItems;
    }
}

// Utility class to display stored items
class WarehouseManager {
    public static void displayStoredItems(List<? extends WarehouseItem> items) {
        for (WarehouseItem item : items) {
            System.out.println("Stored Item: " + item.getItemName());
        }
    }
}

public class SmartWarehouse {
    public static void main(String[] args) {
        WarehouseStorage<ElectronicItem> electronicStorage = new WarehouseStorage<>();
        electronicStorage.addItem(new ElectronicItem("Laptop"));
        electronicStorage.addItem(new ElectronicItem("Smartphone"));

        WarehouseStorage<FurnitureItem> furnitureStorage = new WarehouseStorage<>();
        furnitureStorage.addItem(new FurnitureItem("Chair"));
        furnitureStorage.addItem(new FurnitureItem("Table"));

        WarehouseStorage<GroceryItem> groceryStorage = new WarehouseStorage<>();
        groceryStorage.addItem(new GroceryItem("Rice"));
        groceryStorage.addItem(new GroceryItem("Bread"));

        // Display stored items
        WarehouseManager.displayStoredItems(electronicStorage.getStoredItems());
        WarehouseManager.displayStoredItems(furnitureStorage.getStoredItems());
        WarehouseManager.displayStoredItems(groceryStorage.getStoredItems());
    }
}
