// Author: Miho Sekiya
// Date: 6/24/2022
// Assignment: 08b Bulgarian Solitaire
// Class: Java CIS 016 (Summer2022)

package bulgarianSolitaire;

public class PlayBulSol {
	public static void main(String[] args) {

		// Create BulgarianSolitaire object game
		BulSol game = new BulSol();

		// Start the game
		game.greetingMessage();

		while (game.startGame()) {

			// Call initStack method for getting default stack and set condition
			game.condition = game.initStack();

			// Play rounds until reaching the target
			while (game.condition == false) {
				// Play the first round with the first stack
				game.condition = game.playRound(game.stackList);
				game.lines++;
			} // End of while loop 1

			//  Display the result and prompt the user to play or quit
			game.endRound();
		} // End of while loop 2

	} // End of main method
} // End of class
