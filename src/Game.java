import java.util.*;

/**
 * Represents a game played between two teams(team1 vs team2)
 * Game is played in turns
 * player shot determines if a goal is scored or not, using players shooting stat and randomness
 * @param turns
 */
public class Game {
    
    private Team team1;
    private Team team2;
    private int score1;
    private int score2;
    private Random rand;

    public Game(Team team1, Team team2){

        this.team1 = team1;
        this.team2 = team2;
        this.score1 = 0;
        this.score2 = 0;
        
        this.rand = new Random();

    }

    /**
     * Simulates one attacking possession.
     * Which team attacks is 50/50 chance
     * A random player is chosen to shoot, if it is a goal or not is determeined by their shooting stat and randomness
     */
    public void turn(){

        boolean team_1_offence = rand.nextBoolean();
        Team offenceTeam = team_1_offence ? team1 : team2;
        //Team defenceTeam = team_1_offence ? team2 : team1;  can be used if am using defence stats for later

        // randomly picking attacking player
        Player offence = offenceTeam.getPlayers().get(rand.nextInt(offenceTeam.getPlayers().size()));

        // calculating chance of scoring 
        int chanceOfGoal = offence.getShooting() + rand.nextInt(100);

        if (chanceOfGoal > 100) {
            if (team_1_offence){
                score1++;
            }
            else{
                score2++;
                System.out.println(offence.getName() + "scored for " + offenceTeam.getName());
            }
        
        } else {
            System.out.println(offence.getName() + "missed the shot");
        }
    }

    /**
     * Plays the game in given amount of turns
     * @param turns- represents the number of offense to simulate
     */
    public void playGame(int turns){
        for (int i = 0 ; i < turns ; i++){
            turn();
        }

        System.out.println("Final score: " + team1.getName() + " " + score1 + "-" + score2 + " " + team2.getName());
    }

}











}
