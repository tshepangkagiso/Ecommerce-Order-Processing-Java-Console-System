package OrderProcessingSystem.Controllers.Handlers;
import OrderProcessingSystem.Controllers.Interface.IOrder;
import OrderProcessingSystem.Models.Classes.DigitalProductOrder;

public class DigitalProductOrderHandler implements IOrder<DigitalProductOrder>
{
    @Override
    public boolean processOrder(DigitalProductOrder client, String selectedProduct)
    {
        if (selectedProduct == null || selectedProduct.isEmpty()) return false;
        return client.getDigitalProducts().containsKey(selectedProduct);
    }
}
