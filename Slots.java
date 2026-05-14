public class Slots
{
    private String[][] slots = {{"", "", ""}, {"", "", ""}, {"", "", ""}};
    private String[] slotValue = {"🍒", "🍒", "🍒", "🍒", "🍇", "🍇", "🍇", "🍇", "🍋", "🍋", "🍋", "🍋", "🍉", "🍉" , "🍉" , "🍉", "🍫", "🍫", "🍫", "7️⃣ ", "\u001B[42;1m77\u001B[0m"}; //sorry jun, i gotta make this a single array so my brain doesn't explode
    Gamble Gambling = new Gamble();
    int bank = 0;

    public void Play()
    {
        int auto = 0;
        int stop = 0;
        while (stop < 3)
        {

            if (auto >= 20)
            {
                stop++;
                auto = 0;
            }

            for (int row = stop; row < 3; row++)
            {
                for(int col = 0; col < 3; col++) 
                    {
                    slots[row][col] = slotValue[(int)(Math.random() * 20)];
                    //slots[row][col] = slotValue[19]; //(guarenteed jackpot)
                    }
            }
            

            for (int row = 0; row < 3; row++)
            {
                for(int col = 0; col < 3; col++) 
                    {
                    System.out.print(slots[row][col] + " ");

                    }
                System.out.println();
            }
            System.out.print("\u001B[3F"); //move back 3 line



                try{

                Thread.sleep(100);
                }
                catch (Exception e)
                {
                    System.out.println("An error has occured, please try again");

                }
                    auto++;
            }
        System.out.print("\r");
        System.out.println(slots[0][0] + " " + slots[0][1] + " " + slots[0][2]);
        System.out.println(slots[1][0] + " " + slots[1][1] + " " + slots[1][2]);
        System.out.println(slots[2][0] + " " + slots[2][1] + " " + slots[2][2]);

        try{
        Thread.sleep(200);
        }
        catch (Exception e)
        {
            System.out.println("An error has occured, please try again");

        }
        for(int i = 0; i < 3; i++) {
            if(slots[i][0].equals(slots[i][1]) && slots[i][1].equals(slots[i][2])) {
                reward(slots[i][0]);
            } else if(slots[0][i].equals(slots[1][i])&& slots[1][i].equals(slots[2][i])) {
                reward(slots[0][i]);
            }
        } 
        if (bank > 0){
            if (bank < 100)
            {
            Gambling.addCoin(bank);
            System.out.println("Ye got " + bank + " coins!");
            bank = 0;
            }
            else if (bank >= 100 & bank < 250)
            {
            Gambling.addCoin(bank);
            System.out.println("Ye won " + bank + " coins baby!");
            bank = 0;
            }
            else
            {
                Gambling.addCoin(250);
                System.out.println("YE JUST HIT THE...");
                try{
                Thread.sleep(1000);
                }
                catch (Exception e)
                {
                System.out.println("An error has occured, please try again");
                }
                System.out.println("\u001B[42m $$$ JACKPOTTTTTTTTT!!! $$$ \u001B[0m");
                bank = 0;
            }
        }
        else{
            System.out.println("BUST! Ye get 'em next time... maybe...");
        }
        try{

        Thread.sleep(500);
        }
        catch (Exception e)
        {
            System.out.println("An error has occured, please try again");

        }


       
    Gambling.options();
}

   public void reward(String symbol) {
            if(symbol.equals("🍒")) {
                bank += 5;
            } else if(symbol.equals("🍇")) {
                bank += 10;
            } else if(symbol.equals("🍉")) {
                bank += 15;
            } else if(symbol.equals("🍋")) {
                bank += 25;
            }else if(symbol.equals("🍫")) {
                bank += 50;
            }else if(symbol.equals("7️⃣ ")) {
                bank += 100;
            }else if(symbol.equals("\u001B[42;1m77\u001B[0m")) {
                bank += 250;
        }
    }
    }
