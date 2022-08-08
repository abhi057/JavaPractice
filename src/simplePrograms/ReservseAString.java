package simplePrograms;

public class ReservseAString {

	public static void main(String[] args) {

    String inputStr = "String is King";
    String reversedStr = "";
    
    char charArray[] = inputStr.toCharArray();
    
    for(int i= charArray.length-1; i>=0; i--) {
    	
    	reversedStr = reversedStr + charArray[i]; 
    	
    }
    
    System.out.println("Reversed String is:" +reversedStr);

	}

}
