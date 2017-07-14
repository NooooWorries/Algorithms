public class TestClient
{
	public static void main(String[] args) 
	{
		UnionFind unionFind = new UnionFind(10);
		unionFind.union(1,4);
		unionFind.union(2,4);
		unionFind.union(3,9);
		unionFind.union(5,7);
		unionFind.union(8,3);
	}
}