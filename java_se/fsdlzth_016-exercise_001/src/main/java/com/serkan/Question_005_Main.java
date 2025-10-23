package com.serkan;

import java.util.Random;

/**
 * question-05: Write a method that finds the smallest element in a given array.
 */
public class Question_005_Main {

    static void main() {

        // if element of array is a string
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        String[] wordArray = new String[50];
        Random randomChar = new Random();

        for (int i = 0; i < wordArray.length; i++) {
            StringBuilder word = new StringBuilder();
            for (int j = 0; j < 5; j++) {
                int index = randomChar.nextInt(alphabet.length());
                word.append(alphabet.charAt(index));
            }
            wordArray[i] = word.toString();
        }

        String minWord = wordArray[0];
        for (int i = 1; i < wordArray.length; i++) {
            if (wordArray[i].compareTo(minWord) < 0) {
                minWord = wordArray[i];
            }
        }
        System.out.println("The minimum word is: " + minWord);
  //------------------------------------------------------------------------------//
       // if element of array is a number
        String number = "1234567890";
        Integer[] numberArray = new Integer[50];
        Random randomNumber = new Random();

        for (int i = 0; i < numberArray.length; i++) {
            StringBuilder numberString = new StringBuilder();
        for (int j = 0; j < 5; j++) {
            int index = randomNumber.nextInt(number.length());
            numberString.append(number.charAt(index));
        }
numberArray[i] = Integer.parseInt(numberString.toString());
  }
        Integer minNumber = numberArray[0];
        for (int i = 1; i < numberArray.length; i++) {
            if (numberArray[i].compareTo(minNumber) < 0) {
                minNumber = numberArray[i];
            }
        }
        System.out.println("The minimum number is: " + minNumber);

    }

}
