public class UnionFind 
{
	private int[] id;
	private int count;
	private int[] size;
	
	UnionFind(int N)
	{
		// Create a new array with the size that provided by user
		count = N;
		id = new int[N];
		size = new int[N];
		for (int i = 0; i < N; i ++)
		{
			id[i] = i;
			size[i] = 1;
		}
	}
	
	public int count()
	{
		return count;
	}
	
	public int find(int p)
	{
		while (p != id[p])
			p = id[p];
		return p;
	}
	
	public void union(int p, int q)
	{
		int pRoot = find(p);
		int qRoot = find(q);
		if (pRoot == qRoot)
			return;
		if (size[pRoot] < size[qRoot])
		{
			id[pRoot] = qRoot;
			size[qRoot] = size[qRoot] + size[pRoot];
		}
		else 
		{
			id[qRoot] = pRoot;
			size[pRoot] = size[pRoot] + size[qRoot];
		}
		count --;
	}
}