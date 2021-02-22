package litw;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Group;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
import javafx.util.Duration;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class CharacterController implements Initializable {

     //idle boy image view
static ImageView boy_idle1=new ImageView("/boy idle/Idle (1).png");
static ImageView boy_idle2=new ImageView("/boy idle/Idle (2).png");
static ImageView boy_idle3=new ImageView("/boy idle/Idle (3).png");
static ImageView boy_idle4=new ImageView("/boy idle/Idle (4).png");
static ImageView boy_idle5=new ImageView("/boy idle/Idle (5).png");
static ImageView boy_idle6=new ImageView("/boy idle/Idle (6).png");
static ImageView boy_idle7=new ImageView("/boy idle/Idle (7).png");
static ImageView boy_idle8=new ImageView("/boy idle/Idle (8).png");
static ImageView boy_idle9=new ImageView("/boy idle/Idle (9).png");
static ImageView boy_idle10=new ImageView("/boy idle/Idle (10).png");
static ImageView boy_idle11=new ImageView("/boy idle/Idle (11).png");
static ImageView boy_idle12=new ImageView("/boy idle/Idle (12).png");
static ImageView boy_idle13=new ImageView("/boy idle/Idle (13).png");
static ImageView boy_idle14=new ImageView("/boy idle/Idle (14).png");
static ImageView boy_idle15=new ImageView("/boy idle/Idle (15).png");
//idle girl image view
static ImageView girl_idle1=new ImageView("/girl idle/Idle (1).png");
static ImageView girl_idle2=new ImageView("/girl idle/Idle (2).png");
static ImageView girl_idle3=new ImageView("/girl idle/Idle (3).png");
static ImageView girl_idle4=new ImageView("/girl idle/Idle (4).png");
static ImageView girl_idle5=new ImageView("/girl idle/Idle (5).png");
static ImageView girl_idle6=new ImageView("/girl idle/Idle (6).png");
static ImageView girl_idle7=new ImageView("/girl idle/Idle (7).png");
static ImageView girl_idle8=new ImageView("/girl idle/Idle (8).png");
static ImageView girl_idle9=new ImageView("/girl idle/Idle (9).png");
static ImageView girl_idle10=new ImageView("/girl idle/Idle (10).png");
static ImageView girl_idle11=new ImageView("/girl idle/Idle (11).png");
static ImageView girl_idle12=new ImageView("/girl idle/Idle (12).png");
static ImageView girl_idle13=new ImageView("/girl idle/Idle (13).png");
static ImageView girl_idle14=new ImageView("/girl idle/Idle (14).png");
static ImageView girl_idle15=new ImageView("/girl idle/Idle (15).png");
static ImageView girl_idle16=new ImageView("/girl idle/Idle (16).png");
    
@FXML
  private Button btnm;
  @FXML
  private Button btnum;
    @FXML
    private Group idleB;
    @FXML
    private Group idleG;
        
        
        
        @Override
    public void initialize(URL url, ResourceBundle rb) {
      idleG.setScaleX(0.3);
idleG.setScaleY(0.3);
idleG.setTranslateY(-180);
idleG.setTranslateX(-220);
idleB.setTranslateX(-210);
idleB.setScaleX(0.3);
idleB.setScaleY(0.3);
idleB.setTranslateY(-230);

Timeline i = new Timeline();
i.setCycleCount(Timeline.INDEFINITE);
i.getKeyFrames().add(new KeyFrame(
Duration.millis(200),(ActionEvent event)->{
idleG.getChildren().setAll(girl_idle2);
}
));
i.getKeyFrames().add(new KeyFrame(
Duration.millis(300),(ActionEvent event)->{
idleG.getChildren().setAll(girl_idle3);
}
));
i.getKeyFrames().add(new KeyFrame(
Duration.millis(400),(ActionEvent event)->{
idleG.getChildren().setAll(girl_idle4);
}
));
i.getKeyFrames().add(new KeyFrame(
Duration.millis(500),(ActionEvent event)->{
idleG.getChildren().setAll(girl_idle5);
}
));
i.getKeyFrames().add(new KeyFrame(
Duration.millis(600),(ActionEvent event)->{
idleG.getChildren().setAll(girl_idle6);
}
));
i.getKeyFrames().add(new KeyFrame(
Duration.millis(700),(ActionEvent event)->{
idleG.getChildren().setAll(girl_idle7);
}
));
i.getKeyFrames().add(new KeyFrame(
Duration.millis(800),(ActionEvent event)->{
idleG.getChildren().setAll(girl_idle8);
}
));
i.getKeyFrames().add(new KeyFrame(
Duration.millis(900),(ActionEvent event)->{
idleG.getChildren().setAll(girl_idle9);
}
));
i.getKeyFrames().add(new KeyFrame(
Duration.millis(1000),(ActionEvent event)->{
idleG.getChildren().setAll(girl_idle10);
}
));
i.getKeyFrames().add(new KeyFrame(
Duration.millis(1100),(ActionEvent event)->{
idleG.getChildren().setAll(girl_idle11);
}
));
i.getKeyFrames().add(new KeyFrame(
Duration.millis(1200),(ActionEvent event)->{
idleG.getChildren().setAll(girl_idle12);
}
));
i.getKeyFrames().add(new KeyFrame(
Duration.millis(1300),(ActionEvent event)->{
idleG.getChildren().setAll(girl_idle13);
}
));
i.getKeyFrames().add(new KeyFrame(
Duration.millis(1400),(ActionEvent event)->{
idleG.getChildren().setAll(girl_idle14);
}
));
i.getKeyFrames().add(new KeyFrame(
Duration.millis(1500),(ActionEvent event)->{
idleG.getChildren().setAll(girl_idle15);
}
));
i.getKeyFrames().add(new KeyFrame(
Duration.millis(1600),(ActionEvent event)->{
idleG.getChildren().setAll(girl_idle16);
}
));
i.play();

Timeline IB = new Timeline();
IB.setCycleCount(Timeline.INDEFINITE);
IB.getKeyFrames().add(new KeyFrame(
Duration.millis(200),(ActionEvent event)->{
idleB.getChildren().setAll(boy_idle2);
}
));
IB.getKeyFrames().add(new KeyFrame(
Duration.millis(300),(ActionEvent event)->{
idleB.getChildren().setAll(boy_idle3);
}
));
IB.getKeyFrames().add(new KeyFrame(
Duration.millis(400),(ActionEvent event)->{
idleB.getChildren().setAll(boy_idle4);
}
));
IB.getKeyFrames().add(new KeyFrame(
Duration.millis(500),(ActionEvent event)->{
idleB.getChildren().setAll(boy_idle5);
}
));
IB.getKeyFrames().add(new KeyFrame(
Duration.millis(600),(ActionEvent event)->{
idleB.getChildren().setAll(boy_idle6);
}
));
IB.getKeyFrames().add(new KeyFrame(
Duration.millis(700),(ActionEvent event)->{
idleB.getChildren().setAll(boy_idle7);
}
));
IB.getKeyFrames().add(new KeyFrame(
Duration.millis(800),(ActionEvent event)->{
idleB.getChildren().setAll(boy_idle8);
}
));
IB.getKeyFrames().add(new KeyFrame(
Duration.millis(900),(ActionEvent event)->{
idleB.getChildren().setAll(boy_idle9);
}
));
IB.getKeyFrames().add(new KeyFrame(
Duration.millis(1000),(ActionEvent event)->{
idleB.getChildren().setAll(boy_idle10);
}
));
IB.getKeyFrames().add(new KeyFrame(
Duration.millis(1100),(ActionEvent event)->{
idleB.getChildren().setAll(boy_idle11);
}
));
IB.getKeyFrames().add(new KeyFrame(
Duration.millis(1200),(ActionEvent event)->{
idleB.getChildren().setAll(boy_idle12);
}
));
IB.getKeyFrames().add(new KeyFrame(
Duration.millis(1300),(ActionEvent event)->{
idleB.getChildren().setAll(boy_idle13);
}
));
IB.getKeyFrames().add(new KeyFrame(
Duration.millis(1400),(ActionEvent event)->{
idleB.getChildren().setAll(boy_idle14);
}
));
IB.getKeyFrames().add(new KeyFrame(
Duration.millis(1500),(ActionEvent event)->{
idleB.getChildren().setAll(boy_idle15);
}
));

IB.play();

}
   
    
    
    
    
 
    

    
     @FXML
    private void handleButtonAction(ActionEvent event) throws IOException {
        
        LITW.buttons.play();
        Parent charView =FXMLLoader.load(getClass().getResource("info.fxml"));
        Scene charcterScene=new Scene(charView);
        
        Stage window =(Stage)((Node)event.getSource()).getScene().getWindow();
        
        window.setScene(charcterScene);
        window.show();
    }
    
    @FXML
    private void Emmabutton(ActionEvent event) throws IOException {
        LITW.sex=1;
      LITW.buttons.play();
       
        Parent charView =FXMLLoader.load(getClass().getResource("map.fxml"));
        Scene charcterScene=new Scene(charView);
        
        Stage window =(Stage)((Node)event.getSource()).getScene().getWindow();
        
        window.setScene(charcterScene);
        window.show();
        
        Player Cupdate = null;
        Session session1 = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = session1.beginTransaction();
        String n = InfoController.player.getName();
        Cupdate = (Player)session1.get(Player.class, n);
        Cupdate.setPlayerCharacter("Emma");  
        session1.update(Cupdate);
        tx.commit();
        session1.close(); 
    }
    
    
    @FXML
    private void mikebutton(ActionEvent event) throws IOException {
        LITW.sex=2;
     LITW.buttons.play();
       
        Parent charView =FXMLLoader.load(getClass().getResource("map.fxml"));
        Scene charcterScene=new Scene(charView);
        
        Stage window =(Stage)((Node)event.getSource()).getScene().getWindow();
        
        window.setScene(charcterScene);
        window.show();
        
        Player Cupdate = null;
        Session session1 = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = session1.beginTransaction();
        String n = InfoController.player.getName();
        Cupdate = (Player)session1.get(Player.class, n);
        Cupdate.setPlayerCharacter("Mike");  
        session1.update(Cupdate);
        tx.commit();
        session1.close(); 
        
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
      LITW.buttons.play();;
      LITW.bgmusic.play();
   
      btnum.setVisible(false);
      btnum.setDisable(true);
      
      btnm.setVisible(true);
      btnm.setDisable(false);
   }
    
    
    
    
    
    

}
