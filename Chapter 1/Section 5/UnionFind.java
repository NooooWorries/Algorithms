public class UnionFind 
{
	private int[] id;
	private int count;
	UnionFind(int N)
	{
		// Create a new array with the size that provided by user
		count = N;
		id = new int[N];
		for (int i = 0; i < N; i ++)
			id[i] = i;
	}
	
	public void count()
	{
		return count;
	}
	
	public int find(int p)
	{
		return id[p];
	}
	
	public void union(int p, int q)
	{
		int pid = find(p);
		int qid = find(q);
		if (pid == qid)
			return;
			
		for (int i = 0; i < id.length; i ++)
			if (id[i] == pid;)
				id[i] == qid;
		count --;
	}
}