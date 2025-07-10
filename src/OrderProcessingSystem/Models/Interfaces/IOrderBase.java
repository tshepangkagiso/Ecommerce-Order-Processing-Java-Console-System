package OrderProcessingSystem.Models.Interfaces;

import java.util.UUID;

public interface IOrderBase
{
    UUID getOrderId();
    String getCustomerEmail();
}
