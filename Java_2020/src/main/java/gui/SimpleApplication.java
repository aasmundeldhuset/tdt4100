package gui;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class SimpleApplication extends Application {
	@Override
	public void start(Stage stage) throws Exception {
		GridPane root = FXMLLoader.load(getClass().getResource("/simpleApplication.fxml"));
		for (int i = 0; i <= 9; i++) {
			final int value = i;
			Button button = new Button("" + i);
			int row, column;
			if (i == 0) {
				row = 5;
				column = 1;
			} else {
				row = 4 - (i - 1) / 3;
				column = 1 + (i - 1) % 3;
			}
			System.out.println(i + " " + row + " " + column);
			GridPane.setRowIndex(button, row);
			GridPane.setColumnIndex(button, column);
			button.setOnMouseClicked(new EventHandler<MouseEvent>() {
				@Override
				public void handle(MouseEvent event) {
					System.out.println("Clicked: " + value);
				}
			});
			root.getChildren().add(button);
		}

		Scene scene = new Scene(root, 500, 500);

		stage.setScene(scene);
		stage.setTitle("BorderPaneApplication");
		stage.show();
	}

	public static void main(String[] args) {
		launch(SimpleApplication.class, args);
	}
}
