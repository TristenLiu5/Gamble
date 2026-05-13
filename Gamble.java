import java.util.Scanner;


public class Gamble
{
    private int coins = 0;
    Scanner userInput = new Scanner(System.in);

    public int addCoin(int c) { //aa
        
        coins += c;
        return coins;
        
    }

    

    
    public void options() 
    {
        boolean failsafe = false;
        
        while (failsafe == false)
        {
            System.out.println("Slot Machines - Costs 2 coins, Win up to 250 coins!");
            // System.out.println("Placeholder");
            // System.out.println("Placeholder");
            System.out.println("You have " + coins + " coins.");
            
            // System.out.println("Select an option.");
            String choice = userInput.nextLine();  
            
            if (choice.toLowerCase().contains("sl") || choice.toLowerCase().contains("ot") || choice.equals("1"))
            {
                if (coins >= 2)
                {
                    Main.coins -= 2;
                    failsafe = true;
                    Slots slotGame = new Slots();
                    slotGame.Play();
        
                }
        
                else if (coins < 2)
                {
                    System.out.println("Sorry! You are too POOR! Come back when you're a little... mmmmmmmm... RICHER!");
                }
            }
            else
            {
                System.out.println("That's not a valid answer.");

            }
        }
        
    }
    
    
	
}
	