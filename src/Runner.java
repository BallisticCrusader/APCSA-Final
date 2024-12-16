import java.util.*;
public class Runner 
{
    Scanner input = new Scanner(System.in);

    public void Start()
    {
        System.out.print("Enter 1 to see example or enter 2 to enter your own person: ");
        int first = input.nextInt();
        int price = 0;

        if (first == 1)
        {

        }
        else if(first == 2)
        {
            System.out.print("What is the name of your person: ");
            String name = input.nextLine();
            
            System.out.println("What is the ethnicity of " + name);
            System.out.println("White");
            System.out.println("Black");
            System.out.print(": ");
            String race = input.nextLine();

            if(race.equals("White") || race.equals("white"))
            {
                price += 5;
            }
            else if(race.equals("Black") || race.equals("black"))
            {
                price += 10;
            }

            System.out.println("Where does " + name + " live: ");
            System.out.println("Fort Collins");
            System.out.println("Greeley");
            System.out.print(": ");
            String lives = input.nextLine();

            if(lives.equals("Fort Collins") || lives.equals("fort collins"))
            {
                price += 5;
            }
            else if(lives.equals("Greeley") || lives.equals("greeley"))
            {
                price += 10;
            }

            System.out.print("What is " + name + "'s age: ");
            int age = input.nextInt();

            if(age < 16)
            {
                System.out.println("Invaled Age");
            }
            else if(age >= 16 && age < 29)
            {
                price += 10;
            }
            else if(age >= 30)
            {
                price += 5;
            }

            System.out.println("The Total Cost of " + name + "'s insurance is $" + price);

        }
    }
}
