package bulgarianSolitaire;
//import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class BulgarianSolitaire {
    
	// Create the target state stack in another array
	static Integer[] targetList  = {1, 2, 3, 4, 5, 6, 7, 8, 9};
	static ArrayList<Integer> targetStack = new ArrayList<>(Arrays.asList(targetList));
	static ArrayList<Integer> stackList = new ArrayList<>();
	
	public static ArrayList<Integer> initStack() {
	   	   // Generate an array of random numbers up to 45
//			ArrayList<Integer> stackList = new ArrayList<>();
			int i = 0, sum = 0;
			while (sum < 45 && i  <= 45) {
	   	    	int ranNum = getRandomNumber();
	            stackList.add(ranNum);
	   	        sum += ranNum;
			}  // End of while

			//  Adjust the last element so the sum is 45 
			if (sum > 45) {
				       int lastIndex = stackList.size() - 1;
				       int revisedNum = stackList.get(lastIndex) - (sum - 45);
				       stackList.add(revisedNum);
				       stackList.remove(lastIndex);
			}  // End of if
			// Print the number of cards in each stack
			 for (int x = 0; x < stackList.size(); x++) {
		        System.out.print(stackList.get(x) + " ");     
			 }  // End of for loop
			 return stackList;
	}  // End of initStack method
	
	public static int getRandomNumber() {
	    // Generate random values from 1 to 45
	    Random rand = new Random();
	    int intRandom = rand.nextInt(45) + 1;   
	    return intRandom;
		}  // End of getRandomNumber method
	
	public static boolean playARound(ArrayList<Integer> thisRound) {
		// Check if the target has reached
		Collections.sort(thisRound); 
		System.out.println(thisRound);  // checking round array
		System.out.println(targetStack);  // checking target array
		if (targetStack.equals(thisRound)) {
			return true;
		}
		else {
			// Create a new set by calling newStack method
			ArrayList<Integer> newRound = newStack(thisRound);	
			System.out.println(newRound);  // checking 
			
		}
		return  false;
	    }  // End of playARound method

	public static ArrayList<Integer> newStack(ArrayList<Integer> array) {
		for (int i=0; i < array.size(); i++) {
			int subtractedNum = array.get(i) - 1;
			System.out.println(subtractedNum);  // checking 
			array.set(i, subtractedNum);
		} // End of for loop
//		int numNewStack = array.size();
//    		array.add(numNewStack);
    		array.add(array.size());
			return array;
	}

}  // End of Class

