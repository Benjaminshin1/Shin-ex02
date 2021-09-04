/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Benjamin Shin
 */
package excercise02.homework;
import java.util.Scanner;
//ask user to input a string
//convert the string to the number of characters there are
//output the string plus the number of characters the string has


public class Solution02 {
    public static void main(String[] args) {
        System.out.println("What is the input string?:");
        Scanner input = new Scanner(System.in);
        String characters = input.next();
        input.close();
        int count = characters.length();
        System.out.println(characters + " has " + count + " characters!");

    }
}
