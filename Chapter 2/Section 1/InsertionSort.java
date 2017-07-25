import java.util.*;
public class InsertionSort
{
	public static void main(String[] args) 
	{		
		Random random = new Random();
		int[] array = new int[100000];
		
		for (int i = 0; i < array.length; i++)
		{
			array[i] = random.nextInt();
		}
		
		for (int i = 1; i < array.length; i ++)
		{
			for (int j = i; j > 0 && array[j] < array[j-1]; j --)
			{
				int temp = array[j];
				array[j] = array[j-1];
				array[j-1] = temp;
			}
		}
		
		for (int i = 0; i < length; i++)
			System.out.println(array[i]);
		
	}
}