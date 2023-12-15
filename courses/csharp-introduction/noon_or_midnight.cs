using System;

public class Program
{
    static void Main(string[] args)
    {
        int hour = Convert.ToInt32(Console.ReadLine());

        // your code goes here
        if (hour >= 0 && hour <= 12) {
            Console.WriteLine("AM");
        }
        else if (hour >= 13 && hour <= 24)
        {
            Console.WriteLine("PM");
        }
    }
}