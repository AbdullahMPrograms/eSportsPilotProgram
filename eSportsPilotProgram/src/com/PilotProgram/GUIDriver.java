package com.PilotProgram;

import javafx.application.Application;
import javafx.geometry.*;
import javafx.scene.*;
import javafx.scene.text.Font;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class GUIDriver extends Application {
	public void start(Stage stage) throws Exception {

		Label title = new Label("eSports Pilot Program");
		Font titleFont = new Font("Impact", 48);
		title.setFont(titleFont);
		title.setAlignment(Pos.TOP_CENTER);

		VBox vbox = new VBox(20);
		vbox.setAlignment(Pos.CENTER);
		// add hboxes for upper and lower row of buttons
		HBox buttonsHigh = new HBox(10);
		HBox buttonsLow = new HBox(10);

		// input for three upper buttons
		Button btnApex = new Button(null);
		Image imgApex = new Image(getClass().getResourceAsStream("Apex_legends_cover.jpg"));
		btnApex.setGraphic(new ImageView(imgApex));
		Button btnD2 = new Button(null);
		btnD2.setMaxSize(250, 300);
		Image imgD2 = new Image(getClass().getResourceAsStream("Destiny_2_(artwork).jpg"));
		btnD2.setGraphic(new ImageView(imgD2));
		Button btnFN = new Button(null);
		btnFN.setMaxSize(250, 300);
		Image imgFN = new Image(getClass().getResourceAsStream("FortniteCover.jpg"));
		btnFN.setGraphic(new ImageView(imgFN));

		// input for three lower buttons
		Button btnMC = new Button(null);
		Image imgMC = new Image(getClass().getResourceAsStream("Minecraft_cover.png"));
		btnMC.setGraphic(new ImageView(imgMC));
		Button btnVal = new Button(null);
		Image imgVal = new Image(getClass().getResourceAsStream("valheimcover.jpg"));
		btnVal.setGraphic(new ImageView(imgVal));
		Button btnFIF = new Button(null);
		Image imgFIF = new Image(getClass().getResourceAsStream("FIFAcover.jpg"));
		btnFIF.setGraphic(new ImageView(imgFIF));

		// align hboxes and give them the button values
		buttonsHigh.setAlignment(Pos.CENTER);
		buttonsHigh.getChildren().addAll(btnApex, btnD2, btnFN);
		buttonsLow.setAlignment(Pos.CENTER);
		buttonsLow.getChildren().addAll(btnMC, btnVal, btnFIF);

		// add hboxes to the main vbox
		vbox.getChildren().add(title);
		vbox.getChildren().add(buttonsHigh);
		vbox.getChildren().add(buttonsLow);

		// set scene for home/game selection
		Scene sceneMain = new Scene(vbox, 1200, 1200);
		stage.setScene(sceneMain);
		stage.setTitle("eSports Pilot Program");
		stage.show();

		// this code below is for scenes after "game buttons" are pressed

		// master vbox when apex is selected apex apex apex apex apex apex apex apex apex apex apex apex apex apex apex apex apexapex apex apex apex apex
		VBox vboxApex = new VBox(20);
		Label titleApex = new Label("Apex Legends");
		titleApex.setFont(titleFont);

		// resolution dropdown menu
		ComboBox<String> resListApex = new ComboBox<>();
		resListApex.getItems().addAll("1920x1080", "1920x1200", "1900x1440");
		resListApex.setPromptText("Select A Resolution");

		// Font to use for all textfields
		Font txtFont = new Font("Arial", 32);

		// Hbox for text fields for input check
		HBox txtApex = new HBox(20);

		// input txt field size and values etc.
		TextField hapticFeedApex = new TextField();
		hapticFeedApex.setFont(txtFont);
		hapticFeedApex.setMinSize(300, 100);
		hapticFeedApex.setText("HAPTIC FEED");
		hapticFeedApex.setAlignment(Pos.CENTER);
		hapticFeedApex.setDisable(true);

		TextField damageFeedApex = new TextField();
		damageFeedApex.setFont(txtFont);
		damageFeedApex.setMinSize(300, 100);
		damageFeedApex.setText("DAMAGE FEED");
		damageFeedApex.setAlignment(Pos.CENTER);
		damageFeedApex.setDisable(true);

		// Input txt field values into hbox
		txtApex.getChildren().addAll(hapticFeedApex, damageFeedApex);
		txtApex.setAlignment(Pos.CENTER);

		// Font to use in all buttons on each scene
		Font buttonFont = new Font("Animo", 24);

		// horizontal for the two buttons
		HBox buttonsApex = new HBox(20);

		// inputs values for the buttons
		buttonsApex.setAlignment(Pos.BOTTOM_CENTER);
		Button backBtnApex = new Button("BACK");
		backBtnApex.setFont(buttonFont);
		backBtnApex.setMinSize(200, 80);

		Button startBtnApex = new Button("START");
		startBtnApex.setMinSize(200, 80);
		startBtnApex.setFont(buttonFont);

		// adds button values to hbox
		buttonsApex.getChildren().addAll(backBtnApex, startBtnApex);

		// adds all hboxes etc. to master vbox
		vboxApex.setAlignment(Pos.TOP_CENTER);
		vboxApex.getChildren().add(titleApex);
		vboxApex.getChildren().add(resListApex);
		vboxApex.getChildren().add(txtApex);
		vboxApex.getChildren().add(buttonsApex);

		// add master vbox for D2 screen DESTINY 2 DESTINY 2 DESTINY 2 DESTINY 2 DESTINY 2 DESTINY 2 DESTINY 2 DESTINY 2 DESTINY 2 DESTINY 2 DESTINY 2 DESTINY 2 DESTINY 2 DESTINY 2
		VBox vboxD2 = new VBox(20);
		Label titleD2 = new Label("Destiny 2");
		titleD2.setFont(titleFont);

		// resolution dropdown menu
		ComboBox<String> resListD2 = new ComboBox<>();
		resListD2.getItems().addAll("1920x1080", "1920x1200", "1900x1440");
		resListD2.setPromptText("Select A Resolution");

		// Hbox for text fields for input check
		HBox txtD2 = new HBox(20);

		// input txt field size and values etc.
		TextField hapticFeedD2 = new TextField();
		hapticFeedD2.setFont(txtFont);
		hapticFeedD2.setMinSize(300, 100);
		hapticFeedD2.setText("HAPTIC FEED");
		hapticFeedD2.setAlignment(Pos.CENTER);
		hapticFeedD2.setDisable(true);

		TextField damageFeedD2 = new TextField();
		damageFeedD2.setFont(txtFont);
		damageFeedD2.setMinSize(300, 100);
		damageFeedD2.setText("DAMAGE FEED");
		damageFeedD2.setAlignment(Pos.CENTER);
		damageFeedD2.setDisable(true);

		// Input txt field values into hbox
		txtD2.getChildren().addAll(hapticFeedD2, damageFeedD2);
		txtD2.setAlignment(Pos.CENTER);

		// horizontal for the two buttons
		HBox buttonsD2 = new HBox(20);

		// inputs values for the buttons
		buttonsD2.setAlignment(Pos.BOTTOM_CENTER);
		Button backBtnD2 = new Button("BACK");
		backBtnD2.setFont(buttonFont);
		backBtnD2.setMinSize(200, 80);

		Button startBtnD2 = new Button("START");
		startBtnD2.setMinSize(200, 80);
		startBtnD2.setFont(buttonFont);

		// adds button values to hbox
		buttonsD2.getChildren().addAll(backBtnD2, startBtnD2);

		// adds all hboxes etc. to master vbox
		vboxD2.setAlignment(Pos.TOP_CENTER);
		vboxD2.getChildren().add(titleD2);
		vboxD2.getChildren().add(resListD2);
		vboxD2.getChildren().add(txtD2);
		vboxD2.getChildren().add(buttonsD2);

		// screen when Fornite is selected FORTINTE FORNITE FORTINTE FORNITE FORTINTE FORNITE FORTINTE FORNITE FORTINTE FORNITE FORTINTE FORNITE	
		VBox vboxFN = new VBox(20);
		Label titleFN = new Label("Fortnite");
		titleFN.setFont(titleFont);

		// resolution dropdown menu
		ComboBox<String> resListFN = new ComboBox<>();
		resListFN.getItems().addAll("1920x1080", "1920x1200", "1900x1440");
		resListFN.setPromptText("Select A Resolution");

		// Hbox for text fields for input check
		HBox txtFN = new HBox(20);

		// input txt field size and values etc.
		TextField hapticFeedFN = new TextField();
		hapticFeedFN.setFont(txtFont);
		hapticFeedFN.setMinSize(300, 100);
		hapticFeedFN.setText("HAPTIC FEED");
		hapticFeedFN.setAlignment(Pos.CENTER);
		hapticFeedFN.setDisable(true);

		TextField damageFeedFN = new TextField();
		damageFeedFN.setFont(txtFont);
		damageFeedFN.setMinSize(300, 100);
		damageFeedFN.setText("DAMAGE FEED");
		damageFeedFN.setAlignment(Pos.CENTER);
		damageFeedFN.setDisable(true);

		// Input txt field values into hbox
		txtFN.getChildren().addAll(hapticFeedFN, damageFeedFN);
		txtFN.setAlignment(Pos.CENTER);


		// horizontal for the two buttons
		HBox buttonsFN = new HBox(20);

		// inputs values for the buttons
		buttonsFN.setAlignment(Pos.BOTTOM_CENTER);
		Button backBtnFN = new Button("BACK");
		backBtnFN.setFont(buttonFont);
		backBtnFN.setMinSize(200, 80);

		Button startBtnFN = new Button("START");
		startBtnFN.setMinSize(200, 80);
		startBtnFN.setFont(buttonFont);

		// adds button values to hbox
		buttonsFN.getChildren().addAll(backBtnFN, startBtnFN);

		// adds all hboxes etc. to master vbox
		vboxFN.setAlignment(Pos.TOP_CENTER);
		vboxFN.getChildren().add(titleFN);
		vboxFN.getChildren().add(resListFN);
		vboxFN.getChildren().add(txtFN);
		vboxFN.getChildren().add(buttonsFN);
		
		//vbox for minecraft screen minecraft minecraft minecraft minecraft minecraft minecraft minecraft minecraft minecraft minecraft minecraft minecraft minecraft
		VBox vboxMC = new VBox(20);
		Label titleMC = new Label("Minecraft");
		titleMC.setFont(titleFont);

		// resolution dropdown menu
		ComboBox<String> resListMC = new ComboBox<>();
		resListMC.getItems().addAll("1920x1080", "1920x1200", "1900x1440");
		resListMC.setPromptText("Select A Resolution");

		// Hbox for text fields for input check
		HBox txtMC = new HBox(20);

		// input txt field size and values etc.
		TextField hapticFeedMC = new TextField();
		hapticFeedMC.setFont(txtFont);
		hapticFeedMC.setMinSize(300, 100);
		hapticFeedMC.setText("HAPTIC FEED");
		hapticFeedMC.setAlignment(Pos.CENTER);
		hapticFeedMC.setDisable(true);

		TextField damageFeedMC = new TextField();
		damageFeedMC.setFont(txtFont);
		damageFeedMC.setMinSize(300, 100);
		damageFeedMC.setText("DAMAGE FEED");
		damageFeedMC.setAlignment(Pos.CENTER);
		damageFeedMC.setDisable(true);

		// Input txt field values into hbox
		txtMC.getChildren().addAll(hapticFeedMC, damageFeedMC);
		txtMC.setAlignment(Pos.CENTER);


		// horizontal for the two buttons
		HBox buttonsMC = new HBox(20);

		// inputs values for the buttons
		buttonsMC.setAlignment(Pos.BOTTOM_CENTER);
		Button backBtnMC = new Button("BACK");
		backBtnMC.setFont(buttonFont);
		backBtnMC.setMinSize(200, 80);

		Button startBtnMC = new Button("START");
		startBtnMC.setMinSize(200, 80);
		startBtnMC.setFont(buttonFont);

		// adds button values to hbox
		buttonsMC.getChildren().addAll(backBtnMC, startBtnMC);

		// adds all hboxes etc. to master vbox
		vboxMC.setAlignment(Pos.TOP_CENTER);
		vboxMC.getChildren().add(titleMC);
		vboxMC.getChildren().add(resListMC);
		vboxMC.getChildren().add(txtMC);
		vboxMC.getChildren().add(buttonsMC);
		
		//master vbox for Valheim Valheim Valheim Valheim Valheim Valheim Valheim Valheim Valheim Valheim Valheim Valheim Valheim Valheim Valheim Valheim Valheim Valheim
		VBox vboxVal = new VBox(20);
		Label titleVal = new Label("Minecraft");
		titleVal.setFont(titleFont);

		// resolution dropdown menu
		ComboBox<String> resListVal = new ComboBox<>();
		resListVal.getItems().addAll("1920x1080", "1920x1200", "1900x1440");
		resListVal.setPromptText("Select A Resolution");

		// Hbox for text fields for input check
		HBox txtVal = new HBox(20);

		// input txt field size and values etc.
		TextField hapticFeedVal = new TextField();
		hapticFeedVal.setFont(txtFont);
		hapticFeedVal.setMinSize(300, 100);
		hapticFeedVal.setText("HAPTIC FEED");
		hapticFeedVal.setAlignment(Pos.CENTER);
		hapticFeedVal.setDisable(true);

		TextField damageFeedVal = new TextField();
		damageFeedVal.setFont(txtFont);
		damageFeedVal.setMinSize(300, 100);
		damageFeedVal.setText("DAMAGE FEED");
		damageFeedVal.setAlignment(Pos.CENTER);
		damageFeedVal.setDisable(true);

		// Input txt field values into hbox
		txtVal.getChildren().addAll(hapticFeedVal, damageFeedVal);
		txtVal.setAlignment(Pos.CENTER);


		// horizontal for the two buttons
		HBox buttonsVal = new HBox(20);

		// inputs values for the buttons
		buttonsVal.setAlignment(Pos.BOTTOM_CENTER);
		Button backBtnVal = new Button("BACK");
		backBtnVal.setFont(buttonFont);
		backBtnVal.setMinSize(200, 80);

		Button startBtnVal = new Button("START");
		startBtnVal.setMinSize(200, 80);
		startBtnVal.setFont(buttonFont);

		// adds button values to hbox
		buttonsVal.getChildren().addAll(backBtnVal, startBtnVal);

		// adds all hboxes etc. to master vbox
		vboxVal.setAlignment(Pos.TOP_CENTER);
		vboxVal.getChildren().add(titleVal);
		vboxVal.getChildren().add(resListVal);
		vboxVal.getChildren().add(txtVal);
		vboxVal.getChildren().add(buttonsVal);
		
		//master vbox for FIFA FIFA FIFA FIFA FIFA FIFA FIFA FIFA FIFA FIFA FIFA FIFA FIFA FIFA FIFA FIFA FIFA FIFA FIFA FIFA FIFA FIFA FIFA FIFA FIFA FIFA
		VBox vboxFIF = new VBox(20);
		Label titleFIF = new Label("FIFA");
		titleFIF.setFont(titleFont);

		// resolution dropdown menu
		ComboBox<String> resListFIF = new ComboBox<>();
		resListFIF.getItems().addAll("1920x1080", "1920x1200", "1900x1440");
		resListFIF.setPromptText("Select A Resolution");

		// Hbox for text fields for input check
		HBox txtFIF = new HBox(20);

		// input txt field size and values etc.
		TextField hapticFeedFIF = new TextField();
		hapticFeedFIF.setFont(txtFont);
		hapticFeedFIF.setMinSize(300, 100);
		hapticFeedFIF.setText("HAPTIC FEED");
		hapticFeedFIF.setAlignment(Pos.CENTER);
		hapticFeedFIF.setDisable(true);

		TextField damageFeedFIF = new TextField();
		damageFeedFIF.setFont(txtFont);
		damageFeedFIF.setMinSize(300, 100);
		damageFeedFIF.setText("DAMAGE FEED");
		damageFeedFIF.setAlignment(Pos.CENTER);
		damageFeedFIF.setDisable(true);

		// Input txt field values into hbox
		txtFIF.getChildren().addAll(hapticFeedFIF, damageFeedFIF);
		txtFIF.setAlignment(Pos.CENTER);


		// horizontal for the two buttons
		HBox buttonsFIF = new HBox(20);

		// inputs values for the buttons
		buttonsFIF.setAlignment(Pos.BOTTOM_CENTER);
		Button backBtnFIF = new Button("BACK");
		backBtnFIF.setFont(buttonFont);
		backBtnFIF.setMinSize(200, 80);

		Button startBtnFIF = new Button("START");
		startBtnFIF.setMinSize(200, 80);
		startBtnFIF.setFont(buttonFont);

		// adds button values to hbox
		buttonsFIF.getChildren().addAll(backBtnFIF, startBtnFIF);

		// adds all hboxes etc. to master vbox
		vboxFIF.setAlignment(Pos.TOP_CENTER);
		vboxFIF.getChildren().add(titleFIF);
		vboxFIF.getChildren().add(resListFIF);
		vboxFIF.getChildren().add(txtFIF);
		vboxFIF.getChildren().add(buttonsFIF);


		Scene sceneApex = new Scene(vboxApex, 1000, 600);
		Scene sceneD2 = new Scene(vboxD2, 1000, 600);
		Scene sceneFN = new Scene(vboxFN, 1000, 600);
		Scene sceneMC = new Scene(vboxMC, 1000, 600);
		Scene sceneVal = new Scene(vboxVal, 1000, 600);
		Scene sceneFIF = new Scene(vboxFIF, 1000, 600);

		//button to open apex screen
		btnApex.setOnAction(e -> {
			try {
				stage.setScene(sceneApex);
				stage.setTitle("Apex Legends");
				stage.show();
			} catch (Exception f) {
				System.out.println("An error has occured");
				System.out.println(f.getMessage());
			}
		});
		//button to go back to main
		backBtnApex.setOnAction(e -> {
			try {
				stage.setScene(sceneMain);
				stage.setTitle("eSports Pilot Program");
				stage.show();
			} catch (Exception f) {
				System.out.println("An error has occured");
				System.out.println(f.getMessage());
			}
		});
		//button to go to destiny screen
		btnD2.setOnAction(e -> {
			try {
				stage.setScene(sceneD2);
				stage.setTitle("Destiny 2");
				stage.show();
			} catch (Exception f) {
				System.out.println("An error has occured");
				System.out.println(f.getMessage());
			}
		});
		//button to go back to main
		backBtnD2.setOnAction(e -> {
			try {
				stage.setScene(sceneMain);
				stage.setTitle("eSports Pilot Program");
				stage.show();
			} catch (Exception f) {
				System.out.println("An error has occured");
				System.out.println(f.getMessage());
			}
		});
		//button to go to fortnite screen
		btnFN.setOnAction(e -> {
			try {
				stage.setScene(sceneFN);
				stage.setTitle("Fortnite");
				stage.show();
			} catch (Exception f) {
				System.out.println("An error has occured");
				System.out.println(f.getMessage());
			}
		});
		//button to go back to main from fortnite screen
		backBtnFN.setOnAction(e -> {
			try {
				stage.setScene(sceneMain);
				stage.setTitle("eSports Pilot Program");
				stage.show();
			} catch (Exception f) {
				System.out.println("An error has occured");
				System.out.println(f.getMessage());
			}
		});
		//button to open minecraft screen
		btnMC.setOnAction(e -> {
			try {
				stage.setScene(sceneMC);
				stage.setTitle("Minecraft");
				stage.show();
			} catch (Exception f) {
				System.out.println("An error has occured");
				System.out.println(f.getMessage());
			}
		});
		//button to go back to main from minecraft screen
		backBtnMC.setOnAction(e -> {
			try {
				stage.setScene(sceneMain);
				stage.setTitle("eSports Pilot Program");
				stage.show();
			} catch (Exception f) {
				System.out.println("An error has occured");
				System.out.println(f.getMessage());
			}
		});
		//button to open Valheim screen
		btnVal.setOnAction(e -> {
			try {
				stage.setScene(sceneVal);
				stage.setTitle("Valheim");
				stage.show();
			} catch (Exception f) {
				System.out.println("An error has occured");
				System.out.println(f.getMessage());
			}
		});
		//button to go back to main from Valheim screen
		backBtnVal.setOnAction(e -> {
			try {
				stage.setScene(sceneMain);
				stage.setTitle("eSports Pilot Program");
				stage.show();
			} catch (Exception f) {
				System.out.println("An error has occured");
				System.out.println(f.getMessage());
			}
		});
		//button to open FIFA screen
		btnFIF.setOnAction(e -> {
			try {
				stage.setScene(sceneFIF);
				stage.setTitle("FIFA");
				stage.show();
			} catch (Exception f) {
				System.out.println("An error has occured");
				System.out.println(f.getMessage());
			}
		});
		//button to go back to main from FIFA screen
		backBtnFIF.setOnAction(e -> {
			try {
				stage.setScene(sceneMain);
				stage.setTitle("eSports Pilot Program");
				stage.show();
			} catch (Exception f) {
				System.out.println("An error has occured");
				System.out.println(f.getMessage());
			}
		});



	}

	public static void main(String[] args) {
		launch(args);
	}
}
