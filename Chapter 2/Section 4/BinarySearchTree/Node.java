public class Node<Object extends Comparable<? super Object>>
{
	private Object data;
	private Node<Object> left;
	private Node<Object> right;
	private Node <Object>parent;
	
	Node()
	{
		data = null;
		left = null;
		right = null;
		parent = null;
	}
	
	Node(Object data, Node<Object> left, Node<Object> right, Node<Object> parent)
	{
		this.data = data;
		this.left = left;
		this.right = right;
		this.parent = parent;
	}
	
	public void setData(Object data)
	{
		this.data = data;
	}
	
	public void setLeft(Node<Object> left)
	{
		this.left = left;
	}
	
	public void setRight(Node<Object> right)
	{
		this.right = right;
	}
	
	public void setParent(Node<Object> parent)
	{
		this.parent = parent;
	}
	
	public Object getData()
	{
		return data;
	}
	
	public Node<Object> getLeft()
	{
		return left;
	}
	
	public Node<Object> getRight()
	{
		return right;
	}
	
	public Node<Object> getParent()
	{
		return parent;
	}
	
	
	
}