package bulgarianSolitaire;

import java.util.ArrayList;

public class PlayBulSol2 {

	public static void main(String[] args) {

		// Create BulgarianSolitaire object game
	    BulSol game = new BulSol();
	    // Set condition for reaching the target
	    boolean condition = false;
	    
		// Call initStack method for getting default stack and set condition
		condition = BulSol.initStack();
		
        // Play rounds until reaching the target  		
		while (condition == false) {
		  	// Play the first round with the first stack
    	condition = BulSol.playRound(BulSol.stackList);		
		condition = BulSol.playRound(BulSol.stackList);		
		condition = BulSol.playRound(BulSol.stackList);			
		condition = BulSol.playRound(BulSol.stackList);			
		condition = BulSol.playRound(BulSol.stackList);			
		condition = BulSol.playRound(BulSol.stackList);			
		condition = BulSol.playRound(BulSol.stackList);			
		condition = BulSol.playRound(BulSol.stackList);			
		condition = BulSol.playRound(BulSol.stackList);			
		condition = BulSol.playRound(BulSol.stackList);			
		condition = BulSol.playRound(BulSol.stackList);			
		condition = BulSol.playRound(BulSol.stackList);			
		condition = BulSol.playRound(BulSol.stackList);			
		condition = BulSol.playRound(BulSol.stackList);			
		condition = BulSol.playRound(BulSol.stackList);			
		condition = BulSol.playRound(BulSol.stackList);			
		condition = BulSol.playRound(BulSol.stackList);			
		condition = BulSol.playRound(BulSol.stackList);			
		condition = BulSol.playRound(BulSol.stackList);			
		condition = BulSol.playRound(BulSol.stackList);			
		condition = BulSol.playRound(BulSol.stackList);			
		condition = BulSol.playRound(BulSol.stackList);			
		condition = BulSol.playRound(BulSol.stackList);			
		condition = BulSol.playRound(BulSol.stackList);			
		condition = BulSol.playRound(BulSol.stackList);			
			condition = BulSol.playRound(BulSol.stackList);			
			condition = BulSol.playRound(BulSol.stackList);			
			condition = BulSol.playRound(BulSol.stackList);			
		 	condition = BulSol.playRound(BulSol.stackList);			
			condition = BulSol.playRound(BulSol.stackList);			
			condition = BulSol.playRound(BulSol.stackList);			
     		condition = BulSol.playRound(BulSol.stackList);			
			condition = BulSol.playRound(BulSol.stackList);			
		}  // End of while loop
		System.out.println("Done");
	    
//	    System.out.println(BulSol.stackList);  // Checking
//	    System.out.println(BulSol.targetStack);  // Checking
//	    System.out.println(condition);  // Checking
	    
	    
		
	}  // End of main method

}  // End of class
