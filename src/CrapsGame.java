import java.util.Scanner;
import java.util.Random;

public class CrapsGame
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        Random rnd = new Random();

        String again = "Y";

        while(again.equalsIgnoreCase("Y"))
        {
            int die1 = rnd.nextInt(6) + 1;
            int die2 = rnd.nextInt(6) + 1;
            int sum = die1 + die2;

            System.out.println("First Roll");
            System.out.println("Die 1 is: " + die1);
            System.out.println("Die 2 is: " + die2);
            System.out.println("The sum is: " + sum);

            if(sum == 2 || sum == 3 || sum == 12)
            {
                System.out.println("Craps! Sorry, you lose.");
            }
            else if(sum == 7 || sum == 11)
            {
                System.out.println("Natural! Congrats, you win!");
            }
            else
            {
                int point = sum;

                System.out.println("Point is " + point);

                int roll = 0;

                while(!(roll == point || roll == 7))
                {
                    die1 = rnd.nextInt(6) + 1;
                    die2 = rnd.nextInt(6) + 1;
                    roll = die1 + die2;

                    System.out.println("Die 1: " + die1);
                    System.out.println("Die 2: " + die2);
                    System.out.println("Sum: " + roll);

                    if(roll == point)
                    {
                        System.out.println("Made point and won!");
                    }
                    else if(roll == 7)
                    {
                        System.out.println("Got a seven and lost!");
                    }
                    else
                    {
                        System.out.println("Trying for point");
                    }
                }
            }
            System.out.print("Play again? (Y/N): ");
            again = in.next();
        }
        System.out.println("Thanks for playing!");
    }
}