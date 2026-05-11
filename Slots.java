public class Slots
{
    private String[][] slots = {{"", "", ""}, {"", "", ""}, {"", "", ""}};
    private String[] slotValue = {"🍒", "🍇", "🍋"}; //sorry jun, i gotta make this a single array so my brain doesn't explode
    Gamble Gambling = new Gamble();
    
    public void Play()
    {
        int auto = 0;
        int stop = 0;
        while (stop < 3)
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
                    slots[row][col] = slotValue[(int)(Math.random() * 3)];

                    }
            }

            for (int row = auto; row < 3; row++)
            {
                for(int col = 0; col < 3; col++) 
                    {
                    System.out.print(slots[row][col] + " ");

                    }
                System.out.println();
            }
            System.out.print("\u001B[3F"); //move back 3 line



                try{

                Thread.sleep(50);
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

        if(slots[0][0].equals(slots[0][1]) && slots[0][1].equals(slots[0][2])) {
            if(slots[0][0].equals("🍒") && slots[0][1].equals("🍒") && slots[0][2].equals("🍒")) {
                System.out.println("ye won " + Gambling.addCoin(15) + " coins!");
            }
            else if(slots[0][0].equals("🍇") && slots[0][1].equals("🍇") && slots[0][2].equals("🍇")){
                                System.out.println("ye won" + Gambling.addCoin(25) + " coins!");
            } else if(slots[0][0].equals("🍋") && slots[0][1].equals("🍋") && slots[0][2].equals("🍋")){
                                System.out.println("ye won " + Gambling.addCoin(35) + " coins!");
           
        }
    } else if(slots[1][0].equals(slots[1][1]) && slots[1][1].equals(slots[1][2])) {
        if(slots[1][0].equals("🍒") && slots[1][1].equals("🍒") && slots[1][2].equals("🍒")) {
            System.out.println("ye won " + Gambling.addCoin(15) + " coins!");
        }
        else if(slots[1][0].equals("🍇") && slots[1][1].equals("🍇") && slots[1][2].equals("🍇")){
            System.out.println("ye won " + Gambling.addCoin(25) + " coins!");
        } else if(slots[1][0].equals("🍋") && slots[1][1].equals("🍋") && slots[1][2].equals("🍋")){
            System.out.println("ye won " + Gambling.addCoin(35) + " coins!");
        }
    } else if(slots[2][0].equals(slots[2][1]) && slots[2][1].equals(slots[2][2])) {
        if(slots[2][0].equals("🍒") && slots[2][1].equals("🍒") && slots[2][2].equals("🍒")) {
            System.out.println("ye won " + Gambling.addCoin(15) + " coins!");
        }
        else if(slots[2][0].equals("🍇") && slots[2][1].equals("🍇") && slots[2][2].equals("🍇")){
            System.out.println("ye won " + Gambling.addCoin(25) + " coins!");
        } else if(slots[2][0].equals("🍋") && slots[2][1].equals("🍋") && slots[2][2].equals("🍋")){
            System.out.println("ye won " + Gambling.addCoin(35) + " coins!");
        }
    }
    Main.coins = Gambling.addCoin(Main.coins);
    Gambling.options();
}
}