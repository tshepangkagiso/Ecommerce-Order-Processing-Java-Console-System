package OrderProcessingSystem.Views.Handlers;

import OrderProcessingSystem.Controllers.Handlers.PhysicalProductOrderHandler;
import OrderProcessingSystem.Models.Classes.PhysicalProductOrder;
import OrderProcessingSystem.Views.Interface.IUserInput;

import java.util.Scanner;

public class PhysicalProductOrderView implements IUserInput
{
    @Override
    public void display()
    {
        System.out.println("Physical View: ");
        Scanner input = new Scanner(System.in);

        try
        {
            System.out.print("Please enter your email: ");
            String email = input.nextLine();

            System.out.print("Please enter Physical Product Name: ");
            String product = input.nextLine();

            PhysicalProductOrder order = new PhysicalProductOrder(email);
            PhysicalProductOrderHandler handler = new PhysicalProductOrderHandler();
            var isSuccessful = handler.processOrder(order, product);

            if(isSuccessful)
            {
                System.out.println("Successfully processed the order for: " + email + ", purchased product: " + product) ;
            }
            else
            {
                System.out.println("Failed to process order, incorrect product");
            }

        }
        catch (Exception e)
        {
            System.out.println("Error: " + e.getMessage());
        }

    }
}
