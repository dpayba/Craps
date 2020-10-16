import java.util.Scanner;

public class Play
{
    public static void main(String[]args){
        
        Scanner input = new Scanner(System.in);
        Craps player = new Craps();
        int wins = 0;
        int losses = 0;
        int rolls = 0;
        
        
        System.out.println("Press 1 to play or 0 to quit.");
        int play = input.nextInt();
         
        while(play==1){
            player.Roll();
            rolls += 1;
            while(play == 1){
                    if(player.CheckWin1() == false){        // roll 2, 3, or 12
                        System.out.println("You Lose");
                        losses += 1;
                        System.out.println("You have " + wins + " wins and " + losses + " losses after " + rolls + " rolls.");
                        System.out.println("Press 1 to roll again");
                        play = input.nextInt();
                        if(play != 1)
                                    break;
                                 else{
                                 player.Roll();
                                 rolls += 1;
                            }
                    }
                else {         // true if 4, 5, 6, 7, 8, 9, 10, 11, then check if win or round 2
                    if(player.CheckRound1() == true){     // check if 4, 5, 6, 8, 9, 10
                        player.Roll2();
                        rolls += 1;
                            while(player.CheckRound2() == false){      // roll until sum is same or 7
                                player.Roll2();
                                rolls += 1;                                
                            }
                            if(player.CheckWin2() == true){         // sum is same
                                 System.out.println("You Win");
                                 wins += 1;
                                 System.out.println("You have " + wins + " wins and " + losses + " losses after " + rolls + " rolls.");
                                 System.out.println("Press 1 to roll again");
                                 play = input.nextInt();
                                 if(play != 1)
                                    break;
                                 else{
                                 player.Roll();
                                 rolls += 1;
                            }
                        }
                            else if(player.CheckWin2() == false) {           // sum is 7
                                System.out.println("You Lose");
                                losses += 1;
                                break;
                            }
                    
                        }       else if(player.CheckRound1() == false) {              // win if roll 7 or 11
                        System.out.println("You Win");
                        wins += 1;
                        System.out.println("You have " + wins + " wins and " + losses + " losses after " + rolls + " rolls.");
                        System.out.println("Press 1 to roll again");
                        play = input.nextInt();
                        if(play != 1)
                                    break;
                                 else{
                                 player.Roll();
                                 rolls += 1;
                            }
                    }
                }
            }
            System.out.println("     " );
            System.out.println("GAME OVER. You have " + wins + " wins and " + losses + " losses after " + rolls + " rolls.");
            System.out.println("Press 1 to PLAY AGAIN, or 0 to QUIT");
            play = input.nextInt();
            if(play == 1){
                wins = 0;
                losses = 0;
                rolls = 0;
        }
            else if(play != 1)
            break;
    }
    if(play != 1)
        System.exit(0);
        
    System.out.println("You ended with " + wins + " wins \n" +
                    "and " + losses + " losses \n" +
                    "after " + rolls + " rolls.");
                      
}  
}
