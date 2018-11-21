package PaqueteBlur;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.scene.effect.GaussianBlur;
import javafx.scene.image.ImageView;

public class ControladorBlur {
	@FXML
	private ImageView view;
	@FXML
	public void setBlur() {
		view.setEffect(new GaussianBlur(20));
	}
	@FXML
	private void handleClose() {
		System.exit(0);
	}
	
}
