package Lab10;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class testSelectionSort {

	@Test
	public void test() {
		testPositive();
		testNegative();
		testMixed();
		testDuplicates();
	}

	public testSelectionSort() {
	}

	public void testPositive() {
		int[] arr = { 8, 9, 7, 10, 2 };
		int[] expectedSortedArr = { 2, 7, 8, 9, 10 };
		SelectionSort sorter = new SelectionSort();
		arr = sorter.basicSelectionSort(arr);
		assertArrayEquals(expectedSortedArr, arr);
		sorter.display("testPositive", arr);
	}

	public void testNegative() {
		int[] arr = { -8, -9, -7, -10, -2 };
		int[] expectedSortedArr = { -10, -9, -8, -7, -2 };
		SelectionSort sorter = new SelectionSort();
		arr = sorter.basicSelectionSort(arr);
		assertArrayEquals(expectedSortedArr, arr);
		sorter.display("testNegative", arr);
	}

	public void testMixed() {
		int[] arr = { 3, -2, -1, 0, 2, 1 };
		int[] expectedSortedArr = { -2, -1, 0, 1, 2, 3 };
		SelectionSort sorter = new SelectionSort();
		arr = sorter.basicSelectionSort(arr);
		assertArrayEquals(expectedSortedArr, arr);
		sorter.display("testMixed", arr);
	}

	public void testDuplicates() {
		int[] arr = { 3, 3, -1, -1, 2, 2 };
		int[] expectedSortedArr = { -1, -1, 2, 2, 3, 3 };
		SelectionSort sorter = new SelectionSort();
		arr = sorter.basicSelectionSort(arr);
		assertArrayEquals(expectedSortedArr, arr);
		sorter.display("testDuplicates", arr);
	}
}