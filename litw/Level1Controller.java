package litw;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.animation.KeyFrame;
import javafx.animation.PauseTransition;
import javafx.animation.Timeline;
import static javafx.application.Application.STYLESHEET_CASPIAN;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Group;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.media.AudioClip;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;
import javafx.util.Duration;
import org.hibernate.Session;
import org.hibernate.Transaction;


public class Level1Controller extends CongController implements Initializable {
    
   
  @FXML
  private Group idleB;
  @FXML
  static boolean pass = false;
  @FXML
  private  Label lb;
  @FXML
  final Integer startime = 60;
  @FXML
  private Integer sec = startime;
  @FXML
  private Group idleG;
  @FXML
  private TextField TF;
  @FXML
  private TextField TF2;
  @FXML
  private TextField TF3;
  @FXML
  private TextField TF4;
  @FXML
  private  Label message;
  @FXML
  private Button btnm;
  @FXML
  private Button btnum;

   @FXML
   private void buttonANS(ActionEvent event) throws IOException { 
       pass = true;
     if(TF.getText().equals("4")&& TF2.getText().equals("4")&& TF3.getText().equals("9")&& TF4.getText().equals("3")){
         LITW.correct.play();
          message.setText("");
          message.setText("TRUE");  
          message.setFont(Font.font(STYLESHEET_CASPIAN, FontWeight.BOLD, FontPosture.REGULAR, 20));
          PauseTransition delay = new PauseTransition(Duration.seconds(0.8));
        delay.setOnFinished( e -> 
        {
            try {
                
                Parent cong = FXMLLoader.load(getClass().getResource("cong4.fxml"));
                Scene congscene = new Scene(cong);
                Stage window =(Stage)((Node)event.getSource()).getScene().getWindow();
                window.setScene(congscene);
                window.show();
                
                cong.setOnKeyPressed(new EventHandler<KeyEvent>() {
               @Override
               public void handle(KeyEvent ke) {
               if (ke.getCode() == KeyCode.ESCAPE) {
               System.out.println("Key Pressed: " + ke.getCode());
               System.exit(0);}
                }
                });
            } catch (IOException ex) {
                Logger.getLogger(Level1Controller.class.getName()).log(Level.SEVERE, null, ex);
            }
        });
        
        delay.play();
          return;    
      }
       if(TF.getText() != "4" || TF2.getText() != "4" || TF3.getText() != "9" || TF4.getText() != "3"){
         LITW.buzz.play();
          message.setText("");
          message.setText("FALSE , PLEASE TRY AGAIN"); 
          message.setFont(Font.font(STYLESHEET_CASPIAN, FontWeight.BOLD, FontPosture.REGULAR, 14));
          return;   
      }
        
   }
   
   @FXML
   private void ButtonBack(ActionEvent event) throws IOException {
       LITW.buttons.play();
      Parent map = FXMLLoader.load(getClass().getResource("map.fxml"));
      Scene introscen = new Scene(map);
      Stage window =(Stage)((Node)event.getSource()).getScene().getWindow();
      window.setScene(introscen);
      window.show();
      
      map.setOnKeyPressed(new EventHandler<KeyEvent>() {
      @Override
      public void handle(KeyEvent ke) {
      if (ke.getCode() == KeyCode.ESCAPE) {
      System.out.println("Key Pressed: " + ke.getCode());
      System.exit(0);}
      }
      });
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

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        //CongController.num.setText("1"); 
        AudioClip note =new AudioClip(this.getClass().getResource("/sound/lvl1.mp3").toString());
        note.play();
     
        idleB.setTranslateX(-260);
        idleB.setScaleX(0.25);
        idleB.setScaleY(0.25);
        idleB.setTranslateY(-270);
        
        idleG.setScaleX(0.25);
        idleG.setScaleY(0.25);
        idleG.setTranslateY(-220);
        idleG.setTranslateX(-220);
        
        if(LITW.sex==1){
        
        
      Timeline i = new Timeline();
i.setCycleCount(Timeline.INDEFINITE);
i.getKeyFrames().add(new KeyFrame(
Duration.millis(200),(ActionEvent event)->{
idleG.getChildren().setAll(LITW.girl_idle2);
}
));
i.getKeyFrames().add(new KeyFrame(
Duration.millis(300),(ActionEvent event)->{
idleG.getChildren().setAll(LITW.girl_idle3);
}
));
i.getKeyFrames().add(new KeyFrame(
Duration.millis(400),(ActionEvent event)->{
idleG.getChildren().setAll(LITW.girl_idle4);
}
));
i.getKeyFrames().add(new KeyFrame(
Duration.millis(500),(ActionEvent event)->{
idleG.getChildren().setAll(LITW.girl_idle5);
}
));
i.getKeyFrames().add(new KeyFrame(
Duration.millis(600),(ActionEvent event)->{
idleG.getChildren().setAll(LITW.girl_idle6);
}
));
i.getKeyFrames().add(new KeyFrame(
Duration.millis(700),(ActionEvent event)->{
idleG.getChildren().setAll(LITW.girl_idle7);
}
));
i.getKeyFrames().add(new KeyFrame(
Duration.millis(800),(ActionEvent event)->{
idleG.getChildren().setAll(LITW.girl_idle8);
}
));
i.getKeyFrames().add(new KeyFrame(
Duration.millis(900),(ActionEvent event)->{
idleG.getChildren().setAll(LITW.girl_idle9);
}
));
i.getKeyFrames().add(new KeyFrame(
Duration.millis(1000),(ActionEvent event)->{
idleG.getChildren().setAll(LITW.girl_idle10);
}
));
i.getKeyFrames().add(new KeyFrame(
Duration.millis(1100),(ActionEvent event)->{
idleG.getChildren().setAll(LITW.girl_idle11);
}
));
i.getKeyFrames().add(new KeyFrame(
Duration.millis(1200),(ActionEvent event)->{
idleG.getChildren().setAll(LITW.girl_idle12);
}
));
i.getKeyFrames().add(new KeyFrame(
Duration.millis(1300),(ActionEvent event)->{
idleG.getChildren().setAll(LITW.girl_idle13);
}
));
i.getKeyFrames().add(new KeyFrame(
Duration.millis(1400),(ActionEvent event)->{
idleG.getChildren().setAll(LITW.girl_idle14);
}
));
i.getKeyFrames().add(new KeyFrame(
Duration.millis(1500),(ActionEvent event)->{
idleG.getChildren().setAll(LITW.girl_idle15);
}
));
i.getKeyFrames().add(new KeyFrame(
Duration.millis(1600),(ActionEvent event)->{
idleG.getChildren().setAll(LITW.girl_idle16);
}
));
i.play();
        }else if(LITW.sex==2){
Timeline IB = new Timeline();
IB.setCycleCount(Timeline.INDEFINITE);
IB.getKeyFrames().add(new KeyFrame(
Duration.millis(200),(ActionEvent event)->{
idleB.getChildren().setAll(LITW.boy_idle2);
}
));
IB.getKeyFrames().add(new KeyFrame(
Duration.millis(300),(ActionEvent event)->{
idleB.getChildren().setAll(LITW.boy_idle3);
}
));
IB.getKeyFrames().add(new KeyFrame(
Duration.millis(400),(ActionEvent event)->{
idleB.getChildren().setAll(LITW.boy_idle4);
}
));
IB.getKeyFrames().add(new KeyFrame(
Duration.millis(500),(ActionEvent event)->{
idleB.getChildren().setAll(LITW.boy_idle5);
}
));
IB.getKeyFrames().add(new KeyFrame(
Duration.millis(600),(ActionEvent event)->{
idleB.getChildren().setAll(LITW.boy_idle6);
}
));
IB.getKeyFrames().add(new KeyFrame(
Duration.millis(700),(ActionEvent event)->{
idleB.getChildren().setAll(LITW.boy_idle7);
}
));
IB.getKeyFrames().add(new KeyFrame(
Duration.millis(800),(ActionEvent event)->{
idleB.getChildren().setAll(LITW.boy_idle8);
}
));
IB.getKeyFrames().add(new KeyFrame(
Duration.millis(900),(ActionEvent event)->{
idleB.getChildren().setAll(LITW.boy_idle9);
}
));
IB.getKeyFrames().add(new KeyFrame(
Duration.millis(1000),(ActionEvent event)->{
idleB.getChildren().setAll(LITW.boy_idle10);
}
));
IB.getKeyFrames().add(new KeyFrame(
Duration.millis(1100),(ActionEvent event)->{
idleB.getChildren().setAll(LITW.boy_idle11);
}
));
IB.getKeyFrames().add(new KeyFrame(
Duration.millis(1200),(ActionEvent event)->{
idleB.getChildren().setAll(LITW.boy_idle12);
}
));
IB.getKeyFrames().add(new KeyFrame(
Duration.millis(1300),(ActionEvent event)->{
idleB.getChildren().setAll(LITW.boy_idle13);
}
));
IB.getKeyFrames().add(new KeyFrame(
Duration.millis(1400),(ActionEvent event)->{
idleB.getChildren().setAll(LITW.boy_idle14);
}
));
IB.getKeyFrames().add(new KeyFrame(
Duration.millis(1500),(ActionEvent event)->{
idleB.getChildren().setAll(LITW.boy_idle15);
}
));

IB.play();
        }
        
        Timeline time = new Timeline(); 
        time.setCycleCount(Timeline.INDEFINITE);
        if (time != null)
        {
            time.stop();
        }
        KeyFrame frame = new KeyFrame(Duration.seconds(1),new EventHandler<ActionEvent>()
                {
                    @Override
                    public void handle(ActionEvent event)
                {
                    sec--;
                    lb.setText("0:"+sec.toString());    
                    if (sec <= 0 && pass == false)
                       {
                        try {
                            time.stop();
                            Parent fail =FXMLLoader.load(getClass().getResource("fail.fxml"));
                            Scene Scene=new Scene(fail);
                            Stage window =(Stage)lb.getScene().getWindow();
                            window.setScene(Scene);
                            window.show();
                            
                            fail.setOnKeyPressed(new EventHandler<KeyEvent>() {
                           @Override
                           public void handle(KeyEvent ke) {
                           if (ke.getCode() == KeyCode.ESCAPE) {
                           System.out.println("Key Pressed: " + ke.getCode());
                           System.exit(0);}
                           }
                           });
                            
                        } catch (IOException ex) {
                            Logger.getLogger(Level1Controller.class.getName()).log(Level.SEVERE, null, ex);
                        }
                       }
                }
                });
        time.getKeyFrames().add(frame);
        time.playFromStart();
      
      btnum.setDisable(true);
      btnum.setVisible(false);
      
    }    
    
}
