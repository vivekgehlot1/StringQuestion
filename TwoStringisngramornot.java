
package com.mycompany.stringoperation;
 import java.util.Arrays;
import java.util.Scanner;
public class TwoStringisngramornot {
   
    public static boolean areAnagrams(String str1, String str2) {
        str1 = str1.replaceAll("\\s", "").toLowerCase();
        str2 = str2.replaceAll("\\s", "").toLowerCase();

        if (str1.length() != str2.length()) {
            return false;
        }

        char[] charArray1 = str1.toCharArray();
        char[] charArray2 = str2.toCharArray();

        Arrays.sort(charArray1);
        Arrays.sort(charArray2);

        return Arrays.equals(charArray1, charArray2);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first string:");
        String string1 = scanner.nextLine();

        System.out.println("Enter the second string:");
        String string2 = scanner.nextLine();

        if (areAnagrams(string1, string2)) {
            System.out.println("The strings are anagrams!");
        } else {
            System.out.println("The strings are not anagrams.");
        }

        scanner.close();
    }
}

    

