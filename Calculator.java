public class Calculator {
    public static void main(String[] args) {
        System.out.println("add(2, 3) = " + add(2, 3));
        System.out.println("subtract(3, 2) = " + subtract(3, 2));
        System.out.println("multiply(2, 3) = " + multiply(2, 3));
        System.out.println("divide(6, 3) = " + divide(6, 3));
        try {
            divide(1, 0);
        } catch (ArithmeticException e) {
            System.out.println("divide(1, 0) threw ArithmeticException: " + e.getMessage());
        }
    }

    public static double add(double a, double b) {
        return a + b;
    }

    public static double subtract(double a, double b) {
        return a - b;
    }

    public static double multiply(double a, double b) {
        return a * b;
    }

    public static double divide(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("Cannot divide by zero");
        }
        return a / b;
    }
    public static double mod(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("Cannot divide by zero");
        }
        return a % b;
    }
}
