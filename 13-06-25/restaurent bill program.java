import java.util.Scanner;

public class RestaurantBill {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final double TAX_RATE = 0.08;  // 8% tax

        System.out.println("Welcome to the Restaurant Billing System!");
        System.out.print("Enter the number of items: ");
        int numItems = scanner.nextInt();

        String[] itemNames = new String[numItems];
        int[] quantities = new int[numItems];
        double[] prices = new double[numItems];
        double subtotal = 0;

        // Input item details
        for (int i = 0; i < numItems; i++) {
            System.out.println("\nItem " + (i + 1) + ":");

            System.out.print("Enter item name: ");
            itemNames[i] = scanner.next();

            System.out.print("Enter quantity: ");
            quantities[i] = scanner.nextInt();

            System.out.print("Enter price per unit: ");
            prices[i] = scanner.nextDouble();

            subtotal += quantities[i] * prices[i];
        }

        // Calculate tax and total
        double tax = subtotal * TAX_RATE;
        double total = subtotal + tax;

        // Display bill
        System.out.println("\n=========== BILL ===========");
        System.out.printf("%-15s %-10s %-10s %-10s\n", "Item", "Qty", "Price", "Total");
        for (int i = 0; i < numItems; i++) {
            double itemTotal = quantities[i] * prices[i];
            System.out.printf("%-15s %-10d %-10.2f %-10.2f\n", itemNames[i], quantities[i], prices[i], itemTotal);
        }
        System.out.println("-----------------------------");
        System.out.printf("Subtotal: %.2f\n", subtotal);
        System.out.printf("Tax (8%%): %.2f\n", tax);
        System.out.printf("Total: %.2f\n", total);
        System.out.println("=============================");

        scanner.close();
    }
}