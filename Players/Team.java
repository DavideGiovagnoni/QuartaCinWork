import java.util.ArrayList;

public class Team {

    private String name;
    ArrayList<Player>players;

    public Team(String name) {
        this.name = name;
        players = new ArrayList<>();
    }

    public void add(Player p)  {
        players.add(p);

    }
    
}
