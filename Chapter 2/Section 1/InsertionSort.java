public class InsertionSort
{
	public static void main(String[] args) 
	{		
		int array[] = {4,6,7,2,3,5,12,8,4,15};
		int length = array.length;
		for (int i = 1; i < length; i ++)
		{
			if (array[i - 1] > array [i])
			{
				int temp = array[i];
				int j = i;
				while (j > 0 && array[j - 1] > temp)
				{
					array[j] = array[j - 1];
					j --;
				}
				array[j] = temp;
			}
		}
		for (int i = 0; i < length; i++)
			System.out.println(array[i]);
	}
}