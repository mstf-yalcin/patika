package com.patika.java101;

import java.util.Scanner;

public class Burc {
    static void main() {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter day: ");
        int day = input.nextInt();

        System.out.print("Enter month (1-12): ");
        int month = input.nextInt();

        String zodiac = "";
        boolean error = false;

        switch (month) {
            case 1:
                if (day >= 1 && day <= 31) {
                    zodiac = (day <= 21) ? "Capricorn (Oğlak)" : "Aquarius (Kova)";
                } else {
                    error = true;
                }
                break;

            case 2:
                if (day >= 1 && day <= 29) {
                    zodiac = (day <= 19) ? "Aquarius (Kova)" : "Pisces (Balık)";
                } else {
                    error = true;
                }
                break;

            case 3:
                if (day >= 1 && day <= 31) {
                    zodiac = (day <= 20) ? "Pisces (Balık)" : "Aries (Koç)";
                } else {
                    error = true;
                }
                break;

            case 4:
                if (day >= 1 && day <= 30) {
                    zodiac = (day <= 20) ? "Aries (Koç)" : "Taurus (Boğa)";
                } else {
                    error = true;
                }
                break;

            case 5:
                if (day >= 1 && day <= 31) {
                    zodiac = (day <= 21) ? "Taurus (Boğa)" : "Gemini (İkizler)";
                } else {
                    error = true;
                }
                break;

            case 6:
                if (day >= 1 && day <= 30) {
                    zodiac = (day <= 22) ? "Gemini (İkizler)" : "Cancer (Yengeç)";
                } else {
                    error = true;
                }
                break;

            case 7:
                if (day >= 1 && day <= 31) {
                    zodiac = (day <= 22) ? "Cancer (Yengeç)" : "Leo (Aslan)";
                } else {
                    error = true;
                }
                break;

            case 8:
                if (day >= 1 && day <= 31) {
                    zodiac = (day <= 22) ? "Leo (Aslan)" : "Virgo (Başak)";
                } else {
                    error = true;
                }
                break;

            case 9:
                if (day >= 1 && day <= 30) {
                    zodiac = (day <= 22) ? "Virgo (Başak)" : "Libra (Terazi)";
                } else {
                    error = true;
                }
                break;

            case 10:
                if (day >= 1 && day <= 31) {
                    zodiac = (day <= 22) ? "Libra (Terazi)" : "Scorpio (Akrep)";
                } else {
                    error = true;
                }
                break;

            case 11:
                if (day >= 1 && day <= 30) {
                    zodiac = (day <= 21) ? "Scorpio (Akrep)" : "Sagittarius (Yay)";
                } else {
                    error = true;
                }
                break;

            case 12:
                if (day >= 1 && day <= 31) {
                    zodiac = (day <= 21) ? "Sagittarius (Yay)" : "Capricorn (Oğlak)";
                } else {
                    error = true;
                }
                break;

            default:
                error = true;
        }

        if (error) {
            System.out.println("Invalid input!");
        } else {
            System.out.println("Your Zodiac Sign: " + zodiac);
        }

        input.close();
    }
}