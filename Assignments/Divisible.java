package Assignments;

public class Divisible
{
    public static void main (String[]args)
    {
        int number = 15;

        if (number % 3 == 0 && number % 5 == 0)
        {
            System.out.println("It is divisible by both");
        }
        else
        {
            System.out.println("It is not divisible by both");
        }
    }
}
