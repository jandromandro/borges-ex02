/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Marcos Borges
 */

package exercise02;

/*
Create a program that prompts for an input string
and displays output that shows the input string
and the number of characters the string contains.
 */

import java.util.Scanner;

public class Solution02 {

    private static final Scanner in = new Scanner(System.in);

    public static void main(String[] args){
        
        System.out.println("What is the input string? ");
        String input = in.nextLine();
        
        int count = 0;
        
        for(int i = 0; i < input.length(); i++){

            if(input.charAt(i) != ' ') {// if the value of the character
                                        // in the array at location i
                                        // does NOT equal "empty space"
                                         // meaning the array has ended
                count++;
            }
        }
        System.out.println(String.format("%s has %s characters", input, count));

    }
}
