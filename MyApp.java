
import model.Player;
import model.Team;

public class MyApp {
    public static void main(String[] args) {
        Player player1 = new Player();
        Player player2 = new Player();
        Player player3 = new Player();

        player1.setName("German");
        player1.setSurname("Cano");
        player1.setNumber(14);

        player2.setName("John");
        player2.setSurname("Kennedy");
        player2.setNumber(9);    
        
        player3.setName("Andre");
        player3.setNumber(7);
        
        System.out.println(player1.getName() + " " + player1.getSurname() + " " + player1.getNumber());

        Team team = new Team();

        team.setName("fluminense");
        team.setColors("verde, grená, branca");

        team.getPlayers().add(player1);
        team.getPlayers().add(player2);
        team.getPlayers().add(player3);


    }
}
