public class Slots
{
    private String[][] slots = {{"", "", ""}, {"", "", ""}, {"", "", ""}};
    private String[][] slotValue = {{"🍒", "🍇", "🍋"}, {"🍒", "🍇", "🍋"}, {"🍒", "🍇", "🍋"}}; //among us
    Coin money = new Coin();
    Gamble Gambling = new Gamble();
    
    public void Play()
    {
        int auto = 0;
        int stop = 0;
        while (stop < 1)
        {

            if (auto >= 1)
            {
                stop++;
                auto = 0;
            }


            for (int row = 0; row < 3; row++)
            {
                for(int col = 0; col < 3; col++) 
                    {
                    slots[row][col] = slotValue[(int)(Math.random() * 3)][(int)(Math.random()*3)];
                    }
            }

                System.out.println();
            for (int row = 0; row < 3; row++) 
            {
                for(int col = 0; col < 3; col++) 
                {
                    System.out.print(slots[row][col] + " ");
                }
                System.out.println();
            }


                try{

                Thread.sleep(50);
                }
                catch (Exception e)
                {
                    System.out.println("An error has occured, please try again");

                }
                    auto++;
            }
            

        if(slots[0][0].equals(slots[0][1]) && slots[0][1].equals(slots[0][2])) {
            if(slots[0][0].equals("🍒") && slots[0][1].equals("🍒") && slots[0][2].equals("🍒")) {
                System.out.println("ye won" + money.addCoin(15) + " Coins!");
            }
            else if(slots[0][0].equals("🍇") && slots[0][1].equals("🍇") && slots[0][2].equals("🍇")){
                                System.out.println("ye won" + money.addCoin(25) + " Coins!");
            } else if(slots[0][0].equals("🍋") && slots[0][1].equals("🍋") && slots[0][2].equals("🍋")){
                                System.out.println("ye won" + money.addCoin(35) + " Coins!");
           
        }
    } else if(slots[1][0].equals(slots[1][1]) && slots[1][1].equals(slots[1][2])) {
        if(slots[1][0].equals("🍒") && slots[1][1].equals("🍒") && slots[1][2].equals("🍒")) {
            System.out.println("ye won" + money.addCoin(15) + " Coins!");
        }
        else if(slots[1][0].equals("🍇") && slots[1][1].equals("🍇") && slots[1][2].equals("🍇")){
            System.out.println("ye won" + money.addCoin(25) + " Coins!");
        } else if(slots[1][0].equals("🍋") && slots[1][1].equals("🍋") && slots[1][2].equals("🍋")){
            System.out.println("ye won" + money.addCoin(35) + " Coins!");
        }
    } else if(slots[2][0].equals(slots[2][1]) && slots[2][1].equals(slots[2][2])) {
        if(slots[2][0].equals("🍒") && slots[2][1].equals("🍒") && slots[2][2].equals("🍒")) {
            System.out.println("ye won" + money.addCoin(15) + " Coins!");
        }
        else if(slots[2][0].equals("🍇") && slots[2][1].equals("🍇") && slots[2][2].equals("🍇")){
            System.out.println("ye won" + money.addCoin(25) + " Coins!");
        } else if(slots[2][0].equals("🍋") && slots[2][1].equals("🍋") && slots[2][2].equals("🍋")){
            System.out.println("ye won" + money.addCoin(35) + " Coins!");
        }
    }
    Gambling.options();
}
}