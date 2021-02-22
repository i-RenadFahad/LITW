package litw;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.stage.Stage;
import org.hibernate.Session;
import org.hibernate.Transaction;


public class InfoController implements Initializable {
  @FXML
  private Button btnm;
  @FXML
  private Button btnum;
  @FXML
  TextField txt;
  static Player player; 
  
  @FXML
   private void ButtonBack(ActionEvent event) throws IOException { 
      LITW.buttons.play();
      Parent intro = FXMLLoader.load(getClass().getResource("Intro.fxml"));
      Scene introscen = new Scene(intro);
      Stage window =(Stage)((Node)event.getSource()).getScene().getWindow();
      window.setScene(introscen);
      window.show();
      
      intro.setOnKeyPressed(new EventHandler<KeyEvent>() {
      @Override
      public void handle(KeyEvent ke) {
      if (ke.getCode() == KeyCode.ESCAPE) {
      System.out.println("Key Pressed: " + ke.getCode());
      System.exit(0);}
       }
       });
    }   
     @FXML
    private void ButtonSave(ActionEvent event) throws IOException { 
      LITW.buttons.play();
      
      Parent Character = FXMLLoader.load(getClass().getResource("Character.fxml"));
      Scene Characterscene = new Scene(Character);
      Stage window =(Stage)((Node)event.getSource()).getScene().getWindow();
      window.setScene(Characterscene);
      window.show();
      
     Character.setOnKeyPressed(new EventHandler<KeyEvent>() {
     @Override
     public void handle(KeyEvent ke) {
     if (ke.getCode() == KeyCode.ESCAPE) {
     System.out.println("Key Pressed: " + ke.getCode());
     System.exit(0);}
      }
     });

      
     String tempN = null; 
     int tempL = 1;
     String tempC = null;
     int tempS = 0;
           
     
     tempN = txt.getText();
     tempC = "Emma";      
     
     player = new Player(tempN,tempL,tempC,tempS);     
    
      Session session = HibernateUtil.getSessionFactory().openSession();  
      Transaction tx = session.beginTransaction();
      String PN = " ";
      PN = session.save(player).toString();     
      tx.commit();  
      session.close();   

    }
    @Override
    public void initialize(URL url, ResourceBundle rb) {
       
    }    
     @FXML
      private void Mute(ActionEvent event) throws IOException {
      LITW.buttons.play();
      LITW.bgmusic.stop();
      
      btnm.setVisible(false);
      btnm.setDisable(true);
      
      btnum.setVisible(true);
      btnum.setDisable(false);
   }
   
   @FXML
   private void Unmute(ActionEvent event) throws IOException {
      LITW.buttons.play();
      LITW.bgmusic.play();
   
      btnum.setVisible(false);
      btnum.setDisable(true);
      
      btnm.setVisible(true);
      btnm.setDisable(false);
   }
}
