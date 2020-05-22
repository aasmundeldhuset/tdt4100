package gui;

import javafx.beans.property.DoubleProperty;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;

public class Controller implements EventHandler<MouseEvent> {
	private DoubleProperty value = new SimpleDoubleProperty(3);

	@Override
	public void handle(MouseEvent event) {
		Button button = (Button) event.getSource();
		int buttonValue = Integer.parseInt(button.textProperty().get());
		value.set(buttonValue);

		System.out.println(event);
	}

	public DoubleProperty valueProperty() {
		return value;
	}

	public double getValue() {
		return value.get();
	}
}
