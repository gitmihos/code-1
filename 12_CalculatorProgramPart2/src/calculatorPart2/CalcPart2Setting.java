// Author: Miho Sekiya
// Date: 7/22/2022
// Assignment: 12_CalculatorProgram_Part2
// Class: Java CIS 016 (Summer2022)
package calculatorPart2;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.geometry.VPos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;

public class CalcPart2Setting {

	// Set general preferences for numpads
	private double bWidth = 800; // button width
	private double bHeight = 800; // button height
	private double cWidth = 800; // button width
	private double cHeight = 800; // button height
	private int bFont = 25; // FontSize

	// Set general preferences for display
	double lWidth = 2000; // label width
	double lHeight = 60; // label height
	int lFont = 50; // FontSize

	/** Settings for buttons **/
	// Create a pane to hold cells for buttons
	private GridPane centerGPane = new GridPane();
	// Create and initialize cells
	private paneCell[][] cell = new paneCell[6][4];
	// Create and initialize buttons
	Button[][] numButtons = new paneButton[6][4];
	// Create the characters
	private String[][] charNums = { { "C", "M", "M+", "%" },
			{ "√", "3√", "Pw", "/" }, { "7", "8", "9", "x" },
			{ "4", "5", "6", "-" }, { "1", "2", "3", "+" },
			{ "+/-", "0", ".", "=" } };

	/** Set the constructor */
	public CalcPart2Setting() {
	}

	/** Create top display */
	HBox getDisplay(Label mylabel) {

		// Create an HBox with 0px spacing
		HBox displayHBox = new HBox(0);

		// Set properties for the top HBox
		displayHBox.setAlignment(Pos.CENTER_RIGHT);
		displayHBox.setStyle(
				"-fx-background-color: gray; " + "-fx-border-color: gray; "
						+ "-fx-background-position: center;");

		// Add myLabel to HBox
		displayHBox.getChildren().add(mylabel);
		return displayHBox;
	} // End of getDisplay method

	/** Create numpads display */
	GridPane getNumpad() {
		// Set the pane cells and buttons in the GridPane using for loops
		for (int i = 0; i < 6; i++)
			for (int j = 0; j < 4; j++) {
				// Place pane cells and buttons into the GridPane "centerGPane"
				centerGPane.add(cell[i][j] = new paneCell(), j, i);
				centerGPane.add(numButtons[i][j] = new paneButton(), j, i);
				numButtons[i][j].setText(charNums[i][j]);
				GridPane.setHalignment(numButtons[i][j], HPos.CENTER);
				GridPane.setValignment(numButtons[i][j], VPos.CENTER);
			}
		// Set properties for the GridPane "centerGPane"
		centerGPane.setAlignment(Pos.CENTER);
		centerGPane.setStyle(
				"-fx-background-color: gray; " + "-fx-border-color: gray; "
						+ "-fx-background-position: center;");
		return centerGPane;
	} // End of getNumpad method

	// An inner class for a cell
	public class paneCell extends Pane {
		// Set the constructor: Set properties for the pane cells
		public paneCell() {
			setStyle("-fx-background-color: gray; " + "-fx-border-color: gray; "
					+ "-fx-background-position: center;");
			setPrefSize(cWidth, cHeight);
		} // End of Cell constructor method
	} // End of inner class Cell

	// An inner class for a button
	public class paneButton extends Button {
		// Set the constructor: Set properties for the pane cells
		public paneButton() {
			// Set properties for the buttons
			setStyle("-fx-text-fill: #505050");
			setFont(Font.font("Fantasy", FontWeight.EXTRA_LIGHT,
					FontPosture.REGULAR, bFont));
			setAlignment(Pos.CENTER);
			setPrefWidth(bWidth);
			setPrefHeight(bHeight);
			setPrefSize(bWidth, bHeight);
			setBackground(new Background(new BackgroundFill(Color.BLACK,
					new CornerRadii(10), new Insets(5))));
		} // End of numButton constructor method
	} // End of inner class numButton

} // End of Calculator class
