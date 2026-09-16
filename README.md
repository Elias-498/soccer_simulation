# Turn-Based Soccer Simulation

Turn-Based Soccer Simulation is a Java desktop application built with Swing. It simulates a match between two predefined teams. On each turn, the program randomly chooses the attacking side and a shooter from that team's roster, then uses the player's shooting rating and a random roll to determine whether the shot is scored or missed.

## Features

- Swing interface with a Play button and scrollable match commentary
- Two predefined teams with individual player ratings
- Random selection of the attacking side and shooter on each turn
- Shooting-based scoring with randomized outcomes
- Score tracking for both teams
- A new match that begins at 0-0 each time the Play button is selected
- Match length controlled by the `turns` variable in `Main.java`

## How It Works

1. `Main` creates the teams, player rosters, and Swing interface.
2. Selecting **Play game** clears the previous commentary and creates a new match with the score at 0-0.
3. For each turn, `Game` randomly chooses one of the two predefined teams to attack.
4. A shooter is randomly selected from the attacking team's roster.
5. The player's shooting rating is added to a random value from 0 to 99. A total greater than 100 results in a goal.
6. The turn outcome and final score are displayed in the interface.

The number of turns is set by the `turns` variable in `Main.java` and can be changed without modifying the game logic.

`Player` objects also store speed and stamina ratings. These values are available for future mechanics but do not currently affect shot outcomes.

## Core Files

| File | Purpose |
| --- | --- |
| `Main.java` | Defines the teams and players, creates the Swing interface, and starts each match. |
| `Game.java` | Simulates turns, determines shot outcomes, and tracks the score. |
| `Team.java` | Stores a team name and its player roster. |
| `Player.java` | Stores a player's name, speed, shooting, and stamina ratings. |

## Running the Project

### Requirements

- Java Development Kit (JDK) 8 or later
- IntelliJ IDEA or another Java development environment

### IntelliJ IDEA

1. Open the `soccer_simulation` project folder in IntelliJ IDEA.
2. Make sure the `src` folder is marked as **Sources Root**.
3. Set the project SDK under **File > Project Structure > Project**.
4. Open `Main.java` and run `Main.main()`.
5. Select **Play game** in the application window to start a match.

### Command Line

From the repository root:

```bash
javac -d bin src/Main.java src/Game.java src/Team.java src/Player.java
java -cp bin Main
```

## Design

The project uses separate `Player`, `Team`, and `Game` classes to organize player data, team rosters, match logic, and scoring. `Main` creates the initial data and the Swing interface. An action listener responds to the Play button and updates the match display after each turn.

## Example Output

```text
Turn 1:
Van Dijk missed the shot

Turn 2:
Isak scored for Liverpool

Final Score: Liverpool 1-0 Chelsea
```

## Planned Improvements

- Allow users to choose teams, players, and the number of turns in the interface
- Add goalkeepers and a save mechanic
- Use speed and stamina during the simulation
- Add more player attributes, such as defence, heading, and composure
- Add events such as passes, assists, fouls, dribbles, and defensive actions
- Add audio cues for goals, missed shots, kickoff, and the final whistle
- Add automated tests for scoring and game-state behaviour
- Improve the interface layout and match commentary


