import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class Main {
    public static void main(String[] args) {
        
        Team team1 = new Team("Liverpool");
        // player: name, speed, shooting, stamina
        team1.addPlayer(new Player("Isak", 80 , 90, 77));
        team1.addPlayer(new Player("Wirtz", 75, 50, 88));
        team1.addPlayer(new Player("Van Dijk", 70, 10, 80));
    
        Team team2 = new Team("Chelsea");
        team2.addPlayer(new Player("Pedro", 80 , 80, 77));
        team2.addPlayer(new Player("Enzo", 75, 60, 88));
        team2.addPlayer(new Player("Colwill", 70, 5, 80));
        
        Game game = new Game(team1, team2);

        //GUI

        JFrame frame = new JFrame("SOCCER GAME SIMULATOR");
        frame.setSize(500, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        

        //Buttons
        JButton playButton = new JButton("Play game");

        //text area
        JTextArea textArea = new JTextArea();
        textArea.setEditable(false);
        
        JScrollPane scrollPane = new JScrollPane(textArea);


        frame.setLayout(new BorderLayout());
        frame.add(playButton);
        frame.add(playButton, BorderLayout.NORTH);
        frame.add(scrollPane, BorderLayout.CENTER);
        
        playButton.addActionListener(new ActionListener() {
            
            public void actionPerformed(ActionEvent e){
                
                textArea.setText("");

                int turns = 5;
                for(int i = 0; i < turns; i++){
                   textArea.append("Turn " + (i+1) + ":\n");
                   game.turn(textArea);
                   textArea.append("\n");
                              
                }

                textArea.append("Final Score: " + team1.getName() + " " + game.getScore1() + "-" + game.getScore2() + " " + team2.getName() + "\n");
            }
        });

        frame.setVisible(true);
    }
}