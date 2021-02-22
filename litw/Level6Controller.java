
package litw;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.animation.KeyFrame;
import javafx.animation.PauseTransition;
import javafx.animation.Timeline;
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
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.HBox;
import javafx.scene.media.AudioClip;
import javafx.stage.Stage;
import javafx.util.Duration;


public class Level6Controller implements Initializable {
    
   
  @FXML
  private Group idleB;
  @FXML
  static boolean pass = false;
  @FXML
  private  Label lb;
  @FXML
  final Integer startime = 30;
  @FXML
  private Integer sec = startime;
  @FXML
  private Group idleG;
  @FXML
  private Button btnm;
  @FXML
  private Button btnum;
  @FXML
  HBox hb1;
  @FXML
  HBox hb2;
  @FXML
  HBox hb3;
  @FXML
  HBox hb4;
  @FXML
  HBox hb5;
  @FXML
  HBox hb6;

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
        
        AudioClip lvl6 =new AudioClip(this.getClass().getResource("/sound/lvl6.mp3").toString()); 
        lvl6.play();
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
                            Parent fail = FXMLLoader.load(getClass().getResource("fail.fxml"));
                            Stage stage = (Stage) lb.getScene().getWindow();
                            stage.setScene(new Scene(fail)); 
                            
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
      hb2.setVisible(false); 
      hb2.setDisable(true); 
      hb3.setVisible(false); 
      hb3.setDisable(true); 
      hb4.setVisible(false); 
      hb4.setDisable(true);
      hb5.setVisible(false); 
      hb5.setDisable(true);
      hb6.setVisible(false); 
      hb6.setDisable(true);
      
    }    
    
    public void btnA1(ActionEvent event)
    {
        LITW.correct.play();
        hb1.getChildren().clear();
        hb1.setDisable(true); 
        hb1.setVisible(false); 
        hb2.setDisable(false);
        hb2.setVisible(true); 
    }
    
    public void btnA2(ActionEvent event)
    {
        LITW.buzz.play();
    }
    
    public void btnA3(ActionEvent event)
    {
        LITW.buzz.play();
    }
    
    public void btnB1(ActionEvent event)
    {
        LITW.buzz.play();
    }
    
    public void btnB2(ActionEvent event)
    {
        LITW.correct.play();
        hb2.getChildren().clear();
        hb2.setDisable(true); 
        hb3.setVisible(true);
        hb3.setDisable(false); 
    }
    
    public void btnB3(ActionEvent event)
    {
        LITW.buzz.play();
    }
    
    public void btnC1(ActionEvent event)
    {
        LITW.correct.play();
        hb3.getChildren().clear();
        hb3.setDisable(true); 
        hb4.setVisible(true);
        hb4.setDisable(false); 
    }
    
    public void btnC2(ActionEvent event)
    {
        LITW.buzz.play();
    }
    
    public void btnC3(ActionEvent event)
    {
        LITW.buzz.play();
    }
    
    public void btnD1(ActionEvent event)
    {
       LITW.buzz.play();
    }
    
    public void btnD2(ActionEvent event)
    {
        LITW.buzz.play();
    }
    
    public void btnD3(ActionEvent event)
    {
        LITW.correct.play();
        hb4.getChildren().clear();
        hb4.setDisable(true); 
        hb5.setVisible(true);
        hb5.setDisable(false); 
    }
    
    public void btnE1(ActionEvent event)
    {
        LITW.buzz.play();
    }
    
    public void btnE2(ActionEvent event)
    {
        LITW.correct.play();
        hb5.getChildren().clear();
        hb5.setDisable(true); 
        hb6.setVisible(true);
        hb6.setDisable(false);
    }
    
    public void btnE3(ActionEvent event)
    {
        LITW.buzz.play();
    }
    
    public void btnF1(ActionEvent event)
    {
        LITW.buzz.play();
    }
    
    public void btnF2(ActionEvent event)
    {
        LITW.buzz.play();
    }
    
    public void btnF3(ActionEvent event)
    {
        LITW.correct.play();
        pass=true;
        PauseTransition delay = new PauseTransition(Duration.seconds(0.3));
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
                Logger.getLogger(Level4Controller.class.getName()).log(Level.SEVERE, null, ex);
            }
        });
        
        delay.play();
    }
        
    
}
