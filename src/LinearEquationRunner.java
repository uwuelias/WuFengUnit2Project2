
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
        int y2 = Integer.parseInt(coord2.substring(coord1.indexOf(",") + 2, coord2.indexOf(")")));
        LinearEquation coordinates = new LinearEquation(x1, y1, x2, y2);
        System.out.println();
        System.out.println("The two points are: " + "(" + x1 + ", " + y1 + ") and " + "(" + x2 + ", " + y2 + ")");
        System.out.println("The equation of the line between these points is: " + coordinates.equation());
        System.out.println("The slope of this line is: " + coordinates.slope());
        System.out.println("The y-intercept of the line is: " + coordinates.yIntercept());
        System.out.println();
        System.out.print("Enter a value for x: ");
        double xvalue = scan.nextInt();
        System.out.print("\n\nThe point on the line is " + coordinates.coordinateForX(xvalue));
    }
}

