package litw;

import java.io.IOException;
import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.media.AudioClip;
import javafx.stage.Stage;
import org.hibernate.Query;
import org.hibernate.Session;



public class NameChartController implements Initializable {
@FXML
Button btnm;
@FXML
Button btnum;
@FXML
TableView table;
@FXML
TableColumn<Player,String> NameCol;
@FXML
TableColumn<Player,Integer> LevelCol;
@FXML
TableColumn<Player,String> CharacterCol;
@FXML
TableColumn<Player,Integer> ScoreCol;   
ObservableList<Player> data = FXCollections.observableArrayList();  
  
@Override
public void initialize(URL url, ResourceBundle rb) {
   
    NameCol.setCellValueFactory(new PropertyValueFactory<>("Name"));
    LevelCol.setCellValueFactory(new PropertyValueFactory<>("Level")); 
    CharacterCol.setCellValueFactory(new PropertyValueFactory<>("PlayerCharacter")); 
    ScoreCol.setCellValueFactory(new PropertyValueFactory<>("Score"));  
    
    Session session = HibernateUtil.getSessionFactory().openSession();
    List<Player> plist = null;
    String queryStr = "from Player";
    Query query = session.createQuery(queryStr);  
    plist = query.list();
    session.close();
   
   Session session1 = HibernateUtil.getSessionFactory().openSession();
   List<Score> slist = null;
   String queryStr1 = "from Score";
   Query query1 = session1.createQuery(queryStr1);  
   slist = query1.list();
   session1.close();
    
  
    int S = 0;
   Player player = null;
    for(Player p: plist)  {
            for(Score s: slist) {
             if(s.getLevel()==p.getLevel()){
                 S=s.getScore(); 
                 } 
            }
                System.out.println(S);
                p.setScore(S);
                player = new Player(p.getName(),p.getLevel(),p.getPlayerCharacter(),p.getScore());
                data.add(player); 
      
        }

    table.setItems(data);
}

@FXML
private void ButtonBack(ActionEvent event) throws IOException {
   AudioClip note =new AudioClip(this.getClass().getResource("/buttons/mouse-click.mp3").toString());
   note.play();
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
private void Mute(ActionEvent event) throws IOException {
     AudioClip note =new AudioClip(this.getClass().getResource("/buttons/mouse-click.mp3").toString());
     note.play();
     LITW.bgmusic.stop();
     btnm.setVisible(false);
     btnm.setDisable(true);
     btnum.setVisible(true);
     btnum.setDisable(false);
}

@FXML
private void Unmute(ActionEvent event) throws IOException {
     AudioClip note =new AudioClip(this.getClass().getResource("/buttons/mouse-click.mp3").toString());
     note.play();
     LITW.bgmusic.play();
     btnum.setVisible(false);
     btnum.setDisable(true);
     btnm.setVisible(true);
     btnm.setDisable(false); 
}
}
