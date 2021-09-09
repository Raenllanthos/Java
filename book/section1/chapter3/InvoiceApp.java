package book.section1.chapter3;

import java.text.NumberFormat;
import java.util.Scanner;

public class InvoiceApp {
    public static void main(String[] args)
    {
        final double SALES_TAX_PCT = .05;

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
                double totalBeforeTax = subtotal - discountAmount;
                double salesTax = totalBeforeTax * SALES_TAX_PCT;
                double total = totalBeforeTax + salesTax;
        
                // format and display the result
                NumberFormat currency = NumberFormat.getCurrencyInstance();
                NumberFormat percent = NumberFormat.getPercentInstance();
                String message = 
                      "Discount Percent: " + percent.format(discountPercent) + "\n"
                    + "Discount Amount:  " + currency.format(discountAmount) + "\n"
                    + "Total Before Tax: " + currency.format(totalBeforeTax) + "\n"
                    + "Sales Tax:        " + currency.format(salesTax) + "\n"
                    + "Invoice Total:    " + currency.format(total) + "\n";
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
