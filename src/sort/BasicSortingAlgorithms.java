package sort;
import java.util.Arrays;

public class BasicSortingAlgorithms {
	public static void swap(int[] array, int indexA, int indexB){
		int a = array[indexA];
		array[indexA] = array[indexB];
		array[indexB] = a;
	}
	public static int[] selectionSort_min(int[] array){
		for(int i = 0; i<array.length -1; i++){
			for(int j = i+1; j<array.length; j++){
				if(array[j]<array[i]){
					swap(array,i,j);
				}
			}
			System.out.println(Arrays.toString(array));
		}
		return array;
	}
	
	public static int[] selectionSort_min_recursive(int[] array, int stepNum){
		if(stepNum > array.length -1){
			return array;
		}else{
			for(int i = stepNum; i<array.length; i++){
				if (array[stepNum] > array[i]) { // đẩy số nhỏ lên phía trước
					swap(array, stepNum, i);
				}
			}
		}
		return selectionSort_min_recursive(array, stepNum+1);
				
		
	}
	/*
	 * bubbleSort(arr[], n) 
	 */
	public static int[] min_bubbleSortRecursive(int[] arr, int n)
    {
        // Base case
        if (n == 1)
            return arr;
        for (int i=0; i<n-1; i++)
            if (arr[i] > arr[i+1])
            {
               swap(arr,i,i+1);
            }
        return min_bubbleSortRecursive(arr, n-1);
    }
	public static int[] min_bubbleSort(int[] arr)
	    {
	        int n = arr.length;
	        for (int i = 0; i < n-1; i++)
	            for (int j = 0; j < n-i-1; j++)
	                if (arr[j] > arr[j+1])
	                {
	                	swap(arr, j, j+1);
	                   
	                }
	        return arr;
	    }
	// Recursive function to sort an array using
	// insertion sort
	//sap xep tu tren xuong i tang dan
	public static int[] inSertDQ(int[] a, int i) { // mac dinh i =1
		if (i < a.length) {
//			int x = a[i]; // x = a[1] = 1;
			int j;
			for (j = i - 1; (j >= 0 && a[j] > a[i]); j--) {
//				a[i] = a[j];
//			a[j + 1] = x; 
				swap(a, i, j);
			}
			inSertDQ(a, i + 1);
			
		}
		return a;
	}
	//sap xep nguoc tu duoi len n giam dan
	void insertionSortRecursive(int arr[], int n)
	{
	    // Base case
	    if (n <= 1)
	        return;
	 
	    // Sort first n-1 elements
	    insertionSortRecursive( arr, n-1 );
	 
	    // Insert last element at its correct position
	    // in sorted array.
	    int last = arr[n-1];
	    int j = n-2;
	 
	    /* Move elements of arr[0..i-1], that are
	      greater than key, to one position ahead
	      of their current position */
	    while (j >= 0 && arr[j] > last)
	    {
	        arr[j+1] = arr[j];
	        j--;
	    }
	    arr[j+1] = last;
	}
	/* Function to sort an array using insertion sort*/
	public static int[] insertionSort(int[] arr)
	{
	   int i, key, j;
	   for (i = 1; i < arr.length; i++)
	   {
	       key = arr[i];
	       j = i-1;
	 
	       /* Move elements of arr[0..i-1], that are
	          greater than key, to one position ahead
	          of their current position */
	       while (j >= 0 && arr[j] > key)
	       {
	           arr[j+1] = arr[j];
	           j = j-1;
	       }
	       arr[j+1] = key;
	   }
	   return arr;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] test = {-1,1,5,4,-2};
		
		//swap(test, 0, 2);
//		System.out.println(Arrays.toString(test));
//		System.out.println(Arrays.toString(BasicSortingAlgorithms.selectionSort_min(test)));
//		System.out.println(Arrays.toString(BasicSortingAlgorithms.selectionSort_min_recursive(test, 0)));
//		System.out.println(Arrays.toString(BasicSortingAlgorithms.min_bubbleSort(test)));
//		System.out.println(Arrays.toString(BasicSortingAlgorithms.min_bubbleSortRecursive(test, 4)));
//		System.out.println(Arrays.toString(BasicSortingAlgorithms.inSertDQ(test, 1)));
//		System.out.println(Arrays.toString(BasicSortingAlgorithms.insertionSort(test)));
	}

}
