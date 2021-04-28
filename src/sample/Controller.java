package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

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
    init();

  }
  private void init() {

    CongressHearing h1 =  new CongressHearing("Senate",
      "Nomination-Kahl","Room SD-106, Dirksen Senate Office Building",
      "Thursday, March 4, 2021. 09:30AM", CongressHearing.Ofdaytime.AM);
      Class<?> c = h1.getClass();
      Method[] allMethods = c.getDeclaredMethods();
    for (Method m : allMethods) {
      if (m.getName().startsWith("get") ) {
        try {
          mytextarea.appendText(m.invoke(h1).toString() + '\n');
        } catch (IllegalAccessException e) {
          e.printStackTrace();
        } catch (InvocationTargetException e) {
          e.printStackTrace();
        }
      }
    }
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
