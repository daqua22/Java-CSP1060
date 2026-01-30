import java.util.Scanner;

public class InteractiveGreeter {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.print("What's your name? ");
        String name = in.nextLine();
        
        System.out.print("Where are you from? ");
        String location = in.nextLine();
        
        System.out.print("How old are you (in years)? ");
        int age = in.nextInt();
        in.nextLine();
        
        System.out.println("Hi " + name + " from " + location + ". You are " + age + " years old. I have so much info about you");
        
        System.out.print("What's something you like to do? (hobby) ");
        String activity = in.nextLine();
        
        System.out.println("Have fun next time you " + activity + "!");
        
        System.out.print("How much would you like to donate today? ");
        double donation = in.nextDouble();
        
        System.out.println("You will donate $" + donation + " today. Yay! Thank you for your support!");
    }
}