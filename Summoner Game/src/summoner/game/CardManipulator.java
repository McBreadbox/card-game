package summoner.game;

import java.io.IOException;

/**
 *
 * @author Nick
 */
public class CardManipulator 
{
    
    //This method creates a ReadFile object and pulls a monster from the text file
    public void createRandomCard(Player p)throws IOException
    {
        MonsterCard newCard = new MonsterCard();
        String fileName = "./data/Monsters.txt";
        int randomNum = 1 + (int)(Math.random() * 3);
        System.out.println(randomNum);
        try
        {
            FileReaderModule file = new FileReaderModule(fileName,3,0);
            String[] monsterInfo = file.OpenFile();
            
            newCard.setName(monsterInfo[0]);
            newCard.setHealth(Integer.valueOf(monsterInfo[1]));
            newCard.setMove1(monsterInfo[2]);
            
            System.out.println("Congradulations! You won a "+ newCard.getName());
        }
        catch(IOException e)
        {
            System.out.println(e.getMessage());
        }
        addToInventory(p,newCard);
    }
    
    
    
    
    
    //prints the inventory
    public static void displayInventory(Player p)
    {
        int i=0;
        while(p.inventory[i]!=null && i<40)
        {
            displayCard(p.inventory[i]);
            i++;
        }
    }
    
    
    //prints the card info
    public static void displayCard(MonsterCard c)
    {
        System.out.println(c.getName());
        System.out.println(c.getHealth());
        System.out.println(c.getMove1());
    }
    
    
    //This method adds any card to the players inventory, no matter how the got it
    //TODO allow to add multiple cards? perhaps just call the method multiple times
    public static void addToInventory(Player p, MonsterCard c){
        int i=0;
        while(i<40)
        {
            if (p.inventory[i] == null)
            {
                    p.inventory[i] = c;
                    break;
            }
            i++;
        }
    }
    
}
