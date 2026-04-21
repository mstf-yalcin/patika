package com.patika.java101;

import java.util.Scanner;

public class CinZodyagi {
    static void main() {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your birth year: ");
        int year = input.nextInt();

        int result = year % 12;
        String zodiac;

        switch (result) {
            case 0:
                zodiac = "Monkey";
                break;
            case 1:
                zodiac = "Rooster";
                break;
            case 2:
                zodiac = "Dog";
                break;
            case 3:
                zodiac = "Pig";
                break;
            case 4:
                zodiac = "Rat";
                break;
            case 5:
                zodiac = "Ox";
                break;
            case 6:
                zodiac = "Tiger";
                break;
            case 7:
                zodiac = "Rabbit";
                break;
            case 8:
                zodiac = "Dragon";
                break;
            case 9:
                zodiac = "Snake";
                break;
            case 10:
                zodiac = "Horse";
                break;
            case 11:
                zodiac = "Goat";
                break;
            default:
                zodiac = "Unknown";
        }

        System.out.println("Your Chinese Zodiac Sign: " + zodiac);

        input.close();
    }
}
