public class Slots
{
    private String[] slots = {"", "", ""};
    private String[] slotValue = {"🍒", "🍋", "🍇"};
    
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


        if (slots[0].equals(slots[1]) && slots[1].equals(slots[2]));
        {
            System.out.print("\n"); //\u001B[42m
            System.out.println("You got meony!!");
        }
        
    }
    

}





