package OrderProcessingSystem.Models.Classes;

import java.util.HashMap;

public class PhysicalProductOrder extends OrderBase
{
    private HashMap<String, Double> PhysicalProducts;
    public PhysicalProductOrder(String CustomerEmail)
    {
        super(CustomerEmail);
        this.PhysicalProducts = new HashMap<>();
        PhysicalProducts.put("Wireless Mouse", 25.50);
        PhysicalProducts.put("Bluetooth Headphones", 79.99);
        PhysicalProducts.put("Laptop Stand", 32.00);
        PhysicalProducts.put("Notebook - Hardcover", 6.99);
        PhysicalProducts.put("USB-C Charger", 18.75);
    }
    public HashMap<String, Double> getPhysicalProducts() {return PhysicalProducts;};
}
