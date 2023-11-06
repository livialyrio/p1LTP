package model;

import java.util.ArrayList;

public class Team {
    private String name;
    private String colors;
    private ArrayList<Player> players = new ArrayList<Player>();


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public String getColors() {
        return colors;
    }

    public void setColors(String colors) {
        this.colors = colors;
    }

    public void setPlayers(ArrayList<Player> players){
        this.players = players;
    }

    public ArrayList<Player> getPlayers(){
        return players;
    }
}
