import java.util.Scanner;

/*public class Echo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a first number:");
        int num1 = scanner.nextInt();
        System.out.println("Enter a second number:");
        int num2 = scanner.nextInt();
        System.out.println(num1 + "+" + num2 + "=" + (num1+num2));
        
    }
} */

public class Echo {
    public static void main(String[] args) {
        final double CM_PER_INCH = 2.54;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a length in inches:");
        double inches = scanner.nextDouble();
        double centimeters = inches * CM_PER_INCH;
        System.out.println(inches + " inches is equal to " + centimeters + " centimeters.");
    }
}