package org.example;

public class ArrayReversor {

    private final ArrayFlattenerService flattenerService;

    public ArrayReversor(ArrayFlattenerService flattenerService) {
        this.flattenerService = flattenerService;
    }

    public int[] reverseArray(int[][] a_in) {
        int[] flattened = flattenerService.flattenArray(a_in);
        if (flattened == null) return null;
        int start = 0, end = flattened.length - 1;
        while (start < end) {
            int temp = flattened[start];
            flattened[start] = flattened[end];
            flattened[end] = temp;
            start++;
            end--;
        }
        return flattened;
    }
}
