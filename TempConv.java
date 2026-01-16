import java.util.Scanner;

public class TempConv {
    public static void main(String[] args) {
        final double F_TO_C = 5.0 / 9.0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a temperature in Fahrenheit:");
        double fahrenheit = scanner.nextDouble();
        double celsius = (fahrenheit - 32) * F_TO_C;
        System.out.println(fahrenheit + " degrees Fahrenheit is equal to " + celsius + " degrees Celsius.");
        double kelvin = celsius + 273.15;
        System.out.println(celsius + " degrees Celsius is equal to " + kelvin + " degrees Kelvin.");
        scanner.close();
    }
}