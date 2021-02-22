package litw;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.animation.Animation;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Group;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.media.AudioClip;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.util.Duration;

public class IntroController implements Initializable {

    
     final ImageView boyWalk1=new ImageView("/walk/Walk (1).png");
        final ImageView boyWalk2=new ImageView("/walk/Walk (2).png");
        final ImageView boyWalk3=new ImageView("/walk/Walk (3).png");
        final ImageView boyWalk4=new ImageView("/walk/Walk (4).png");
        final ImageView boyWalk5=new ImageView("/walk/Walk (5).png");
        final ImageView boyWalk6=new ImageView("/walk/Walk (6).png");
        final ImageView boyWalk7=new ImageView("/walk/Walk (7).png");
        final ImageView boyWalk8=new ImageView("/walk/Walk (8).png");
        final ImageView boyWalk9=new ImageView("/walk/Walk (9).png");
        final ImageView boyWalk10=new ImageView("/walk/Walk (10).png");
        final ImageView boyWalk11=new ImageView("/walk/Walk (11).png");
        final ImageView boyWalk12=new ImageView("/walk/Walk (12).png");
        
        ImageView girl_Walk1=new ImageView("/girl_walk/Walk (1).png");
        ImageView girl_Walk2=new ImageView("/girl_walk/Walk (2).png");
        ImageView girl_Walk3=new ImageView("/girl_walk/Walk (3).png");
        ImageView girl_Walk4=new ImageView("/girl_walk/Walk (4).png");
        ImageView girl_Walk5=new ImageView("/girl_walk/Walk (5).png");    
        ImageView girl_Walk6=new ImageView("/girl_walk/Walk (6).png");
        ImageView girl_Walk7=new ImageView("/girl_walk/Walk (7).png");
        ImageView girl_Walk8=new ImageView("/girl_walk/Walk (8).png");
        ImageView girl_Walk9=new ImageView("/girl_walk/Walk (9).png");
        ImageView girl_Walk10=new ImageView("/girl_walk/Walk (10).png");
        ImageView girl_Walk11=new ImageView("/girl_walk/Walk (11).png");
        ImageView girl_Walk12=new ImageView("/girl_walk/Walk (12).png");
        ImageView girl_Walk13=new ImageView("/girl_walk/Walk (13).png");
        ImageView girl_Walk14=new ImageView("/girl_walk/Walk (14).png");
        ImageView girl_Walk15=new ImageView("/girl_walk/Walk (15).png");
        ImageView girl_Walk16=new ImageView("/girl_walk/Walk (16).png");
        ImageView girl_Walk17=new ImageView("/girl_walk/Walk (17).png");
        ImageView girl_Walk18=new ImageView("/girl_walk/Walk (18).png");
        ImageView girl_Walk19=new ImageView("/girl_walk/Walk (19).png");
        ImageView girl_Walk20=new ImageView("/girl_walk/Walk (20).png");
        
    
    @FXML
    private Label label;
    @FXML
    private Group walk;
    @FXML
    private Group walkG;
    @FXML
    private Text story;
    
    
    @FXML
    private void handleButtonAction(ActionEvent event) throws IOException {
        LITW.buttons.play();
        Parent info =FXMLLoader.load(getClass().getResource("info.fxml"));
        Scene charcterScene=new Scene(info);
        Stage window =(Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(charcterScene);
        window.show();
        
        info.setOnKeyPressed(new EventHandler<KeyEvent>() {
        @Override
       public void handle(KeyEvent ke) {
       if (ke.getCode() == KeyCode.ESCAPE) {
       System.out.println("Key Pressed: " + ke.getCode());
       System.exit(0);}
        }
     });
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        walk.setTranslateY(-270);
        walk.setTranslateX(-420);
        walk.setScaleX(0.3);
        walk.setScaleY(0.3);
        
       walkG.setTranslateY(-210);
       walkG.setTranslateX(-500);
       walkG.setScaleX(0.3);
       walkG.setScaleY(0.3);
       
       
       AudioClip note =new AudioClip(this.getClass().getResource("/walk/careful.mp3").toString());
        
        note.play();
        
        Timeline t = new Timeline();
        t.setCycleCount(Timeline.INDEFINITE);
        
      
        t.getKeyFrames().add(new KeyFrame(
        Duration.millis(200),(ActionEvent event)->{
        walk.getChildren().setAll(boyWalk2);
        walk.setTranslateX(walk.getTranslateX()+5);
        }
        ));
        
        t.getKeyFrames().add(new KeyFrame(
        Duration.millis(300),(ActionEvent event)->{
        walk.getChildren().setAll(boyWalk3);
         walk.setTranslateX(walk.getTranslateX()+5);
        //walk.setTranslateX(-260);
        }
        ));
        
        t.getKeyFrames().add(new KeyFrame(
        Duration.millis(400),(ActionEvent event)->{
        walk.getChildren().setAll(boyWalk4);
         walk.setTranslateX(walk.getTranslateX()+5);
       // walk.setTranslateX(-240);
        }
        ));
        
        t.getKeyFrames().add(new KeyFrame(
        Duration.millis(500),(ActionEvent event)->{
        walk.getChildren().setAll(boyWalk5);
         walk.setTranslateX(walk.getTranslateX()+5);
       // walk.setTranslateX(-220);
        }
        ));
        
        t.getKeyFrames().add(new KeyFrame(
        Duration.millis(600),(ActionEvent event)->{
        walk.getChildren().setAll(boyWalk6);
         walk.setTranslateX(walk.getTranslateX()+5);
       // walk.setTranslateX(-200);
        }
        ));
        
        t.getKeyFrames().add(new KeyFrame(
        Duration.millis(700),(ActionEvent event)->{
        walk.getChildren().setAll(boyWalk7);
         walk.setTranslateX(walk.getTranslateX()+5);
        //walk.setTranslateX(-180);
        }
        ));
        
        t.getKeyFrames().add(new KeyFrame(
        Duration.millis(800),(ActionEvent event)->{
        walk.getChildren().setAll(boyWalk8);
        walk.setTranslateX(walk.getTranslateX()+5);
       // walk.setTranslateX(-160);
        }
        ));
        
        t.getKeyFrames().add(new KeyFrame(
        Duration.millis(900),(ActionEvent event)->{
        walk.getChildren().setAll(boyWalk9);
        walk.setTranslateX(walk.getTranslateX()+5);
       // walk.setTranslateX(-140);
        }
        ));
        
        t.getKeyFrames().add(new KeyFrame(
        Duration.millis(1000),(ActionEvent event)->{
        walk.getChildren().setAll(boyWalk10);
        walk.setTranslateX(walk.getTranslateX()+5);
       // walk.setTranslateX(-120);
        }
        ));
        
        t.getKeyFrames().add(new KeyFrame(
        Duration.millis(1100),(ActionEvent event)->{
        walk.getChildren().setAll(boyWalk10);
        walk.setTranslateX(walk.getTranslateX()+5);
       // walk.setTranslateX(-100);
        }
        ));
        
        t.getKeyFrames().add(new KeyFrame(
        Duration.millis(1200),(ActionEvent event)->{
        walk.getChildren().setAll(boyWalk12);
        walk.setTranslateX(walk.getTranslateX()+5);
     //  walk.setTranslateX(-90);
        }
        ));
        
        t.play();
        
        Timeline GW = new Timeline();
        GW.setCycleCount(Timeline.INDEFINITE);
        
      
        GW.getKeyFrames().add(new KeyFrame(
        Duration.millis(200),(ActionEvent event)->{
        walkG.getChildren().setAll(girl_Walk2);
        walkG.setTranslateX(walkG.getTranslateX()+5);
        }
        ));
        
        GW.getKeyFrames().add(new KeyFrame(
        Duration.millis(300),(ActionEvent event)->{
        walkG.getChildren().setAll(girl_Walk3);
        walkG.setTranslateX(walkG.getTranslateX()+5);
        }
        ));
         
        GW.getKeyFrames().add(new KeyFrame(
        Duration.millis(400),(ActionEvent event)->{
        walkG.getChildren().setAll(girl_Walk4);
        walkG.setTranslateX(walkG.getTranslateX()+5);
        }
        ));
        
        GW.getKeyFrames().add(new KeyFrame(
        Duration.millis(500),(ActionEvent event)->{
        walkG.getChildren().setAll(girl_Walk5);
        walkG.setTranslateX(walkG.getTranslateX()+5);
        }
        ));
        
        GW.getKeyFrames().add(new KeyFrame(
        Duration.millis(600),(ActionEvent event)->{
        walkG.getChildren().setAll(girl_Walk6);
        walkG.setTranslateX(walkG.getTranslateX()+5);
        }
        ));
        
        GW.getKeyFrames().add(new KeyFrame(
        Duration.millis(700),(ActionEvent event)->{
        walkG.getChildren().setAll(girl_Walk7);
        walkG.setTranslateX(walkG.getTranslateX()+5);
        }
        ));
        GW.getKeyFrames().add(new KeyFrame(
        Duration.millis(800),(ActionEvent event)->{
        walkG.getChildren().setAll(girl_Walk8);
        walkG.setTranslateX(walkG.getTranslateX()+5);
        }
        ));
        
        GW.getKeyFrames().add(new KeyFrame(
        Duration.millis(900),(ActionEvent event)->{
        walkG.getChildren().setAll(girl_Walk9);
        walkG.setTranslateX(walkG.getTranslateX()+5);
        }
        ));
        
        GW.getKeyFrames().add(new KeyFrame(
        Duration.millis(1000),(ActionEvent event)->{
        walkG.getChildren().setAll(girl_Walk10);
        walkG.setTranslateX(walkG.getTranslateX()+5);
        }
        ));
        
        GW.getKeyFrames().add(new KeyFrame(
        Duration.millis(1100),(ActionEvent event)->{
        walkG.getChildren().setAll(girl_Walk11);
        walkG.setTranslateX(walkG.getTranslateX()+5);
        }
        ));
        
        GW.getKeyFrames().add(new KeyFrame(
        Duration.millis(1200),(ActionEvent event)->{
        walkG.getChildren().setAll(girl_Walk12);
        walkG.setTranslateX(walkG.getTranslateX()+5);
        }
        ));
        GW.getKeyFrames().add(new KeyFrame(
        Duration.millis(1300),(ActionEvent event)->{
        walkG.getChildren().setAll(girl_Walk13);
        walkG.setTranslateX(walkG.getTranslateX()+5);
        }
        ));
        
        GW.getKeyFrames().add(new KeyFrame(
        Duration.millis(1400),(ActionEvent event)->{
        walkG.getChildren().setAll(girl_Walk14);
        walkG.setTranslateX(walkG.getTranslateX()+5);
        }
        ));
        
        GW.getKeyFrames().add(new KeyFrame(
        Duration.millis(1500),(ActionEvent event)->{
        walkG.getChildren().setAll(girl_Walk15);
        walkG.setTranslateX(walkG.getTranslateX()+5);
        }
        ));
        
        GW.getKeyFrames().add(new KeyFrame(
        Duration.millis(1600),(ActionEvent event)->{
        walkG.getChildren().setAll(girl_Walk16);
        walkG.setTranslateX(walkG.getTranslateX()+5);
        }
        ));
        
        GW.getKeyFrames().add(new KeyFrame(
        Duration.millis(1700),(ActionEvent event)->{
        walkG.getChildren().setAll(girl_Walk17);
        walkG.setTranslateX(walkG.getTranslateX()+5);
        }
        ));
        
        GW.getKeyFrames().add(new KeyFrame(
        Duration.millis(1800),(ActionEvent event)->{
        walkG.getChildren().setAll(girl_Walk18);
        walkG.setTranslateX(walkG.getTranslateX()+5);
        }
        ));
        
        GW.getKeyFrames().add(new KeyFrame(
        Duration.millis(1900),(ActionEvent event)->{
        walkG.getChildren().setAll(girl_Walk19);
        walkG.setTranslateX(walkG.getTranslateX()+5);
        }
        ));
        
        GW.getKeyFrames().add(new KeyFrame(
        Duration.millis(2000),(ActionEvent event)->{
        walkG.getChildren().setAll(girl_Walk20);
        walkG.setTranslateX(walkG.getTranslateX()+5);
        }
        ));
        
        GW.play();
 
    }  

}
