/* Gaurangi Tripathi B.Tech CSE Section E 2014657
Question: Given an unsorted array of integers, design an algorithm and implement a program to sort this array using selection sort. Your program should also find number of comparisons and number of swaps required.
	Input Format:	
		The first line contains number of test cases, T.
		For each test case, there will be two input lines. First line contains n (the size of array).
		Second line contains space-separated integers describing array.
	Output Format:
		The output will have T number of lines.
		For each test case T, there will be three output lines.
		First line will give the sorted array. Second line will give total number of comparisons.
		Third line will give total number of swaps required.
	Sample Input:
		1
		8
		-13 65-21 76 46 89 45 12
	Sample Output:
		-21-13 12 45 46 65 76 89
		Comparisons = 28
		Swaps j = 7
*/
import java.util.Scanner;
public class SelectionSort 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no of test cases: ");
		int t = sc.nextInt();
		while(t-- > 0)
		{
		  System.out.println("Enter array length: ");
		  int n = sc.nextInt();
		  int arr[] = new int[n];
		  System.out.println("Enter array elements: ");
		  for(int i = 0; i < n; i++)
		  {
			 arr[i] = sc.nextInt();
		  }
		  Selectionsort(arr,n);
		}
		sc.close();
	}
	public static void Selectionsort(int arr[] , int n)
	{
		int min,t,c=0,s=0;
	    for(int i=0;i<n-1;i++){
	        min=i;
	        for(int j=i+1;j<n;j++){
	            if(arr[j]<arr[min])
	                min=j;
	            c++;
	        }
	        t=arr[min];
	        arr[min]=arr[i];
	        arr[i]=t;
	        s++;
	    }
	    for(int i = 0; i<n; i++)
	    {
	    	System.out.println(arr[i] + " ");
	    }
	    System.out.println("\nComparisons " +c);
	    System.out.println("\nSwaps " +s);
	    System.out.println();
	}

}
