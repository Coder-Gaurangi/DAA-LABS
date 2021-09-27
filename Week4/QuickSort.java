/* Gaurangi Tripathi B.Tech CSE Section E 2014657
 2
   Given an unsorted array of integers, design an algorithm and implement it using a program to sort an array of elements by partitioning the array into two subarrays
   based on a pivot element such that one of the sub array holds values smaller than the pivot element while another sub array holds values greater
   than the pivot element Pivot element should be selected randomly from the array. 
   Your program should also find number of comparisons and swaps required for sorting the array.
   
	Input Format:
		  The first line contains number of test cases, T
		  For each test case, there will be two input lines.
		  First line contains a (the size of array) 
		  Second line contains space-separated integers describing array.
	Output Format:
		   The output will have T number of lines
		   For each test case T,there will be the output lines.
		   First line will give the sorted array
		   Second line will give total number of comparisons
		   Third line will give total number of swaps required.
	Sample Input:
	     1
	     8
	     23 65 21 79 46 89 45 32
    Sample Output:-
     	21 23 32 45 46 65 79 89
 */

import java.util.Scanner;
public class QuickSort
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-- >0)
		{
		  int n = sc.nextInt();
		  int arr[] = new int[n];
		  for(int i=0 ; i < n ; i++)
		  {
			  arr[i] = sc.nextInt();
		  }
		 QuickSort ob = new QuickSort();
		  ob.sort(arr , 0 , arr.length-1);
		  System.out.println("\nSorted array");
	        for (int i = 0; i < n; ++i)
	            System.out.print(arr[i] + " ");
	        System.out.println();
		}
	        sc.close();
		

	}    
     public static int partition(int arr[], int low, int high)
    {
    	int pivot = arr[high]; 
        int i = (low-1); 
        for (int j=low; j<high; j++)
        {
           if (arr[j] <= pivot)
            {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i+1];
        arr[i+1] = arr[high];
        arr[high] = temp;
  
        return i+1;
    }
    void sort(int arr[], int low, int high)
    {
        if (low < high)
        {
            int pi = partition(arr, low, high);
            sort(arr, low, pi-1);
            sort(arr, pi+1, high);
        }
    }
}