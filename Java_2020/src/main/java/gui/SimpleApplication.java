package gui;

import javafx.application.Application;
import javafx.event.EventType;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class SimpleApplication extends Application {
	@Override
	public void start(Stage stage) throws Exception {
		GridPane root = FXMLLoader.load(getClass().getResource("/simpleApplication.fxml"));

//		BorderPane root = new BorderPane();
//		root.setTop(new Text("top"));
//		root.setBottom(new Text("bottom"));
//		root.setLeft(new Text("left"));
//		root.setRight(new Text("right"));
//		root.setCenter(new Text("center"));

		Scene scene = new Scene(root, 500, 500);

		stage.setScene(scene);
		stage.setTitle("BorderPaneApplication");
		stage.show();
	}

	public static void main(String[] args) {
		launch(SimpleApplication.class, args);
	}
}
