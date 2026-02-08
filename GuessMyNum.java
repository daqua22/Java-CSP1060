import java.util.Random;
import java.util.Scanner;

public class GuessMyNum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random random = new Random();
        
        int number = random.nextInt(100) + 1;
        int maxAttempts = 3;
        
        System.out.println("I'm thinking of a number between 1 and 100.");
        
        for (int i = 1; i <= maxAttempts; i++) {
            System.out.print("Attempt " + i + ": Type a number: ");
            int guess = in.nextInt();

            if (guess == number) {
                System.out.println("Correct! You got it right.");
                return; 
            } else if (guess < number) {
                System.out.println("Too low.");
            } else {
                System.out.println("Too high.");
            }
            
            if (i == maxAttempts) {
                System.out.println("Game over! The number was: " + number);
            }
        }
    }
}