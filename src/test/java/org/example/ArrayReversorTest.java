package org.example;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class ArrayReversorTest {

    @Test
    void testReverseArray() {
        // Given
        ArrayFlattenerService arrayFlattenerService = mock(ArrayFlattenerService.class);
        int[][] a_in = {{1, 3}, {0}, {4, 5, 9}};
        when(arrayFlattenerService.flattenArray(a_in)).thenReturn(new int[]{1, 3, 0, 4, 5, 9});
        ArrayReversor reversor = new ArrayReversor(arrayFlattenerService);

        int[] result = reversor.reverseArray(a_in);


        verify(arrayFlattenerService).flattenArray(a_in);
        assertArrayEquals(new int[]{9, 5, 4, 0, 3, 1}, result);
    }

    @Test
    void testReverseArrayNull() {

        ArrayFlattenerService arrayFlattenerService = mock(ArrayFlattenerService.class);
        when(arrayFlattenerService.flattenArray(null)).thenReturn(null);
        ArrayReversor reversor = new ArrayReversor(arrayFlattenerService);

        int[] result = reversor.reverseArray(null);

        verify(arrayFlattenerService).flattenArray(null);
        assertNull(result);
    }
}
