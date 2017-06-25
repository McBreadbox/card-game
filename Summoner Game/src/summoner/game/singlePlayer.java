package summoner.game;
import java.util.Scanner;

public class singlePlayer 
{
    public void game(Player p)
    {
        Scanner s = new Scanner(System.in);
            int i;
            int j;
            
            int totalMonsters = 0;
            int totalML = 0;
            int playerLife = p.getLife();
            
            for(int a = 0; a <6; a++)
            {
                if (p.inventory[a]!=null)
                {
                    totalMonsters = totalMonsters+1;
                    totalML = totalML + p.inventory[a].getHealth();
                    init(p.inventory[a],a);
                }
            }
            
        
        while(totalML != 0 && playerLife != 0)
        {
            String[][] map = new String[12][8];
            

            //begins first row
            for(i = 0; i<12; i++)
            {
                //prints map divider
                if (i==6)
                    System.out.println("------------------------");
                
                //prints the map
                for(j=0; j<8; j++)
                {
                    map[i][j] = "[ ]";
                    

                    //places monsters on map
                    for(int b = 0; b < totalMonsters; b++)
                    {
                        if (j==p.inventory[b].getX() && i==p.inventory[b].getY())
                        {
                            map[i][j] = ("[" + p.inventory[b].getHealth() + "]");
                        }
                    }
                        System.out.print(map[i][j]);
                }
            
                System.out.println();
                
            }
            for(int b = 0; b < totalMonsters; b++)
            {
                System.out.println("Make a move for your monster #" + (b+1));        
                String move = s.nextLine();
                
                if(move.equals("w") && p.inventory[b].getY() > 0)
                    p.inventory[b].setY(p.inventory[b].getY()-1);
                
                else if(move.equals("s") && p.inventory[b].getY() < 11)
                    p.inventory[b].setY(p.inventory[b].getY()+1);
                
                else if(move.equals("a") && p.inventory[b].getX() > 0)
                    p.inventory[b].setX(p.inventory[b].getX()-1);
                
                else if(move.equals("d") && p.inventory[b].getX() < 7)
                    p.inventory[b].setX(p.inventory[b].getX()+1);
                
                else if(move.equals("q"))
                    System.exit(0);
            }
            /*System.out.println("Confirm move");
            String confirm = s.nextLine();
                break;
            else{}*/ 
        }       
    }
    
    public void init(MonsterCard m, int x)
    {
        Scanner s = new Scanner(System.in);
        
        //System.out.println("X coordinate: (2)");
        m.setX(x+1);//s.nextInt());
        //System.out.println("Y coordinate: (11)");
        m.setY(11);//s.nextInt());
    }
}
