package InterviewQuestionDay4;

import java.util.Arrays;
import java.util.Comparator;


//Find the length of the Longest string.
//Stream API
public class FindLongestString {
	
	public static void LongestString( String [] strings ) {
		//calculating on the basis of number
		int maxlength=Arrays.stream(strings).mapToInt(string -> string.length()).max().orElse(0);
		System.out.println(maxlength);
		
		//calculating on the basis of string.
		String fetchmaxlengthString=Arrays.stream(strings).max(Comparator.comparingInt(String::length)).get();
		System.out.println(fetchmaxlengthString);
		
		String fetchmaxlengthStrings = Arrays.stream(strings).reduce((x, y)->x.length() > y.length()?x:y).get();
		System.out.println(fetchmaxlengthStrings);
	}

	public static void main(String[] args) {
		
   String [] string = {"Apple", "Banana", "Avocado","blueberry","Grapes"};
    LongestString(string);
	}

}
