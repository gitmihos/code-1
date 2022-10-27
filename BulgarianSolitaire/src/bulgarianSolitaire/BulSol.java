// Author: Miho Sekiya
// Date: 6/24/2022
// Assignment: 08b Bulgarian Solitaire
// Class: Java CIS 016 (Summer2022)

package bulgarianSolitaire;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class BulSol {

	/** Create the target state stack in another array */
	private static int max = 45; // Set max number of cards
	private static Integer[] targetList = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
	private static ArrayList<Integer> targetStack = new ArrayList<>(Arrays.asList(targetList));
	ArrayList<Integer> stackList = new ArrayList<>();
	boolean condition; // Set condition if stack equals target stack
	int lines = 0;
	int best = 100;

	/** Set the constructor */
	public void BulSol() {
	}

	/** Initialize a stack: generate, print, sort, check condition */
	public boolean initStack() {
		// Generate an array stackList of random numbers up to max
		int i = 0, sum = 0;
		while (sum < max && i <= max) {
			int ranNum = getRandomNumber(); // Generate a random number method
			stackList.add(ranNum);
			sum += ranNum; // Adding each element value to sum
		} // End of while

		// Adjust the last element so the sum equals max
		if (sum > max) {
			int lastIndex = stackList.size() - 1;
			int revisedNum = stackList.get(lastIndex) - (sum - max);
			stackList.add(revisedNum);
			stackList.remove(lastIndex);
		} // End of if

		// Print the number of cards in each elements and separator
		System.out.println();
		printStack(stackList);
		System.out.println("------------");
		// Sort the stack
		sortStack(stackList);
		// Check the condition
		return checkStack(stackList);
	} // End of initStack method

	// Play a round: subtract 1 card, sort, print, check condition
	public boolean playRound(ArrayList<Integer> array) {
		// Set a new stack
		newStack(array);
		// Sort the stack
		sortStack(array);
		// Print the number of cards in each elements
		printStack(array);
		// Check the condition
		return checkStack(array);
	} // End of playARound method

	/** Generate a random number */
	public int getRandomNumber() {
		// Generate random values from 1 to 45
		Random rand = new Random();
		int intRandom = rand.nextInt(max) + 1;
//	    System.out.println(intRandom);  // Checking
		return intRandom;
	} // End of getRandomNumber method

	/** Set a new stack: subtract 1 from each element, add an element */
	public void newStack(ArrayList<Integer> array) {
		for (int i = 0; i < array.size(); i++) {
			int subtractedNum = array.get(i) - 1;
			array.set(i, subtractedNum);
		} // End of for loop
		array.add(array.size());
		setStackList(array);
	}

	/** Print the number of cards in each elements */
	public void printStack(ArrayList array) {
		for (int i = 0; i < array.size(); i++) {
			System.out.print(array.get(i) + " ");
		} // End of for loop
		System.out.println();
	} // End of printStack method

	/** Sort the stack */
	public ArrayList<Integer> sortStack(ArrayList<Integer> array) {
		Collections.sort(array);
		array.removeIf(n -> n == 0);
		return array;
	}

	/** Check the condition */
	public boolean checkStack(ArrayList array) {
		return (targetStack.equals(array));
	}

	/** Set the new stack */
	public void setStackList(ArrayList<Integer> array) {
		stackList = array;
	} // End of setStackList method

	/** Get the stack */
	public ArrayList<Integer> getStackList() {
		return stackList;
	} // End of getStackList method

	/** Display the greeting message */
	public void greetingMessage() {
		System.out.print("Welcome to Bulgarian Solitaire! \n\n");
	} // End of greetingMessage method

	/** Start the game by pressing s */
	public boolean startGame() {
		// Create a Scanner
		Scanner input = new Scanner(System.in);
		// Start the game by pressing s and call the initial card stack
		System.out.print("Enter 's' to start playing, or other keys to quit: ");
		String letter = input.nextLine();
		char ch = letter.charAt(0);
		if (ch == 's') {
			stackList.clear();
			return true;
		} else {
			System.out.println("\nGoodbye");
			return false;
		}
	} // End of startGame method

	/** Display and prompt user to play another or quit */
	public void endRound() {
		System.out.println("Done.  Total: " + lines + " lines.  Record: " + best + " lines\n");
		if (lines < best)
			best = lines;
		lines = 0;
	} // End of endRound method

} // End of Class
