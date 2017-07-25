public class InPlaceMerge
{
	
	public static void main(String[] args) 
	{
		int[] array = {1,2,3,4,5,1,2,3,4,5};
		
		int[] tempArray = new int[array.length];

		merge(array, tempArray, 0, 4, 9);
		
		for (int i = 0; i < array.length; i++)
		{
			System.out.println(array[i]);
		}
		
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