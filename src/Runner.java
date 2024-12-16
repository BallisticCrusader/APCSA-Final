import java.util.*;
public class Runner 
{
    Person blake = new Person("Blake", 30, "White", "Fort Collins");
    Person bob = new Person("Bob", 58, "White", "Greeley");
    Person robert = new Person("Robert", 24, "White", "Fort Collins");
    Person tyrone = new Person("Tyrone", 17, "Black", "Greeley");
    Person darius = new Person("Darius", 21, "Black", "Fort Collins");
    Person isaiah = new Person("Isaiah", 45, "Black", "Greeley");

    Scanner input = new Scanner(System.in);

    public void Start()
    {
        System.out.print("Enter 1 to see example or enter 2 to enter your own person: ");
        int first = input.nextInt();
        input.nextLine();
        int price = 0;

        if (first == 1)
        {
            System.out.println("Who wold you like to take a look at: ");
            System.out.println("Blake");
            System.out.println("Bob");
            System.out.println("Robert");
            System.out.println("Tyrone");
            System.out.println("Darius");
            System.out.println("Isaiah");
            System.out.print(": ");
            String na = input.nextLine();

            if(na.equals("Blake") || na.equals("blake"))
            {
                System.out.println(blake);
            }
            else if(na.equals("Bob") || na.equals("bob"))
            {
                System.out.println(bob);
            }
            else if(na.equals("Robert") || na.equals("robert"))
            {
                System.out.println(robert);
            }
            else if(na.equals("Tyrone") || na.equals("tyrone"))
            {
                System.out.println(tyrone);
            }
            else if(na.equals("Darius") || na.equals("darius"))
            {
                System.out.println(darius);
            }
            else if(na.equals("Isaiah") || na.equals("isaiah"))
            {
                System.out.println(isaiah);
            }
            else
            {
                System.out.println("Not Valid Input");
            }
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
                price += 320;
            }
            else if(race.equals("Black") || race.equals("black"))
            {
                price += 390;
            }

            System.out.println("Where does " + name + " live: ");
            System.out.println("Fort Collins");
            System.out.println("Greeley");
            System.out.print(": ");
            String lives = input.nextLine();

            if(lives.equals("Fort Collins") || lives.equals("fort collins"))
            {
                price += 310;
            }
            else if(lives.equals("Greeley") || lives.equals("greeley"))
            {
                price += 409;
            }

            System.out.print("What is " + name + "'s age: ");
            int age = input.nextInt();

            if(age < 16)
            {
                System.out.println("Invaled Age");
            }
            else if(age >= 16 && age < 29)
            {
                price += 440;
            }
            else if(age >= 30)
            {
                price += 150;
            }

            System.out.println("The Total Cost of " + name + "'s insurance is $" + price);
            input.close();

        }
    }
}