import java.util.Scanner;

public class FloatingPointProcessor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        double number;
        double total = 0.0;
        double max = -Double.MAX_VALUE; // Start max at the smallest possible double value
        double min = Double.MAX_VALUE; // Start min at the largest possible double value
        double interest;

        while (count < 5) {
            System.out.print("Enter a floating-point number: ");
            number = scanner.nextDouble();

            total += number;

            if (number > max) {
                max = number;
            }

            if (number < min) {
                min = number;
            }

            count++;
        }

        double average = total / 5;
        interest = total * 0.20;

        System.out.println("Total: " + total);
        System.out.println("Average: " + average);
        System.out.println("Maximum: " + max);
        System.out.println("Minimum: " + min);
        System.out.println("Interest on Total at 20%: " + interest);
    }
}
