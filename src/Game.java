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
     * Simulates one attacking possession in the console.
     */
    public void turn() {
        System.out.print(simulateTurn());
    }

    /**
     * Simulates one attacking possession and writes the result to the GUI.
     *
     * @param textArea the text area used to display the turn result
     */
    public void turn(JTextArea textArea) {
        textArea.append(simulateTurn());
    }

    private String simulateTurn() {
        boolean team1Offence = rand.nextBoolean();
        Team offenceTeam = team1Offence ? team1 : team2;

        Player offence = offenceTeam.getPlayers().get(rand.nextInt(offenceTeam.getPlayers().size()));
        int chanceOfGoal = offence.getShooting() + rand.nextInt(100);

        if (chanceOfGoal > 100) {
            if (team1Offence) {
                score1++;
            } else {
                score2++;
            }

            return offence.getName() + " scored for " + offenceTeam.getName() + "\n";
        }

        return offence.getName() + " missed the shot\n";
    }

    /**
     * Plays the game for the given number of turns in the console.
     *
     * @param turns the number of attacking possessions to simulate
     */
    public void playGame(int turns) {
        for (int i = 0; i < turns; i++) {
            turn();
        }

        System.out.println("Final score: " + team1.getName() + " " + score1 + "-" + score2 + " " + team2.getName());
    }

    public int getScore1() {
        return score1;
    }

    public int getScore2() {
        return score2;
    }
}
