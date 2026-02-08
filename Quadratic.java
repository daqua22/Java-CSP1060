import java.util.Scanner;

public class Quadratic {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter coefficients for ax^2 + bx + c = 0");

        double a = getValidDouble(in, "Enter a: ");
        double b = getValidDouble(in, "Enter b: ");
        double c = getValidDouble(in, "Enter c: ");

        // cnat be 0
        if (a == 0) {
            System.out.println("Error: 'a' cannot be zero in a quadratic equation.");
            return;
        }

        // discriminant
        double discriminant = Math.pow(b, 2) - (4 * a * c);

        System.out.println("\nDiscriminant: " + discriminant);

        // roots
        if (discriminant < 0) {
            System.out.println("No real solutions (the roots are imaginary).");
        } else if (discriminant == 0) {
            double root = -b / (2 * a);
            System.out.printf("There is exactly one solution: %.2f\n", root);
        } else {
            double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
            System.out.printf("There are two solutions: %.2f and %.2f\n", root1, root2);
        }
    }

   ///validation
    public static double getValidDouble(Scanner in, String prompt) {
        System.out.print(prompt);
        while (!in.hasNextDouble()) {
            String input = in.next();
            System.out.print("Invalid input: '" + input + "'. Please enter a number: ");
        }
        return in.nextDouble();
    }
}