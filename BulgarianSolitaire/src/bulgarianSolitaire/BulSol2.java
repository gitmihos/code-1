package bulgarianSolitaire;
import java.util.Random;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class BulSol2 {

	// Create the target state stack in another array
	static Integer[] targetList = {1, 2, 3, 4, 5, 6, 7, 8, 9};
	static ArrayList<Integer> targetStack = new ArrayList<>(Arrays.asList(targetList));
	static ArrayList<Integer> stackList = new ArrayList<>();	
	static int max = 45;   // Set max number of cards
//	boolean condition;   // Set condition if stack equals target stack 
	
	// Set the constructor
	public void BulSol() {
	}
	
	// Initialize a stack: generate, print, sort, check condition
	public static boolean initStack() {
	   	// Generate an array stackList of random numbers up to max 
		int i = 0, sum = 0;
			while (sum < max && i  <= max) {
	   	    	int ranNum = getRandomNumber();  // Generate a random number method
	            stackList.add(ranNum);
	   	        sum += ranNum;  // Adding each element value to sum
			}  // End of while

			//  Adjust the last element so the sum equals max 
			if (sum > max) {
				       int lastIndex = stackList.size() - 1;
				       int revisedNum = stackList.get(lastIndex) - (sum - max);
				       stackList.add(revisedNum);
				       stackList.remove(lastIndex);
			}  // End of if
			
			// Print the number of cards in each elements and separator
			    printStack(stackList);
			    System.out.println("------------");
			 // Sort the stack  
			    sortStack(stackList);
			 // Check the condition
                return checkStack(stackList);
			 
	}  // End of initStack method
		
	// Play a round: subtract 1 card, sort, print, check condition
	public static boolean playRound(ArrayList<Integer> array) {
		// Set a new stack
		newStack(array);
		 // Sort the stack  
	    sortStack(array);
		// Print the number of cards in each elements
	    printStack(array);
	 // Check the condition
        return checkStack(array);
	    }  // End of playARound method

	 // Generate a random number
	 public static int getRandomNumber() {
	    // Generate random values from 1 to 45
	    Random rand = new Random();
	    int intRandom = rand.nextInt(max) + 1;   
//	    System.out.println(intRandom);  // Checking
	    return intRandom;
		}  // End of getRandomNumber method

		// Set a new stack: subtract 1 from each element, add an element
		public static void newStack(ArrayList<Integer> array) {
			for (int i=0; i < array.size(); i++) {
				int subtractedNum = array.get(i) - 1;
//				System.out.println(subtractedNum);  // checking 
//				if (subtractedNum == 0)
//						array.remove(i);
//				else
					array.set(i, subtractedNum);
			} // End of for loop
	    		array.add(array.size());
	    		setStackList(array);
		}
	  
	  // Print the number of cards in each elements
	  public static void printStack(ArrayList array) {
			 for (int i = 0; i < array.size(); i++) {
			        System.out.print(array.get(i) + " ");     
				 }  // End of for loop
			 System.out.println();
	  }  // End of printStack method

	  // Sort the stack
	  public static ArrayList<Integer> sortStack(ArrayList<Integer> array) {
			Collections.sort(array); 		  
			int sum = 0; 
			// remove 0
			for (int i=0; i < array.size(); i++) {
				if (array.get(i) == 0)
					sum++;	
			}	
			for (int x=0; x < sum; x++) {
				array.remove(x);
			
			//					array.remove(i);
			}  // End of for loop
			return array;
	  }
	  
	  // Check the condition
	  public static boolean checkStack(ArrayList array) {
          System.out.println(stackList);
		  return  (targetStack.equals(array)) ;
	  }
		 
	  // Set the new stack 
	  public static void setStackList(ArrayList<Integer> array) {
	    stackList = array;
	  }  // End of setStackList method
	  
	  // Get the stack
	  public static ArrayList<Integer> getStackList(){
		  return stackList;
	  } // End of getStackList method

} // End of Class
