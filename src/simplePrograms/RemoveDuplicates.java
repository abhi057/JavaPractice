package simplePrograms;

import java.util.Arrays;
import java.util.LinkedHashSet;

public class RemoveDuplicates {

	public static void main(String[] args) {

		System.out.println("test");

		String givenStr = "Java is a programming language and Python is also a programming language";

		System.out.println("Given String: "+givenStr);
		String words[] = givenStr.split(" ");
		String result = "";

		LinkedHashSet<String> mySet = new LinkedHashSet<String>(Arrays.asList(words));

		for (String str : mySet) {
			result = result + str + " ";
		}

		System.out.println("Line after removing duplcaite words: " + result);
 
	}

}
