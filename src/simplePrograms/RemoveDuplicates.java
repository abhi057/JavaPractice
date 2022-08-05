package simplePrograms;

import java.util.Arrays;
import java.util.LinkedHashSet;

public class RemoveDuplicates {

	public static void main(String[] args) {

		 

		String givenStr = "Java is a programming language and Python is also a programming language";

		System.out.println("Given String: "+givenStr);
		String words[] = givenStr.split(" ");
		String result = "";
		  
		
//Using loops
/*		for(int i=0; i< words.length; i ++) {
			for(int j=i+1; j< words.length; j++)
			{
				if(words[i].equals(words[j]))
				{
					words[j] = "remove";
				}
			}
		}
        
		for(String str : words)
		{
			if(str!="remove")
			{
				result = result + str + " "; 
			}
		}
 
*/		
//Using collections		
	

		LinkedHashSet<String> mySet = new LinkedHashSet<String>(Arrays.asList(words));

		for (String str : mySet) {
			result = result + str + " ";
		}

		System.out.println("Line after removing duplcate words: " + result);
 
	}

}
