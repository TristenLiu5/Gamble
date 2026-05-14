import java.util.Scanner;


public class Gamble
{
    private int coins = 10;
    Scanner userInput = new Scanner(System.in);

    public int addCoin(int c) {
        
        coins += c;
        return coins;
    }
    

    
    public void options() 
    {
        boolean play = true;
         while(play) {
        System.out.println("Slot Machines - Costs 2 coins, Win up to 250 coins!");
            // System.out.println("Placeholder");
            // System.out.println("Placeholder");
            System.out.println("You have " + coins + " coins.");
            System.out.println("type slots or 1 to play... good luck to ye, beginners...");
            // System.out.println("Select an option.");
            String choice = userInput.nextLine();  
           
            if(choice.equals("quit"))
            {
                 play = false;
                
                 System.out.println("Practice yer luck, pal!");

                 break;
                
            } else   if(choice.equals("dororong")) {
                coins = 0;
                System.out.println("sorry, our cutty tiny goddess didn't liked ye.");

            }

            if(choice.equals("youmu")) {
                coins += coins;
                System.out.println("... didn't know that ghost girl knew how to do some favors...");
            }
           
        
                if (choice.toLowerCase().contains("sl") || choice.toLowerCase().contains("ot") || choice.equals("1"))
            {
                if (coins >= 2)
                {
                    coins -= 2;
                    Slots slotGame = new Slots();
                    slotGame.Play();
        
                }

           
                else if (coins < 2)
                {
                    System.out.println("Sorry! You are too POOR! Come back when you're a little... mmmmmmmm... RICHER!");
                }
            }
           
        }
        
    }
}