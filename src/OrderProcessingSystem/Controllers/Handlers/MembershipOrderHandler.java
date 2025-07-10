package OrderProcessingSystem.Controllers.Handlers;
import OrderProcessingSystem.Controllers.Interface.IOrder;
import OrderProcessingSystem.Models.Classes.MembershipOrder;

public class MembershipOrderHandler implements IOrder<MembershipOrder>
{
    @Override
    public boolean processOrder(MembershipOrder client, String selectedProduct)
    {
        if (selectedProduct == null || selectedProduct.isEmpty()) return false;
        return client.getMembershipProducts().containsKey(selectedProduct);
    }
}