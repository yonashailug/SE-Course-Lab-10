package org.example;

import java.util.ArrayList;

public class ArrayFlattener {
    public static int[] flattenArray(int[][] array) {
        if (array == null) {
            return null;
        }

        ArrayList<Integer> list = new ArrayList<>();
        for (int[] subArray : array) {
            for (int number : subArray) {
                list.add(number);
            }
        }

        int[] flattenedArray = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            flattenedArray[i] = list.get(i);
        }

        return flattenedArray;
    }
}
