package InterviewQuestionDay4;

import java.util.Arrays;

//Reverse an Array of integer in place..
//Using while loop

public class ReverseArray {
    
	public static void main(String[] args) {
	
		int [] numbers = {1,2,3,4,5};
		int i = 0;
		int j = numbers.length-1;
		int temp;
		while(i<j) {
			temp = numbers[i];
			numbers[i] = numbers[j];
			numbers[j] = temp;
			i++;
			j--;
			
			}
		
			System.out.print(Arrays.toString(numbers));
			
		}
		
			
		}
	


