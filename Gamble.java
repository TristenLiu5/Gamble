import java.util.Scanner;


public class Gamble
{
    private int coins = 0;
    Scanner userInput = new Scanner(System.in);

    
    public void setCoin(int c) {
        
        coins = c;
        
    }
    
    public void options() {
        
        
        System.out.println("Slot Machines - Costs 5 coins, Win up to 250 coins!");
        System.out.println("Placeholder");
        System.out.println("Placeholder");
        System.out.println("You have " + coins + " coins.");
        
        System.out.println("Select an option");
        String choice = userInput.nextLine();  
        
        if (choice.toLowerCase().equals("slots") || choice.equals("1"))
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
	