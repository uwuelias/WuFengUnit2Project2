
import java.util.Scanner;
public class LinearEquationRunner {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome!");
        System.out.print("Enter coordinate 1: ");
        String coord1 = scan.nextLine();
        int x1 = Integer.parseInt(coord1.substring(1, coord1.indexOf(",")));
        int y1 = Integer.parseInt(coord1.substring(coord1.indexOf(",") + 2, coord1.indexOf(")")));
        System.out.print("\nEnter coordinate 2: ");
        String coord2 = scan.nextLine();
        int x2 = Integer.parseInt(coord2.substring(1, coord2.indexOf(",")));
        int y2 = Integer.parseInt(coord2.substring(coord2.indexOf(",") + 2, coord2.indexOf(")")));
        LinearEquation coordinates = new LinearEquation(x1, y1, x2, y2);
        if (x1 == x2) {
            System.out.println("These points are on a vertical line: x = " + x1);
            System.exit(1);
        }
        System.out.println();
        System.out.println(coordinates.lineInfo());
        System.out.println();
        System.out.print("Enter a value for x: ");
        double xvalue = scan.nextDouble();
        System.out.print("\n\nThe point on the line is " + coordinates.coordinateForX(xvalue));
    }
}

