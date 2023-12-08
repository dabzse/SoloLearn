using System;

public class Program
{
    static void Main(string[] args)
    {
        int wins;
        int ties;

        // your code goes here
        wins = Convert.ToInt32(Console.ReadLine());
        ties = Convert.ToInt32(Console.ReadLine());
        Console.WriteLine(wins + ties * 0.5);
    }
}