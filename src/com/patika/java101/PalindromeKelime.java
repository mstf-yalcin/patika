package com.patika.java101;

public class PalindromeKelime {

    static boolean isPalindrome(String str) {
        String s1 = str;
        String s2 = new StringBuilder(s1).reverse().toString();

        return s1.equals(s2);
    }

    static boolean isPalindrome2(String str) {
        int i = 0, j = str.length() - 1;
        while (i < j) {
            if (str.charAt(i) != str.charAt(j))
                return false;
            i++;
            j--;
        }
        return true;
    }

    static void main() {
        System.out.println(isPalindrome("abba"));
    }
}
