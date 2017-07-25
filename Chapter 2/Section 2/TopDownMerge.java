import java.awt.datatransfer.*;

public class TopDownMerge
{
	public static int[] tempArray;
	public static void main(String[] args) 
	{
		int[] array = {1,3,5,7,9,2,4,6,8,10};
		sort(array);
		for (int k = 0; k < array.length; k++)
		{
			System.out.println(array[k]);
		}
	}
	
	public static void sort(int[] array)
	{
		tempArray = new int[array.length];
		sort(array, 0, array.length - 1);
		
	}
	
	public static void sort (int[] array, int low, int high)
	{
		if (high <= low)
			return;
		int mid = low + (high - low) / 2;
		sort(array, low, mid);
		sort(array, mid + 1, high);
		merge(array, tempArray, low, mid, high);
	}
	
	public static void merge(int[] array, int[] tempArray, int low, int mid, int high)
	{
		int i = low; // Array one start point;
		int j = mid + 1; // Array two start point 
				
		// Copy all elements to tempArray
		for (int k = low; k <= high; k++)
		{
			tempArray[k] = array[k]; 
		}
		
		// Merge sort
		for (int k = low; k <= high; k++)
		{
			// Case one: left part exhausted
			if (i > mid )
			{
				array[k] = tempArray[j++];
			}
			// Case two: right part exhausted
			else if (j > high)
			{
				array[k] = tempArray[i++];
			}
			// Case three: j < i
			else if (tempArray[j] < tempArray[i])
			{
				array[k] = tempArray[j++];
			}
			// Case four: j >= i
			else
			{
				array[k] = tempArray[i++];
			}
		}
	}
}