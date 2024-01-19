public class Calculator {

    public static int add(int a, int b) {
        return a + b;
    }

    public static int subtract(int a, int b) {
        return a - b;
    }

    public static int multiply(int a, int b) {
        return a * b;
    }

    public static int divide(int a, int b) {
        return a / b;
    }

    public static int modulo(int a, int b) {
        return a % b;
    }
    
    public static int power(int a, int b) {
        return a ^ b;
    }
    
    public static int square(int a) {
        return a * a;
   }
   
    public static void main(String[] args) {
        int a1 = 10;
        int a2 = 20;

        int sum = add(a1, a2);
        int difference = subtract(a1, a2);
        int product = multiply(a1, a2);
        int quotient = divide(a1, a2);
        int remainder = modulo(a1, a2);
        int power = power(a1,a2);
        int square = square(a1);

        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);
        System.out.println("Product: " + product);
        System.out.println("Quotient: " + quotient);
        System.out.println("Remainder: " + remainder);
        System.out.println("power: " +power);
        System.out.println("square: " + square);
    }
}
