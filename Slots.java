public class Slots
{
    private String[] slots = {"", "", ""};
    private String[] slotValue = {"🍒", "🍇", "🍋"};
    Gamble Gambling = new Gamble();
    //Gamble Gambling = Main.Gambling();
    
    public void Play()
    {
        int auto = 0;
        int stop = 0;
        while (stop < 3)
        {

            if (auto >= 10)
            {
                stop++;
                auto = 0;
            }


            for (int i = stop; i < 3; i++)
            {
                slots[i] = slotValue[(int) (Math.random() * 3)];
                System.out.print("\r" + slots[0] + slots[1] + slots[2]);

                try{

                Thread.sleep(50);
                }
                catch (Exception e)
                {
                    System.out.println("An error has occured, please try again");

                }
            }
            auto++;
        }

        System.out.print("\n"); //\u001B[42m
        if (slots[0].equals("🍒") && slots[0].equals(slots[1]) && slots[1].equals(slots[2]))
        { 
            System.out.println("You won " + Gambling.addCoin(5) + " coins!");
        }
        else if (slots[0].equals("🍇") && slots[0].equals(slots[1]) && slots[1].equals(slots[2]))
        {
            System.out.println("You won " + Gambling.addCoin(15) + " coins!");
        }
        else if (slots[0].equals("🍋") && slots[0].equals(slots[1]) && slots[1].equals(slots[2]))
        {
            System.out.println("You won " + Gambling.addCoin(25) + " coins!");
        }

        try{

        Thread.sleep(200);
        }
        catch (Exception e)
        {
            System.out.println("An error has occured, please try again");

        }
        Gambling.options();
    }
    

}





