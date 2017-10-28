import javax.xml.soap.*;
import java.awt.*;

public class LinkedList<Object> 
{
	// Attributes
	private Node<Object> head;
	private Node<Object> tail;
	private Node<Object> current;
	private int size;
	
	// Constructors
	LinkedList()
	{
		head = null;
		tail = null;
		current = null;
		size = 0;
	}
	
	LinkedList (Object data)
	{
		head = new Node<Object>(data);
		tail = head;
		current = tail;
		size = 1;
	}
	
	public void addToHead(Object data)
	{
		// If the size of linked list is 0
		if (size == 0)
		{
			head = new Node<Object>(data);
			tail = head;
			current = tail;
			size = 1;
		}
		// If the size of linked list is higher than 0
		else 
		{
			Node<Object> node = new Node<Object>(data);
			head.setPrevious(node);
			node.setNext(head);
			head = node;
			size ++;
		}
		current = head;
	}
	
	public void addToTail(Object data)
	{
		// If the size of linked list is 0
		if (size == 0)
		{
			tail = new Node<Object>(data);
			head = tail;
			current = head;
			size = 1;
		}
		// if the size of linked list is higher than 0
		else 
		{
			Node<Object> node = new Node<Object>(data);
			tail.setNext(node);
			node.setPrevious(tail);
			tail = node;
			size ++;
		}
		current = tail;
	}
	
	
	public void addCurrent(Object data)
	{
		if (size == 0)
			addToHead(data);
		else if (size == 1)
		{
			Node<Object> node = new Node<Object>(data);
			head.setNext(node);
			node.setPrevious(head);
			tail = node;
			size = 2; 
			current = node;
		}
		else 
		{
			Node<Object> node = new Node<Object>(data);
			current.setNext(node);
			node.setNext(current.getNext());
			current.getNext().setPrevious(node);
			node.setPrevious(current);
			current = node;
			size ++;
		}
	}
	
	public Object removeHead()
	{
		if (size == 0)
			return null;
		else if (size == 1)
		{
			Object value = head.getData();
			head = null;
			tail = head;
			current = tail;
			size = 0;
			return value;
		}
		else
		{
			Object value = head.getData();
			Node<Object> tempNode = head;
			head = head.getNext();
			head.setPrevious(null);
			current = head;
			tempNode = null;
			size --;
			return value;
		}
	}
	
	public Object removeTail()
	{
		if (size == 0)
			return null;
		else if (size == 1)
		{
			Object value = tail.getData();
			tail = null;
			head = tail;
			current = head;
			size = 0;
			return value;
		}
		else 
		{
			Object value = tail.getData();
			Node<Object> tempNode = tail;
			tail = tail.getPrevious();
			tail.setNext(null);
			current = tail;
			tempNode = null;
			size --;
			return value;
		}	
	}
	
	public Object removeCurrent()
	{
		if (size == 0)
			return null;
		else if (size == 1)
		{
			Object value = current.getData();
			current = null;
			head = current;
			tail = head;
			size = 0;
			return value;
		}
		else 
		{
			Object value = current.getData();
			Node tempNode = current;
			current.getPrevious().setNext(current.getNext());
			current.getNext().setPrevious(current.getPrevious());
			current = current.getNext();
			tempNode = null;
			return value;
		}
	}
	
	public void forward()
	{
		current = current.getNext();
	}
	
	public void backward()
	{
		current = current.getPrevious();
	}
	
	public void moveToHead()
	{
		current = head;
	}
	
	public void moveToTail()
	{
		current = tail;
	}
	
	public Object getCurrent()
	{
		return current.getData();
	}
	
	public int getSize()
	{
		return size;
	}
}