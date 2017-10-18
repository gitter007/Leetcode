package Sorting;
//  http://www.geeksforgeeks.org/quick-sort/
// https://www.youtube.com/watch?v=PgBzjlCcFvc

public class QuickSortLastElementAsPivot {

	 
	    /* The main function that implements QuickSort()
	      arr[] --> Array to be sorted,
	      low  --> Starting index,
	      high  --> Ending index */
	    void sort(int arr[], int low, int high)
	    {
	        if (low < high)
	        {
	            /* pi is partitioning index, arr[pi] is 
	              now at right place */
	            int pi = partition(arr, low, high);
	 
	            // Recursively sort elements before
	            // partition and after partition
	            sort(arr, low, pi-1);
	            sort(arr, pi+1, high);
	        }
	    }
	 
	   int partition(int arr[], int low, int high)
	    {
	        int pivot = arr[high]; //Taking last element as pivot
	        int i = (low-1); // index of smaller element
	        for (int j=low; j<high; j++)
	        {
	            // If current element is smaller than or
	            // equal to pivot
	            if (arr[j] <= pivot)
	            {
	                i++;
	 
	                // swap arr[i] and arr[j]
	                int temp = arr[i];
	                arr[i] = arr[j];
	                arr[j] = temp;
	            }
	        }
	 
	        // swap arr[i+1] and arr[high] (or pivot)
	        int temp = arr[i+1]; //Exchanging with first Element equal or higher than pivot with pivot
	        arr[i+1] = arr[high];
	        arr[high] = temp;
	 
	        return i+1;
	    }
	 	    

	    // Driver program
	    public static void main(String args[])
	    {
	        int[] arr = {10, 7, 8, 9, 1, 5,1};
//	        int arr[] = {6, 3, 1, 2, 5};
	        int n = arr.length;
	 
	        QuickSortLastElementAsPivot ob = new QuickSortLastElementAsPivot();
	        ob.sort(arr, 0, n-1);
	 
	        System.out.println("sorted array");
	        printArray(arr);
	    }

	    /* A utility function to print array of size n */
	    static void printArray(int arr[])
	    {
	        int n = arr.length;
	        for (int i=0; i<n; i++)
	            System.out.print(arr[i]+" ");
	        System.out.println();
	    }
	 	    
}
