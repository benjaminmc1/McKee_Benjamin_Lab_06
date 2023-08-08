import java.util.Scanner;

public class CtoFConverter {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double celsius = 0;
        double fahrenheit = 0;
        
        System.out.println("Enter the temperature in celsius: ");

        do {
            celsius = in.nextDouble();
            if(!in.hasNextDouble()) {
                System.out.println("Invalid entry. Try again.");
            }
        }while(!in.hasNextDouble());

        fahrenheit = (celsius * (9 / 5)) + 32;
        System.out.println("The temperature in fahrenheit is " + fahrenheit + " degrees.");

        in.close();
    }
}