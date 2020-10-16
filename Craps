import java.util.Random;

public class Craps
{
    Random generator = new Random();
    
    private int die1, die2, sum, sum2; 
    
    
    public Craps(){             
        die1 = 0;
        die2 = 0;
        sum = 0;
        sum2 = 0;
}
    public void Roll(){                 // rolls dice 1st time
            die1 = generator.nextInt(6) + 1;
            die2 = generator.nextInt(6) + 1;
            sum = die1 + die2;
            System.out.println("You rolled a " + die1 + " and a " + die2 + " for a total of " + sum);
            
}  
    public void Roll2(){            // rolls dice, 2nd round dice
            die1 = generator.nextInt(6) + 1;
            die2 = generator.nextInt(6) + 1;
            sum2 = die1 + die2;
            System.out.println("You rolled a " + die1 + " and a " + die2 + " for a total of " + sum2);
}
    public boolean CheckWin1(){              // checks first roll, either go to checkround2 or lose
       if(sum == 7 || sum == 11 || sum == 4 || sum == 5 || sum == 6 || sum == 8 || sum == 9 || sum == 10){
            return true;
       }
       else
            return false;
}    
    public boolean CheckRound1(){              // checks first roll for win or to go to round 2
        if(sum == 4 || sum == 5 || sum == 6 || sum == 8 || sum == 9 || sum == 10){
            return true;
       }
        else {
            return false;
        }   
} 
    public boolean CheckRound2(){               // round 2, check for same sum or 7 else roll again
       if(sum == sum2 || sum2 == 7){
           return true;
        }
        else
            return false;
}  
    public boolean CheckWin2(){                 // checks if the sum is the same or a 7
        if(sum == sum2){
            return true;
        }
            else 
            return false;
}   
}
