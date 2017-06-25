package summoner.game;

import java.io.IOException;

public class MonsterCard 
{
    private String name;
    private int health, attackPoints, movementPoints, x, y;
    final int level = 1, levelLimit = 6;
    private String move1, move2, move3, move4, move5, move6, ability;
    
    private boolean canMove;
    private boolean canAttack;

    //getters 
    public String getName()
    {
        return name;
    }
    public int getHealth()
    {
        return health;
    }
    public String getMove1()
    {
        return move1;
    }
    public int getX()
    {
        return x;
    }
    public int getY()
    {
        return y;
    }
    
    
    //setters
    public void setName(String name)
    {
        this.name = name;
    }
    public void setHealth(int health)
    {
        this.health = health;
    }
    public void setMove1(String move1)
    {
        this.move1 = move1;
    }
    public void setX(int x)
    {
        this.x = x;
    }
    public void setY(int y)
    {
        this.y = y;
    }
    
    
    
    
}
        


