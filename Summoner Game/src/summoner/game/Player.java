package summoner.game;

public class Player 
{
    private String name;
    private int life = 100;
    private int tears;
    private int salt;
    private int resource = 6;
    private int actionPoints;
    public MonsterCard inventory[] = new MonsterCard[40];
    public MonsterCard cardSet[] = new MonsterCard[6];
    
    Player(String name)
    {
        this.name = name;
    }
    
    public int getLife()
    {
        return life;
    }
    
    
    
}
