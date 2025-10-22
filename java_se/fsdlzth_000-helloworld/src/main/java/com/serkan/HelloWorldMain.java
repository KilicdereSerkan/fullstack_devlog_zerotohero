package com.serkan;


public class HelloWorldMain {
   public static void main() {
         System.out.println("Hello, World!");// ==> This line prints "Hello, World!" to the console and adds a new line at the end.
         System.out.printf("Hello, %s!", "World"); // ==> This line prints "Hello, World!" using formatted output. it replaces the %s placeholder with the string "World".
         System.out.print("Hello, World!"); // ==> This line prints "Hello, World!" without adding a new line at the end.
   }

   /*
    Hello, World! Explanation:
    The "Hello, World!" program is a simple program that outputs the text "Hello, World!" to the console.
    It is often used as a beginner's introduction to programming in a new language.
    The program typically consists of a main function or method that contains a print statement to display the message.
    1. The program starts with the declaration of a class named HelloWorldMain.
    2. Inside the class, there is a main method, which is the entry point of the program.
    3. The main method contains a single line of code that uses the System.out.println() function to print the message "Hello, World!" to the console.
    4. When the program is executed, it displays the message on the screen.
    5. This program serves as a basic example to demonstrate the syntax and structure of a programming language.

    - class ==> keyword used to define a class in Java.
    - HelloWorldMain ==> the name of the class.
    - public ==> access modifier that allows the method to be accessible from outside the class.
    - static ==> indicates that the method belongs to the class itself rather than an instance of the class(object).
    - void ==> specifies that the method does not return any value.
    - main ==> the name of the method that serves as the entry point for the program.
    - "("String[] args)" ==> parameter that allows the program to accept command-line arguments as an array of strings.
    6. Overall, the "Hello, World!" program is a simple yet important starting point for learning programming concepts and syntax.

    */
}
