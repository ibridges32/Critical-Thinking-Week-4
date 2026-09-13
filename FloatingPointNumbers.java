import java.util.Scanner;

public class FloatingPointNumbers {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double total = 0.0;
        double average;
        double maximum = 0.0;
        double minimum = 0.0;
        double interest;

        int count = 0;

        while (count < 5) {

            System.out.print("Enter floating-point value " + (count + 1) + ": ");
            double number = input.nextDouble();

            // Set the first number as both the maximum and minimum
            if (count == 0) {
                maximum = number;
                minimum = number;
            } else {

                if (number > maximum) {
                    maximum = number;
                }

                if (number < minimum) {
                    minimum = number;
                }
            }

            total = total + number;

            // Increase counter to prevent an endless loop
            count++;
        }

        average = total / 5;
        interest = total * 0.20;

        System.out.println();
        System.out.println("Results:");
        System.out.println("Total: " + total);
        System.out.println("Average: " + average);
        System.out.println("Maximum: " + maximum);
        System.out.println("Minimum: " + minimum);
        System.out.println("Interest on total at 20%: " + interest);

        input.close();
    }
}
