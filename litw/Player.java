
package litw;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="PLAYERINFO")    
public class Player implements java.io.Serializable{ 
    
    @Id  
    @Column(name="Name")
    private String Name;
    @Column(name="Level")
    private int Level; 
    @Column(name="PlayerCharacter")
    private String PlayerCharacter;
    @Column(name="Score")
    private int Score;  
    
   public Player()
   {
       
   }
   
   public Player(String Name,int Level, String PlayerCharacter,int Score)
   {
       this.Name = Name;
       this.Level = Level;
       this.PlayerCharacter = PlayerCharacter;
       this.Score = Score;
   }
    public String getName() {
        return Name;
    }


    public void setName(String Name) {
        this.Name = Name;
    }


    public int getLevel() {
        return Level;
    }


    public void setLevel(int Level) {
        this.Level = Level;
    }

  
    public String getPlayerCharacter() {
        return PlayerCharacter;
    }

  
    public void setPlayerCharacter(String PlayerCharacter) {
        this.PlayerCharacter = PlayerCharacter;
    }
    
    public int getScore() {
        return Score;
    }
 
    public void setScore(int Score) {
        this.Score = Score;
    }

    @Override
    public String toString() {
        return "Player{" + "Name=" + Name + ", Level=" + Level + ", PlayerCharacter=" + PlayerCharacter + ", Score=" + Score + '}';
    }
    
 



   
  

  

    

}
