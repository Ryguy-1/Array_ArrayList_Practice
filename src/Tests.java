import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.jupiter.api.Test;

class Tests {
	@Test
	void testArraySearch() {
		int[] testArray = { 3, 54, 123, 32, 53, 336 };
		assertEquals(0, Methods.findElementIntArray(testArray, 3));
		assertEquals(1, Methods.findElementIntArray(testArray, 54));
		assertEquals(2, Methods.findElementIntArray(testArray, 123));
		assertEquals(3, Methods.findElementIntArray(testArray, 32));
		assertEquals(4, Methods.findElementIntArray(testArray, 53));
		assertEquals(-1, Methods.findElementIntArray(testArray, 1000));
	}
	
	@Test
	void testFindSmallestElement() {
		int[] testArray = { 3, 54, 123, 32, 53, 336 };
		int[] testArray2 = { -3, -54, -123, -32, -53, -336 };
		int[] testArray3 = { 0, 1, 2 };
		assertEquals(3, Methods.findSmallestElement(testArray));
		assertEquals(-336, Methods.findSmallestElement(testArray2));
		assertEquals(0, Methods.findSmallestElement(testArray3));
	}
	
	@Test
	void testAverageArray() {
		int[] testArray = { 3, 54, 123, 32, 53, 336 };
		int[] testArray2 = { -3, -54, -123, -32, -53, -336 };
		int[] testArray3 = { 0, 1, 2 };
		assertEquals(100.166, Methods.averageIntArray(testArray), 0.001);
		assertEquals(-100.166, Methods.averageIntArray(testArray2), 0.001);
		assertEquals(1.0, Methods.averageIntArray(testArray3), 0.001);
	}
	
	@Test 
	void testArraySort(){
		int[] testArray = { 3, 54, 123, 32, 53, 336 };
		int[] orderArray = { 3, 32, 53, 54, 123, 336 };
		Methods.sortIntArray(testArray);
		assertArrayEquals(testArray, orderArray);
	}
	
	@Test
	void testFindInArrayList() {
		String[] words = {"one", "two", "three", "four", "five", "six", "seven", "eight"};
		ArrayList<String> list = new ArrayList<String>(Arrays.asList(words));
		assertEquals(0, Methods.findElementInArrayList(list, "one"));
		assertEquals(1, Methods.findElementInArrayList(list, "two"));
		assertEquals(2, Methods.findElementInArrayList(list, "three"));
		assertEquals(3, Methods.findElementInArrayList(list, "four"));
		assertEquals(-1, Methods.findElementInArrayList(list, "negative one"));
	}
	
	@Test
	void testFindShortestString() {
		String[] words = {"one", "two", "three", "four", "five", "six", "seven", "eight"};
		String[] words2 = {"***", "**", "*", "****"};
		ArrayList<String> list = new ArrayList<String>(Arrays.asList(words));
		ArrayList<String> list2 = new ArrayList<String>(Arrays.asList(words2));
		assertEquals("one", Methods.findShortestString(list));
		assertEquals("*", Methods.findShortestString(list2));
		
	}
	
	@Test
	void testAverageStringLength() {
		String[] words = {"one", "two", "three", "four", "five", "six", "seven", "eight"};
		ArrayList<String> list = new ArrayList<String>(Arrays.asList(words));
		String[] words2 = {"This", "is",  "a", "list", "of", "words", "with", "varying", "lengths", "gjljaslkveojbopjepnAkjdvvwse"};
		ArrayList<String> list2 = new ArrayList<String>(Arrays.asList(words2));
		assertEquals(4.0, Methods.averageStringLength(list), 0.001);
		assertEquals(6.4, Methods.averageStringLength(list2), 0.001);
	}
	
	@Test
	void TestSortStringArrayList() {
		String[] words = {"one", "two", "three", "four", "five", "six", "seven", "eight"};
		String[] wordsSorted = {"eight", "five", "four", "one", "seven", "six", "three", "two"};
		ArrayList<String> list = new ArrayList<String>(Arrays.asList(words));
		Methods.sortStringArrayList(list);
		assertArrayEquals(wordsSorted, list.toArray());
	}
}
