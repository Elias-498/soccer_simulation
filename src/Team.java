import java.util.ArrayList;

/**
 * Represents a soccer team with a list of players. 
 * Allows adding players and getting team information
 */
public class Team {

    private String name; // team name
    private ArrayList<Player> players; // list of players

    public Team(String name) {

        this.name = name;
        this.players = new ArrayList<>(); 

    }

    /**
     * Adds a player to the team
     * @param player - player to add(object)
     */
    public void addPlayer(Player player){
        players.add(player);
    }

    // Returns the list of players in the team
    public ArrayList<Player> getPlayers() {
        return players;
    }

    // returns team name
    public String getName(){
        return name;
    }
    
}
