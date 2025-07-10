package OrderProcessingSystem.Models.Classes;

//Imports
import OrderProcessingSystem.Models.Interfaces.IOrderBase;

import java.util.*;
import static java.util.UUID.randomUUID;

public class OrderBase implements IOrderBase {
    private UUID OrderId;
    private String CustomerEmail;

    public OrderBase(String CustomerEmail)
    {
        this.OrderId = randomUUID();
        this.CustomerEmail = CustomerEmail;
    }

    @Override
    public UUID getOrderId(){
        return this.OrderId;
    }

    @Override
    public String getCustomerEmail(){
        return this.CustomerEmail;
    }
}
