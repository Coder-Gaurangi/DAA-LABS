/*Gaurangi Tripathi B.Tech CSE Section E 2014657
 	Given an already sorted array of positive integers, design an algorithm and implement it using a program to find whether a given key element is present in the sorted array or not. For an array arr[n], search at the indexes arr[0], arr[2], arr[4],.....,arr[2k] and so on. Once the interval (arr[2k]< key < arr[ 2k+1] ) is found, perform a linear search operation from the index 2k to find the element key. (Complexity < O(n), where n is the number of elements need to be scanned for searching):
 	Approach: We are starting with 0th element, if element is found, then we return 0.
 			  Else we go to 1st index ( i = 1), check if ith index is less than length of array and element at that index is less than or equal to key element then we double the index.
 			  If the above condition fails i.e. either index position has exceeded array length or the element at an index is greater than the key means that we have found the range where key lies.
 			  Then we can perform linear or binary search as:
 			  		return linearSearch(arrayName, startPosition, arraySize, key): return linearSearch(arr, int(i/2), n, key)
 			  		return binarySearch(arrayName, startPosition, endPosition, Key): return linearSearch(arr, int(i/2), min(i,n-1), key)
*/
package prg;
import java.util.Scanner;
class ExponentialSearch
{
    private static int BinarySearch(int[] A, int left, int right, int x)
    {
        if (left > right)
        {
            return -1;
        }
        int mid = (left + right) / 2;
        if (x == A[mid]) 
        {
            return mid;
        }
        else if (x < A[mid]) 
        {
            return BinarySearch(A, left, mid - 1, x);
        }
        else 
        {
            return BinarySearch(A, mid + 1, right, x);
        }
    }
    public static int Search(int[] A, int x)
    {
        int bound = 1;
        while (bound < A.length && A[bound] < x) 
        {
            bound *= 2;        
        }
        return BinarySearch(A, bound/2, Integer.min(bound, A.length), x);
    }
    public static void main(String[] args)
    {
    	Scanner sc = new Scanner(System.in);
    	System.out.println("Enter array length:");
		int n = sc.nextInt();
		int A[] = new int[n];
		System.out.println("Enter array elements:");
		for(int i = 0; i < n; i++)
		{
			A[i] = sc.nextInt();
		}
		System.out.println("Enter element to search:");
		int key = sc.nextInt();
        int result = Search(A, key);
 
        if (result != -1) 
        {
            System.out.println("Present: " + (result + 1));
        }
        else 
        {
            System.out.println("Not Present");
        }
        sc.close();
    }
}