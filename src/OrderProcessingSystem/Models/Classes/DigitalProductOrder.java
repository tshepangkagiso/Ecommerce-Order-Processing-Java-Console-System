package OrderProcessingSystem.Models.Classes;

import java.util.*;

public class DigitalProductOrder extends OrderBase
{
    private HashMap<String, Double> DigitalProducts;



    public DigitalProductOrder(String CustomerEmail)
    {
        super(CustomerEmail);

        this.DigitalProducts = new HashMap<>();
        DigitalProducts.put("Ebook - Java Programming", 19.99);
        DigitalProducts.put("Online Course - Data Structures", 49.99);
        DigitalProducts.put("Software License - Antivirus", 29.99);
        DigitalProducts.put("Music Album Download", 9.99);
        DigitalProducts.put("Photo Editing App", 14.99);
    }


    public HashMap<String,Double> getDigitalProducts() {return DigitalProducts;}


}
