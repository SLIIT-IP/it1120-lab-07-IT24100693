import java.util.Scanner;

public class IT24100693Lab7Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int customers = 5;

        for (int i = 1; i <= customers; i++) {
            System.out.print("Enter total bill amount for customer " + i + ": ");
            double billAmount = sc.nextDouble();

            char paymentMode;
            do {
                System.out.print("Enter payment mode (C for Cash, O for Other): ");
                paymentMode = sc.next().charAt(0);
                if (paymentMode != 'C' && paymentMode != 'c' && paymentMode != 'O' && paymentMode != 'o') {
                    System.out.println("Payment Mode is Not Valid");
                }
            } while (paymentMode != 'C' && paymentMode != 'c' && paymentMode != 'O' && paymentMode != 'o');

            if (paymentMode == 'C' || paymentMode == 'c') {
                double discount = billAmount * 0.05;
                billAmount -= discount;
                System.out.println("Discount applied: $" + discount);
            } else {
                System.out.println("No discount applied.");
            }

            System.out.println("Amount to be paid: $" + billAmount);
        }
    }
}
