import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BubbleSortTest {


    @Test
    public void testEmptyArray() {
        int[] arr = {0};
        int[] arr1 = {0};
        BubbleSort.sort(arr);
       assertArrayEquals(arr1,arr);
    }

    @Test
    public void test5Values() {
        int[] arr = {9,8,7,6,5};
        int[] arr1 = {5,6,7,8,9};
        BubbleSort.sort(arr);
        assertArrayEquals(arr1,arr);
    }

    @Test
    public void test1Value() {
        int[] arr = {9};
        int[] arr1 = {9};
        BubbleSort.sort(arr);
        assertArrayEquals(arr1,arr);
    }

    // Test mit Minus Werten
    @Test
    public void testMinusValues() {
        int[] arr = {-9,-8,-7,-5,-6};
        int[] arr1 = {-9,-8,-7,-6,-5};
        BubbleSort.sort(arr);
        assertArrayEquals(arr1,arr);
    }

    //Test mit gleichen Elementen
    @Test
    public void testEqualValues() {
        int[] arr = {9,8,8,8,5};
        int[] arr1 = {5,8,8,8,9};
        BubbleSort.sort(arr);
        assertArrayEquals(arr1,arr);
    }

    //Test eines bereits sortierten Arrays
    @Test
    public void testSortedValues() {
        int[] arr = {5,6,7,8,9};
        int[] arr1 = {5,6,7,8,9};
        BubbleSort.sort(arr);
        assertArrayEquals(arr1,arr);
    }


}