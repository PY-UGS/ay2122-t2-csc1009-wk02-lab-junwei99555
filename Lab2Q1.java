import java.util.Scanner;

public class Lab2Q1 {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter number for radius: ");
        double radius = input.nextDouble();
        final double PI = 3.14159;
        double area = PI * radius * radius;
        System.out.println("The area for the circle of radius " + radius + " is " + area);
    }
}
