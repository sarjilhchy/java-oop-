import java.util.Scanner;

public class TempConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Temperature Converter");
        System.out.println("1. Celsius to Fahrenheit");
        System.out.println("2. Fahrenheit to Celsius");
        System.out.print("Choose option (1 or 2): ");
        int option = sc.nextInt();

        double temp, converted;

        if (option == 1) {
            System.out.print("Enter temperature in Celsius: ");
            temp = sc.nextDouble();
            converted = (temp * 9/5) + 32;
            System.out.println("Temperature in Fahrenheit: " + converted);
        } else if (option == 2) {
            System.out.print("Enter temperature in Fahrenheit: ");
            temp = sc.nextDouble();
            converted = (temp - 32) * 5/9;
            System.out.println("Temperature in Celsius: " + converted);
        } else {
            System.out.println("Invalid option!");
        }

        sc.close();
    }
}
