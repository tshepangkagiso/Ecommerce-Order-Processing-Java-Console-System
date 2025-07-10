package OrderProcessingSystem.Controllers.Handlers;
import OrderProcessingSystem.Controllers.Interface.IOrder;
import OrderProcessingSystem.Models.Classes.OrderBase;
import OrderProcessingSystem.Models.Classes.PhysicalProductOrder;

import java.util.Scanner;

public class PhysicalProductOrderHandler implements IOrder<PhysicalProductOrder>
{
    @Override
    public boolean processOrder(PhysicalProductOrder client, String selectedProduct)
    {
        if (selectedProduct == null || selectedProduct.isEmpty()) return false;
        return client.getPhysicalProducts().containsKey(selectedProduct);
    }

}
