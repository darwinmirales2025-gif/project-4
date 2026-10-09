import java.util.Scanner;

public class Weather1 {
    public static void main(String[] args) {
        int[] temperatures = {45, 44, 39, 48, 37, 46, 53};
        int sum = 0;
        
        // Calculate sum of temperatures
        for (int temp : temperatures) {
            sum += temp;
        }
        
        // Calculate average temperature
        double average = (double) sum / temperatures.length;
        
        // Count days above average
        int aboveAverageDays = 0;
        for (int temp : temperatures) {
            if (temp > average) {
                aboveAverageDays++;
            }
        }
        
        // Print results
        System.out.println("Average temperature: " + average);
        System.out.println(aboveAverageDays + " days were above average.");
    }
}