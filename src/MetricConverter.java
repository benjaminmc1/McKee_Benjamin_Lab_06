import java.util.Scanner;

public class MetricConverter {
    public static void main(String[] args) {
        double meter = 0;
        double miles = 0;
        double feet = 0;
        double inches = 0;

        Scanner in = new Scanner(System.in);

        System.out.print("Enter a distance in meters: ");
        do {
            meter = in.nextDouble();
            if(!in.hasNextDouble()) {
                System.out.println("Invalid entry. Try again.");
            }
        }while(!in.hasNextDouble());

        miles = meter / 1609;
        feet = meter * 3.281;
        inches = feet / 12;

        System.out.printf("The distance you entered %,.4f meters is %,.2f miles, or %,.2f feet, or %,.2f inches.", meter, miles, feet, inches);

        in.close();
    }
}
