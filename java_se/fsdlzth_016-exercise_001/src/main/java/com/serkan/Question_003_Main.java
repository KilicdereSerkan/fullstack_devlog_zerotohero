package com.serkan;

import java.util.Scanner;

/**
 * question-03: Write a method that removes all spaces in a String using String.replace.
 */
public class Question_003_Main {
    static void main() {
        Scanner input=new Scanner(System.in);

        System.out.println("Please enter the text");
        String givenText = input.nextLine();

        String afterReplacement=givenText.replace(" ", "");
        System.out.println(afterReplacement);


    }
}
