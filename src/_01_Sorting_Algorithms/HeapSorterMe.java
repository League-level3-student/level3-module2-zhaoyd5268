package _01_Sorting_Algorithms;

public class HeapSorterMe extends Sorter {
    public HeapSorterMe() {
        type = "HeapMe";
    }

	void sort(int[] array, SortingVisualizer display) {
		   int n = array.length;
	        
	        for (int i = n / 2 - 1; i >= 0; i--) {
	            heapSort(array, n, i, display);
	            display.updateDisplay();
	        }

	        for (int i = n - 1; i >= 0; i--)  {
	            int temp = array[0];
	            array[0] = array[i];
	            array[i] = temp;
	 
	            heapSort(array, i, 0, display);
	            display.updateDisplay();
	        }
	    }

	public void heapSort(int[] array, int n, int i, SortingVisualizer display) {
		int largest = i;
		int l = 2*i+1;
	    int r = 2 * i + 2;
	    
        if (l < n && array[l] > array[largest]) {
            largest = l;
        }
        
        if (r < n && array[r] > array[largest]) {
            largest = r;
        }
        
        if (largest != i)
        {
            int swap = array[i];
            array[i] = array[largest];
            array[largest] = swap;
 
            heapSort(array, n, largest, display);
            display.updateDisplay();
        }
    }
	}

