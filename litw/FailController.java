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
import javafx.scene.image.ImageView;
import javafx.scene.media.AudioClip;
import javafx.stage.Stage;
import javafx.util.Duration;

public class FailController implements Initializable {
    

    @FXML
    private Group idleB;
    @FXML
    private Group idleG;
    
         //idle boy image view
        static ImageView boy_dead1=new ImageView("/boy dead/Dead (1).png");
        static ImageView boy_dead2=new ImageView("/boy dead/Dead (2).png");
        static ImageView boy_dead3=new ImageView("/boy dead/Dead (3).png");
        static ImageView boy_dead4=new ImageView("/boy dead/Dead (4).png");
        static ImageView boy_dead5=new ImageView("/boy dead/Dead (5).png");
        static ImageView boy_dead6=new ImageView("/boy dead/Dead (6).png");
        static ImageView boy_dead7=new ImageView("/boy dead/Dead (7).png");
        static ImageView boy_dead8=new ImageView("/boy dead/Dead (8).png");
        static ImageView boy_dead9=new ImageView("/boy dead/Dead (9).png");
        static ImageView boy_dead10=new ImageView("/boy dead/Dead (10).png");
        static ImageView boy_dead11=new ImageView("/boy dead/Dead (11).png");
        static ImageView boy_dead12=new ImageView("/boy dead/Dead (12).png");
        static ImageView boy_dead13=new ImageView("/boy dead/Dead (13).png");
        static ImageView boy_dead14=new ImageView("/boy dead/Dead (14).png");
        static ImageView boy_dead15=new ImageView("/boy dead/Dead (15).png");
        
        static ImageView girl_dead1=new ImageView("/girl dead/Dead (1).png");
        static ImageView girl_dead2=new ImageView("/girl dead/Dead (2).png");
        static ImageView girl_dead3=new ImageView("/girl dead/Dead (3).png");
        static ImageView girl_dead4=new ImageView("/girl dead/Dead (4).png");
        static ImageView girl_dead5=new ImageView("/girl dead/Dead (5).png");
        static ImageView girl_dead6=new ImageView("/girl dead/Dead (6).png");
        static ImageView girl_dead7=new ImageView("/girl dead/Dead (7).png");
        static ImageView girl_dead8=new ImageView("/girl dead/Dead (8).png");
        static ImageView girl_dead9=new ImageView("/girl dead/Dead (9).png");
        static ImageView girl_dead10=new ImageView("/girl dead/Dead (10).png");
        static ImageView girl_dead11=new ImageView("/girl dead/Dead (11).png");
        static ImageView girl_dead12=new ImageView("/girl dead/Dead (12).png");
        static ImageView girl_dead13=new ImageView("/girl dead/Dead (13).png");
        static ImageView girl_dead14=new ImageView("/girl dead/Dead (14).png");
        static ImageView girl_dead15=new ImageView("/girl dead/Dead (15).png");
        static ImageView girl_dead16=new ImageView("/girl dead/Dead (16).png");
        static ImageView girl_dead17=new ImageView("/girl dead/Dead (17).png");
        static ImageView girl_dead18=new ImageView("/girl dead/Dead (18).png");
        static ImageView girl_dead19=new ImageView("/girl dead/Dead (19).png");
        static ImageView girl_dead20=new ImageView("/girl dead/Dead (20).png");
        static ImageView girl_dead21=new ImageView("/girl dead/Dead (21).png");
        static ImageView girl_dead22=new ImageView("/girl dead/Dead (22).png");
        static ImageView girl_dead23=new ImageView("/girl dead/Dead (23).png");
        static ImageView girl_dead24=new ImageView("/girl dead/Dead (24).png");
        static ImageView girl_dead25=new ImageView("/girl dead/Dead (25).png");
        static ImageView girl_dead26=new ImageView("/girl dead/Dead (26).png");
        static ImageView girl_dead27=new ImageView("/girl dead/Dead (27).png");
        static ImageView girl_dead28=new ImageView("/girl dead/Dead (28).png");
        static ImageView girl_dead29=new ImageView("/girl dead/Dead (29).png");
        static ImageView girl_dead30=new ImageView("/girl dead/Dead (30).png");
        
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        AudioClip win =new AudioClip(this.getClass().getResource("/sound/fail.m4a").toString());
        win.play();
        
        
        idleB.setTranslateX(-260);
        idleB.setScaleX(0.25);
        idleB.setScaleY(0.25);
        idleB.setTranslateY(-270);
        
        idleG.setScaleX(0.25);
        idleG.setScaleY(0.25);
        idleG.setTranslateY(-220);
        idleG.setTranslateX(-220);
        
        if(LITW.sex==1)
        {
            Timeline i = new Timeline();
            i.setCycleCount(Timeline.INDEFINITE);
            i.getKeyFrames().add(new KeyFrame(
            Duration.millis(200),(ActionEvent event)->{
           idleG.getChildren().setAll(girl_dead2);}));
        
           i.getKeyFrames().add(new KeyFrame(
           Duration.millis(300),(ActionEvent event)->{
           idleG.getChildren().setAll(girl_dead3);}));
        
           i.getKeyFrames().add(new KeyFrame(
           Duration.millis(400),(ActionEvent event)->{
           idleG.getChildren().setAll(girl_dead4);}));
        
           i.getKeyFrames().add(new KeyFrame(
           Duration.millis(500),(ActionEvent event)->{
           idleG.getChildren().setAll(girl_dead5);}));
        
           i.getKeyFrames().add(new KeyFrame(
           Duration.millis(600),(ActionEvent event)->{
           idleG.getChildren().setAll(girl_dead6);}));
        
           i.getKeyFrames().add(new KeyFrame(
           Duration.millis(700),(ActionEvent event)->{
           idleG.getChildren().setAll(girl_dead7);}));
        
           i.getKeyFrames().add(new KeyFrame(
           Duration.millis(800),(ActionEvent event)->{
          idleG.getChildren().setAll(girl_dead8);}));
        
          i.getKeyFrames().add(new KeyFrame(
          Duration.millis(900),(ActionEvent event)->{
          idleG.getChildren().setAll(girl_dead9);}));
        
          i.getKeyFrames().add(new KeyFrame(
          Duration.millis(1000),(ActionEvent event)->{
          idleG.getChildren().setAll(girl_dead10);}));
        
          i.getKeyFrames().add(new KeyFrame(
          Duration.millis(1100),(ActionEvent event)->{
          idleG.getChildren().setAll(girl_dead11);}));

          i.getKeyFrames().add(new KeyFrame(
          Duration.millis(1200),(ActionEvent event)->{
          idleG.getChildren().setAll(girl_dead12);}));
          
          i.getKeyFrames().add(new KeyFrame(
          Duration.millis(1300),(ActionEvent event)->{
          idleG.getChildren().setAll(girl_dead13);}));
          
          i.getKeyFrames().add(new KeyFrame(
          Duration.millis(1400),(ActionEvent event)->{
          idleG.getChildren().setAll(girl_dead14);}));
          
          i.getKeyFrames().add(new KeyFrame(
          Duration.millis(1500),(ActionEvent event)->{
          idleG.getChildren().setAll(girl_dead15);}));
          
          i.getKeyFrames().add(new KeyFrame(
          Duration.millis(1600),(ActionEvent event)->{
          idleG.getChildren().setAll(girl_dead16);}));
          
          i.getKeyFrames().add(new KeyFrame(
          Duration.millis(1700),(ActionEvent event)->{
          idleG.getChildren().setAll(girl_dead17);}));
          
          i.getKeyFrames().add(new KeyFrame(
          Duration.millis(1800),(ActionEvent event)->{
          idleG.getChildren().setAll(girl_dead18);}));
          
          i.getKeyFrames().add(new KeyFrame(
          Duration.millis(1900),(ActionEvent event)->{
          idleG.getChildren().setAll(girl_dead19);}));
          
          i.getKeyFrames().add(new KeyFrame(
          Duration.millis(2000),(ActionEvent event)->{
          idleG.getChildren().setAll(girl_dead20);}));
          
          i.getKeyFrames().add(new KeyFrame(
          Duration.millis(2100),(ActionEvent event)->{
          idleG.getChildren().setAll(girl_dead21);}));
          
          i.getKeyFrames().add(new KeyFrame(
          Duration.millis(2200),(ActionEvent event)->{
          idleG.getChildren().setAll(girl_dead22);}));
          
          i.getKeyFrames().add(new KeyFrame(
          Duration.millis(2300),(ActionEvent event)->{
          idleG.getChildren().setAll(girl_dead23);}));
          
          i.getKeyFrames().add(new KeyFrame(
          Duration.millis(2400),(ActionEvent event)->{
          idleG.getChildren().setAll(girl_dead24);}));
          
          i.getKeyFrames().add(new KeyFrame(
          Duration.millis(2500),(ActionEvent event)->{
          idleG.getChildren().setAll(girl_dead25);}));
          
          i.getKeyFrames().add(new KeyFrame(
          Duration.millis(2600),(ActionEvent event)->{
          idleG.getChildren().setAll(girl_dead26);}));
          
          i.getKeyFrames().add(new KeyFrame(
          Duration.millis(2700),(ActionEvent event)->{
          idleG.getChildren().setAll(girl_dead27);}));
          
          i.getKeyFrames().add(new KeyFrame(
          Duration.millis(2800),(ActionEvent event)->{
          idleG.getChildren().setAll(girl_dead28);}));
          
          i.getKeyFrames().add(new KeyFrame(
          Duration.millis(2900),(ActionEvent event)->{
          idleG.getChildren().setAll(girl_dead29);}));
          
          i.getKeyFrames().add(new KeyFrame(
          Duration.millis(3000),(ActionEvent event)->{ 
          idleG.getChildren().setAll(girl_dead30);}));

          i.play();
        }
        
        else if(LITW.sex==2)
        {
          Timeline IB = new Timeline();
          IB.setCycleCount(Timeline.INDEFINITE);

          IB.getKeyFrames().add(new KeyFrame(
          Duration.millis(200),(ActionEvent event)->{
          idleB.getChildren().setAll(boy_dead2);}));
       
          IB.getKeyFrames().add(new KeyFrame(
          Duration.millis(300),(ActionEvent event)->{
          idleB.getChildren().setAll(boy_dead3);}));
       
          IB.getKeyFrames().add(new KeyFrame(
          Duration.millis(400),(ActionEvent event)->{
          idleB.getChildren().setAll(boy_dead4);}));
       
          IB.getKeyFrames().add(new KeyFrame(
          Duration.millis(500),(ActionEvent event)->{
          idleB.getChildren().setAll(boy_dead5);}));
       
          IB.getKeyFrames().add(new KeyFrame(
          Duration.millis(600),(ActionEvent event)->{
          idleB.getChildren().setAll(boy_dead6);}));
       
          IB.getKeyFrames().add(new KeyFrame(
          Duration.millis(700),(ActionEvent event)->{
          idleB.getChildren().setAll(boy_dead7);}));
       
          IB.getKeyFrames().add(new KeyFrame(
          Duration.millis(800),(ActionEvent event)->{
          idleB.getChildren().setAll(boy_dead8);}));
       
          IB.getKeyFrames().add(new KeyFrame(
          Duration.millis(900),(ActionEvent event)->{
          idleB.getChildren().setAll(boy_dead9);}));
       
          IB.getKeyFrames().add(new KeyFrame(
          Duration.millis(1000),(ActionEvent event)->{
          idleB.getChildren().setAll(boy_dead10);}));
       
          IB.getKeyFrames().add(new KeyFrame(
          Duration.millis(1100),(ActionEvent event)->{
          idleB.getChildren().setAll(boy_dead11);}));
       
          IB.getKeyFrames().add(new KeyFrame(
          Duration.millis(1200),(ActionEvent event)->{
          idleB.getChildren().setAll(boy_dead12);}));
       
          IB.getKeyFrames().add(new KeyFrame(
          Duration.millis(1300),(ActionEvent event)->{
          idleB.getChildren().setAll(boy_dead13);}));
       
          IB.getKeyFrames().add(new KeyFrame(
          Duration.millis(1400),(ActionEvent event)->{
          idleB.getChildren().setAll(boy_dead14);}));
       
          IB.getKeyFrames().add(new KeyFrame(
          Duration.millis(1500),(ActionEvent event)->{
          idleB.getChildren().setAll(boy_dead15);}));
       
          IB.play();
        }
    }
    
    @FXML
    public void Retry(ActionEvent event) throws IOException 
    {
        LITW.buttons.play();
        Parent lvl4 = FXMLLoader.load(getClass().getResource("map.fxml")); 
        Scene lvl4scene = new Scene(lvl4);
        Stage window =(Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(lvl4scene);
        window.show();
    }
    
    @FXML
    public void Quit(ActionEvent event) throws IOException
    {
        LITW.buttons.play();
        Parent nameChart = FXMLLoader.load(getClass().getResource("nameChart.fxml"));
        Scene introscen = new Scene(nameChart);
        Stage window =(Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(introscen);
        window.show(); 
    }
    
}
