package com.patika.java101;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;

public class TekrarEdenEleman2 {
    static void main() {
        Map<Integer, Integer> frequencyMap = new LinkedHashMap<>();

        int[] list = {10, 20, 20, 10, 10, 20, 5, 20};

        for (int i : list)
                frequencyMap.put(i, frequencyMap.getOrDefault(i, 0) + 1);

        System.out.println("Array : " + Arrays.toString(list));
        System.out.println("Repetition Counts");

        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet())
            System.out.println("The number " + entry.getKey() + " was repeated " + entry.getValue() + " times.");

    }
}
