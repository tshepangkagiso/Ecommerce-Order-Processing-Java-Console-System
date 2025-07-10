package OrderProcessingSystem.Views.Handlers;

import OrderProcessingSystem.Controllers.Handlers.DigitalProductOrderHandler;
import OrderProcessingSystem.Controllers.Handlers.PhysicalProductOrderHandler;
import OrderProcessingSystem.Models.Classes.DigitalProductOrder;
import OrderProcessingSystem.Models.Classes.PhysicalProductOrder;
import OrderProcessingSystem.Views.Interface.IUserInput;

import java.util.Scanner;

public class DigitalProductOrderView implements IUserInput
{
    @Override
    public void display()
    {
        System.out.println("Digital View: ");
        Scanner input = new Scanner(System.in);

        try
        {
            System.out.print("Please enter your email: ");
            String email = input.nextLine();

            System.out.print("Please enter Physical Product Name: ");
            String product = input.nextLine();

            DigitalProductOrder order = new DigitalProductOrder(email);
            DigitalProductOrderHandler handler = new DigitalProductOrderHandler();
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
