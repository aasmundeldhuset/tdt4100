package gui;

import javafx.beans.property.DoubleProperty;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;

import java.util.Arrays;

public class Controller implements EventHandler<MouseEvent> {
	private DoubleProperty value = new SimpleDoubleProperty(0);
	private boolean decimalMode;
	private int decimalDivisor = 10;

	@Override
	public void handle(MouseEvent event) {
		Button button = (Button) event.getSource();
		if (button.getText().equals(".")) {
			decimalMode = true;
		}
	}

	public void handleDigit(MouseEvent event) {
		Button button = (Button) event.getSource();
		int digit = Integer.parseInt(button.getText());
		if (decimalMode) {
			value.setValue(value.getValue() + digit / (double) decimalDivisor);
			decimalDivisor *= 10;
		} else {
			value.setValue(value.getValue() * 10 + digit);
		}
	}

	public DoubleProperty valueProperty() {
		return value;
	}

	public double getValue() {
		return value.get();
	}
}
