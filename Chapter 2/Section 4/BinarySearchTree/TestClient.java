public class TestClient
{
	public static void main(String[] args) 
	{
		BinarySearchTree<Integer> tree = new BinarySearchTree<Integer>();
		tree.insert(3);
		tree.insert(7);
		tree.insert(1);
		tree.insert(9);
		tree.insert(4);
		
		tree.delete(7);
		tree.print();
		
	}
}