package _04_JavaClassSearchAndSort;

import java.util.Collections;
import java.util.List;

/*
 * Use the Arrays and Collections classes to implement the search and sort
 * methods below.
 */
public class _02_JavaClassSearchSort {

	public static int[] arraySort(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int k = 0; k < arr.length - 1; k++) {
				if (arr[k] > arr[k + 1]) {
					int newperson = arr[k];
					arr[k] = arr[k + 1];
					arr[k + 1] = newperson;
				}
			}
		}
		return arr;
	}

	public static List<Double> listSort(List<Double> list) {
		Collections.sort(list);
		return list;
	}

	public static Boolean arraySearch(char[] arr, char key) {
    	boolean r = false;
		for(int i = 0; i < arr.length; i++) {
    		if (arr[i] == key) {
    			r = true;
    		}
    	}
		return r;
	}

	public static Boolean listSearch(List<Character> list, Character key) {
		boolean r = false; 
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i) == key) {
				r = true;
			}
		}
		return r;
	}
}
