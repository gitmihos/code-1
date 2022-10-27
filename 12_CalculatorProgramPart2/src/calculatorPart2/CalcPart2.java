// Author: Miho Sekiya
// Date: 7/22/2022
// Assignment: 12_CalculatorProgram_Part2
// Class: Java CIS 016 (Summer2022)
package calculatorPart2;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.CornerRadii;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

public class CalcPart2 extends Application {

	@Override // Override the start method in the Application class
	public void start(Stage primaryStage) { // throws Exception {

	// Create CalFunc object cf
	CalcPart2Functions cf = new CalcPart2Functions();
	// Create Calculator object numpads
	CalcPart2Setting numpads = new CalcPart2Setting();	
		
	/** Set labels  **/
		Label myLabel = new Label("123456");

		myLabel.setText("0"); // Set initial number into the label
		// Set preferences for myLabel
		myLabel.setFont(Font.font("Fantasy", FontWeight.BOLD, FontPosture.REGULAR, numpads.lFont));
		myLabel.setStyle("-fx-border-color: gray;");
		myLabel.setAlignment(Pos.CENTER_RIGHT); // align text to the right side of the label.
		myLabel.setBackground(new Background(new BackgroundFill(Color.WHITE, new CornerRadii(3), new Insets(2))));
		myLabel.setLayoutX(10); // set the x location of the label
		myLabel.setLayoutY(10); // set the y location of the label
		myLabel.setPrefSize(numpads.lWidth, numpads.lHeight); // set the width and height of the label
		
		
	/** Set border pane and place parts **/
		BorderPane mainpane = new BorderPane();
		mainpane.setTop(numpads.getDisplay(myLabel));
		mainpane.setCenter(numpads.getNumpad());

	/** Mouse Events  **/
		numpads.numButtons[5][1].setOnMousePressed(e -> cf.btn0(myLabel));
		numpads.numButtons[4][0].setOnMousePressed(e -> cf.btn1(myLabel));
		numpads.numButtons[4][1].setOnMousePressed(e -> cf.btn2(myLabel));
		numpads.numButtons[4][2].setOnMousePressed(e -> cf.btn3(myLabel));
		numpads.numButtons[3][0].setOnMousePressed(e -> cf.btn4(myLabel));
		numpads.numButtons[3][1].setOnMousePressed(e -> cf.btn5(myLabel));
		numpads.numButtons[3][2].setOnMousePressed(e -> cf.btn6(myLabel));
		numpads.numButtons[2][0].setOnMousePressed(e -> cf.btn7(myLabel));
		numpads.numButtons[2][1].setOnMousePressed(e -> cf.btn8(myLabel));
		numpads.numButtons[2][2].setOnMousePressed(e -> cf.btn9(myLabel));
		numpads.numButtons[4][3].setOnMousePressed(e -> cf.btnplus(myLabel));
		numpads.numButtons[3][3].setOnMousePressed(e -> cf.btnminus(myLabel));
		numpads.numButtons[2][3].setOnMousePressed(e -> cf.btnmulti(myLabel));
		numpads.numButtons[1][3].setOnMousePressed(e -> cf.btndivide(myLabel));
		numpads.numButtons[5][3].setOnMousePressed(e -> cf.btnequal(myLabel));
		numpads.numButtons[0][0].setOnMousePressed(e -> cf.btnclear(myLabel));
		numpads.numButtons[0][1].setOnMousePressed(e -> cf.btnmemory(myLabel));
		numpads.numButtons[0][2].setOnMousePressed(e -> cf.btnmemoryP(myLabel));
		numpads.numButtons[5][0].setOnMousePressed(e -> cf.btnpn(myLabel));
		numpads.numButtons[5][2].setOnMousePressed(e -> cf.btndot(myLabel));
		numpads.numButtons[1][0].setOnMousePressed(e -> cf.btnSR(myLabel));
		numpads.numButtons[1][1].setOnMousePressed(e -> cf.btnCR(myLabel));
		numpads.numButtons[1][2].setOnMousePressed(e -> cf.btnPW(myLabel));
		numpads.numButtons[0][3].setOnMousePressed(e -> cf.btnpct(myLabel));
			
	/** Key Events **/
		mainpane.setOnKeyPressed(e -> {
			switch (e.getCode()) {
				case NUMPAD0: cf.btn0(myLabel); break;
				case NUMPAD1: cf.btn1(myLabel); break;
				case NUMPAD2: cf.btn2(myLabel); break;
				case NUMPAD3: cf.btn3(myLabel); break;
				case NUMPAD4: cf.btn4(myLabel); break;
				case NUMPAD5: cf.btn5(myLabel); break;
				case NUMPAD6: cf.btn6(myLabel); break;
				case NUMPAD7: cf.btn7(myLabel); break;
				case NUMPAD8: cf.btn8(myLabel); break;
				case NUMPAD9: cf.btn9(myLabel); break;
				case ADD: cf.btnplus(myLabel); break;
				case SUBTRACT: cf.btnminus(myLabel); break;
				case MULTIPLY: cf.btnmulti(myLabel); break;
				case DIVIDE: cf.btndivide(myLabel); break;
				case ENTER: cf.btnequal(myLabel); break;
				case CLEAR: cf.btnclear(myLabel); break;
				case PAGE_UP: cf.btnmemory(myLabel); break;
				case PAGE_DOWN: cf.btnmemoryP(myLabel); break;
				case EQUALS: cf.btnpn(myLabel); break;
				case PERIOD: cf.btndot(myLabel); break;
				case R: cf.btnSR(myLabel); break;
				case C: cf.btnCR(myLabel); break;
				case W: cf.btnPW(myLabel); break;
				case P: cf.btnpct(myLabel); break;
				default: ;
			}
		});

		/** Create a scene and place it in the stage **/
		Scene scene = new Scene(mainpane, 300, 400);
		primaryStage.setTitle("Easy on Eyes Calculator"); // Set the stage title
		primaryStage.setScene(scene); // Place the scene in the stage
		primaryStage.show(); // Display the stage
	}

	/** Main method **/
	public static void main(String[] args) {
		launch(args);
	}
}
