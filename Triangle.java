import java.util.Scanner;

public class Triangle {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Ente three stick lengths to see if they can form a triangle:");

        int a = getValidPositiveInt(in, "Length 1: ");
        int b = getValidPositiveInt(in, "Length 2: ");
        int c = getValidPositiveInt(in, "Length 3: ");

        if (canFormTriangle(a, b, c)) {
            System.out.println("Yes, you can form a triangle!");
        } else {
            System.out.println("No, you cannot form a triangle.");
        }
    }

    public static boolean canFormTriangle(int a, int b, int c) {
        if (a > (b + c)) return false;
        if (b > (a + c)) return false;
        if (c > (a + b)) return false;
        
        return true;
    }

    public static int getValidPositiveInt(Scanner in, String prompt) {
        int value = -1;
        while (value <= 0) {
            System.out.print(prompt);
            if (in.hasNextInt()) {
                value = in.nextInt();
                if (value <= 0) {
                    System.out.println("Error: Length must be greater than zero. You entered: " + value);
                }
            } else {
                String invalid = in.next();
                System.out.println("Error: '" + invalid + "' is not a valid integer.");
            }
        }
        return value;
    }
}