// Name: Vedant Shitole 
// PRN: 23070126143
// Batch: AIML B3 

// Main.java 
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;
        // Menu for user to select a shape.
        do {
            System.out.println("\nSelect Shape:");
            System.out.println("1. Circle");
            System.out.println("2. Rectangle");
            System.out.println("3. Square");
            System.out.println("4. Sphere");
            System.out.println("5. Cylinder");
            System.out.println("6. Equilateral Pyramid");
            System.out.println("0. Exit");
            System.out.print("Enter choice: ");
            choice = scanner.nextInt();

            // Switch case to handle user selection.
            switch (choice) {
                case 1:
                    System.out.print("Enter radius: ");
                    Circle circle = new Circle(scanner.nextDouble());
                    displayResults(circle);
                    break;
                case 2:
                    System.out.print("Enter length and width: ");
                    Rectangle rectangle = new Rectangle(scanner.nextDouble(), scanner.nextDouble());
                    displayResults(rectangle);
                    break;
                case 3:
                    System.out.print("Enter side length: ");
                    Square square = new Square(scanner.nextDouble());
                    displayResults(square);
                    break;
                    case 4:
                    System.out.print("Enter radius: ");
                    Sphere sphere = new Sphere(scanner.nextDouble());
                    displayResults(sphere);
                    break;
                case 5:
                    System.out.print("Enter radius and height: ");
                    Cylinder cylinder = new Cylinder(scanner.nextDouble(), scanner.nextDouble());
                    displayResults(cylinder);
                    break;
                case 6:
                    System.out.print("Enter base and height: ");
                    EquilateralPyramid pyramid = new EquilateralPyramid(scanner.nextDouble(), scanner.nextDouble());
                    displayResults(pyramid);
                    break;
                case 0:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        } while (choice != 0);
        scanner.close();

    }
}

