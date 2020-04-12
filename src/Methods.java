import java.util.ArrayList;

public class Methods {
	/*
	 * returns the first location of elem found in arr.
	 * returns -1 if elem is not found in arr.
	 */
	public static int findElementIntArray(int[] arr, int elem) {
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] == elem) {
				return i;
			}
		}
		return -1;
	}
	
	/*
	 * returns the element in arr that has the lowest 
	 *     numerical value.
	 */
	public static int findSmallestElement(int[] arr) {
		int smallest_Idx = 0;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]<arr[smallest_Idx]) {
				smallest_Idx = i;
			}
		}
		return arr[smallest_Idx];
	}
	
	/*
	 * returns the mean (average) of all of the elements 
	 *     in arr.
	 */
	public static double averageIntArray(int[] arr) {
		int counter = 0;
		for (int i = 0; i < arr.length; i++) {
			counter+=arr[i];
		}
		return (double)counter/arr.length;
	}
	
	/*
	 * rearranges the elements of arr to be in ascending order
	 */
	public static void sortIntArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			int smallest_Index = i;
			for (int j = i; j < arr.length; j++) {
				if(arr[j]<arr[smallest_Index]) {
					smallest_Index = j;
				}
			}
			int temp = arr[i];
			arr[i] = arr[smallest_Index];
			arr[smallest_Index] = temp;
		}
	}
	
	/*
	 * returns the first location of elem found in list.
	 * returns -1 if elem is not found in list.
	 */
	public static int findElementInArrayList(ArrayList<String> list, String elem) {
		for (int i = 0; i < list.size(); i++) {
			if(list.get(i)==elem)
				return i;
		}return -1;
	}
	
	/*
	 * returns the element in list that has the least 
	 *    number of characters. If more than one string have the 
	 *    same number of characters, it will return the first one
	 *    in list.
	 */
	public static String findShortestString(ArrayList<String> list) {
		int stringMin_Idx = 0;
		for (int i = 0; i < list.size(); i++) {
			if(list.get(i).length()<list.get(stringMin_Idx).length()) {
				stringMin_Idx = i;
			}
		}
		return list.get(stringMin_Idx);
		
		
	}
	
	/*
	 * returns the average number of characters
	 *     of each String in list.
	 */
	public static double averageStringLength(ArrayList<String> list) {
		int characterCounter = 0;
		for (int i = 0; i < list.size(); i++) {
			characterCounter+=list.get(i).length();
		}
		return (double)characterCounter/list.size();
	}
	
	/*
	 * rearranges the elements of list to be in alphabetical order
	 *     use the String's compareTo method
	 */
	public static void sortStringArrayList(ArrayList<String> list) {
		String s = "asdfas";
		for (int i = 0; i < list.size(); i++) {
			int min_Idx = i;
			for (int j = i; j < list.size(); j++) {
				if(list.get(j).compareTo(list.get(min_Idx))<0) {
					min_Idx = j;
				}
			}
			String temp = list.get(i);
			list.set(i, list.get(min_Idx));
			list.set(min_Idx, temp);
		}
	}
	
	
}
