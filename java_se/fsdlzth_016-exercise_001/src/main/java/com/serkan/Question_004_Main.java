package com.serkan;

/**
 * question-04: Using a for loop write code to compute the sum of even numbers from 1 to 100.
 */
public class Question_004_Main {
    static void main() {
     int sumOfEvenNumber = 0;
        for (int i = 0; i <=100 ; i++) {
            if (i%2==0) {
                 sumOfEvenNumber += i ;
            }
        }
        System.out.println("The sum of even numbers is: " + sumOfEvenNumber);
    }
}
