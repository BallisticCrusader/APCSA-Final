public class Person 
{
    private String name;
    private int age;
    private String race;
    private String lives;

    public Person()
    {
        name = "NONE";
        age = 0;
        race = "NONE";
        lives = "None";
    }

    public Person(String name, int age, String race, String lives)
    {
        this.name = name;
        this.age = age;
        this.race = race;
        this.lives = lives;
    }

    public int Calculator()
    {
        int price = 0;

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


        if(race.equals("White") || race.equals("white"))
        {
            price += 5;
        }
        else if(race.equals("Black") || race.equals("black"))
        {
            price += 10;
        }


        if(lives.equals("Fort Collins") || lives.equals("fort collins"))
        {
            price += 5;
        }
        else if(lives.equals("Greeley") || lives.equals("greeley"))
        {
            price += 10;
        }       
        return price;
    }

    public String toString()
    {
        return "Name: " + name + "\nAge: " + age + "\nRace: " + race + "\nLives: " + lives + "\nInsurance: $" + Calculator();
    }
}
