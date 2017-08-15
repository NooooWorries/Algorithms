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
	
	/*
	 * 1: in order
	 * 2: pre order
	 * 3: post order
	*/
	public void print()
	{
		inOrder(root);
	}
	
	private void inOrder(Node<Object> node)
	{
		if (node != null)
		{
			inOrder(node.getLeft());
			System.out.println(node.getData());
			inOrder(node.getRight());
		}
	}
	
	private void preOrder(Node<Object> node)
	{
		System.out.println(node.getData());
		inOrder(node.getLeft());
		inOrder(node.getRight());
	}
	
	private void postOrder(Node<Object> node)
	{
		inOrder(node.getLeft());
		inOrder(node.getRight());
		System.out.println(node.getData());
	}
	
	public int search(Object data)
	{
		return searchRecursion(root, data);
	}
	
	private int searchRecursion(Node<Object> node, Object key)
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
	
	private Node<Object> searchInternal(Node<Object> node, Object key)
	{
		if (node == null)
			return null;	
		if (key.equals(node.getData()))
			return node;
		int comparsion = key.compareTo(node.getData());
		if (comparsion < 0)
			return searchInternal(node.getLeft(), key);
		else
			return searchInternal(node.getRight(), key);
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
	
	public void insert (Object data)
	{
		internalInsert(root, data);
	}
	
	public void delete (Object key)
	{
		internalDelete(root, key);
	}
	
	private void internalDelete(Node<Object> node, Object key)
	{
		Node target = searchInternal(root, key);
		if (target == null) return;
		
		if (target.getLeft() == null && target.getRight() == null)
		{
			target = null;
			nodes --;
		}
		else if (target.getLeft() != null && target.getRight() == null)
		{
			target.setData(target.getLeft().getData());
			target.setLeft(null);
			nodes --;
		}
		else if (target.getLeft() == null && target.getRight() != null)
		{
			target.setData(target.getRight().getData());
			target.setRight(null);
			nodes --;
		}
		else
		{
			Node parent = new Node();	
			while (node != null)
			{
				parent = node;
				node = node.getLeft();
			}
			target.setData(parent.getData());
			parent.getParent().setLeft(null);
		}
	}
	
	private void internalInsert (Node<Object> node, Object key)
	{
		Node<Object> parent = null;
		while (node != null)
		{
			parent = node;
			int comparsion = key.compareTo(node.getData());
			if (comparsion < 0)
				node = node.getLeft();
			else
				node = node.getRight();
		}
		Node newNode = new Node();
		newNode.setData(key);
		
		if (parent == null)
			root = newNode;
		else 
		{
			int comp = key.compareTo(parent.getData());
			if (comp < 0)
				parent.setLeft(newNode);
			else
				parent.setRight(newNode);
			newNode.setParent(parent);
		}	
		nodes++;
	}	
	
	
	
}