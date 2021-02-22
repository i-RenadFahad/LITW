
package litw;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="SCOREINFO") 
public class Score implements java.io.Serializable{
    
    @Id  
    @Column(name="Level")
    private int Level;
    @Column(name="Score") 
    private int Score;
    
    public Score()
    {
        
    }
    
    public Score(int Level,int Score)
    {
        Level = this.Level;
        Score = this.Score;
    }

  
    public int getLevel() {
        return Level;
    }

 
    public void setLevel(int Level) {
        this.Level = Level;
    }

  
    public int getScore() {
        return Score;
    }

    public void setScore(int Score) {
        this.Score = Score;
    }
}
