package com.patika.java101;

import java.util.Scanner;

public class EbobEkok {
    static void main() {
        Scanner input = new Scanner(System.in);

        System.out.print("First number: ");
        int n1 = input.nextInt();

        System.out.print("Second number: ");
        int n2 = input.nextInt();

        int ebob = 1;

        int i = 1;
        while (i <= n1 && i <= n2) {
            if ((n1 % i == 0) && (n2 % i == 0)) {
                ebob = i;
            }
            i++;
        }

        int ekok = 0;
        int j = 1;

        while (true) {
            if ((j % n1 == 0) && (j % n2 == 0)) {
                ekok = j;
                break;
            }
            j++;
        }

        System.out.println("EBOB: " + ebob);
        System.out.println("EKOK: " + ekok);

        input.close();
    }
}
