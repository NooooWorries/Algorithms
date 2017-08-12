public class BinarySearchTree<Object extends Comparable<? super Object>>
{
	private Node<Object> root;
	private int nodes;
	
	BinarySearchTree()
	{
		root = null;
		nodes = 0;
	}
	
	BinarySearchTree(Node<Object> root)
	{
		this.root = root;
		nodes = 1;
	}
	
	
	
	public void inOrder(Node<Object> node)
	{
		inOrder(node.getLeft());
		System.out.println(node.getData());
		inOrder(node.getRight());
	}
	
	public void preOrder(Node<Object> node)
	{
		System.out.println(node.getData());
		inOrder(node.getLeft());
		inOrder(node.getRight());
	}
	
	public void postOrder(Node<Object> node)
	{
		inOrder(node.getLeft());
		inOrder(node.getRight());
		System.out.println(node.getData());
	}
	
	public int searchRecursion(Node<Object> node, Object key)
	{
		if (node == null)
			return 0;	
		if (key.equals(node.getData()))
			return 1;
		int comparsion = key.compareTo(node.getData());
		if (comparsion < 0)
			return searchRecursion(node.getLeft(), key);
		else
			return searchRecursion(node.getRight(), key);
	}
	
	public Object searchIteration(Node<Object> node, Object key)
	{
		while (node != null || !key.equals(node.getData()))
		{
			int comparsion = key.compareTo(node.getData());
			if (comparsion < 0)
				node = node.getLeft();
			else
				node = node.getRight();
		}
		if (node == null)
			return null;
		else
			return key;
	}
	
	public Node<Object> findMinimun(Node<Object> node)
	{
		while (node.getLeft() != null)
			node = node.getLeft();
		return node;
	}
	
	public Node<Object> findMaximum(Node<Object> node)
	{
		while (node.getRight() != null)
			node = node.getRight();
		return node;
	}
	
	public Node<Object> insert (Node<Object> node, Object data)
	{
		if (root == null)
		{
			root = new Node(data, null, null, null);
			return node;
		}
		else if (node == null)
		{
			node = new Node(data, null, null, node.getParent());
			nodes ++;
			return node;
		}
		else
		{
			int comparsion = data.compareTo(node.getData());
			if (comparsion < 0)
				node= insert(node.getLeft(), data);
			else if (comparsion > 0)
				node = insert(node.getRight(), data);
			else
				node.setData(data);
			return node;
		}
	}
	
	public Node<Object> getRootNode()
	{
		return root;
	}
	
	
}