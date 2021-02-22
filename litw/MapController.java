package litw;

import java.io.IOException;
import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;
import javafx.animation.KeyFrame;
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
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.stage.Stage;
import javafx.util.Duration;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class MapController implements Initializable {
    
    
    @FXML
    private Group idleB;
    @FXML
    private Group idleG;
    @FXML
    Button btn2pink;
    @FXML
    Button btn3pink;
    @FXML
    Button btn4pink;
    @FXML
    Button btn5pink;
    @FXML
    Button btn6pink;
    @FXML
    Button btn7pink;
    @FXML
    Button btn8pink;
    @FXML
    Button btn9pink;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
    
        
        btn2pink.setVisible(false);
        btn3pink.setVisible(false);
        btn4pink.setVisible(false);
        btn5pink.setVisible(false);
        btn6pink.setVisible(false);
        btn7pink.setVisible(false);
        btn8pink.setVisible(false);
        btn9pink.setVisible(false);
         
        
        if(Level1Controller.pass==true){
          btn2pink.setVisible(true);  
            
        Player Pupdate = null;
        Session session1 = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = session1.beginTransaction();
        String n = InfoController.player.getName();
        Pupdate = (Player)session1.get(Player.class, n);
        Pupdate.setLevel(2); 
        session1.update(Pupdate); 
        tx.commit();
        session1.close(); 
        
        }
        if(Level2Controller.pass==true){
          btn3pink.setVisible(true);   
          
        Player Pupdate = null;
        Session session1 = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = session1.beginTransaction();
        String n = InfoController.player.getName();
        Pupdate = (Player)session1.get(Player.class, n);
        Pupdate.setLevel(3);
        session1.update(Pupdate);
        tx.commit();
        session1.close(); 
        }
        if(Level3Controller.pass==true){
          btn4pink.setVisible(true); 
          
        Player Pupdate = null;
        Session session1 = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = session1.beginTransaction();
        String n = InfoController.player.getName();
        Pupdate = (Player)session1.get(Player.class, n);
        Pupdate.setLevel(4);
        session1.update(Pupdate);
        tx.commit();
        session1.close(); 
        }
        if(Level4Controller.pass==true){
          btn5pink.setVisible(true);  
          
        Player Pupdate = null;
        Session session1 = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = session1.beginTransaction();
        String n = InfoController.player.getName();
        Pupdate = (Player)session1.get(Player.class, n);
        Pupdate.setLevel(5);
        session1.update(Pupdate);
        tx.commit();
        session1.close(); 
        }
        if(Level5Controller.pass==true){
          btn6pink.setVisible(true);  
          
        Player Pupdate = null;
        Session session1 = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = session1.beginTransaction();
        String n = InfoController.player.getName();
        Pupdate = (Player)session1.get(Player.class, n);
        Pupdate.setLevel(6);
        session1.update(Pupdate);
        tx.commit();
        session1.close(); 
        }
        if(Level6Controller.pass==true){
          btn7pink.setVisible(true); 
          
        Player Pupdate = null;
        Session session1 = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = session1.beginTransaction();
        String n = InfoController.player.getName();
        Pupdate = (Player)session1.get(Player.class, n);
        Pupdate.setLevel(7);
        session1.update(Pupdate);
        tx.commit();
        session1.close(); 
        }
        if(Level7Controller.pass==true){
          btn8pink.setVisible(true);  
          
        Player Pupdate = null;
        Session session1 = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = session1.beginTransaction();
        String n = InfoController.player.getName();
        Pupdate = (Player)session1.get(Player.class, n);
        Pupdate.setLevel(8);
        session1.update(Pupdate);
        tx.commit();
        session1.close(); 
        }
        if(Level8Controller.pass==true){
          btn9pink.setVisible(true);  
          
        Player Pupdate = null;
        Session session1 = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = session1.beginTransaction();
        String n = InfoController.player.getName();
        Pupdate = (Player)session1.get(Player.class, n);
        Pupdate.setLevel(9);
        session1.update(Pupdate);
        tx.commit();
        session1.close(); 
        }
        
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
    
    }

@FXML
    private void backtocharacter(ActionEvent event) throws IOException {
     LITW.buttons.play();
        Parent Character =FXMLLoader.load(getClass().getResource("Character.fxml"));
        Scene charcterScene=new Scene(Character);
        Stage window =(Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(charcterScene);
        window.show();
        
        Character.setOnKeyPressed(new EventHandler<KeyEvent>() {
       @Override
       public void handle(KeyEvent ke) {
       if (ke.getCode() == KeyCode.ESCAPE) {
       System.out.println("Key Pressed: " + ke.getCode());
       System.exit(0);}
       }
       });
    }
    @FXML
    private void L1(ActionEvent event) throws IOException {
    
       
        LITW.buttons.play();
        Parent level1 =FXMLLoader.load(getClass().getResource("level1.fxml"));
        Scene level1Scene=new Scene(level1);
        Stage window =(Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(level1Scene);
        window.show();
        
        level1.setOnKeyPressed(new EventHandler<KeyEvent>() {
        @Override
       public void handle(KeyEvent ke) {
       if (ke.getCode() == KeyCode.ESCAPE) {
       System.out.println("Key Pressed: " + ke.getCode());
       System.exit(0);}
        }
     });
        
}
    @FXML
    private void L2(ActionEvent event) throws IOException {
       if(Level1Controller.pass==true){
        LITW.buttons.play();
        Parent level2 =FXMLLoader.load(getClass().getResource("level2.fxml"));
        Scene level2Scene=new Scene(level2);
        Stage window =(Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(level2Scene);
        window.show();
        
        level2.setOnKeyPressed(new EventHandler<KeyEvent>() {
        @Override
       public void handle(KeyEvent ke) {
       if (ke.getCode() == KeyCode.ESCAPE) {
       System.out.println("Key Pressed: " + ke.getCode());
       System.exit(0);}
        }
     });
       }
       
   
     
}
            @FXML
    private void L3(ActionEvent event) throws IOException {
      if(Level2Controller.pass==true){
        LITW.buttons.play();
        Parent level3 =FXMLLoader.load(getClass().getResource("level3.fxml"));
        Scene level3Scene=new Scene(level3);
        Stage window =(Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(level3Scene);
        window.show();
        
        level3.setOnKeyPressed(new EventHandler<KeyEvent>() {
        @Override
       public void handle(KeyEvent ke) {
       if (ke.getCode() == KeyCode.ESCAPE) {
       System.out.println("Key Pressed: " + ke.getCode());
       System.exit(0);}
        }
     });
      }
}
        @FXML
    private void L4(ActionEvent event) throws IOException {
       if(Level3Controller.pass==true){
        LITW.buttons.play();
        Parent level4 =FXMLLoader.load(getClass().getResource("level4.fxml"));
        Scene level4Scene=new Scene(level4);
        Stage window =(Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(level4Scene);
        window.show();
        
        level4.setOnKeyPressed(new EventHandler<KeyEvent>() {
        @Override
       public void handle(KeyEvent ke) {
       if (ke.getCode() == KeyCode.ESCAPE) {
       System.out.println("Key Pressed: " + ke.getCode());
       System.exit(0);}
        }
     });
       }
     
}
    @FXML
    private void L5(ActionEvent event) throws IOException {
         if(Level4Controller.pass==true){
        LITW.buttons.play();
        Parent level5 =FXMLLoader.load(getClass().getResource("level5.fxml"));
        Scene level5Scene=new Scene(level5);
        Stage window =(Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(level5Scene);
        window.show();
        
        level5.setOnKeyPressed(new EventHandler<KeyEvent>() {
        @Override
       public void handle(KeyEvent ke) {
       if (ke.getCode() == KeyCode.ESCAPE) {
       System.out.println("Key Pressed: " + ke.getCode());
       System.exit(0);}
        }
     });
         }
     
}
    @FXML
    private void L6(ActionEvent event) throws IOException {
       if(Level5Controller.pass==true){
        LITW.buttons.play();
        Parent level6 =FXMLLoader.load(getClass().getResource("level6.fxml"));
        Scene level6Scene=new Scene(level6);
        Stage window =(Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(level6Scene);
        window.show();
        
        level6.setOnKeyPressed(new EventHandler<KeyEvent>() {
        @Override
       public void handle(KeyEvent ke) {
       if (ke.getCode() == KeyCode.ESCAPE) {
       System.out.println("Key Pressed: " + ke.getCode());
       System.exit(0);}
        }
     });
       }
     
}
    @FXML
    private void L7(ActionEvent event) throws IOException {
        if(Level6Controller.pass==true){
        LITW.buttons.play();
        Parent level7 =FXMLLoader.load(getClass().getResource("level7.fxml"));
        Scene level7Scene=new Scene(level7);
        Stage window =(Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(level7Scene);
        window.show();
        
        level7.setOnKeyPressed(new EventHandler<KeyEvent>() {
        @Override
       public void handle(KeyEvent ke) {
       if (ke.getCode() == KeyCode.ESCAPE) {
       System.out.println("Key Pressed: " + ke.getCode());
       System.exit(0);}
        }
     });
        }
     
}
    @FXML
    private void L8(ActionEvent event) throws IOException {
      if(Level7Controller.pass==true){
        LITW.buttons.play();
        Parent level8 =FXMLLoader.load(getClass().getResource("level8.fxml"));
        Scene level8Scene=new Scene(level8);
        Stage window =(Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(level8Scene);
        window.show();
        
        level8.setOnKeyPressed(new EventHandler<KeyEvent>() {
        @Override
       public void handle(KeyEvent ke) {
       if (ke.getCode() == KeyCode.ESCAPE) {
       System.out.println("Key Pressed: " + ke.getCode());
       System.exit(0);}
        }
     });
      }
       
}
    @FXML
    private void L9(ActionEvent event) throws IOException {
      if(Level8Controller.pass==true){
        LITW.buttons.play();
        Parent level9 =FXMLLoader.load(getClass().getResource("level9.fxml"));
        Scene level9Scene=new Scene(level9);
        Stage window =(Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(level9Scene);
        window.show();
        
        level9.setOnKeyPressed(new EventHandler<KeyEvent>() {
        @Override
       public void handle(KeyEvent ke) {
       if (ke.getCode() == KeyCode.ESCAPE) {
       System.out.println("Key Pressed: " + ke.getCode());
       System.exit(0);}
        }
     });
      }    
}

     
}
   

