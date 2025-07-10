package OrderProcessingSystem.Views.Handlers;

import java.util.Scanner;

public class HomeView
{
    public void menu()
    {

        try
        {
            Scanner input = new Scanner(System.in);
            AllProductView catalog = new AllProductView();
            DigitalProductOrderView digitalProductOrderView = new DigitalProductOrderView();
            PhysicalProductOrderView physicalProductOrderView = new PhysicalProductOrderView();
            MembershipOrderView membershipOrderView = new MembershipOrderView();

            System.out.printf("Ecommerce Order Processing Java Console System %n %n");
            while (true)
            {
                catalog.displayAllProducts();
                System.out.print("Enter (Membership,Physical,Digital) or Quit To End Program: ");
                String response = input.nextLine().toLowerCase();
                switch (response.toLowerCase())
                {
                    case "membership":
                        System.out.println();
                        membershipOrderView.display();
                        System.out.println();
                        break;
                    case "digital":
                        System.out.println();
                        digitalProductOrderView.display();
                        System.out.println();
                        break;
                    case "physical":
                        System.out.println();
                        physicalProductOrderView.display();
                        System.out.println();
                        break;
                    case "quit":
                        System.out.println("Exiting System...");
                        System.exit(0);
                        break;
                    default:
                        System.out.println("Wrong Input");
                        break;
                }
            }
        }
        catch (Exception e)
        {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
