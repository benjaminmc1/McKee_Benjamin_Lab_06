import java.util.Scanner;
import java.util.Random;

public class HighorLow {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner in = new Scanner(System.in);

        int randomInt = rand.nextInt(1, 10);
        
        System.out.print("Guess the computer generated number [1-10]: ");
        do {
            int guess = in.nextInt();
            if(!in.hasNextInt()) {
                System.out.println("Invalid entry. Try again.");
            } else {
                while(guess != randomInt) {
                    if(guess > randomInt) {
                        System.out.println("Too high! Try again.");
                        guess = in.nextInt();
                    } else if(guess < randomInt) {
                        System.out.println("Too low! Try again.");
                        guess = in.nextInt();
                    }
                }
                System.out.println("You guessed correctly!");
            }
         }while(!in.hasNextInt());

         in.close();
    }
}
