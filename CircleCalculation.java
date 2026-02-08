import java.util.Scanner;

public class CircleCalculation {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the radius of the circle: ");
        double radius = input.nextDouble();

        double diameter = calculateDiameter(radius);
        double circumference = calculateCircumference(radius);
        double area = calculateArea(radius);

        System.out.println("--- Results ---");
        System.out.printf("Diameter:      %.2f%n", diameter);
        System.out.printf("Circumference: %.2f%n", circumference);
        System.out.printf("Area:          %.2f%n", area);
        
        input.close();
    }

    
     //diameter: d = 2 * r
     
    public static double calculateDiameter(double r) {
        return 2 * r;
    }


     // area: A = PI * r^2
     
    public static double calculateArea(double r) {
        return Math.PI * Math.pow(r, 2);
    }
     // circumference: C = 2 * PI * r
     
    public static double calculateCircumference(double r) {
        return 2 * Math.PI * r;
    }

    
   

    
}