import java.util.Scanner;


public class Gamble
{
    static int coins = 0;
    Scanner userInput = new Scanner(System.in);
    public int botherCount = 0;

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
            System.out.println("Type slots or 1 to play... good luck to ye, beginners...");
            System.out.println("You have " + coins + " coins.");
            // System.out.println("Select an option.");
            String choice = userInput.nextLine();  

            if(choice.toLowerCase().equals("loan"))
            {
                System.out.println("\u001B[91mWe got ya call. Here's some of that sweet gold. But, you best pay double by 8 rounds, or...");
                                try{
                Thread.sleep(1000);
                }
                catch (Exception e)
                {
                }
                int respond = (int)(Math.random() * 3);
                if (respond == 0)
                {
                System.out.println("Let's just say, you might be seein' a nice fellow outside you're house soon.");
                }
                else if (respond == 1)
                {
                System.out.println("Let's just say, you'll be sleepin' with the fishes soon.");
                }
                else if (respond == 2)
                {
                System.out.println("Let's just say, those clothes of yours will be stained a nice crimson.");
                }
                System.out.print("\u001B[0m");
            try{
            Thread.sleep(2000);
            }
            catch (Exception e)
            {
            }


            } 
            if(choice.toLowerCase().equals("quit"))
            {
                 play = false;
                
                 System.out.println("Practice yer luck, pal!");

                 break;
            } 
            if(choice.toLowerCase().contains("dororong")) {
                coins = Integer.MIN_VALUE;
                System.out.println("Sorry, our cute tiny goddess didn't liked ye.");

            }

            if(choice.toLowerCase().contains("youmu")) {
                if (coins > 0)
                {
                coins *= 2;
                System.out.println("Somehow she cut your money in half... which doubled it??? I don't know either man");
                }
            }
           
        
                if (choice.toLowerCase().contains("sl") || choice.toLowerCase().contains("ot") || choice.equals("1"))
            {
                if (coins >= 2)
                {
                    botherCount = 0;
                    coins -= 2;
                    Slots slotGame = new Slots();
                    slotGame.Play();
        
                }

           
                if (coins < 2)
                {
                    if (botherCount == 0)
                    {
                        System.out.println("Sorry! You are too POOR! Come back when you're a little... mmmmmmmm... RICHER!");
                    }
                    else if (botherCount == 1)
                    {
                        System.out.println("Buddy, you don't have money, why are you tryna gamble?");
                    }
                    else if (botherCount == 2)
                    {
                        System.out.println("You're that addicted to gambling? Seriously, learn to quit.");
                    }
                    else if (botherCount == 3)
                    {
                        System.out.println("Alright, fine. I'll let you in on a little secret. There's some people out back willing to give you loan if you type 'loan'. I wouldn't recommend it though.");
                    }
                    else if (botherCount == 4)
                    {
                        System.out.println("I already gave you the answer. Just type loan if you're that desperate to gamble.");
                    }
                    if (botherCount < 4)
                    {
                    botherCount++;
                    }
                }
            }
           
        }
        
    }
}