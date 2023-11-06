package model;
import model.Team;
import java.sql.Date;


public class Match {
    private Team home;
    private Team visitor;
    private Integer homeScore;
    private Integer visitorScore;
    private Date date;

    public Team getResult() {
        if(homeScore > visitorScore){
            return home;
        }
        else if(homeScore < visitorScore){
            return visitor;
        }
        else{
            return null;
        }
            
    }

    public Integer getResult(Team t){
        if(t == home){
            return homeScore;
        }
        else if(t == visitor){
            return visitorScore;
        }
        else{
            return null;
        }

    }

}
