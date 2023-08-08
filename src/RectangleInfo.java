import java.util.Scanner;
import java.lang.Math;

public class RectangleInfo {
    public static void main(String[] args) {
        double length = 0;
        double width = 0;
        double area = 0;
        double perimeter = 0;
        double pythagorean = 0;

        Scanner in = new Scanner(System.in);

        System.out.print("Enter the length of a rectangle: ");
        do {
            length = in.nextDouble();
            if(!in.hasNextDouble()) {
                System.out.println("Invalid entry. Try again.");
            }
        }while(!in.hasNextDouble());

        System.out.print("Enter the width of a rectangle: ");
        do {
            width = in.nextDouble();
            if(!in.hasNextDouble()) {
                System.out.println("Invalid entry. Try again.");
            }
        }while(!in.hasNextDouble());

        perimeter = (2 * length) + (2 * width);
        area = length * width;
        pythagorean = Math.sqrt((Math.pow(length, 2)) + (Math.pow(width, 2)));
        System.out.printf("The perimeter of the rectangle is %,.2f, the area of the rectangle is %,.2f and the diagonal length of the rectangle is %,.2f", perimeter, area, pythagorean);

        in.close();
    }
}
