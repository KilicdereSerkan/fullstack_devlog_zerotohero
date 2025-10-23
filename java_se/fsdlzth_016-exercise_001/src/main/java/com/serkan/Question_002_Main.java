package com.serkan;

import java.util.Scanner;

/**
 * question-02: Write a short program that reads two numbers, sums them, and prints the result formatted using StringBuilder.
 */
public class Question_002_Main {


    public static void main(String[] args) {

        Scanner input= new Scanner(System.in);

        System.out.println("Please enter first number");
        int numberOne=input.nextInt();
        System.out.println("Please enter second number");
        int numberTwo=input.nextInt();

        int addition =  numberOne + numberTwo;
        System.out.println(addition);

        StringBuilder formattedText = new StringBuilder();
        formattedText.append(numberOne);
        formattedText.append(" + ");
        formattedText.append(numberTwo);
        formattedText.append(" = ");
        formattedText.append(addition);

        String formattedString = formattedText.toString();
        System.out.println(formattedString);
    }
}
