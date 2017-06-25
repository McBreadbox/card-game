package summoner.game;
/*
This is a game written by Nickolas Conte
*/
import java.util.Scanner;
import java.io.IOException;

public class SummonerGame
{
    
    
    public static void main(String[] args) throws IOException
    {
        Scanner s = new Scanner (System.in);
        CardManipulator m = new CardManipulator();
        
        
        System.out.println("Welcome to the summoner game!");
        System.out.println("Please pick a name.");        
        String newName = s.nextLine();
        
        String name = newName;
        Player p = new Player(name);

        System.out.println("Welcome " + name + ", you get one card.");
        
        m.createRandomCard(p);
        int i=0;
        while(i == 0){
            System.out.println("_______________________");
            System.out.println("Display card? 'd'");
            System.out.println("Play card lottery? 'a'");
            System.out.println("Quit? 'q'");
            System.out.println("Start single player game? 's'");
            System.out.println("_______________________");

            String invCard = s.nextLine();
        
            if (invCard.equals("d"))
            {
                System.out.println("Inventory:");
                m.displayInventory(p);
            }
            if (invCard.equals("a"))
            {
                m.createRandomCard(p);
            }
            if (invCard.equals("q"))
            {
                break;
            }
            if (invCard.equals("s"))
            {
                singlePlayer sp = new singlePlayer();
                sp.game(p);
            }
        }
    }
    
    
    
    
}
