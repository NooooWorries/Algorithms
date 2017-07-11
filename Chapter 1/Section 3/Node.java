import java.util.*;

public class Node<Object>
{
	// Variables
	private Object data;
	private Node next;
	private Node previous;
		
	// Constructors
	Node()
	{
		// Accept nothing
	}
		
	Node(Object data)
	{
		this.data = data;
		this.next = null;
		this.previous = null;
	}
	
	public Object getData()
	{
		return data;
	}
	
	public Node getNext()
	{
		return next;
	}
	
	public Node getPrevious()
	{
		return previous;
	}
	
	public void setData(Object data)
	{
		this.data = data;
	}
	
	public void setNext(Node next)
	{
		this.next = next;
	}
	
	public void setPrevious(Node previous)
	{
		this.previous = previous;
	}
}