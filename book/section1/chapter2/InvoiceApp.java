package section1.chapter2;

import java.util.Scanner;

public class InvoiceApp {
    public static void main(String[] args)
    {
        // display a welcome message
        System.out.println("Welcome to the Invoice Total Calculator");
        System.out.println(); // prints a blank line

        // get the input from the user
        Scanner sc = new Scanner(System.in);

        // perform invoice calculations until choice isn't equal to "y" or "Y"
        String choice = "y";
        while (choice.equalsIgnoreCase("y"))
            {
                // get the invoice subtotal from the user
                System.out.print("Enter subtotal: ");
                double subtotal = sc.nextDouble();
        
                // calculate the discount amount and total
                double discountPercent = 0.0;
                if (subtotal >= 200) discountPercent = .2;
                else if (subtotal >= 100) discountPercent = .1;
                else discountPercent = 0.0;

                double discountAmount = subtotal * discountPercent;
                double total = subtotal - discountAmount;
        
                // format and display the result
                String message = "Discount Percent: " + discountPercent + "\n"
                                + "Discount Amount: " + discountAmount + "\n"
                                + "Invoice Total: " + total + "\n";
                System.out.println(message);

                // see if the user wants to continue
                System.out.print("Continue? (y/n): ");
                choice = sc.next();
                while (!choice.equalsIgnoreCase("y") && !choice.equalsIgnoreCase("n"))
                {
                    System.out.print("Invalid Entry. Continue? (y/n): ");
                    choice = sc.next();
                }
                System.out.println();
            }
        sc.close();
    }
}
