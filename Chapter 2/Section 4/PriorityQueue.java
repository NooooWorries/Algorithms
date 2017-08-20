import java.util.*;

public class PriorityQueue
{
	private int[] queue; 
	private int count = 0;
	public static void main(String args[])
	{
		PriorityQueue priorityQueue = new PriorityQueue();
		priorityQueue.run();
	}
	
	public void run()
	{
		queue = new int[128000];
		Random random = new Random();
		for (int i = 0; i < 127999; i ++)
		{
			insert(random.nextInt());
		}
		for (int i = 0; i < 127999; i ++)
		{
			System.out.println(deleteMax());
		}
	}
	
	private void exchange(int i, int j)
	{
		int temp = queue[i];
		queue[i] = queue[j];
		queue[j] = temp;
	}
	
	private boolean less(int i, int j)
	{
		return queue[i] < queue[j];
	}
	
	private void swim(int k)
	{
		while(k > 1 && less(k/2, k))
		{
			exchange(k/2, k);
			k = k/2;
		}
	}
	
	private void sink(int k)
	{
		while( 2 * k <= count)
		{
			int j = 2 * k;
			if (j <= count && less(j, j+1))
				j++;
			if (!less(k,j))
				break;
			exchange(k, j);
			k = j;
		}
	}
	
	public void insert(int k)
	{
		queue[++count] = k;
		swim(count);
	}
	
	public int deleteMax()
	{
		int max = queue[1];
		exchange(1, count--);
		sink(1);
		return max;
		
	}
		
}