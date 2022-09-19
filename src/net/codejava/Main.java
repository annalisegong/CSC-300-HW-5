package net.codejava;

public class Main 
{
	public static void main(String[] args) 
	{
		//implement a function to return the times of occurrence of a word in a string
		String text = "In the beginning God created the heavens and the earth.";
		String key = "the";
		int count = occurCount(text, key);
		
		System.out.println("'" + key + "' appears " + count + " times");
	}
	
	public static String removeSpace(String input)
	{
		String result = "";
		String legalChar = "abcdefghijklmnopqrstuvwxyz ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		for(int i = 0; i < input.length(); i++)
		{
			//when charAt(i) is alphabetic or space, we add it to the new string
			//solution 3 is regular expression
			
			//if(input.charAt(i) > 'a')
			if(legalChar.indexOf(input.charAt(i)) >= 0)
			{
				result = result + input.charAt(i);
			}
		}
		return result;
	}
	
	public static boolean stringCompareIgnoreCase(String input1, String input2)
	{
		return input1.toLowerCase().equals(input2.toLowerCase());
	}
	
	public static String[] SplitStringBySpace(String input)
	{
		return input.split(" ");
	}
	
	public static int occurCount(String text, String key)
	{
		int result = 0;
		//remove special characters
		String text1 = removeSpace(text);
		//split with spaces
		String [] array = text1.split(" ");
		//count occurrences of key
		for(int i = 0; i < array.length; i++)
		{
			if(stringCompareIgnoreCase(array[i], key))
			{
				result++;
			}
		}
		return result;
	}
}