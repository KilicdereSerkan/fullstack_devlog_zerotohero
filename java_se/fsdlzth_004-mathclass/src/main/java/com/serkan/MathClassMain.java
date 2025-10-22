package com.serkan;


/**
 * This class demonstrates the usage of various methods from the Math class in Java.
 * The Math class in Java provides a collection of static methods to perform basic mathematical operations. Here are key features and methods of the Math class:
 *--
 * Static Methods:
 * All methods in the Math class are static, meaning they can be called without creating an instance of the class. For example, you can directly call Math.sqrt(16) to get the square root of 16.
 *--
 * Commonly Used Methods:
 * Basic Arithmetic: You can use methods like Math.addExact(int x, int y), Math.subtractExact(int x, int y), Math.multiplyExact(int x, int y), and Math.divideExact(int x, int y) for addition, subtraction, multiplication, and division.
 * Power and Exponential: Use Math.pow(double a, double b) to calculate a raised to the power of b, and Math.exp(double a) to compute the exponential of a.
 * Trigonometric Functions: Access various trigonometric functions like Math.sin(double a), Math.cos(double a), and Math.tan(double a).
 * Rounding Functions: Methods such as Math.round(double a), Math.ceil(double a), and Math.floor(double a) help with rounding numbers to the nearest integer or to the next whole number.
 * Constants: The Math class includes constants like Math.PI (π) for mathematical calculations involving circles, and Math.E for the base of natural logarithms.
 * Handling Edge Cases: The Math class also provides methods to handle special cases, such as Math.max(int a, int b) and Math.min(int a, int b) to find the maximum and minimum of two values.
 *--
 * The Math class in Java is quite extensive, providing not just basic arithmetic operations but also a variety of other mathematical functions. Here are some additional details about its capabilities:
 *--
 * Advanced Mathematical Functions:
 *--
 * Logarithmic Functions: You can use Math.log(double a) to compute the natural logarithm (base e) and Math.log10(double a) for logarithms with base 10.
 * Square Root and Absolute Value: Use Math.sqrt(double a) for square root and Math.abs(int a) or Math.abs(double a) to get the absolute value.
 * Random Numbers: The class also includes methods for generating random numbers with Math.random(), which returns a double value between 0.0 and 1.0.
 * Constants: The Math class provides constants representing commonly used mathematical values. For example:
 *--
 * Math.PI: Represents the mathematical constant π (pi), useful for calculations involving circles.
 * Math.E: Represents Euler's number, the base of natural logarithms.
 * Performance Considerations: Since these methods are static, they are optimized for performance and are generally faster than creating your own mathematical functions.
 *--
 * Precision: When high precision is needed, consider using the BigDecimal class, especially for financial calculations, as it allows better control over rounding and precision issues that can arise with floating-point arithmetic.
 *--
 * The Math class plays a significant role in various applications, from simple calculations to complex numerical algorithms
 * --
 * Overall, the Math class simplifies mathematical operations and improves code readability.
 */
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
