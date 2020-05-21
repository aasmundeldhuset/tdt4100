package gui;

import javafx.event.EventHandler;
import javafx.scene.input.MouseEvent;

public class Controller implements EventHandler<MouseEvent> {
	@Override
	public void handle(MouseEvent event) {
		System.out.println(event);
	}
}
