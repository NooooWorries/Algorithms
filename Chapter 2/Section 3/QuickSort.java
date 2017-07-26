import java.util.*;

public class QuickSort
{
	public static void main(String[] args) 
	{
		int size = 100000;
		int[] array = new int[size];
		Random random = new Random();
		for (int i = 0; i < size; i ++)
		{
			array[i] = random.nextInt();
		}
		
		shuffle(array);
		sort(array, 0, array.length - 1);
		for(int i = 0; i < array.length; i++)
		{
			System.out.println(array[i]);
		}
	}
	
	public static void shuffle (int[] array)
	{
		Random random = new Random();
		if (array != null)
		{
			for(int i = 0; i < array.length; i++)
			{
				int j = random.nextInt(i + 1);
				int temp = array[i];
				array[i] = array[j];
				array[j] = temp;
			}
		}
	}
	
	public static void sort (int[] array, int low, int high)
	{
		if (high <= low)
			return;
		int j = partition(array, low, high);
		sort(array, low, j - 1);
		sort(array, j + 1, high);
	}
	
	private static int partition(int[] array, int low, int high)
	{
		int left = low;
		int right = high + 1;
		int cutPoint = array[low];
		
		while(true)
		{
			while(array[++left] < cutPoint)
			{
				if (left == high)
					break;
			}
			while(array[--right] > cutPoint)
			{
				if (right == low)
					break;
			}
			if (left >= right)
				break;
			int temp = array[left];
			array[left] = array[right];
			array[right] = temp;
		}
		
		int temp = array[right];
		array[right] = array[low];
		array[low] = temp;
		
		return right;
	}
}