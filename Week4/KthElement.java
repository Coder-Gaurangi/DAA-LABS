
/* Gaurangi Tripathi B.Tech CSE Section E 2014657
 
 Given an unsorted array of integers, design an algorithm and implement it using a program to find Kth smallest
 or largest element in the array. (Worst case Time Complexity = O(n)).
	Input Format:
		The first line contains number of test cases, T
		For each test case, there will be three input lines.
			First line contains n (the size of array). 
			Second line contains space-separated integers describing array. 
			Third line contains K.
	Output Format:
		The output will have T number of lines.
		For each test case, output will be the Kth smallest or largest array element. 
		If no Kih element is present, output should be "not present".
	Input:-
		1
		5 
		7 10 4  3 15
        3
	Output :-
		7
 */

import java.util.Arrays;
import java.util.Scanner;
public class KthElement 
{
    public static int kthSmallest(int[] arr,int k)
    {
        Arrays.sort(arr);
        return arr[k - 1];
    }
    public static void main(String[] args)
    {
    	Scanner sc = new Scanner(System.in);
    	int t = sc.nextInt();
    	while(t-->0)
    	{
    	  int n = sc.nextInt();
  		  int arr[] = new int[n];
  		  for(int i=0 ; i < n ; i++)
  		  {
  			  arr[i] = sc.nextInt();
  		  }
    	
          int k = sc.nextInt();
          System.out.print("K'th smallest element is " + kthSmallest(arr, k));
        }
    	sc.close();
    }
}