public class Slots
{
    private String[] slots = {"", "", ""};
    private String[] slotValue = {"🍒", "🍋", "🍇"};
    
    public void Play()
    {
        int terra = 0;
        while (terra < 50)
        {
            for (int i = 0; i < 3; i++)
            {
                slots[i] = slotValue[(int) (Math.random() * 3)];
                System.out.print(slots[0] + slots[1] + slots[2] + "\r");
            }
            terra++;
        
        }
        
    }
    

}





