package InterviewQuestionDay4;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class CmmnElement {
	// Given Two arrays of integers, write a java 8 program to find the common elements between them.
		//Using Enhanced Loop.
	public static void fetchCommonElement(int[] arr1, int[] arr2) {
		
		 List<Integer> fetchCommonElement = Arrays.stream(arr1).filter(number -> Arrays.stream(arr2).anyMatch(arr2Number -> arr2Number == number)).boxed().collect(Collectors.toList());
		
		System.out.println("Common Element in the Array is : "+ fetchCommonElement);
		
	}
	
	
	public static void main(String[] args) {
		

	
	int [] Array1 ={1,2,3,4,5,6};
	int [] Array2 ={4,5,6,7,8,9};
	
	fetchCommonElement(Array1,Array2);
	
	
}
}
