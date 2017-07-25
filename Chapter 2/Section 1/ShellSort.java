import java.util.Random;

public class ShellSort 
{
	public static void main(String[] args) 
	{
		Random random = new Random();
		int[] array = new int[100000];
		
		for (int i = 0; i < array.length; i++)
		{
			array[i] = random.nextInt();
		}
		
		int length = array.length;
		for (int gap = length / 2; gap > 0; gap /= 2)
		{
			for (int i = gap; i < length; i++)
			{
				for (int j = i; j >= gap && array[j] < array[j-gap]; j = j - gap)
				{
					int temp = array[j];
					array[j] = array[j-gap];
					array[j-gap] = temp;
				}
			}
		}
		
		
		for (int i = 0; i < length; i++)
		{
			System.out.println(array[i]);
		}
	}
}