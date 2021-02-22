package litw;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class HomeController implements Initializable {

     
    @FXML
  private void ButtonAction(ActionEvent event) throws IOException {
      LITW.buttons.play();
      Parent introroot = FXMLLoader.load(getClass().getResource("Intro.fxml"));
      Scene introscene = new Scene(introroot);
      Stage window =(Stage)((Node)event.getSource()).getScene().getWindow();
      window.setScene(introscene);
      window.show();
    }
    
   
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
  
    }    
    
    
}
