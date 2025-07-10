package OrderProcessingSystem.Controllers.Interface;

public interface IOrder<T>
{
    boolean processOrder(T client, String selectedProduct);
}
