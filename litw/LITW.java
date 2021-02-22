package litw;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label; 
import javafx.scene.image.ImageView;
import javafx.scene.media.AudioClip;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import org.hibernate.Transaction;


public class LITW extends Application {
    
     static int sex=0;
     static Label cont;
     static Text cong;
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
   
static AudioClip bgmusic ; 
static AudioClip buttons ;
static AudioClip buzz ;
static AudioClip correct; 
  
  
    @Override 
    public void start(Stage stage) throws Exception {  
     buttons=new AudioClip(this.getClass().getResource("/buttons/mouse-click.mp3").toString());
     buzz =new AudioClip(this.getClass().getResource("/sound/buzz.m4a").toString());
     correct =new AudioClip(this.getClass().getResource("/sound/correct_answre.m4a").toString());
      ////////////////////////
     bgmusic =new AudioClip(this.getClass().getResource("/background/soundLITW.mp3").toString());
     bgmusic.play();
        Parent root = FXMLLoader.load(getClass().getResource("home.fxml"));               
        Scene scene = new Scene(root);   
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {  
        launch(args); 
    }
    
    
    
}
