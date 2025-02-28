import java.util.Scanner;

public class MenuDrivenProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Calculate Square");
            System.out.println("2. Calculate Factorial");
            System.out.println("3. Check Even/Odd");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    calculateSquare(scanner);
                    break;
                case 2:
                    calculateFactorial(scanner);
                    break;
                case 3:
                    checkEvenOdd(scanner);
                    break;
                case 4:
                    System.out.println("Exiting program...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }

        } while (choice != 4);

        scanner.close();
    }

    public static void calculateSquare(Scanner scanner) {
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        System.out.println("Square of " + num + " is: " + (num * num));
    }

    public static void calculateFactorial(Scanner scanner) {
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        long factorial = 1;
        if (num < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
            return;
        }

        for (int i = 1; i <= num; i++) {
            factorial *= i;
        }
        System.out.println("Factorial of " + num + " is: " + factorial);
    }

    public static void checkEvenOdd(Scanner scanner) {
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        if (num % 2 == 0) {
            System.out.println(num + " is even.");
        } else {
            System.out.println(num + " is odd.");
        }
    }
}