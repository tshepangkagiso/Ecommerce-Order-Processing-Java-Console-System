package OrderProcessingSystem.Views.Handlers;

import OrderProcessingSystem.Models.Classes.DigitalProductOrder;
import OrderProcessingSystem.Models.Classes.MembershipOrder;
import OrderProcessingSystem.Models.Classes.PhysicalProductOrder;

import java.util.HashMap;

public class AllProductView
{
    private HashMap<String, HashMap<String, Double>> getAllProducts()
    {
        String adminEmail = "AdminEcommerce@gmail.com";

        DigitalProductOrder adminDigital = new DigitalProductOrder(adminEmail);
        PhysicalProductOrder adminPhysical = new PhysicalProductOrder(adminEmail);
        MembershipOrder adminMembership = new MembershipOrder(adminEmail);

        HashMap<String, HashMap<String, Double>> allProducts = new HashMap<>();
        allProducts.put("Digital", adminDigital.getDigitalProducts());
        allProducts.put("Membership", adminMembership.getMembershipProducts());
        allProducts.put("Physical", adminPhysical.getPhysicalProducts());

        return  allProducts;
    }

    public void displayAllProducts() {
        HashMap<String, HashMap<String, Double>> allProducts = getAllProducts();

        for (String category : allProducts.keySet())
        {
            System.out.println("=== " + category + " Products ===");

            HashMap<String, Double> products = allProducts.get(category);

            for (String productName : products.keySet()) {
                Double price = products.get(productName);
                System.out.println(productName + " - R" + price);
            }
            System.out.println();
        }
    }

}
