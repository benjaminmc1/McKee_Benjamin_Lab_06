import java.util.Scanner;

public class FuelCosts {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double gallons = 0;
        double fuelEfficiency = 0;
        double pricePerGallon = 0;
        double pricePer100 = 0;
        double miles = 0;
        double totalPrice = 0;
        double pricePerMile = 0;
        
        System.out.print("\nEnter the number of gallons in the tank: ");

        do {
            gallons = in.nextDouble();
            if(!in.hasNextDouble()) {
                System.out.println("\nInvalid entry. Try again.");
            }
        }while(!in.hasNextDouble());
        
        System.out.println();
        System.out.print("\nEnter the fuel efficiency of the vehicle: ");

        do {
            fuelEfficiency = in.nextDouble();
            if(!in.hasNextDouble()) {
                System.out.println("\nInvalid entry. Try again.");
            }
        }while(!in.hasNextDouble());

        System.out.println();
        System.out.print("\nEnter the price of gas per gallon: ");

        do {
            pricePerGallon = in.nextDouble();
                if(!in.hasNextDouble()) {
                    System.out.println("\nInvalid entry. Try again.");
                }
        }while(!in.hasNextDouble());
                    
        miles = fuelEfficiency * gallons;
        totalPrice = pricePerGallon * gallons;
        pricePerMile = totalPrice / miles;
        pricePer100 = pricePerMile * 100;
        System.out.printf("\nThe price to drive 100 miles is $%,.2f and the total amount of miles the vehicle is able to drive is %,.2f miles.", pricePer100, miles);

        in.close();
    }
}
