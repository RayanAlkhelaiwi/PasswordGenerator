package com.ReanAlklwiy;

/**
 *
 * A program that prompt the user to enter a length and choose
 * whether the password contains numbers and letters, or numbers only.
 *
 */

//import java.util.ArrayList;
//import java.util.Arrays;
import java.util.Arrays;
import java.util.Scanner;
public class Main {

    /**
     * A method that returns a string of a chosen length of random numbers (To use as a password)
     *
     * @param passwordSize
     */
    public static void numOnlyGenerator(int passwordSize){

        int[] numPassword = new int[passwordSize];
        for (int i = 0; i < passwordSize; i++) {
            numPassword[i] = (int) (Math.random() * 10 + 1);
        }

//        ArrayList<int[]> arrayList = new ArrayList<int[]>(Arrays.asList(numPassword));
//        String numPassString = numPassword.toString();
        System.out.println("Password is: " + Arrays.toString(numPassword));
    }

    /**
     * A method that returns a string of a chosen length of a random mixed numbers & letters (To use as a password)
     *
     * @param passwordSize
     */
    public static void letterAndNumberGenerator (int passwordSize){

        String alphabet = "qwertyuiopasdfghjklzxcvbnmQWERTYUIOPASDFGHJKLZXCVBNM1234567890~!@#$%^&*()-=+_";

        char[] alphaArray = alphabet.toCharArray();
        char[] tempArray = new char[alphaArray.length];

        for (int i = 0; i < passwordSize; i++) {
            int randNum = (int) (Math.random() * alphaArray.length);

            tempArray[i] = alphaArray[randNum];
        }

        System.out.println("Password is: " +Arrays.toString(tempArray));
    }

    /**
     * Main method.
     *
     * @param args
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the password size (Number of Character): ");
        int passwordSize = scan.nextInt();

        System.out.println("Choose one of the options (Enter the option's number):" +
                "\n1. Digits only. \n2. Digits & Letters.");
        int optionChoice = scan.nextInt();

        if (optionChoice == 1) {

            numOnlyGenerator(passwordSize);
        } else {
            letterAndNumberGenerator(passwordSize);
        }
    }
}