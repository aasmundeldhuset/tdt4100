package gui;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class SimpleApplication extends Application {
	@Override
	public void start(Stage stage) throws Exception {
		GridPane root = FXMLLoader.load(getClass().getResource("/simpleApplication.fxml"));

//		Text text = new Text("Hello world!");
//		text.setFont(new Font("Times New Roman", 24));
//		root.getChildren().add(text);
//		GridPane.setRowIndex(text, 1);
//		GridPane.setColumnIndex(text, 1);
//
//		Button button = new Button("Click me!");
//		root.getChildren().add(button);
//		GridPane.setRowIndex(button, 1);
//		GridPane.setColumnIndex(button, 2);

		Scene scene = new Scene(root, 500, 500);

		stage.setScene(scene);
		stage.setTitle("My Application");
		stage.show();
	}

	public static void main(String[] args) {
		launch(SimpleApplication.class, args);
	}
}
