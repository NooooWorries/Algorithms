public class Stack<Object> 
{
	// Attribute
	LinkedList<Object> list;
	
	// Constructors
	Stack()
	{
		list = new LinkedList<Object>();
	}
	
	Stack (Object data)
	{
		list = new LinkedList<Object>(data);
	}
	
	public Object pop()
	{
		return list.removeHead();
	}
	
	public void push (Object data)
	{
		list.addToHead(data);
	}
}