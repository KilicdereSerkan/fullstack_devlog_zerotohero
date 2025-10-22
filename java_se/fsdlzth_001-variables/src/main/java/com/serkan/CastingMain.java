package com.serkan;

/**
 *      "Casting" in Java refers to the process of converting a variable from one data type to another. There are two types of casting:
 *   1. Primitive Type CastingMain: This involves converting between primitive data types (e.g., int, double, char).
 *    - Widening CastingMain (Implicit): Converting a smaller data type to a larger data type (e.g., int to double).
 *    - Narrowing CastingMain (Explicit): Converting a larger data type to a smaller data type (e.g., double to int). This requires explicit casting using parentheses.
 *    - Example:
 *      int myInt = 9;
 *      double myDouble = myInt; // Widening casting
 *      double myDouble2 = 9.78;
 *      int myInt2 = (int) myDouble2; // Narrowing casting
 *
 *      casting can lead to data loss when narrowing, as the fractional part is truncated.
 *      - Reference Type CastingMain: This involves converting between object types (e.g., superclass to subclass).
 *      - Upcasting: Converting a subclass type to a superclass type. This is done implicitly.
 *      - Downcasting: Converting a superclass type to a subclass type. This requires explicit casting and can lead to a ClassCastException if not done carefully.
 *      - Example:
 *      Dog dog = new Dog();
 *      Animal animal = dog; // Upcasting
 *      Animal anotherAnimal = new Animal();
 *      Dog anotherDog = (Dog) anotherAnimal; // Downcasting (may throw ClassCastException)
 *
 *      - Casting is essential for ensuring that variables are treated as the correct type, especially when dealing with methods that accept specific data types or when working with collections of objects.
 *      - Proper casting helps prevent runtime errors and ensures type safety in Java programs.
 *
 *      - casting order is like this:
 *      byte -> short -> char -> int -> long -> float -> double , boolean is not included because it cannot be converted to any other type.
 *
 *
 */
public class CastingMain {


        int myInt = 9;
        double myDouble = myInt; // Widening casting. widening casting is done automatically by Java when converting a smaller data type to a larger data type.
        double myDouble2 = 9.78;
        int myInt2 = (int) myDouble2; // Narrowing casting . narrowing casting must be done manually by placing the desired data type in parentheses in front of the value to be converted.

        public static void main(String[] args) {
            System.out.println("Widening Casting (int to double): " + 9 + " -> " + 9.0);
            System.out.println("Narrowing Casting (double to int): " + 9.78 + " -> " + 9);

            byte myMinByteValue = Byte.MIN_VALUE;
            byte myNewByteValue = (byte) (myMinByteValue / 2); // narrowing casting example ==> if we don't do narrowing casting here, we will get a compilation error because the result of the division is an int by default.
            byte myNewMinByteValue = (-128/2) ; // this is also narrowing casting example, but here we are not getting a compilation error because the result of the division is within the range of byte data type.
            /*
            above two lines there is difference:
            In the first line, we explicitly cast the result of the division to a byte using (byte). This is necessary because the division operation results in an int by default, and assigning it directly to a byte variable would cause a compilation error.
            In the second line, we are dividing -128 by 2, which results in -64. Since -64 is within the range of the byte data type (-128 to 127), Java allows the assignment without explicit casting.
            because java compiler can determine that the result of the expression (-128/2) is a constant value that fits within the byte range, so it allows the assignment without explicit casting.
            but in general, when performing arithmetic operations that involve byte, short, or char types, Java promotes them to int before performing the operation, so explicit casting is usually required when assigning the result back to a smaller data type.
             */
            System.out.println("New Byte Value after narrowing casting: " + myNewByteValue);
        }
}
