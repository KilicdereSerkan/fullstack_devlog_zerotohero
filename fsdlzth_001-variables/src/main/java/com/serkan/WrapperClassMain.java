package com.serkan;


/**
 * Wrapper classes in Java provide a way to use primitive data types (int, char, etc.) as objects.
 * Each primitive data type has a corresponding wrapper class in the java.lang package.
 * Wrapper classes are useful when you need to work with collections that can only store objects,
 * or when you need to use methods that require objects instead of primitives.
 * Here are the primitive data types and their corresponding wrapper classes:
 * - byte    -> Byte
 * - short   -> Short
 * - int     -> Integer
 * - long    -> Long
 * - float   -> Float
 * - double  -> Double
 * - char    -> Character
 * - boolean -> Boolean
 * Wrapper classes also provide utility methods for converting between types and for manipulating values.
 * For example, the Integer class provides methods for converting strings to integers, exammple: Integer.parseInt("123") returns the int value 123.
 * Autoboxing and Unboxing:
 * - Autoboxing is the automatic conversion that the Java compiler makes between the primitive types and their corresponding object wrapper classes.
 *   For example, converting an int to an Integer is autoboxing.
 * - Unboxing is the reverse process where the object wrapper class is converted back to its corresponding primitive type.
 *   For example, converting an Integer to an int is unboxing.
 *
 * Below is an example demonstrating the use of the Integer wrapper class, including autoboxing, unboxing, and various utility methods.
 * utiliy methods of wrapper classes can be found in the official documentation: https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Integer.html
 *
 * Wrapper classes are immutable, meaning that once an object is created, its value cannot be changed. Any operation that seems to modify the value of a wrapper class actually creates a new object.
 * - Immutability helps ensure thread safety and consistency when working with wrapper class objects.
 * - Wrapper classes are widely used in Java programming, especially when working with collections, generics, and when you need to treat primitive data types as objects.
 * - They provide a convenient way to perform operations on primitive data types while leveraging the benefits of object-oriented programming.
 * - Overall, wrapper classes are an essential part of Java's type system, bridging the gap between primitive types and objects.
 *
 */
public class WrapperClassMain {
    Integer myInteger = 10; // Autoboxing: primitive int 10 is converted to Integer object
    int myPrimitiveInt = myInteger; // Unboxing: Integer object is converted back to primitive int

    public static void main(String[] args) {
        // utility method example 01 => converting String to int using Integer wrapper class
        String numberStr = "123";
        int number = Integer.parseInt(numberStr); // converting String to int using Integer wrapper class
        System.out.println("Converted number: " + number);

        // utility method example 02 => converting int to String using Integer wrapper class
        int anotherNumber = 456;
        String anotherNumberStr = Integer.toString(anotherNumber); // converting int to String using
        System.out.println("Converted String: " + anotherNumberStr);

        //utility method example 03 => finding max value between two integers using Integer wrapper class
        int a = 10;
        int b = 20;
        int max = Integer.max(a, b); // finding max value between two integers using Integer wrapper class
        System.out.println("Max value: " + max);

        // utility method example 04 => finding min value between two integers using Integer wrapper class
        int min = Integer.min(a, b); // finding min value between two integers using Integer wrapper class
        System.out.println("Min value: " + min);

        // utility method example 05 => getting the binary string representation of an integer using Integer wrapper class
        int num = 29;
        String binaryStr = Integer.toBinaryString(num); // getting the binary string representation of an integer using Integer wrapper class
        System.out.println("Binary representation of " + num + " is: " + binaryStr);

        // utility method example 06 => getting the hexadecimal string representation of an integer using Integer wrapper class
        String hexStr = Integer.toHexString(num); // getting the hexadecimal string representation of an integer using Integer wrapper class
        System.out.println("Hexadecimal representation of " + num + " is: " + hexStr);

        // utility method example 07 => getting the octal string representation of an integer using Integer wrapper class
        String octalStr = Integer.toOctalString(num); // getting the octal string representation of an integer using Integer wrapper class
        System.out.println("Octal representation of " + num + " is: " + octalStr);

        // utility method example 08 => comparing two Integer objects using Integer wrapper class
        Integer intObj1 = 100;
        Integer intObj2 = 200;
        int comparisonResult = Integer.compare(intObj1, intObj2); // comparing two Integer objects using Integer wrapper class
        System.out.println("Comparison result between " + intObj1 + " and " + intObj2 + " is: " + comparisonResult);


        // utility method example 09 => getting the hash code of an Integer object using Integer wrapper class
        Integer intObj3 = 300;
        int hashCode = Integer.hashCode(intObj3); // getting the hash code of an Integer object using Integer wrapper class
        System.out.println("Hash code of " + intObj3 + " is: " + hashCode);

        // utility method example 10 => getting the size of an Integer object in bits using Integer wrapper class
        int sizeInBits = Integer.SIZE; // getting the size of an Integer object in bits using Integer wrapper class
        System.out.println("Size of Integer in bits: " + sizeInBits);

        // utility method example 11 => getting the size of an Integer object in bytes using Integer wrapper class
        int sizeInBytes = Integer.BYTES; // getting the size of an Integer object in bytes using Integer wrapper class
        System.out.println("Size of Integer in bytes: " + sizeInBytes);

        // utility method example 12 => getting the maximum value an Integer can hold using Integer wrapper class
        int maxValue = Integer.MAX_VALUE; // getting the maximum value an Integer can hold using Integer wrapper class
        System.out.println("Maximum value of Integer: " + maxValue);

        // utility method example 13 => getting the minimum value an Integer can hold using Integer wrapper class
        int minValue = Integer.MIN_VALUE; // getting the minimum value an Integer can hold using Integer wrapper class
        System.out.println("Minimum value of Integer: " + minValue);

        /*
            * You can explore more utility methods provided by the Integer wrapper class and other wrapper classes in Java.
            * other utility methods of Integer class is
            *  Integer.sum(int a, int b) - returns the sum of two integers
            *  Integer.rotateLeft(int i, int distance) - rotates the bits of the integer to the left by the specified distance
            *  Integer.rotateRight(int i, int distance) - rotates the bits of the integer
            *  Integer.bitCount(int i) - returns the number of one-bits in the two's complement binary representation of the integer
            *  Integer.highestOneBit(int i) - returns an integer with only the highest one-bit set
            *  Integer.lowestOneBit(int i) - returns an integer with only the lowest one-bit set
            *  and many more...
         */




    }
}

