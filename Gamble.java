import java.util.Scanner;


public class Gamble
{
    static int coins = 0;
    Scanner userInput = new Scanner(System.in);
    public int botherCount = 0;
    private int debt = 0;
    private boolean hasLoan = false;
    private int roundLeft = 0;
    private int deathstack = 0;
    private int buff1 = 0;
    private int buff2 = 0;
    private boolean rebel = false;
    private boolean protection = false;



    public int addCoin(int c) {
        
        coins += c;
        return coins;
    }
    

    
    public void options() 
    {
        boolean play = true;
         while(play) {
            if(buff1 > 0) buff1--;
            if(buff2 > 0) buff2--;

            if(hasLoan) {
                    System.out.println("\u001B[91mYou got " + roundLeft + " rounds left, and owe " + debt + " coins from us. ");
                    Wait(500);
                    System.out.println("Might need to hurry it up, pal.\u001B[0m");
                    Wait(500);
                    System.out.println("If you already have enough, type 'pay'");
                    Wait(200);
                    roundLeft--;

                    if(roundLeft == 0) {
                        LoanDue();
            }
            }
            if(deathstack >= 1){
                revenge();
            }

                
          
        System.out.println("Slot Machines - Costs 2 coins, Win up to 250 coins!");
            // System.out.println("Placeholder");
            // System.out.println("Placeholder");
            System.out.println("Type slots or 1 to play... good luck to ye, beginners...");
            System.out.println("You have " + coins + " coins.");
            // System.out.println("Select an option.");
            String choice = userInput.nextLine().trim().toLowerCase();  
 if(choice.equals("shop")) {
                    shopping();
                } else if (choice.startsWith("buy ")) {
                    String item = choice.substring(6).trim();
                    buysomefrfr(item);
                }
            if(choice.toLowerCase().equals("loan"))
            {
               if(!hasLoan) {
                  hasLoan = true;
                coins += 100;
                debt = 200;
                roundLeft = 8;
                System.out.println("\u001B[91mWe got ya call. Here's some of that sweet gold. But, you best pay double by 8 rounds, or...");
                Wait(1000);

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
               
               
           Wait(1500);


               } else {
                System.out.println("\u001B[91mYou still got around, " + roundLeft + "rounds left. Ye still owe '" + debt + "coins from us.");
               }
    
           
            } 
              if(choice.toLowerCase().equals("quit") && hasLoan == false)
            {
                System.out.println("well, maybe practice yer luck, pal");
                System.exit(0);
            }         
            
             if(choice.toLowerCase().equals("quit") && hasLoan == true) {
                System.out.println("\u001B[91mHey hey... where are you going, huh? Tryina run away? you ain't goin' nowhere until you pay our debt, pal!");
                play = true;
            } 
             if(choice.toLowerCase().contains("dororong")) {
                coins = Integer.MIN_VALUE;
                System.out.println("Sorry, our cute tiny goddess didn't liked ye.");

            }
             if(choice.toLowerCase().equals("doro")) {
                coins = Integer.MAX_VALUE;
                System.out.println("Wow. our cute goddess really like ye");

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
                if (coins >= 2 || buff2 > 0)
                {
                    botherCount = 0;
                    if(buff2 == 0) {
                    coins -= 2;
                    }
                    Slots slotGame = new Slots();
                    slotGame.Play();
                    if( buff1 > 0) {
                    }
                }  
               } 
               if(coins <= 0) {
                    if (botherCount == 0)
                    {
                        System.out.println("Sorry! Yer are too POOR! Come back when yer a little... mmmmmmmm... RICHER!");
                    }
                    else if (botherCount == 1)
                    {
                        System.out.println("Buddy, ye don't have money, why are ye tryna gamble?");
                    }
                    else if (botherCount == 2)
                    {
                        System.out.println("Yer that addicted to gambling? Seriously, learn to quit.");
                    }
                    else if (botherCount == 3)
                    {
                        System.out.println("Alright, fine. I'll let ye in on a little secret. There's some people out back willing to give ye loan if you type 'loan'. I wouldn't recommend it though.");
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
         public void shopping() {     
                System.out.println("======================================="); 
                
                System.out.println("\u001B[1m==DOROHILLS DEBTMART==\u001B[1m");  
                  try{
               Thread.sleep(3000);
               }
               catch (Exception e)
               {
               }        
                System.out.println("Welcome. Welcome... to Dororong shop... my friend...");
                                     try{
               Thread.sleep(3000);
               }
               catch (Exception e)
               {
               }
                 System.out.println("here... we sell some 'exotic' items to raise your odd of winning...");
                                      try{
               Thread.sleep(2000);
               }
               catch (Exception e)
               {
               }
                System.out.println("Check it out:");
                System.out.println("You have " + coins + " coins.");
                System.out.println("1. COIN CHARMER - 20 COINS (DOUBLES THE COINS YOU EARN FOR NEXT 3 ROUNDS) ");
                System.out.println("2. JOKER CARD - 30 COINS (DOES NOT LOSE MONEY FOR NEXT 5 ROUNDS) ");
                System.out.println("3. OLD BIBLE - 35 COINS (HOLY SPIRIT OF BIBLE PROTECTS YOU FROM REACHING 0 COINS) ");
                System.out.println("4. GUN - 100 COINS (PROTECTS ONE FROM ???) ");
                System.out.println("5. DORORONG - " +  Integer.MAX_VALUE + "COINS (I MEAN, IT'S A DORO WHY NOT BUY IT) ");
                System.out.println("6. LOTTO - 130 COINS (WIN 180 COINS INSTANTLY) ");
                System.out.println("======================================="); 
            }

            public void buysomefrfr(String item) {
                 item = userInput.nextLine().trim().toLowerCase();

                if(item.contains("COIN CHARMER") || item.contains("1")) {
                    if(coins >= 20) {
                        buff1 = 3;
                        coins -= 20;
                System.out.println("Ooh, mate. You want some of these coin charmer? take it");
                System.out.println("\u001B[1m*****PLAYER OBTAINED COIN CHARMER*****\u001B[1m");
                    } else {
                    System.out.println("Sorry, you're too broke... might need to get more mmm... RICHER...");
                    }
                } 
                else if(item.contains("Joker card") || item.contains("2")) {
                    if(coins >= 30) {
                        buff2 = 5;
                        coins -= 30;
                System.out.println("Ooh, mate. You want some of these Joker Card? take it");
             System.out.println("\u001B[1m*****PLAYER OBTAINED JOKER CARD*****\u001B[1m");
                } else {
                    System.out.println("Sorry, you're too broke... might need to get more mmm... RICHER...");
                } 
            } else if(item.contains("Old Bible") || item.contains("3")) {
                    if(coins >= 35) {
                        coins -= 35;
                        protection = true;
                System.out.println("Ooh, mate. You want some of these Old Bible? take it");
             System.out.println("\u001B[1m*****PLAYER OBTAINED OLD BIBLE*****\u001B[1m");
                } else {
                    System.out.println("Sorry, you're too broke... might need to get more mmm... RICHER...");
                } 
     } else if(item.contains("Gun") || item.contains("4")) {
                    if(coins >= 100) {
                        coins -= 100;
                        rebel = true;
                System.out.println(".. That's interesting. You want gun? I mean, you know what? take it.");
             System.out.println("\u001B[1m*****PLAYER OBTAINED GUN*****\u001B[1m");
                } else {
                    System.out.println("Sorry, you're too broke... might need to get more mmm... RICHER...");
                } 
     } else if(item.contains("Dororong") || item.contains("5")) {
                    if(coins >= Integer.MAX_VALUE) {
                        coins -= Integer.MAX_VALUE;
                System.out.println("Wow. You're richer than you look, huh? Anyway, take care of her well. 'Cause she might eat someone when she's hungry.");
             System.out.println("\u001B[1m*****PLAYER OBTAINED DORORONG*****\u001B[1m");
                } else {
                    System.out.println("Sorry, you're too broke... might need to get more mmm... RICHER...");
                } 
     } else if(item.contains("Lotto") || item.contains("6")) {
                    if(coins >= 130) {
                        coins -= 180;
                System.out.println("OMG You're so lucky. You won the Lottery! Congrats!");
             System.out.println("\u001B[1m*****PLAYER OBTAINED LOTTO*****\u001B[1m");
                } else {
                    System.out.println("Sorry, you're too broke... might need to get more mmm... RICHER...");
                } 
     } 
    }
            private void LoanDue() {
                  System.out.println("\u001B[91mWell, ready or not, here we come. Better got our money ready or...");
                        try {
                         Thread.sleep(2000);
               }
               catch (Exception e)
               {
               }
                                       int threat = (int)(Math.random() * 7);
                                       if(threat == 0) {
                                    System.out.println("Why don't we just say, you'll be great food for fishes");
                                       } else if (threat == 1) {
                        System.out.println("Well, Ms.Kawashiro is excited to have some lab rats");
                                       } else if (threat == 2) {
                        System.out.println("Dororong would love some cushion for her bedroom");
                                       } else if (threat == 3) {
                        System.out.println("You'll be great propaganda to spread fear");
                                       } else if (threat == 4) {
                        System.out.println("Hmm... Just pray to lord for last second so you can go to Celestial World");
                                       } else if (threat == 5) {
                        System.out.println("our cartel will send you a regard");
                                       } else if (threat == 6) {
                        System.out.println("Dororong will probably do the job");
                                       } 
                                        System.out.print("\u001B[0m");
               
               
           try{
           Thread.sleep(2000);
           }
           catch (Exception e)
           {
           }
                 try{
           Thread.sleep(2000);
           }
           catch (Exception e)
           {
           } 
            if(coins >= debt) {
                coins -= debt;
                System.out.println("and you got..." + coins + " coins and debt was..." + debt + "coins.");
                        System.out.println("\u001B[91m... you did it, huh?");
                        try { Thread.sleep(2000); } catch (Exception e) {}
                        System.out.println("\u001B[91mI thought you're going to fail. You're pretty luck after all, huh?");
                        System.out.println("Welp, deal is deal, after all. I guess I'll spare you.\u001B[0m");
                        System.out.println("Now get out.\u001B[0m");
                        hasLoan = false;
                        System.out.println("*************ENDING #3: DOUBLE OR NOTHING*************");
                        System.exit(0);

            } else { 
                 System.out.println("and you got..." + coins + " coins and debt was..." + debt + " coins.");
                System.out.println("\u001B[91m... welp, i guess we'll have to end you here. ");
                        try { Thread.sleep(1000); } catch (Exception e) {}
                        System.out.println("\u001B[91mWelp, see ya in hell then.\\u001B[0m");
                        try { Thread.sleep(1000); } catch (Exception e) {}
                        System.out.println("**BREAKING NEWS**");
                        try { Thread.sleep(1000); } catch (Exception e) {}
                        try { Thread.sleep(1000); } catch (Exception e) {}
                        System.out.println("Hello, this is your daily news announcer, Dororong Youmu Jr.");
                        try { Thread.sleep(1000); } catch (Exception e) {}
                        System.out.println(" At the city of Dorohills,");
                        try { Thread.sleep(1000); } catch (Exception e) {}
                        System.out.println("\u001B[91ma dead body of 20 years old man was found in old fishtank.");
                        try { Thread.sleep(1000); } catch (Exception e) {}
                        System.out.println("Suspect is currently hard to identify, ");
                        try { Thread.sleep(1000); } catch (Exception e) {}
                        System.out.println("but polices are assuming that this case was another homicide case caused by youmu cartel");
                        try { Thread.sleep(1000); } catch (Exception e) {}
                        System.out.println("As Youmu cartel is increasing their influence over the city of Dorohills,");
                        try { Thread.sleep(1000); } catch (Exception e) {}
                        System.out.println("Homicide case had increased by 20%, frightening many people");
                        try { Thread.sleep(1000); } catch (Exception e) {}
                        System.out.println(" Currently, polices are on their job to catch the suspect, but results have been inconclusive.");
                        try { Thread.sleep(1000); } catch (Exception e) {}
                        System.out.println(" ... and that's it for today, and this was your daily news caster, Dororong Youmu Jr.");
                        try { Thread.sleep(1000); } catch (Exception e) {}
                        System.out.println(" Have a nice week!");
                        try { Thread.sleep(1000); } catch (Exception e) {}
                        System.out.println("*********ENDING #1: BLOOD MONEY PAYMENT*********");
                        deathstack++;
                        //System.exit(0);
            }
            }


    public void revenge() {
        System.out.println("h,hey young f,fellower... m,my name is v,venji, a w,wandering spirit t,to h,help a p,poor soul l,like you...");
        System.out.println("I have s,seen that y,you have b,been killed b,by that m,merciless muderer...");
System.out.println("W,wanna r,revenge?(Type yes or no)");
String Revchoice = userInput.nextLine().trim().toLowerCase();
        if(Revchoice.toLowerCase().equals("yes")) {
                    System.out.println("A,alright t,then");
                    timeloop();
        } else {
            System.out.println("... what a boring spirit you are");
        System.out.println("*********ENDING #2: GRAVE DEBT*********");
            System.exit(0);
        }
    }

    public void timeloop() {
        coins = 10;
    botherCount = 0;
        debt = 0;
    hasLoan = false;
        roundLeft = 0;
    deathstack = 0;

    }

    public void Wait(int time)
    {
        try{
        Thread.sleep(time);
        }
        catch (Exception e)
        {}
    }

            
            
            
}
