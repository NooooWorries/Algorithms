public class ShellSort 
{
	public static void main(String[] args) 
	{
		int array[] = {4,6,7,2,3,5,12,8,4,15};
		int length = array.length;
		for (int gap = length / 2; gap > 0; gap /= 2)
		{
			for (int i = 0; i < gap; i ++)
			{
				for (int j = i + gap; j < length; j += gap)
				{
					if (array[j] < array[j - gap])
					{
						int temp = array[j];
						int k = j - gap;
						while (k >= 0 && array[k] > temp)
						{
							array[k + gap] = array[k];
							k -= gap;
						}
						array[k + gap] = temp;
					}
				}
			}
		}
		
		for (int i = 0; i < length; i++)
		{
			System.out.println(array[i]);
		}
	}
}