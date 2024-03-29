import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        
        int choice;
        Scanner input = new Scanner(System.in);
        try {
          char opt; 
        do {
            System.out.println("Calculator Menu:");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Percentage");
            System.out.println("6. Factorial");
            System.out.println("7. Square");
            System.out.println("8. Cube");
            System.out.println("9. Square Root");
            System.out.println("10. a Power b");
            System.out.println("11. a Root b");
            

            System.out.print("Enter your choice: ");

            choice = input.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter two numbers separated by space: ");
                    try {
                        int num1 = input.nextInt();
                        int num2 = input.nextInt();
                        System.out.println("Result: " + (num1 + num2));
                    } catch (InputMismatchException e) {
                        System.out.println("Invalid input! Please enter two valid integers separated by space.");
                        input.nextLine(); 
                    }
                    break;
                case 2:
                    System.out.print("Enter two numbers separated by space: ");
                    try {
                        int num1 = input.nextInt();
                        int num2 = input.nextInt();
                        System.out.println("Result: " + (num1 - num2));
                    } catch (InputMismatchException e) {
                        System.out.println("Invalid input! Please enter two valid integers separated by space.");
                        input.nextLine(); 
                    }
                    break;
                case 3:
                    System.out.print("Enter two numbers separated by space: ");
                    try {
                        int num1 = input.nextInt();
                        int num2 = input.nextInt();
                        System.out.println("Result: " + (num1 * num2));
                    } catch (InputMismatchException e) {
                        System.out.println("Invalid input! Please enter two valid integers separated by space.");
                        input.nextLine(); 
                    }
                    break;
                case 4:
                    System.out.print("Enter two numbers separated by space: ");
                    try {
                        int num1 = input.nextInt();
                        int num2 = input.nextInt();
                        if (num2 == 0) {
                            System.out.println("Cannot divide by zero!");
                        } else {
                            System.out.println("Result: " + ((double) num1 / num2));
                        }
                    } catch (InputMismatchException e) {
                        System.out.println("Invalid input! Please enter two valid integers separated by space.");
                        input.nextLine(); 
                    }
                    break;
                case 5:
                    System.out.print("Enter a number: ");
                    try {
                        int num1 = input.nextInt();
                        System.out.print("Enter a percentage: ");
                        int num2 = input.nextInt();
                        System.out.println("Result: " + ((double) num1 * num2 / 100));
                    } catch (InputMismatchException e) {
                        System.out.println("Invalid input! Please enter a valid integer and a valid percentage.");
                        input.nextLine(); 
                    }
                   
                    break;
                case 6:
                    System.out.print("Enter a number: ");
                    try {
                        int num = input.nextInt();
                        if(num>65)
                        System.out.println("The variable can not store the result!, Variable is over flowed");
                        else if(num<0)
                        System.out.println("We can't find Factorial for Negative numbers");
                        else{
                            long result = 1;
                        for (int i = 1; i <= num; i++) {
                            result *= i;
                        }
                        System.out.println("Result: " + result);
                        }
                    } catch (InputMismatchException e) {
                        System.out.println("Invalid input! Please enter a valid integer.");
                        input.nextLine(); 
                    }
                    break;
                case 7:
                    System.out.print("Enter a number: ");
                    try {
                        int num = input.nextInt();
                        System.out.println("Result: " + (num * num));
                    } catch (InputMismatchException e) {
                        System.out.println("Invalid input! Please enter a valid integer.");
                        input.nextLine(); 
                    }
                    break;
                case 8:
                    System.out.print("Enter a number: ");
                    try {
                        int num = input.nextInt();
                        System.out.println("Result: " + (num * num * num));
                    } catch (InputMismatchException e) {
                        System.out.println("Invalid input! Please enter a valid integer.");
                        input.nextLine(); 
                    }
                    break;
                case 9:
                    System.out.print("Enter a number: ");
                    try {
                        double num = input.nextDouble();
                        if (num < 0) {
                            System.out.println("Cannot find square root of a negative number!");
                        } else {
                            System.out.println("Result: " + Math.sqrt(num));
                        }
                    } catch (InputMismatchException e) {
                        System.out.println("Invalid input! Please enter a valid number.");
                        input.nextLine(); 
                    }
                    break;
                case 10:
                    System.out.print("Enter two numbers separated by space: ");
                    try {
                        double a = input.nextDouble();
                        double b = input.nextDouble();
                        System.out.println("Result: " + Math.pow(a, b));
                    } catch (InputMismatchException e) {
                        System.out.println("Invalid input! Please enter two valid numbers separated by space.");
                        input.nextLine(); 
                    }
                    break;
                case 11:
                    System.out.print("Enter two numbers separated by space: ");
                    try {
                        double a = input.nextDouble();
                        double b = input.nextDouble();
                        if (b == 0) {
                            System.out.println("Cannot find root with 0 as exponent!");
                        } else if (a < 0 && b % 2 == 0) {
                            System.out.println("Cannot find even root of a negative number!");
                        } else {
                            System.out.println("Result: " + Math.pow(a, 1.0 / b));
                        }
                    } catch (InputMismatchException e) {
                        System.out.println("Invalid input! Please enter two valid numbers separated by space.");
                        input.nextLine(); 
                    }
                    break;
                default:
                    System.out.println("Invalid choice! Please enter a valid choice.");
            }
    
            System.out.print("Do you want ot performother operations..(y to perform) : ");
            opt=input.next().charAt(0);
        } while (opt=='y'||opt=='Y');
    } 
        catch (InputMismatchException e) {
            System.out.println("Invalid input! Please enter a valid choice.");
            input.nextLine(); 
            
        }
    
        input.close();
    }
}    