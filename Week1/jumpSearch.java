/*Gaurangi Tripathi B.Tech CSE Section E 2014657
 	Given an already sorted array of positive integers, design an algorithm and implement it using a program to find whether a given key element is present in the sorted array or not. For an array arr[n], search at the indexes arr[0], arr[2], arr[4],.....,arr[2k] and so on. Once the interval (arr[2k]< key < arr[ 2k+1] ) is found, perform a linear search operation from the index 2k to find the element key. (Complexity < O(n), where n is the number of elements need to be scanned for searching):*/
package prg;
import java.util.Scanner;
public class jumpSearch
{
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array length:");
		int n = sc.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter array elements:");
		for(int i = 0; i < n; i++)
		{
			arr[i] = sc.nextInt();
		}
		System.out.println("Enter element to search:");
		int key = sc.nextInt();
		int result = search(arr,key);
		System.out.println("Present: " + (result+1));
		sc.close();
	}
	public static int search(int [] arr, int key)
	{
		int n = arr.length;
		int steps = (int)Math.floor(Math.sqrt(n));
		int prev = 0;
		while(arr[Math.min(steps, n)-1] < key)
		{
			prev = steps;
			steps += (int)Math.floor(Math.sqrt(n));
			if(prev >= n)
				return -1;
		}
		while(arr[prev] < key)
		{
			prev++;
			if(prev == Math.min(steps, n))
				return -1;
		}
		if(arr[prev] == key)
			return prev;
		return -1;
	}	
}
