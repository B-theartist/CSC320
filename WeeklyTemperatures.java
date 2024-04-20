/*
 * 1. Initialize two ArrayLists: daysOfWeek for storing days and temperatures for storing average temperatures.
2. Populate daysOfWeek with days from Monday to Sunday.
3. Use a loop to prompt the user for average temperatures for each day and store these values in the temperatures ArrayList.
4. Prompt the user to enter a day of the week or "week" to display the weekly report.
5. If a specific day is entered:
    a. Find the index of the day in daysOfWeek.
    b. Display the day and the corresponding temperature from temperatures.
6. If "week" is entered:
    a. Display each day along with its temperature.
    b. Calculate the average temperature for the week and display it.

 */


import java.util.ArrayList;
import java.util.Scanner;

public class WeeklyTemperatures {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> daysOfWeek = new ArrayList<>();
        ArrayList<Double> temperatures = new ArrayList<>();
        
        // Populate days of the week
        String[] days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        for (String day : days) {
            daysOfWeek.add(day);
        }

        // Get temperatures for each day
        for (String day : daysOfWeek) {
            System.out.println("Enter the average temperature for " + day + ": ");
            double temp = scanner.nextDouble();
            temperatures.add(temp);
        }

        // Query part
        while (true) {
            System.out.println("Enter a day of the week to get the temperature or 'week' for the weekly report: ");
            String input = scanner.next();
            
            if (input.equalsIgnoreCase("week")) {
                double sum = 0;
                for (int i = 0; i < temperatures.size(); i++) {
                    System.out.println(daysOfWeek.get(i) + ": " + temperatures.get(i) + " degrees");
                    sum += temperatures.get(i);
                }
                double average = sum / temperatures.size();
                System.out.println("Average weekly temperature: " + average + " degrees");
                break;
            } else {
                int index = daysOfWeek.indexOf(input);
                if (index != -1) {
                    System.out.println(input + ": " + temperatures.get(index) + " degrees");
                } else {
                    System.out.println("Invalid day. Please enter a correct day.");
                }
            }
        }
    }
}

