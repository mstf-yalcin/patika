package com.patika.java101;

import java.util.HashMap;

public class TekrarEdenEleman {
    static void main() {
        int[] numbers = {2, 5, 6, 8, 6, 2, 10, 8, 8, 3, 4, 4};

        HashMap<Integer, Integer> frequency = new HashMap<>();

        for (int num : numbers)
            if (num % 2 == 0)
                frequency.put(num, frequency.getOrDefault(num, 0) + 1);

        System.out.println("Duplicate even numbers:");

        for (int key : frequency.keySet())
            if (frequency.get(key) > 1)
                System.out.println(key);

    }
}
