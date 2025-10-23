package com.serkan;

/**
 * question-01: Write Java code that increments an int variable by 5 with overflow check.
 */
public class Question_001_Main {
    static void main() {
        int maxInt=Integer.MIN_VALUE;
        System.out.println("maxInt="+maxInt); //maxInt=-2147483648

        int selectedNumber= 2147483643; // if we increase the number by one program will say there is on owerflow

        if(selectedNumber+5>maxInt){
            System.out.println("there is an owerflow");
        } else{
            System.out.println("selectedNumber is in range");
        }


    }
}
