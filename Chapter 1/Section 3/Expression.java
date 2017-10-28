import java.util.*;
import java.math.*;

public class Expression 
{
	public static void main(String[] args) 
	{
		Stack<String> ops = new Stack<String>();
		Stack<Double> values = new Stack<Double>();
		String expression = args[0];
		
		int strLength = expression.length();
		for (int i = 0; i < strLength; i ++)
		{
			char valueChar = expression.charAt(i);
			String valueStr = String.valueOf(valueChar);
			
			// Push operator
			if (valueStr.equals("("));
			else if (valueStr.equals("+"))
				ops.push(valueStr);
			else if (valueStr.equals("-"))
				ops.push(valueStr);
			else if (valueStr.equals("*"))
				ops.push(valueStr);
			else if (valueStr.equals("/"))
				ops.push(valueStr);
			else if (valueStr.equals("sqrt"))
				ops.push(valueStr);
			else if (valueStr.equals(")"))
			{
				String operator = ops.pop();
				double value = values.pop();
				if (operator.equals("+"))
					value = value + values.pop();
				else if (operator.equals("-"))
					value = value - values.pop();
				else if (operator.equals("*"))
					value = value * values.pop();
				else if (operator.equals("/"))
					value = value / values.pop();
				else if (operator.equals("sqrt"))
					value = Math.sqrt(value);
				values.push(value);
			}
			else
				values.push(Double.parseDouble(valueStr));				
		}
		System.out.println("Result: " + values.pop());
		
	}
}