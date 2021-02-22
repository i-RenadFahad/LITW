package litw;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.animation.KeyFrame;
import javafx.animation.PauseTransition;
import javafx.animation.Timeline;
import javafx.event.*; 
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
import javafx.scene.input.MouseEvent;
import javafx.scene.media.AudioClip;
import javafx.scene.paint.Color;
import javafx.scene.shape.*;
import javafx.stage.Stage;
import javafx.util.Duration;

public class Level4Controller implements Initializable {
    

    @FXML
    private Group idleB;
    @FXML
    private Group idleG;
    @FXML  
    static boolean pass = false;
    @FXML
    AudioClip bgmusic;
    @FXML
    Circle cr;
    @FXML
    Button btnm;
    @FXML
    Button btnum;
    @FXML
    Label lb; 
    @FXML
    final Integer startTime = 60;
    @FXML
    private Integer sec = startTime;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        
        AudioClip lvl4 =new AudioClip(this.getClass().getResource("/lvl4/lvl4.mp3").toString());
        lvl4.play();
        
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
        
        cr.setFill(Color.TRANSPARENT); 
        cr.setStroke(Color.TRANSPARENT);
        

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
                            Logger.getLogger(Level4Controller.class.getName()).log(Level.SEVERE, null, ex);
                        }
                       }
                }
                });
        time.getKeyFrames().add(frame);
        time.playFromStart();
        
        btnum.setDisable(true);
        btnum.setVisible(false); 

    } 
    
    @FXML
    public void ButtonBack (ActionEvent event) throws IOException
    {
      LITW.buttons.play();
      Parent map = FXMLLoader.load(getClass().getResource("map.fxml"));
      Scene mapscen = new Scene(map);
      Stage window =(Stage)((Node)event.getSource()).getScene().getWindow();
      window.setScene(mapscen);
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
    public void Mute(ActionEvent event)
    {
        LITW.buttons.play();
        LITW.bgmusic.stop();
        
       btnm.setVisible(false); 
       btnm.setDisable(true);  
       
       btnum.setVisible(true); 
       btnum.setDisable(false); 
        
        
    }
    
    @FXML
    public void Unmute(ActionEvent event)
    {
        LITW.buttons.play();
        LITW.bgmusic.play();
        
       btnum.setVisible(false); 
       btnum.setDisable(true);  
       
       btnm.setVisible(true); 
       btnm.setDisable(false);
    }
    
    @FXML
    public void WrongClk(MouseEvent event)  
    {
            LITW.buzz.play();
    }
    
    @FXML
    public void CircleClk(MouseEvent event) throws IOException
    {
        pass = true;
        LITW.correct.play();
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
                Logger.getLogger(Level4Controller.class.getName()).log(Level.SEVERE, null, ex);
            }
        });
        
        delay.play();
   
        cr.setFill(Color.WHITE);
        cr.setStroke(Color.BLACK); 
    }
    
    
}
