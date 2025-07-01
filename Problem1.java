package p2;
import java.util.Scanner;

public class Problem1 {

    
    public double add(double a, double b) {
        return a + b;
    }

    public double subtract(double a, double b) {
        return a - b;
    }

    public double multiply(double a, double b) {
        return a * b;
    }

    public double divide(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("Division by 0");
        }
        return a / b;
    }

    
    public static void main(String[] args) {
        Problem1 calc = new Problem1(); 
        Scanner sc = new Scanner(System.in);
        Double result;

        System.out.println("Enter the a (Double) number:");
        double a = sc.nextDouble();

        System.out.println("Enter the b (Double) number:");
        double b = sc.nextDouble();

        sc.nextLine(); 

        System.out.println("Enter the operation (add, subtract, multiply, divide):");
        String op = sc.nextLine().toLowerCase();

        switch (op) {
            case "add":
                result = calc.add(a, b);
                break;
            case "subtract":
                result = calc.subtract(a, b);
                break;
            case "multiply":
                result = calc.multiply(a, b);
                break;
            case "divide":
                try {
                    result = calc.divide(a, b);
                } catch (ArithmeticException e) {
                    System.out.println("Error: " + e.getMessage());
                    sc.close();
                    return;
                }
                break;
            default:
                System.out.println("Invalid operation");
                sc.close();
                return;
        }

        System.out.println("Result: " + result);
        sc.close();
    }
}
