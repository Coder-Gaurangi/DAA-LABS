/*Gaurangi Tripathi B.Tech CSE 2015657
Question: Given an unsorted array of positive integers, design an algorithm and implement it using a program to find whether there are any duplicate elements in the array or not. (use sorting) (Time omplexity=0(n log n))
	Input Format:
		The first line contains number of test cases, T.
		For each test case, there will be two input lines.
		First line contains n (the size of array).
		Second line contains space-separated integers describing array.
	Output Format:
		The output will have T number of lines.
		For each test case, output will be 'YES' if duplicates are present otherwise 'NO'.
	Sample Input:
		1
		5
		28 52 83 14 75
	SAMPLE Output:
		No
*/
import java.util.Scanner;
public class DuplicateElements 
{

	 public static void main(String[] args)
	 {
	     Scanner sc = new  Scanner(System.in);
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
	                Duplicate_elements(arr,n);
	     }
	     sc.close();
	  }

	public static void Duplicate_elements(int arr[],int n)
	 {
		 for(int i = 0; i < n; i++)
		 {  
	            for(int j = i + 1; j < n; j++) 
	            {  
	                if(arr[i] == arr[j])  
		            {
		            System.out.println("Yes");
		            return;
		            }
	                
		    }
		 
	  }
		 System.out.println("No");
   }
}
