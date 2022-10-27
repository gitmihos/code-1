package bulgarianSolitaire;
import java.util.Scanner;
import java.util.ArrayList; 
//import java.util.Random;

public class PlayBulgarianSolitaire {

	// Main method  
	public static void main(String[] args) {
	// Create BulgarianSolitaire object
	    BulgarianSolitaire game = new BulgarianSolitaire();
	    
    // Create a Scanner
	    Scanner input = new Scanner(System.in);
    // Start the game by pressing s and call the initial card stack
	    System.out.print("Enter 's' to start playing Bulgarian Solitaire: ");
	    String letter = input.nextLine();
	    char ch = letter.charAt(0);
   	    if (ch == 's' ) {
   	    	// Initialize the first stack
   	    	ArrayList<Integer> list = 	game.initStack();
   	    	// Play the first round with the first stack
   	    	Boolean condition = game.playARound(list);
   	    	if (condition == true) {
   	    		System.out.println("Done");
   	    	}
   	    	else
   	    		System.out.println("Not Yet");
 
	    }
	    else {
	    	    System.out.println("Goodbye");
	    }
	    }  // End of Main 
	}  // End of class
	

