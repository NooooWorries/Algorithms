import java.util.*;
import java.lang.*;
import java.io.*;

public class BottomUpMerge
{
	public static int[] tempArray;
	
	public static void main (String[] args) throws java.lang.Exception
	{
		int[] array = {1,3,5,7,9,2,4,6,8,10};
		sort(array);
	}
	
	public static void sort (int[] array)
	{
		tempArray = new int[array.length];
		sort(array, 0, array.length - 1);
		for(int i = 0; i < array.length; i++)
		{
			System.out.println(array[i]);
		}
	}
	
	public static void sort(int[] array, int low, int high)
	{
		int length = array.length;
		for (int size = 1; size < length; size = size + size)
		{
			for (int i = 0; i < length - size; i = i + (2 * size))
			{
				merge(array, i, i + size - 1, Math.min(i + size + size - 1, length - 1));
			}
		}
	}
	
	public static void merge (int[] array, int low, int mid, int high)
	{
		int i = low;
		int j = mid + 1;
		for(int k = low; k <= high; k++)
		{
			tempArray[k] = array[k];
		}
		for (int k = low; k <= high; k++)
		{
			if (i > mid)
			{
				array[k] = tempArray[j++];
			}
			else if (j > high)
			{
				array[k] = tempArray[i++];
			}
			else if (tempArray[j] < tempArray[i])
			{
				array[k] = tempArray[j++];
			}
			else
			{
				array[k] = tempArray[i++];
			}
		}
	}
}