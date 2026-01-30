import java.util.Random;
import java.util.Scanner;

public class GuessMyNum {
    public static void main(String[] args) {
        
        Random random = new Random();
        int number = random.nextInt(100) + 1;
        
        
        System.out.println("I'm thinking of a number between 1 and 100 (including both).");
        System.out.println("Can you guess what it is?");
        System.out.print("Type a number: ");
        
        
        Scanner in = new Scanner(System.in); // scanner is a tool for getting user input
        int guess = in.nextInt();
        
        
        System.out.println("Your guess is: " + guess);
        
        
        System.out.println("The number I was thinking of is: " + number);
        
        // int difference = guess - number;
        // if (difference > 0) {
    
        int difference = guess - number;
        if (difference < 0) {
            difference = -difference;
        }
        System.out.println("You were off by: " + difference);
    }
}