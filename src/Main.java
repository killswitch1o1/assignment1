import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose a shape: ");
        System.out.println("1. Circle");
        System.out.println("2. Rectangle");
        System.out.println("3. Triangle");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Enter circle color:");
                String circleColor = scanner.next();
                System.out.println("Enter circle radius:");
                double circleRadius = scanner.nextDouble();
                Circle circle = new Circle(circleColor, circleRadius);
                circle.display();
                System.out.println("Area: " + circle.calculateArea());
                System.out.println("Perimeter: " + circle.calculatePerimeter());
                break;
            case 2:
                System.out.println("Enter rectangle color:");
                String rectangleColor = scanner.next();
                System.out.println("Enter rectangle length:");
                double rectangleLength = scanner.nextDouble();
                System.out.println("Enter rectangle width:");
                double rectangleWidth = scanner.nextDouble();
                Rectangle rectangle = new Rectangle(rectangleColor, rectangleLength, rectangleWidth);
                rectangle.display();
                System.out.println("Area: " + rectangle.calculateArea());
                System.out.println("Perimeter: " + rectangle.calculatePerimeter());
                break;
            case 3:
                System.out.println("Enter triangle color:");
                String triangleColor = scanner.next();
                System.out.println("Enter triangle base:");
                double triangleBase = scanner.nextDouble();
                System.out.println("Enter triangle height:");
                double triangleHeight = scanner.nextDouble();
                System.out.println("Enter triangle side1:");
                double triangleSide1 = scanner.nextDouble();
                System.out.println("Enter triangle side2:");
                double triangleSide2 = scanner.nextDouble();
                System.out.println("Enter triangle side3:");
                double triangleSide3 = scanner.nextDouble();
                Triangle triangle = new Triangle(triangleColor, triangleBase, triangleHeight, triangleSide1, triangleSide2, triangleSide3);
                triangle.display();
                System.out.println("Area: " + triangle.calculateArea());
                System.out.println("Perimeter: " + triangle.calculatePerimeter());
                break;
            default:
                System.out.println("Invalid choice!");
                break;
        }

        scanner.close();
    }
}
