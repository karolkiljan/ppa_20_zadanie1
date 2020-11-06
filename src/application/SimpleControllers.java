package application;

import java.lang.Math.*;

import javafx.fxml.FXML;
import javafx.event.ActionEvent;
import javafx.scene.control.TextArea;
import javafx.scene.control.ToggleButton;
import javafx.scene.control.ColorPicker;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.control.DatePicker;
import javafx.scene.control.ProgressBar;
import javafx.scene.control.TextField;


public class SimpleControllers {

	@FXML TextArea textArea;
	@FXML ToggleButton toggleButton;
	@FXML ColorPicker colorPicker;
	@FXML Pane pane;
	@FXML DatePicker datePicker;
	@FXML ProgressBar progress;
	@FXML TextField textInput;

	@FXML public void about(ActionEvent event) {
		textArea.textProperty().set("You clicked on 'About'");	
		
	}
	
    
	@FXML public void addAndRemoveTextAndRandomProgress(ActionEvent event) {            
		if(toggleButton.isSelected()) {                          
			textArea.textProperty().set(textArea.textProperty().get() + " \n klikniete!");    
		} else {                                                 
			textArea.textProperty().set(textArea.textProperty().get() + " odkilikniete!");             
		}    
		progress.setProgress(Math.random());
	}
	
	@FXML public void changeColor(ActionEvent event) {
		
		pane.setStyle("-fx-background-color: " + Color.web(colorPicker.getValue().toString()).toString().substring(2,colorPicker.getValue().toString().length())+ ";");		
	}
	
	@FXML public void addDateToTextArea(ActionEvent event) {
		textArea.textProperty().set(textArea.textProperty().get() + "\n" + datePicker.valueProperty().get());
	}
	
    
	
}
