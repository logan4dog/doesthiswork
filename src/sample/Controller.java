package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;

import javafx.scene.control.TextArea;
import javafx.scene.text.Text;

import static javafx.application.Platform.exit;


public class Controller  {
    @FXML
    public Text mytext;
    public TextArea mytextarea;

  public void initialize() {
    mytext.setText("Hello World from initialize!");
    mytextarea.setPrefRowCount(5);

  }
  private void init() {


  }


  public void handleButtonAction(ActionEvent actionEvent) {
    mytext.setText("Hello World after button click!");
  }

  public void handleCloseAction(ActionEvent actionEvent) {
    exit();
  }

  public void handleSaveFileAction(ActionEvent actionEvent) {

  }
}
