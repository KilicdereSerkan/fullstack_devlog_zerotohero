package com.serkan;



public class MathClassMain {

    static void main() {

        /*
            * Demonstrates the usage of various methods from the Math class in Java.
            * Methods demonstrated include addition, subtraction, multiplication, division,
            * maximum, minimum, square root, and power.
            * Each method's result is printed to the console.
            * Note: Math.divideExact does not exist in Java's Math class; division is performed using the '/' operator.
            * For demonstration purposes, we will use standard division.
            *
            * Math class is used for performing mathematical operations.
            * it is part of java.lang package and provides various static methods for mathematical calculations.
            * it has methods for basic arithmetic operations, trigonometric functions, logarithmic functions, and more.
            * it has also constants like Math.PI and Math.E
            * Math class methods are static, so you can call them directly using the class name without creating an instance of the class.
            * Example: Math.sqrt(16) returns 4.0
            * Math class differs from StrictMath class in that Math class may use platform-specific optimizations for better performance,
            * while StrictMath class provides more consistent results across different platforms by adhering strictly to IEEE 754 standards.
            * Math class methods include:
            * - addExact(int x, int y): Returns the sum of two integers, throwing an exception if overflow occurs.
            * - subtractExact(int x, int y): Returns the difference of two integers, throwing an exception if overflow occurs.
            * - multiplyExact(int x, int y): Returns the product of two integers, throwing an exception if overflow occurs.
            * - max(int a, int b): Returns the greater of two int values.
            * - min(int a, int b): Returns the smaller of two int values.
            * - sqrt(double a): Returns the correctly rounded positive square root of a double value.
            * - pow(double a, double b): Returns the value of the first argument raised to the power of the second argument.
            * - Note: Math.divideExact does not exist; use standard division operator '/' instead.
            * - More methods can be found in the official Java documentation.
         */


        int sumResult = Math.addExact(5, 10);
        System.out.println("Sum: " + sumResult);

        int subtractResult = Math.subtractExact(10, 5);
        System.out.println("Subtract: " + subtractResult);

        int multiplyResult = Math.multiplyExact(5, 10);
        System.out.println("Multiply: " + multiplyResult);

        double divideResult = Math.divideExact(10, 5);
        System.out.println("Divide: " + divideResult);

        int maxResult = Math.max(5, 10);
        System.out.println("Max: " + maxResult);

        int minResult = Math.min(5, 10);
        System.out.println("Min: " + minResult);

        double sqrtResult = Math.sqrt(16);
        System.out.println("Square Root: " + sqrtResult);

        double powResult = Math.pow(2, 3);
        System.out.println("Power: " + powResult);



    }
}
