public class TestClient
{
	public static void main(String[] args) 
	{
		BinarySearchTree<Integer> tree = new BinarySearchTree<Integer>();
		tree.insert(tree.getRootNode(), 3);
		tree.insert(tree.getRootNode(), 2);
		tree.insert(tree.getRootNode(), 7);
		tree.insert(tree.getRootNode(), 8);
		tree.insert(tree.getRootNode(), 9);
		tree.insert(tree.getRootNode(), 1);
	}
}