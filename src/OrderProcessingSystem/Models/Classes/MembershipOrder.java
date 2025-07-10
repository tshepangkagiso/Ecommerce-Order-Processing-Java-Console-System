package OrderProcessingSystem.Models.Classes;

import java.util.HashMap;

public class MembershipOrder extends OrderBase
{
    private HashMap<String, Double> MembershipProducts;
    public MembershipOrder(String CustomerEmail)
    {
        super(CustomerEmail);
        this.MembershipProducts =  new HashMap<>();
        MembershipProducts.put("Gym Membership - Monthly", 39.99);
        MembershipProducts.put("Streaming Service - Annual", 99.99);
        MembershipProducts.put("Online Magazine Subscription", 24.99);
        MembershipProducts.put("Gaming Pass - Monthly", 14.99);
        MembershipProducts.put("Cloud Storage Plan", 5.99);
    }

    public HashMap<String, Double> getMembershipProducts() { return  MembershipProducts;}
}
