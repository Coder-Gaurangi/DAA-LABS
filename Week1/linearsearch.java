/*Gaurangi Tripathi B.Tech CSE Section E 2014657
  Given an array of nonnegative integers, design a linear algorithm and implement it using a program to find whether given key element is present in the array or not.
  Also, find number of comparisons.
  (Time Complexity = O(n), where n is the size of input) 
  Date of Work: 18-07-21
*/
package prg;
import java.util.Scanner;
public class linearsearch 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("\nEnter number of test cases: ");
       		int t = sc.nextInt();
        	while(t-- > 0)
		System.out.println("Enter array length: ");
		int n = sc.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter elements of array: ");
		for(int i = 0; i < n; i++)
		{
			arr[i] = sc.nextInt();
		}
		System.out.println("Enter element to search: ");
		int x = sc.nextInt();
		int res = search(arr,x);
		if(res == -1)
			System.out.print("Not present");
		else
			System.out.print("Present " + res);
		sc.close();
	}
	public static int search(int arr[], int x)
	{
		int len = arr.length;
		for(int i = 0; i < len; i++)
		{
			if(arr[i] == x)
				return i+1;
		}
		return -1;
	}
}
