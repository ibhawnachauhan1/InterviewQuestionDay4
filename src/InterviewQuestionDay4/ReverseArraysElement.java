package InterviewQuestionDay4;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.stream.IntStream;

//Reverse an Array of integer in place..
//Using Stream API
public class ReverseArraysElement {
	
	public static void ReverseElement(int [] arr) {
		IntStream.range(0, arr.length/2).forEach(i ->{
			int temp = arr[i];
			arr[i] = arr[arr.length -i -1];
			arr[arr.length -i -1] = temp;
			
			
		});
		System.out.println("Reversed Array: " +Arrays.toString(arr));
		
	}
	

	public static void main(String[] args) {
		
   int [] arr = {1,2,3,4,5,6,7};
   ReverseElement(arr);
	}

}
