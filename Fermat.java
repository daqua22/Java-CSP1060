import java.util.Scanner;

public class Fermat {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter values for a, b, c, and n to test Fermat's Last Theorem:");
        
        System.out.print("a: ");
        int a = in.nextInt();
        
        System.out.print("b: ");
        int b = in.nextInt();
        
        System.out.print("c: ");
        int c = in.nextInt();
        
        System.out.print("n: ");
        int n = in.nextInt();

        checkFermat(a, b, c, n);
    }

    public static void checkFermat(int a, int b, int c, int n) {
        // a^n + b^n and c^n
        double leftSide = Math.pow(a, n) + Math.pow(b, n);
        double rightSide = Math.pow(c, n);

        if (n > 2 && leftSide == rightSide) {
            System.out.println("Holy smokes, Fermat was wrong!");
        } else {
            System.out.println("No, that doesn't work.");
        }
    }
}