public class SelectionSort 
{
	public static void main(String args[]) 
	{
		int array[] = {4,6,7,2,3,5,12,8,4,15};
		int length = array.length;
		for (int i = 0; i < length; i ++)
		{
			for (int j = i; j < length; j ++)
			{
				if(array[i] > array[j])
				{
					int temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
		}
		
		for (int i = 0; i < length; i ++)
		{
			System.out.println(array[i]);
		}
	}
}