package org.example;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertNull;

public class ArrayFlattenerTest {

    @Test
    void testFlattenArray() {
        assertArrayEquals(new int[]{1, 3, 0, 4, 5, 9}, ArrayFlattener.flattenArray(new int[][]{{1, 3}, {0}, {4, 5, 9}}));
    }

    @Test
    void testNullInput() {
        assertNull(ArrayFlattener.flattenArray(null));
    }
}
