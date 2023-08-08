package com.techzenure.day6;

import java.util.Scanner;

public class Palindrome {
	
    public static boolean Palindrome(String str) {
        int length = str.length();
        for (int i = 0; i < length / 2; i++) {
            if (str.charAt(i) != str.charAt(length - 1 - i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        if (Palindrome(input)) 
        {
            System.out.println("string is a palindrome.");
        } else 
        {
            System.out.println("string is NOT a palindrome.");
        }
        sc.close();
    }
}