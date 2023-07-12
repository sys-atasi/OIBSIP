import java.util.Scanner;
import java.util.Random;
class Game{
    public static void GuessN()
    {
        Scanner sc =new Scanner(System.in);
        int compguess=1+(int)(100*Math.random());
        int nguess=100;
        int i,userguess,score=0;
        System.out.println("\n****GAME STARTS****\n");
        for(i=0;i<nguess;i++)
        {
            System.out.print("Enter your Guessed Number: ");
            userguess=sc.nextInt();
            if(compguess==userguess)
            {
                System.out.println("Congratulations!!\nYou Guessed The Right Number\n");
                score=100-i;
                System.out.println("Your Score is "+score);  
                break;              
            }
            else if(compguess<userguess)
            {
                System.out.println("You Should Guess a smaller number....Try Again!\n");
                
            }
            else if(compguess>userguess)
            {
                System.out.println("You Should Guess a Greater Number....Try Again!\n");
            }
        }
        if(i==nguess)
        {
            System.out.println("You Chances are Over..Better Luck Next time..!!");
            System.out.println("The Number is "+compguess);
        }
    }
}
class GuessNumber
{
    public static void main(String[]args)
    {
        Game g=new Game();
        g.GuessN();
    }
}
