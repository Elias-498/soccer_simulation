/**
 * Represents a soccer player with stats
 */
public class Player {

    private String name ;
    private int speed ; // affects chance to get ball
    private int shooting ; // affects chance to score
    private int stamina ; // affects chance to perform actions

    
    public Player(String name, int speed, int shooting, int stamina){

        this.name = name ;
        this.speed = speed ;
        this.shooting = shooting ;
        this.stamina = stamina ;
        
    }

    // Getters
    public String getName() {
        return name;
    }

    public int getSpeed(){
        return speed; 
    }

    public int getShooting(){
        return shooting;
    }

    public int getStamina(){
        return stamina ;
    }
}
