package com.serkan;


public class Operators {
  static void main() {
        // Arithmetic Operators
        int a = 10;
        int b = 3;
        System.out.println("Addition: " + (a + b)); // 13
        System.out.println("Subtraction: " + (a - b)); // 7
        System.out.println("Multiplication: " + (a * b)); // 30
        System.out.println("Division: " + (a / b)); // 3
        System.out.println("Modulus: " + (a % b)); // 1
        /*
        arithmetic operators: +, -, *, /, %
        arithmetic operators are used to perform mathematical operations on numeric values.
        1. Addition (+): Adds two values together.
        2. Subtraction (-): Subtracts the second value from the first.
        3. Multiplication (*): Multiplies two values.
        4. Division (/): Divides the first value by the second.
        5. Modulus (%): Returns the remainder of the division of the first value by the second.
        6. Increment (++) : Increases a value by one.
        7. Decrement (--) : Decreases a value by one.
        8. Unary plus (+) : Indicates a positive value (usually redundant).
        9. Unary minus (-) : Negates a value.
        10. Parentheses () : Used to group expressions and control the order of operations.
        11. Type casting : Converts a value from one data type to another.
        12. Overflow and underflow : Occurs when a calculation exceeds the maximum or minimum limit of a data type.
        13. Associativity : Defines the order of evaluation for operators of the same precedence (left-to-right or right-to-left).
        14. Precedence : Determines the order in which operators are evaluated in an expression.
        */







        //------------------------------------------------------------------------------------------------------
        // Relational Operators ==> it is used to compare two values. and these operators return a boolean value (true or false) based on the comparison.

        System.out.println("Equal: " + (a == b)); // false
        System.out.println("Not Equal: " + (a != b)); // true
        System.out.println("Greater Than: " + (a > b)); // true
        System.out.println("Less Than: " + (a < b)); // false
        System.out.println("Greater Than or Equal: " + (a >= b)); // true
        System.out.println("Less Than or Equal: " + (a <= b)); // false

        // Logical Operators ==> it is used to combine multiple boolean expressions. and these operators return a boolean value (true or false) based on the evaluation of the expressions.
        boolean x = true;
        boolean y = false;
        System.out.println("Logical AND: " + (x && y)); // false
        System.out.println("Logical OR: " + (x || y)); // true
        System.out.println("Logical NOT: " + (!x)); // false

        // Assignment Operators  ==> it is used to assign values to variables.these
        // Simple Assignment ;
        int c = 5;
        System.out.println("c initial value: " + c); // 5
        // Compound Assignments ==> combines an arithmetic operation with assignment.these operators perform the operation on the variable and then assign the result back to the same variable.
        // also implicit type casting is done here if needed...
        c += 2; // c = c + 2
        System.out.println("c after += 2: " + c); // 7
        c -= 3; // c = c - 3
        System.out.println("c after -= 3: " + c); // 4
        c *= 4; // c = c * 4
        System.out.println("c after *= 4: " + c); // 16
        c /= 2; // c = c / 2
        System.out.println("c after /= 2: " + c); // 8
        c %= 3; // c = c % 3
        System.out.println("c after %= 3: " + c); // 2

        // Increment and Decrement Operators ==> these operators are used to increase or decrease the value of a variable by 1.these operators can be used in both prefix and postfix forms.
        int d = 5;
        System.out.println("d before increment: " + d); // 5
        d++; // Increment ==> postfix
        System.out.println("d after increment: " + d); // 6
        d--; // Decrement ==> postfix
        System.out.println("d after decrement: " + d); // 5
        ++d; // Increment ==> prefix
        System.out.println("d after prefix increment: " + d); // 6
        --d; // Decrement ==> prefix
        System.out.println("d after prefix decrement: " + d); // 5


        // Ternary Operator ==> it is a shorthand way of writing an if-else statement. it takes three operands: a condition, a value to return if the condition is true, and a value to return if the condition is false.
        int e = 10;
        String result = (e % 2 == 0) ? "Even" : "Odd"; // Ternary Operator ==> checks if e is even or odd its syntax is (condition) ? value_if_true : value_if_false
        System.out.println("e is: " + result); // Even

        // Bitwise Operators ==> these operators are used to perform bit-level operations on integer types (int, long, short, byte). these operators manipulate individual bits of the operands.
        int f = 5; // 0101 in binary
        int g = 3; // 0011 in binary
        System.out.println("Bitwise AND: " + (f & g)); // 1 ==> its syntax is & meaning AND doing bit by bit comparison here 0101 & 0011 = 0001 operation is done bit by bit like 0&0=0,0&1=0,1&0=0,1&1=1
        System.out.println("Bitwise OR: " + (f | g)); // 7  ==> its syntax is | meaning OR doing bit by bit comparison here 0101 | 0011 = 0111 operation is done bit by bit like 0|0=0,0|1=1,1|0=1,1|1=1
        System.out.println("Bitwise XOR: " + (f ^ g)); // 6 ==> its syntax is ^ meaning XOR doing bit by bit comparison here 0101 ^ 0011 = 0110 operation is done bit by bit like 0^0=0,0^1=1,1^0=1,1^1=0
        System.out.println("Bitwise NOT: " + (~f)); // -6 ==> its syntax is ~ meaning NOT it inverts the bits of the operand here ~0101 = 1010 in binary which is -6 in decimal (two's complement representation)
        System.out.println("Left Shift: " + (f << 1)); // 10 ==> its syntax is << meaning Left Shift it shifts the bits of the operand to the left by the specified number of positions here 0101 << 1 = 1010 which is 10 in decimal
        System.out.println("Right Shift: " + (f >> 1)); // 2  ==> its syntax is >> meaning Right Shift it shifts the bits of the operand to the right by the specified number of positions here 0101 >> 1 = 0010 which is 2 in decimal

        // Instanceof Operator ==> it is used to test whether an object is an instance of a specific class or implements a specific interface.
        String str = "Hello";
        System.out.println("str is instance of String: " + (str instanceof String)); //
        System.out.println("str is instance of Object: " + (str instanceof Object)); // true


        // Type Comparison Operator (Java 14+) ==> it is used to test whether an object is of a specific type and, if so, to cast it to that type in a single operation.
        Object obj = "Hello, World!";
        if (obj instanceof String s) {
            System.out.println("The length of the string is: " + s.length()); // 13
        }

        // Note: The Type Comparison Operator is a preview feature in Java 14 and may require enabling preview features to use.

        //------------------------------------------------------------------------------------------------------
        //14. Operator precedence : Determines the order in which operators are evaluated in an expression.;
        int h = 5 + 3 * 2; // Multiplication has higher precedence than addition
        System.out.println("h (5 + 3 * 2): " + h); // 11
        int i = 5 - 3 * 2; // Multiplication has higher precedence than subtraction
        System.out.println("i (5 - 3 * 2): " + i); // -1
        int j = 10 - 4 / 2; // Division has higher precedence than subtraction
        System.out.println("j (10 - 4 / 2): " + j); // 8
        int k = 5 - 4 / 2; // Division has higher precedence than subtraction
        System.out.println("k (5 - 4 / 2): " + k); // 3
        int m = (5 + 3) * 2; // Parentheses change the order of evaluation
        System.out.println("i ((5 + 3) * 2): " + m); // 16
        int n = 10 - 2 + 4; // Left-to-right associativity for + and -
        System.out.println("n (10 - 2 + 4): " + n); // 12

        //there are more operators and their precedence but these are the most common ones.
        // For a complete list of operators and their precedence, refer to the official Java documentation.


    }
}
