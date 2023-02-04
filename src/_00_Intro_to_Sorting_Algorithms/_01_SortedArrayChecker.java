package _00_Intro_to_Sorting_Algorithms;

public class _01_SortedArrayChecker {
    /*
     * Write a static method called intArraySorted.
     *
     * This method takes in an array of integers and it returns a boolean.
     * The method returns true if the integer array is in ascending order
     * and false otherwise.
     */
	public static boolean intArraySorted(int[] arr) {
		boolean orderorno = true;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					orderorno = false;
				} 
			}
		}	
		return orderorno;
	}

    /*
     * 2. Write a static method called doubleArraySorted.
     *
     * This method takes in an array of doubles and it returns a boolean.
     * The method returns true if the double array is in ascending order
     * and false otherwise.
     */
	public static boolean doubleArraySorted(double[] arr) {
		boolean orderorno = true;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					orderorno = false;
				} 
			}
		}	
		return orderorno;
	}

    /*
     * 3. Write a static method called charArraySorted.
     * 
     * This method takes in an array of characters and it returns a boolean.
     * The method returns true if the character array is in alphabetical
     * order and false otherwise (You can compare characters just like
     * integers).
     */
		public static boolean charArraySorted(char[] arr) {
			boolean orderorno = true;
			for (int i = 0; i < arr.length; i++) {
				for (int j = 0; j < arr.length - 1; j++) {
					if (arr[j] > arr[j + 1]) {
						orderorno = false;
					} 
				}
			}			
			return orderorno;
		}

    /*
     * 4. Write a static method called stringArraySorted.
     *
     *  This method takes in an array of Strings and it returns a boolean.
     *  The method returns true if the String array is in alphabetical
     *  order and false otherwise (Use the compareTo(String) method).
     */
		public static boolean stringArraySorted(String[] arr) {
			boolean orderorno = true;
			for (int i = 0; i < arr.length-1; i++) {
					if (arr[i].compareTo(arr[i+1]) > 0) {
						orderorno = false;
					}
			}
			return orderorno;
		}
}
