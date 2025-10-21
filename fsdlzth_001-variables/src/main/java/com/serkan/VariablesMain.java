package com.serkan;
public class VariablesMain {
    /**
     * main method is the entry point of any Java program
     * "public" - access modifier, "static" - means that this method belongs to the class, "void" - means that this method does not return any value
     * String[] args - parameter of the main method, it is an array of strings that can be passed to the program from command line
     * inside the main method we write our code
     */
  static void main(){
        /*
         * variable is a container that holds data which can be changed during program execution
         * declaration, initialization, assignment
         * expression is a construct made up of variables, operators, and method invocations, which are constructed according to the syntax of the language, that evaluates to a single value.
         */
      int myFirstNumber;                                   // this is declaration of a variable, also it is a statement. statement is smallest unit of code that could be executed
      myFirstNumber = 5;                                   // this is initialization of a variable, also it is an assignment statement
      int mySecondNumber = 10;                             // this is declaration and initialization in one line. also its called combined statement.
      int myThirdNumber = myFirstNumber + mySecondNumber;  // this is declaration, initialization and assignment in one line, also its called combined statement. it is adding two variables and assigning the result to a new variable,İt is an expression.
      /*
       above line can be broken down as follows:
       int myThirdNumber;                                // declaration
       myThirdNumber = myFirstNumber + mySecondNumber;   // initialization and assignment
       myFirstNumber + mySecondNumber is an expression that adds the values of two variables,and the expression evaluates to a single value which is then assigned to myThirdNumber variable.
       expresion is the code segment that is on the right side of the assignment operator (=).
      */
      System.out.println("My third number is: " + myThirdNumber);

        // primitive data types: int, byte, short, long, double, float, char, boolean
        // int - integer data type, it holds whole numbers, positive or negative, without decimals,e.g., 123 or -123, default value is 0, size is 4 bytes (32 bits), range is -2,147,483,648 to 2,147,483,647
        // byte - byte data type, it holds whole numbers, positive or negative, without decimals, e.g., 123 or -123, default value is 0, size is 1 byte (8 bits), range is -128 to 127
        // short - short data type, it holds whole numbers, positive or negative, without decimals
        // long - long data type, it holds whole numbers, positive or negative, without decimals, e.g., 123L or -123L, default value is 0L, size is 8 bytes (64 bits), range is -9,223,372,036,854,775 to 9,223,372,036,854,775
        // double - double data type, it holds decimal numbers, e.g., 123.45 or -123.45, default value is 0.0, size is 8 bytes (64 bits), range is approximately ±4.9e-324 to ±1.8e+308
        // float - float data type, it holds decimal numbers, e.g., 123.45f or -123.45f, default value is 0.0f, size is 4 bytes (32 bits), range is approximately ±1.4e-45 to ±3.4e+38
        // char - char data type, it holds a single character, e.g., 'A' or 'a', default value is '\u0000', size is 2 bytes (16 bits), range is '\u0000' to '\uffff'
        // boolean - boolean data type, it holds one of two values: true or false, default value is false, size is not precisely defined but typically uses 1 bit

      /*
 VARIABLES
 variables are a way to store information in our computer.
 Variables that we define in a program, can be accessed by a name we give them, and the computer does the hard work, of figuring out where they get stored, in the computer's random access memory, or RAM.
 Variables value can be change
 In Java syntax, all code is case-sensitive, and this includes keywords. As we'll soon see, an int, all in lowercase, is not the same as Int, with a capital I. Here, an int, (all in lowercase) is a keyword in Java
 */

      //----------------------------------------------------------------------------------------------------------

      /*
         DATA TYPES
            Data types specify the different sizes and values that can be stored in the variable.
         There are two types of data types in Java:
            1. Primitive data types: The most basic data types in Java, which include:
                - byte
                - short
                - int
                - long
                - float
                - double
                - char
                - boolean
            2. Non-primitive data types: Also known as reference data types, these include:
                - Strings
                - Arrays
                - Classes
                - Interfaces

       */

      // float data type example
        float myFloatNumber = 5.99f; // f is used to indicate that
        System.out.println("My float number is: " + myFloatNumber);
      // double data type example
        double myDoubleNumber = 19.99d; // d is used to indicate that
        System.out.println("My double number is: " + myDoubleNumber);

        String floatRange= "(" + Float.MIN_VALUE + ") +  (" + Float.MAX_VALUE + ")"; // float range
      System.out.printf("Float range is: %s%n", floatRange);

        /*
        float vs double:
        - Precision: float has a precision of about 7 decimal digits, while double has a precision of about 15 decimal digits. This means that double can represent numbers more accurately than float.
        - Memory Usage: float uses 4 bytes of memory, while double uses 8 bytes. This means that float is more memory-efficient than double, but at the cost of precision.
        - Default Type: In Java, floating-point literals are treated as double by default. To specify a float literal, you need to append an 'f' or 'F' to the number.
        - Use Cases: float is typically used in applications where memory is a concern and precision is not critical, such as in graphics or gaming applications. double is used in applications that require high precision, such as scientific calculations or financial applications.
        - Performance: float operations can be faster than double operations on some hardware, but this difference is usually negligible for most applications.
        - Overall, the choice between float and double depends on the specific requirements of your application, including the need for precision, memory constraints, and performance considerations.
        - In general, if you need high precision and can afford the extra memory usage, use double. If memory is a concern and you can tolerate lower precision, use float.
        - It's important to note that both float and double are subject to rounding errors due to their binary representation, so care should be taken when performing arithmetic operations with them.
        - When working with monetary values, it's often recommended to use BigDecimal instead of float or double to avoid precision issues.
        - float range is: approximately ±1.4E-45 to ±3.4E+38
        - double range is: approximately ±4.9E-324 to ±1.8E+308 E is exponent and that means 10 raised to the power of the number following it.
        -1.4E-45 = 1.4 x 10^-45 = 0.0000000000000000000000000000000000000000000014
        - this is scientific notation.
        3.4E+38 = 3.4 x 10^38 = 340000000000000000000000000000000000000
         - float is 4 bytes (32 bits) and double is 8 bytes (64 bits)
         */


      //----------------------------------------------------------------------------------------------------------


        char myChar = 'A'; // char data type example
        System.out.println("My char is: " + myChar);
        // - char data type is used to store a single character
        // - char data type is 2 bytes (16 bits)
        // - char data type range is '\u0000' to '\uffff' (0 to 65535)
        char myUnicodeChar = '\u00A9'; // unicode character example
        System.out.println("My unicode char is: " + myUnicodeChar);

        // - Unicode is a universal character encoding standard that assigns a unique code to every character and symbol in every language in the world.
        // - In Java, the char data type uses Unicode to represent characters, allowing for a wide range of characters from different languages and symbol sets to be used in Java programs.
        // - The Unicode standard uses a 16-bit encoding scheme, which means that each character is represented by a unique 16-bit code point.
        // - In Java, Unicode characters can be represented using escape sequences, which start with a backslash (\) followed by the letter 'u' and four hexadecimal digits representing the Unicode code point.
        // chaer also uses ASCII characters
        char myAsciiChar = 65; // ASCII character example
        System.out.println("My ASCII char is: " + myAsciiChar);
        // - ASCII (American Standard Code for Information Interchange) is a character encoding standard that represents characters using 7-bit binary codes.
        // - In Java, the char data type can also represent ASCII characters, which are a subset of Unicode characters.
        // - The ASCII character set includes 128 characters, including letters, digits, punctuation marks, and control characters.
        // - In Java, ASCII characters can be represented using their corresponding integer values, which range from 0 to 127.
        // - For example, the ASCII value of the letter 'A' is 65, so we can assign the value 65 to a char variable to represent the character 'A'.
        // - Overall, the char data type in Java is a versatile data type that can represent a wide range of characters using both Unicode and ASCII encoding standards.


      //----------------------------------------------------------------------------------------------------------

        boolean myBoolean = true; // boolean data type example
        System.out.println("My boolean is: " + myBoolean);

        // - boolean data type is used to store a value of either true or false
        // - boolean data type is used for logical operations and conditional statements
        // - boolean data type size is not precisely defined, but typically uses 1 bit
        // - boolean data type default value is false
        // - boolean data type is commonly used in control flow statements such as if-else statements and loops to determine the flow of execution based on certain conditions.
        // - boolean data type is also used in logical operations such as AND, OR, and NOT to evaluate expressions and make decisions based on the results.
        // - Overall, the boolean data type is a fundamental data type in Java that plays a crucial role in controlling the flow of execution and making decisions based on logical conditions.
        // - boolean values can also be obtained as the result of comparison operations, such as equality (==), inequality (!=), greater than (>), less than (<), greater than or equal to (>=), and less than or equal to (<=).4
        // - For example, the expression (5 > 3) evaluates to true, while the expression (5 < 3) evaluates to false.
        // - "boolean" values can also be combined using logical operators such as AND (&&), OR (||), and NOT (!).
        // - For example, the expression (true && false) evaluates to false, while the expression (true || false) evaluates to true.
        // - These logical operations are commonly used in conditional statements and loops to control the flow of execution based on multiple conditions.
        // - In addition to primitive boolean data type, Java also provides a Boolean wrapper class that allows boolean values to be treated as objects. This is useful in certain situations, such as when working with collections or when using generics.
        // - The Boolean wrapper class provides methods for converting between boolean values and strings, as well as for performing logical operations on boolean values.
        // - Overall, the boolean data type and Boolean wrapper class are essential components of Java programming, enabling developers to implement logical decision-making and control flow in their applications.

//----------------------------------------------------------------------------------------------------------

      // lastly , below are exammples of all variable types list that exists in java together;
      // primitive data types:, int, byte, short, long, float, double, char, boolean
      // non-primitive data types: Strings, Arrays, Classes, Interfaces, collections, etc.
      // example of all variable types together:
        int myIntVar = 100;
        byte myByteVar = 10;
        short myShortVar = 1000;
        long myLongVar = 10000L;
        float myFloatVar = 10.5f;
        double myDoubleVar = 20.99d;
        char myCharVar = 'J';
        boolean myBooleanVar = true;
        String myStringVar = "Hello, Java!"; // String is non-primitive data type and it is an object it is created from the String class, and it is a collection of characters.char array, but it is so intricately designed that it behaves like a primitive data type.
        int[] myArrayVar = {1, 2, 3, 4 };

        // advanced example of non-primitive data type:
        // also objects are non-primitive data types
        // example of object
        VariablesMain myObject = new VariablesMain();
        // here, we are creating an object of the VariablesMain class using the new keyword, and assigning it to a variable named myObject of type VariablesMain.
        // Objects are instances of classes, and they can have their own properties and methods.






  }
}

